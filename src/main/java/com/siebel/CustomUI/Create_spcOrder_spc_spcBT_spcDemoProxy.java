package com.siebel.CustomUI;

public class Create_spcOrder_spc_spcBT_spcDemoProxy implements com.siebel.CustomUI.Create_spcOrder_spc_spcBT_spcDemo_PortType {
  private String _endpoint = null;
  private com.siebel.CustomUI.Create_spcOrder_spc_spcBT_spcDemo_PortType create_spcOrder_spc_spcBT_spcDemo_PortType = null;
  
  public Create_spcOrder_spc_spcBT_spcDemoProxy() {
    _initCreate_spcOrder_spc_spcBT_spcDemoProxy();
  }
  
  public Create_spcOrder_spc_spcBT_spcDemoProxy(String endpoint) {
    _endpoint = endpoint;
    _initCreate_spcOrder_spc_spcBT_spcDemoProxy();
  }
  
  private void _initCreate_spcOrder_spc_spcBT_spcDemoProxy() {
    try {
      create_spcOrder_spc_spcBT_spcDemo_PortType = (new com.siebel.CustomUI.Create_spcOrder_spc_spcBT_spcDemo_ServiceLocator()).getCreate_spcOrder_spc_spcBT_spcDemo();
      if (create_spcOrder_spc_spcBT_spcDemo_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)create_spcOrder_spc_spcBT_spcDemo_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)create_spcOrder_spc_spcBT_spcDemo_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (create_spcOrder_spc_spcBT_spcDemo_PortType != null)
      ((javax.xml.rpc.Stub)create_spcOrder_spc_spcBT_spcDemo_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.siebel.CustomUI.Create_spcOrder_spc_spcBT_spcDemo_PortType getCreate_spcOrder_spc_spcBT_spcDemo_PortType() {
    if (create_spcOrder_spc_spcBT_spcDemo_PortType == null)
      _initCreate_spcOrder_spc_spcBT_spcDemoProxy();
    return create_spcOrder_spc_spcBT_spcDemo_PortType;
  }
  
  public com.siebel.CustomUI.Create_spcOrder_spc_spcBT_spcDemo_Output create_spcOrder_spc_spcBT_spcDemo(com.siebel.CustomUI.Create_spcOrder_spc_spcBT_spcDemo_Input create_spcOrder_spc_spcBT_spcDemo_Input) throws java.rmi.RemoteException{
    if (create_spcOrder_spc_spcBT_spcDemo_PortType == null)
      _initCreate_spcOrder_spc_spcBT_spcDemoProxy();
    return create_spcOrder_spc_spcBT_spcDemo_PortType.create_spcOrder_spc_spcBT_spcDemo(create_spcOrder_spc_spcBT_spcDemo_Input);
  }
  
  
}