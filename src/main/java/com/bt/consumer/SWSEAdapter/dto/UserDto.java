package com.bt.consumer.SWSEAdapter.dto;

import java.io.Serializable;

public class UserDto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -491091159986378261L;
	private String ein;
	private String consumer;
	private String customerSummary;
	private String billingSummary;
	private String contactSummary;
	private boolean t_b;
	public String getEin() {
		return ein;
	}
	public void setEin(String ein) {
		this.ein = ein;
	}
	public String getConsumer() {
		return consumer;
	}
	public void setConsumer(String consumer) {
		this.consumer = consumer;
	}
	
	public String getCustomerSummary() {
		return customerSummary;
	}
	public void setCustomerSummary(String customerSummary) {
		this.customerSummary = customerSummary;
	}
	public String getBillingSummary() {
		return billingSummary;
	}
	public void setBillingSummary(String billingSummary) {
		this.billingSummary = billingSummary;
	}
	public String getContactSummary() {
		return contactSummary;
	}
	public void setContactSummary(String contactSummary) {
		this.contactSummary = contactSummary;
	}
	public boolean isT_b() {
		return t_b;
	}
	public void setT_b(boolean t_b) {
		this.t_b = t_b;
	}
	

}
