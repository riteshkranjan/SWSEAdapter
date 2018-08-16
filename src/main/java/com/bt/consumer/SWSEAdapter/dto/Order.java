package com.bt.consumer.SWSEAdapter.dto;

import java.io.Serializable;

import com.bt.consumer.SWSEAdapter.enums.Status;
import com.bt.consumer.SWSEAdapter.enums.Substatus;

public class Order implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8316371136289989523L;
	private String orderNumber;
	private Status status;
	private Substatus subStatus;
	private String billingAccountNumber;
	private String customerId;
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public Substatus getSubStatus() {
		return subStatus;
	}
	public void setSubStatus(Substatus subStatus) {
		this.subStatus = subStatus;
	}
	public String getBillingAccountNumber() {
		return billingAccountNumber;
	}
	public void setBillingAccountNumber(String billingAccountNumber) {
		this.billingAccountNumber = billingAccountNumber;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	@Override
	public String toString() {
		return "Order [orderNumber=" + orderNumber + ", status=" + status + ", subStatus=" + subStatus
				+ ", billingAccountNumber=" + billingAccountNumber + ", customerId=" + customerId + "]";
	}
	
}
