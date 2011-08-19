
/**
 * ServiceGroupMetaData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6-wso2v1  Built on : May 05, 2010 (06:40:53 UTC)
 */

            
                package org.esbhive.hp.mgt.carbon.service;
            

            /**
            *  ServiceGroupMetaData bean class
            */
        
        public  class ServiceGroupMetaData
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = ServiceGroupMetaData
                Namespace URI = http://mgt.service.carbon.wso2.org/xsd
                Namespace Prefix = ns4
                */
            

                        /**
                        * field for EngagedModules
                        * This was an Array!
                        */

                        
                                    protected java.lang.String[] localEngagedModules ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEngagedModulesTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String[]
                           */
                           public  java.lang.String[] getEngagedModules(){
                               return localEngagedModules;
                           }

                           
                        


                               
                              /**
                               * validate the array for EngagedModules
                               */
                              protected void validateEngagedModules(java.lang.String[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param EngagedModules
                              */
                              public void setEngagedModules(java.lang.String[] param){
                              
                                   validateEngagedModules(param);

                               
                                          if (param != null){
                                             //update the setting tracker
                                             localEngagedModulesTracker = true;
                                          } else {
                                             localEngagedModulesTracker = true;
                                                 
                                          }
                                      
                                      this.localEngagedModules=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.lang.String
                             */
                             public void addEngagedModules(java.lang.String param){
                                   if (localEngagedModules == null){
                                   localEngagedModules = new java.lang.String[]{};
                                   }

                            
                                 //update the setting tracker
                                localEngagedModulesTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localEngagedModules);
                               list.add(param);
                               this.localEngagedModules =
                             (java.lang.String[])list.toArray(
                            new java.lang.String[list.size()]);

                             }
                             

                        /**
                        * field for MtomStatus
                        */

                        
                                    protected java.lang.String localMtomStatus ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMtomStatusTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getMtomStatus(){
                               return localMtomStatus;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MtomStatus
                               */
                               public void setMtomStatus(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localMtomStatusTracker = true;
                                       } else {
                                          localMtomStatusTracker = true;
                                              
                                       }
                                   
                                            this.localMtomStatus=param;
                                    

                               }
                            

                        /**
                        * field for DisableDeletion
                        */

                        
                                    protected boolean localDisableDeletion ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDisableDeletionTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getDisableDeletion(){
                               return localDisableDeletion;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DisableDeletion
                               */
                               public void setDisableDeletion(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       
                                               if (false) {
                                           localDisableDeletionTracker = false;
                                              
                                       } else {
                                          localDisableDeletionTracker = true;
                                       }
                                   
                                            this.localDisableDeletion=param;
                                    

                               }
                            

                        /**
                        * field for ServiceContextPath
                        */

                        
                                    protected java.lang.String localServiceContextPath ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localServiceContextPathTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getServiceContextPath(){
                               return localServiceContextPath;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ServiceContextPath
                               */
                               public void setServiceContextPath(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localServiceContextPathTracker = true;
                                       } else {
                                          localServiceContextPathTracker = true;
                                              
                                       }
                                   
                                            this.localServiceContextPath=param;
                                    

                               }
                            

                        /**
                        * field for ServiceGroupName
                        */

                        
                                    protected java.lang.String localServiceGroupName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localServiceGroupNameTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getServiceGroupName(){
                               return localServiceGroupName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ServiceGroupName
                               */
                               public void setServiceGroupName(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localServiceGroupNameTracker = true;
                                       } else {
                                          localServiceGroupNameTracker = true;
                                              
                                       }
                                   
                                            this.localServiceGroupName=param;
                                    

                               }
                            

                        /**
                        * field for Services
                        * This was an Array!
                        */

                        
                                    protected org.esbhive.hp.mgt.carbon.service.ServiceMetaData[] localServices ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localServicesTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return org.esbhive.hp.mgt.carbon.service.ServiceMetaData[]
                           */
                           public  org.esbhive.hp.mgt.carbon.service.ServiceMetaData[] getServices(){
                               return localServices;
                           }

                           
                        


                               
                              /**
                               * validate the array for Services
                               */
                              protected void validateServices(org.esbhive.hp.mgt.carbon.service.ServiceMetaData[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param Services
                              */
                              public void setServices(org.esbhive.hp.mgt.carbon.service.ServiceMetaData[] param){
                              
                                   validateServices(param);

                               
                                          if (param != null){
                                             //update the setting tracker
                                             localServicesTracker = true;
                                          } else {
                                             localServicesTracker = true;
                                                 
                                          }
                                      
                                      this.localServices=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param org.esbhive.hp.mgt.carbon.service.ServiceMetaData
                             */
                             public void addServices(org.esbhive.hp.mgt.carbon.service.ServiceMetaData param){
                                   if (localServices == null){
                                   localServices = new org.esbhive.hp.mgt.carbon.service.ServiceMetaData[]{};
                                   }

                            
                                 //update the setting tracker
                                localServicesTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localServices);
                               list.add(param);
                               this.localServices =
                             (org.esbhive.hp.mgt.carbon.service.ServiceMetaData[])list.toArray(
                            new org.esbhive.hp.mgt.carbon.service.ServiceMetaData[list.size()]);

                             }
                             

     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,parentQName);
               return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
               parentQName,factory,dataSource);
            
       }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       javax.xml.stream.XMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                java.lang.String prefix = null;
                java.lang.String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();
                    writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
                
                  if (serializeType){
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://mgt.service.carbon.wso2.org/xsd");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":ServiceGroupMetaData",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "ServiceGroupMetaData",
                           xmlWriter);
                   }

               
                   }
                if (localEngagedModulesTracker){
                             if (localEngagedModules!=null) {
                                   namespace = "http://mgt.service.carbon.wso2.org/xsd";
                                   for (int i = 0;i < localEngagedModules.length;i++){
                                        
                                            if (localEngagedModules[i] != null){
                                        
                                                writeStartElement(null, namespace, "engagedModules", xmlWriter);

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEngagedModules[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // write null attribute
                                                            namespace = "http://mgt.service.carbon.wso2.org/xsd";
                                                            writeStartElement(null, namespace, "engagedModules", xmlWriter);
                                                            writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                            xmlWriter.writeEndElement();
                                                       
                                                }

                                   }
                             } else {
                                 
                                         // write the null attribute
                                        // write null attribute
                                           writeStartElement(null, "http://mgt.service.carbon.wso2.org/xsd", "engagedModules", xmlWriter);

                                           // write the nil attribute
                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                           xmlWriter.writeEndElement();
                                    
                             }

                        } if (localMtomStatusTracker){
                                    namespace = "http://mgt.service.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "mtomStatus", xmlWriter);
                             

                                          if (localMtomStatus==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localMtomStatus);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDisableDeletionTracker){
                                    namespace = "http://mgt.service.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "disableDeletion", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("disableDeletion cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDisableDeletion));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localServiceContextPathTracker){
                                    namespace = "http://mgt.service.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "serviceContextPath", xmlWriter);
                             

                                          if (localServiceContextPath==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localServiceContextPath);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localServiceGroupNameTracker){
                                    namespace = "http://mgt.service.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "serviceGroupName", xmlWriter);
                             

                                          if (localServiceGroupName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localServiceGroupName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localServicesTracker){
                                       if (localServices!=null){
                                            for (int i = 0;i < localServices.length;i++){
                                                if (localServices[i] != null){
                                                 localServices[i].serialize(new javax.xml.namespace.QName("http://mgt.service.carbon.wso2.org/xsd","services"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://mgt.service.carbon.wso2.org/xsd", "services", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://mgt.service.carbon.wso2.org/xsd", "services", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://mgt.service.carbon.wso2.org/xsd")){
                return "ns4";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }
        
        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace,attName,attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName,attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace,attName,attValue);
            }
        }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

                java.lang.String attributeNamespace = qname.getNamespaceURI();
                java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
                if (attributePrefix == null) {
                    attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
                }
                java.lang.String attributeValue;
                if (attributePrefix.trim().length() > 0) {
                    attributeValue = attributePrefix + ":" + qname.getLocalPart();
                } else {
                    attributeValue = qname.getLocalPart();
                }

                if (namespace.equals("")) {
                    xmlWriter.writeAttribute(attName, attributeValue);
                } else {
                    registerPrefix(xmlWriter, namespace);
                    xmlWriter.writeAttribute(namespace, attName, attributeValue);
                }
            }
        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                 if (localEngagedModulesTracker){
                            if (localEngagedModules!=null){
                                  for (int i = 0;i < localEngagedModules.length;i++){
                                      
                                         if (localEngagedModules[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("http://mgt.service.carbon.wso2.org/xsd",
                                                                              "engagedModules"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEngagedModules[i]));
                                          } else {
                                             
                                                    elementList.add(new javax.xml.namespace.QName("http://mgt.service.carbon.wso2.org/xsd",
                                                                              "engagedModules"));
                                                    elementList.add(null);
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    elementList.add(new javax.xml.namespace.QName("http://mgt.service.carbon.wso2.org/xsd",
                                                                              "engagedModules"));
                                    elementList.add(null);
                                
                            }

                        } if (localMtomStatusTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://mgt.service.carbon.wso2.org/xsd",
                                                                      "mtomStatus"));
                                 
                                         elementList.add(localMtomStatus==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMtomStatus));
                                    } if (localDisableDeletionTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://mgt.service.carbon.wso2.org/xsd",
                                                                      "disableDeletion"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDisableDeletion));
                            } if (localServiceContextPathTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://mgt.service.carbon.wso2.org/xsd",
                                                                      "serviceContextPath"));
                                 
                                         elementList.add(localServiceContextPath==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localServiceContextPath));
                                    } if (localServiceGroupNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://mgt.service.carbon.wso2.org/xsd",
                                                                      "serviceGroupName"));
                                 
                                         elementList.add(localServiceGroupName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localServiceGroupName));
                                    } if (localServicesTracker){
                             if (localServices!=null) {
                                 for (int i = 0;i < localServices.length;i++){

                                    if (localServices[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://mgt.service.carbon.wso2.org/xsd",
                                                                          "services"));
                                         elementList.add(localServices[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://mgt.service.carbon.wso2.org/xsd",
                                                                          "services"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://mgt.service.carbon.wso2.org/xsd",
                                                                          "services"));
                                        elementList.add(localServices);
                                    
                             }

                        }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static ServiceGroupMetaData parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            ServiceGroupMetaData object =
                new ServiceGroupMetaData();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"ServiceGroupMetaData".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (ServiceGroupMetaData)org.esbhive.hp.mgt.carbon.util.java.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                        java.util.ArrayList list1 = new java.util.ArrayList();
                    
                        java.util.ArrayList list6 = new java.util.ArrayList();
                       
                while(!reader.isEndElement()) {
                    if (reader.isStartElement() ){
                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://mgt.service.carbon.wso2.org/xsd","engagedModules").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                              nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                              if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                  list1.add(null);
                                                       
                                                  reader.next();
                                              } else {
                                            list1.add(reader.getElementText());
                                            }
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone1 = false;
                                            while(!loopDone1){
                                                // Ensure we are at the EndElement
                                                while (!reader.isEndElement()){
                                                    reader.next();
                                                }
                                                // Step out of this element
                                                reader.next();
                                                // Step to next element event.
                                                while (!reader.isStartElement() && !reader.isEndElement())
                                                    reader.next();
                                                if (reader.isEndElement()){
                                                    //two continuous end elements means we are exiting the xml structure
                                                    loopDone1 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("http://mgt.service.carbon.wso2.org/xsd","engagedModules").equals(reader.getName())){
                                                         
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list1.add(null);
                                                                   
                                                              reader.next();
                                                          } else {
                                                        list1.add(reader.getElementText());
                                                        }
                                                    }else{
                                                        loopDone1 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                                    object.setEngagedModules((java.lang.String[])
                                                        list1.toArray(new java.lang.String[list1.size()]));
                                                
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://mgt.service.carbon.wso2.org/xsd","mtomStatus").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setMtomStatus(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://mgt.service.carbon.wso2.org/xsd","disableDeletion").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDisableDeletion(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://mgt.service.carbon.wso2.org/xsd","serviceContextPath").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setServiceContextPath(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://mgt.service.carbon.wso2.org/xsd","serviceGroupName").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setServiceGroupName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://mgt.service.carbon.wso2.org/xsd","services").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list6.add(null);
                                                              reader.next();
                                                          } else {
                                                        list6.add(org.esbhive.hp.mgt.carbon.service.ServiceMetaData.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone6 = false;
                                                        while(!loopDone6){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone6 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://mgt.service.carbon.wso2.org/xsd","services").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list6.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list6.add(org.esbhive.hp.mgt.carbon.service.ServiceMetaData.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone6 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setServices((org.esbhive.hp.mgt.carbon.service.ServiceMetaData[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                org.esbhive.hp.mgt.carbon.service.ServiceMetaData.class,
                                                                list6));
                                                            
                              }  // End of if for expected property start element
                                
                             else{
                                        // A start element we are not expecting indicates an invalid parameter was passed
                                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                             }
                          
                             } else {
                                reader.next();
                             }  
                           }  // end of while loop
                        



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    