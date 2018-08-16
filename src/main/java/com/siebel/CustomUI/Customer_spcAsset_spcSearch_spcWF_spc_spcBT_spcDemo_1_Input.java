/**
 * Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_1_Input.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.siebel.CustomUI;

public class Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_1_Input  implements java.io.Serializable {
    private java.lang.String billingAccntId;

    public Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_1_Input() {
    }

    public Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_1_Input(
           java.lang.String billingAccntId) {
           this.billingAccntId = billingAccntId;
    }


    /**
     * Gets the billingAccntId value for this Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_1_Input.
     * 
     * @return billingAccntId
     */
    public java.lang.String getBillingAccntId() {
        return billingAccntId;
    }


    /**
     * Sets the billingAccntId value for this Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_1_Input.
     * 
     * @param billingAccntId
     */
    public void setBillingAccntId(java.lang.String billingAccntId) {
        this.billingAccntId = billingAccntId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_1_Input)) return false;
        Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_1_Input other = (Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_1_Input) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.billingAccntId==null && other.getBillingAccntId()==null) || 
             (this.billingAccntId!=null &&
              this.billingAccntId.equals(other.getBillingAccntId())));
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
        if (getBillingAccntId() != null) {
            _hashCode += getBillingAccntId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_1_Input.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://siebel.com/CustomUI", ">Customer_spcAsset_spcSearch_spcWF_spc-_spcBT_spcDemo_1_Input"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingAccntId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://siebel.com/CustomUI", "BillingAccntId"));
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

	@Override
	public String toString() {
		return "Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_1_Input [billingAccntId=" + billingAccntId + "]";
	}
    
    

}
