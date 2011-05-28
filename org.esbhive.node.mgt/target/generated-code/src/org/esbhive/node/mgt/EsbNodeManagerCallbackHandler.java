
/**
 * EsbNodeManagerCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6-wso2v1  Built on : May 05, 2010 (06:40:41 UTC)
 */

    package org.esbhive.node.mgt;

    /**
     *  EsbNodeManagerCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class EsbNodeManagerCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public EsbNodeManagerCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public EsbNodeManagerCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for addNodeAndGetNodes method
            * override this method for handling normal response from addNodeAndGetNodes operation
            */
           public void receiveResultaddNodeAndGetNodes(
                    org.esbhive.node.mgt.data.xsd.ESBNode[] result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from addNodeAndGetNodes operation
           */
            public void receiveErroraddNodeAndGetNodes(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for addNode method
            * override this method for handling normal response from addNode operation
            */
           public void receiveResultaddNode(
                    org.esbhive.node.mgt.data.xsd.ESBNode[] result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from addNode operation
           */
            public void receiveErroraddNode(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getNodes method
            * override this method for handling normal response from getNodes operation
            */
           public void receiveResultgetNodes(
                    org.esbhive.node.mgt.data.xsd.ESBNode[] result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getNodes operation
           */
            public void receiveErrorgetNodes(java.lang.Exception e) {
            }
                


    }
    