/**
 * Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_1_Output.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.siebel.CustomUI;

public class Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_1_Output  implements java.io.Serializable {
    private com.siebel.www.xml.BaseAccount.Account[] listOfBaseAccount;

    public Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_1_Output() {
    }

    public Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_1_Output(
           com.siebel.www.xml.BaseAccount.Account[] listOfBaseAccount) {
           this.listOfBaseAccount = listOfBaseAccount;
    }


    /**
     * Gets the listOfBaseAccount value for this Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_1_Output.
     * 
     * @return listOfBaseAccount
     */
    public com.siebel.www.xml.BaseAccount.Account[] getListOfBaseAccount() {
        return listOfBaseAccount;
    }


    /**
     * Sets the listOfBaseAccount value for this Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_1_Output.
     * 
     * @param listOfBaseAccount
     */
    public void setListOfBaseAccount(com.siebel.www.xml.BaseAccount.Account[] listOfBaseAccount) {
        this.listOfBaseAccount = listOfBaseAccount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_1_Output)) return false;
        Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_1_Output other = (Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_1_Output) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.listOfBaseAccount==null && other.getListOfBaseAccount()==null) || 
             (this.listOfBaseAccount!=null &&
              java.util.Arrays.equals(this.listOfBaseAccount, other.getListOfBaseAccount())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getListOfBaseAccount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListOfBaseAccount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListOfBaseAccount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_1_Output.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://siebel.com/CustomUI", ">Customer_spcAsset_spcSearch_spcWF_spc-_spcBT_spcDemo_1_Output"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listOfBaseAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "ListOfBaseAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "ListOfBaseAccount"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
