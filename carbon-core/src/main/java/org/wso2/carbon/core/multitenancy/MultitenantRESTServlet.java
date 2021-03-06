/*                                                                             
 * Copyright 2004,2005 The Apache Software Foundation.                         
 *                                                                             
 * Licensed under the Apache License, Version 2.0 (the "License");             
 * you may not use this file except in compliance with the License.            
 * You may obtain a copy of the License at                                     
 *                                                                             
 *      http://www.apache.org/licenses/LICENSE-2.0                             
 *                                                                             
 * Unless required by applicable law or agreed to in writing, software         
 * distributed under the License is distributed on an "AS IS" BASIS,           
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.    
 * See the License for the specific language governing permissions and         
 * limitations under the License.                                              
 */
package org.wso2.carbon.core.multitenancy;

import org.apache.axis2.AxisFault;
import org.apache.axis2.Constants;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.context.ConfigurationContext;
import org.apache.axis2.context.MessageContext;
import org.apache.axis2.context.OperationContext;
import org.apache.axis2.description.TransportInDescription;
import org.apache.axis2.description.TransportOutDescription;
import org.apache.axis2.transport.RequestResponseTransport;
import org.apache.axis2.transport.http.AxisServlet;
import org.apache.axis2.transport.http.HTTPConstants;
import org.apache.axis2.transport.http.ServletBasedOutTransportInfo;
import org.apache.axis2.wsdl.WSDLConstants;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;

/**
 * A servlet class for handling REST requests in a multitenant environment
 */
public class MultitenantRESTServlet extends AxisServlet {

    private static final Log log = LogFactory.getLog(MultitenantRESTServlet.class);
    private String requestUri;

    private MessageContext inMessageContext;

    public MultitenantRESTServlet() {
    }

    public MultitenantRESTServlet(ConfigurationContext configCtx, String requestUri) {
        this.configContext = configCtx;
        this.axisConfiguration = configCtx.getAxisConfiguration();
        this.requestUri = requestUri;
    }

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {
        new RestRequestProcessor(HTTPConstants.HTTP_METHOD_GET,
                                 request,
                                 response).processURLRequest();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        new RestRequestProcessor(Constants.Configuration.HTTP_METHOD_POST,
                                 request,
                                 response).processXMLRequest();
    }

    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        new RestRequestProcessor(Constants.Configuration.HTTP_METHOD_DELETE,
                                 request,
                                 response).processURLRequest();
    }

    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        new RestRequestProcessor(Constants.Configuration.HTTP_METHOD_PUT, request, response)
                .processXMLRequest();
    }

    protected MessageContext createMessageContext(HttpServletRequest request,
                                                  HttpServletResponse response,
                                                  boolean isSoapRequest) throws IOException {
        this.inMessageContext = configContext.createMessageContext();

        String trsPrefix;
        int sepindex;
        // Support older servlet API's
        try {
            trsPrefix = request.getRequestURL().toString();
        } catch (Throwable t) {
            log.info("Old Servlet API (Fallback to HttpServletRequest.getRequestURI) :" + t);
            trsPrefix = request.getRequestURI();
        }
        sepindex = trsPrefix.indexOf(':');
        if (sepindex > -1) {
            trsPrefix = trsPrefix.substring(0, sepindex);
            inMessageContext.setIncomingTransportName(trsPrefix);
        } else {
            inMessageContext.setIncomingTransportName(Constants.TRANSPORT_HTTP);
            trsPrefix = Constants.TRANSPORT_HTTP;
        }
        TransportInDescription transportIn =
                axisConfiguration.getTransportIn(inMessageContext.getIncomingTransportName());
        //set the default output description. This will be http

        TransportOutDescription transportOut = axisConfiguration.getTransportOut(trsPrefix);
        if (transportOut == null) {
            // if the req coming via https but we do not have a https sender
            transportOut = axisConfiguration.getTransportOut(Constants.TRANSPORT_HTTP);
        }


        inMessageContext.setTransportIn(transportIn);
        inMessageContext.setTransportOut(transportOut);
        inMessageContext.setServerSide(true);

        /*  if (!isSoapRequest) {
            String query = request.getQueryString();
            if (query != null) {
                requestUri = requestUri + "?" + query;
            }
        }*/

        inMessageContext.setTo(new EndpointReference(requestUri));
        inMessageContext.setFrom(new EndpointReference(request.getRemoteAddr()));
        inMessageContext.setProperty(MessageContext.REMOTE_ADDR, request.getRemoteAddr());
        inMessageContext.setProperty(Constants.OUT_TRANSPORT_INFO,
                                     new ServletBasedOutTransportInfo(response));
        // set the transport Headers
        inMessageContext.setProperty(MessageContext.TRANSPORT_HEADERS, getTransportHeaders(request));
        inMessageContext.setProperty(HTTPConstants.MC_HTTP_SERVLETREQUEST, request);
        inMessageContext.setProperty(HTTPConstants.MC_HTTP_SERVLETRESPONSE, response);
        try {
            ServletContext context = getServletContext();
            if (context != null) {
                inMessageContext.setProperty(HTTPConstants.MC_HTTP_SERVLETCONTEXT, context);
            }
        } catch (Exception e) {
            log.debug(e.getMessage(), e);
        }

        //setting the RequestResponseTransport object
        inMessageContext.setProperty(RequestResponseTransport.TRANSPORT_CONTROL,
                                     new ServletRequestResponseTransport());

        return inMessageContext;
    }

    public MessageContext getOutMessageContext() throws AxisFault {
        OperationContext opCtx = inMessageContext.getOperationContext();
        if (opCtx != null) {
            return opCtx.getMessageContext(WSDLConstants.MESSAGE_LABEL_OUT_VALUE);
        }
        return null;
    }

    public MessageContext getOutFaultMessageContext() throws AxisFault {
        OperationContext opCtx = inMessageContext.getOperationContext();
        if (opCtx != null) {
            return opCtx.getMessageContext(WSDLConstants.MESSAGE_LABEL_FAULT_VALUE);
        }
        return null;
    }

    protected class ServletRequestResponseTransport implements RequestResponseTransport {
        private boolean responseWritten = false;
        private CountDownLatch responseReadySignal = new CountDownLatch(1);
        // The initial status must be WAITING, as the main servlet will do some other
        // work after setting this RequestResponseTransport up, and we don't want to miss
        // signals that come in before this thread gets to the awaitResponse call.
        private RequestResponseTransportStatus status = RequestResponseTransportStatus.WAITING;
        AxisFault faultToBeThrownOut = null;

        ServletRequestResponseTransport() {
        }

        public void acknowledgeMessage(MessageContext msgContext) throws AxisFault {
            status = RequestResponseTransportStatus.ACKED;
            responseReadySignal.countDown();
        }

        public void awaitResponse()
                throws InterruptedException, AxisFault {
            log.debug("Blocking servlet thread -- awaiting response");
            responseReadySignal.await();

            if (faultToBeThrownOut != null) {
                throw faultToBeThrownOut;
            }
        }

        public void signalResponseReady() {
            log.debug("Signalling response available");
            status = RequestResponseTransportStatus.SIGNALLED;
            responseReadySignal.countDown();
        }

        public RequestResponseTransportStatus getStatus() {
            return status;
        }

        public void signalFaultReady(AxisFault fault) {
            faultToBeThrownOut = fault;
            signalResponseReady();
        }

        public boolean isResponseWritten() {
            return responseWritten;
        }

        public void setResponseWritten(boolean responseWritten) {
            this.responseWritten = responseWritten;
        }

    }

}
