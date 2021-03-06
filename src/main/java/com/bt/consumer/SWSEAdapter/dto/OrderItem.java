package com.bt.consumer.SWSEAdapter.dto;

import java.io.Serializable;
import java.util.Date;

import com.bt.consumer.SWSEAdapter.enums.Status;
import com.bt.consumer.SWSEAdapter.enums.Substatus;

public class OrderItem implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6479522378499332622L;
	private String product;
	private String action;
	private Date customerAgreedDate;
	private Status status;
	private Substatus subStatus;
	private String serviceId;
	private String assetIntegId;
	private String promIntegrationId;
	private Double price;
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public Date getCustomerAgreedDate() {
		return customerAgreedDate;
	}
	public void setCustomerAgreedDate(Date customerAgreedDate) {
		this.customerAgreedDate = customerAgreedDate;
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
	public String getServiceId() {
		return serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}
	public String getAssetIntegId() {
		return assetIntegId;
	}
	public void setAssetIntegId(String assetIntegId) {
		this.assetIntegId = assetIntegId;
	}
	public String getPromIntegrationId() {
		return promIntegrationId;
	}
	public void setPromIntegrationId(String promIntegrationId) {
		this.promIntegrationId = promIntegrationId;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "OrderItem [product=" + product + ", action=" + action + ", customerAgreedDate=" + customerAgreedDate
				+ ", status=" + status + ", subStatus=" + subStatus + ", serviceId=" + serviceId + ", assetIntegId="
				+ assetIntegId + ", promIntegrationId=" + promIntegrationId + ", price=" + price + "]";
	}
	
}
