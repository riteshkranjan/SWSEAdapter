/**
 * Create_spcOrder_spc_spcBT_spcDemo_Input.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.siebel.CustomUI;

public class Create_spcOrder_spc_spcBT_spcDemo_Input  implements java.io.Serializable {
    private java.lang.String product_spcId;

    public Create_spcOrder_spc_spcBT_spcDemo_Input() {
    }

    public Create_spcOrder_spc_spcBT_spcDemo_Input(
           java.lang.String product_spcId) {
           this.product_spcId = product_spcId;
    }


    /**
     * Gets the product_spcId value for this Create_spcOrder_spc_spcBT_spcDemo_Input.
     * 
     * @return product_spcId
     */
    public java.lang.String getProduct_spcId() {
        return product_spcId;
    }


    /**
     * Sets the product_spcId value for this Create_spcOrder_spc_spcBT_spcDemo_Input.
     * 
     * @param product_spcId
     */
    public void setProduct_spcId(java.lang.String product_spcId) {
        this.product_spcId = product_spcId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Create_spcOrder_spc_spcBT_spcDemo_Input)) return false;
        Create_spcOrder_spc_spcBT_spcDemo_Input other = (Create_spcOrder_spc_spcBT_spcDemo_Input) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.product_spcId==null && other.getProduct_spcId()==null) || 
             (this.product_spcId!=null &&
              this.product_spcId.equals(other.getProduct_spcId())));
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
        if (getProduct_spcId() != null) {
            _hashCode += getProduct_spcId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Create_spcOrder_spc_spcBT_spcDemo_Input.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://siebel.com/CustomUI", ">Create_spcOrder_spc-_spcBT_spcDemo_Input"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product_spcId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://siebel.com/CustomUI", "Product_spcId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
