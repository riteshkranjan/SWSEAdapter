/**
 * Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_BindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.siebel.CustomUI;

public class Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_BindingStub extends org.apache.axis.client.Stub implements com.siebel.CustomUI.Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[1];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Customer_spcAsset_spcSearch_spcWF_spc-_spcBT_spcDemo_1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://siebel.com/CustomUI", "Customer_spcAsset_spcSearch_spcWF_spc-_spcBT_spcDemo_1_Input"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://siebel.com/CustomUI", ">Customer_spcAsset_spcSearch_spcWF_spc-_spcBT_spcDemo_1_Input"), com.siebel.CustomUI.Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_1_Input.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://siebel.com/CustomUI", ">Customer_spcAsset_spcSearch_spcWF_spc-_spcBT_spcDemo_1_Output"));
        oper.setReturnClass(com.siebel.CustomUI.Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_1_Output.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://siebel.com/CustomUI", "Customer_spcAsset_spcSearch_spcWF_spc-_spcBT_spcDemo_1_Output"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

    }

    public Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_BindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_BindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_BindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://siebel.com/CustomUI", ">Customer_spcAsset_spcSearch_spcWF_spc-_spcBT_spcDemo_1_Input");
            cachedSerQNames.add(qName);
            cls = com.siebel.CustomUI.Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_1_Input.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://siebel.com/CustomUI", ">Customer_spcAsset_spcSearch_spcWF_spc-_spcBT_spcDemo_1_Output");
            cachedSerQNames.add(qName);
            cls = com.siebel.CustomUI.Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_1_Output.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "Account");
            cachedSerQNames.add(qName);
            cls = com.siebel.www.xml.BaseAccount.Account.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "AssetMgmt-AssetOrderMgmt");
            cachedSerQNames.add(qName);
            cls = com.siebel.www.xml.BaseAccount.AssetMgmtAssetOrderMgmt.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "ListOfAssetMgmt-AssetOrderMgmt");
            cachedSerQNames.add(qName);
            cls = com.siebel.www.xml.BaseAccount.AssetMgmtAssetOrderMgmt[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "AssetMgmt-AssetOrderMgmt");
            qName2 = new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "AssetMgmt-AssetOrderMgmt");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "ListOfBaseAccount");
            cachedSerQNames.add(qName);
            cls = com.siebel.www.xml.BaseAccount.Account[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "Account");
            qName2 = new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "Account");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "ListOfOrderEntry-LineItems");
            cachedSerQNames.add(qName);
            cls = com.siebel.www.xml.BaseAccount.OrderEntryLineItems[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "OrderEntry-LineItems");
            qName2 = new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "OrderEntry-LineItems");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "ListOfOrderEntry-Orders");
            cachedSerQNames.add(qName);
            cls = com.siebel.www.xml.BaseAccount.OrderEntryOrders[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "OrderEntry-Orders");
            qName2 = new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "OrderEntry-Orders");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "OrderEntry-LineItems");
            cachedSerQNames.add(qName);
            cls = com.siebel.www.xml.BaseAccount.OrderEntryLineItems.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "OrderEntry-Orders");
            cachedSerQNames.add(qName);
            cls = com.siebel.www.xml.BaseAccount.OrderEntryOrders.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.siebel.CustomUI.Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_1_Output customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_1(com.siebel.CustomUI.Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_1_Input customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_1_Input) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("document/http://siebel.com/CustomUI:Customer_spcAsset_spcSearch_spcWF_spc-_spcBT_spcDemo_1");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "Customer_spcAsset_spcSearch_spcWF_spc-_spcBT_spcDemo_1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_1_Input});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.siebel.CustomUI.Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_1_Output) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.siebel.CustomUI.Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_1_Output) org.apache.axis.utils.JavaUtils.convert(_resp, com.siebel.CustomUI.Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_1_Output.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
