package com.siebel.CustomUI;

public class Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemoProxy implements com.siebel.CustomUI.Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_PortType {
  private String _endpoint = null;
  private com.siebel.CustomUI.Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_PortType customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_PortType = null;
  
  public Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemoProxy() {
    _initCustomer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemoProxy();
  }
  
  public Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemoProxy(String endpoint) {
    _endpoint = endpoint;
    _initCustomer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemoProxy();
  }
  
  private void _initCustomer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemoProxy() {
    try {
      customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_PortType = (new com.siebel.CustomUI.Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_ServiceLocator()).getCustomer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo();
      if (customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_PortType != null)
      ((javax.xml.rpc.Stub)customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.siebel.CustomUI.Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_PortType getCustomer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_PortType() {
    if (customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_PortType == null)
      _initCustomer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemoProxy();
    return customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_PortType;
  }
  
  public com.siebel.CustomUI.Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_1_Output customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_1(com.siebel.CustomUI.Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_1_Input customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_1_Input) throws java.rmi.RemoteException{
    if (customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_PortType == null)
      _initCustomer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemoProxy();
    return customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_PortType.customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_1(customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_1_Input);
  }
  
  
}