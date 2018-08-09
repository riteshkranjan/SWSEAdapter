/**
 * Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.siebel.CustomUI;

public class Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_ServiceLocator extends org.apache.axis.client.Service implements com.siebel.CustomUI.Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_Service {

    public Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_ServiceLocator() {
    }


    public Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo
    private java.lang.String Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_address = "http://blp02b14hsedb01/eai_enu/start.swe?SWEExtSource=WebService&SWEExtCmd=Execute&WSSOAP=1";

    public java.lang.String getCustomer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemoAddress() {
        return Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemoWSDDServiceName = "Customer_spcAsset_spcSearch_spcWF_spc-_spcBT_spcDemo";

    public java.lang.String getCustomer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemoWSDDServiceName() {
        return Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemoWSDDServiceName;
    }

    public void setCustomer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemoWSDDServiceName(java.lang.String name) {
        Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemoWSDDServiceName = name;
    }

    public com.siebel.CustomUI.Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_PortType getCustomer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCustomer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo(endpoint);
    }

    public com.siebel.CustomUI.Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_PortType getCustomer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.siebel.CustomUI.Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_BindingStub _stub = new com.siebel.CustomUI.Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_BindingStub(portAddress, this);
            _stub.setPortName(getCustomer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemoWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCustomer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemoEndpointAddress(java.lang.String address) {
        Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.siebel.CustomUI.Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.siebel.CustomUI.Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_BindingStub _stub = new com.siebel.CustomUI.Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_BindingStub(new java.net.URL(Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_address), this);
                _stub.setPortName(getCustomer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemoWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("Customer_spcAsset_spcSearch_spcWF_spc-_spcBT_spcDemo".equals(inputPortName)) {
            return getCustomer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://siebel.com/CustomUI", "Customer_spcAsset_spcSearch_spcWF_spc-_spcBT_spcDemo");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://siebel.com/CustomUI", "Customer_spcAsset_spcSearch_spcWF_spc-_spcBT_spcDemo"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo".equals(portName)) {
            setCustomer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemoEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
