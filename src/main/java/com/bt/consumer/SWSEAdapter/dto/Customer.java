package com.bt.consumer.SWSEAdapter.dto;

import java.io.Serializable;
import java.util.Date;

public class Customer implements Serializable{
	
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
	private Date t_bLastUpdated;
	private Date lastPromoted;
	private Date registraionDate;
	private Date ukResidencyDeclareDate;
	private Date lastContactDate;
	private String promoted;
	private String lastContactOutcome;
	private String lastContactType;
	private boolean isHazardWarningNote;
	private boolean isVATInvoice;
	private boolean isAnonymous;
	private String cutomerPhase;
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
	public Date getT_bLastUpdated() {
		return t_bLastUpdated;
	}
	public void setT_bLastUpdated(Date t_bLastUpdated) {
		this.t_bLastUpdated = t_bLastUpdated;
	}
	public Date getLastPromoted() {
		return lastPromoted;
	}
	public void setLastPromoted(Date lastPromoted) {
		this.lastPromoted = lastPromoted;
	}
	public Date getRegistraionDate() {
		return registraionDate;
	}
	public void setRegistraionDate(Date registraionDate) {
		this.registraionDate = registraionDate;
	}
	public Date getUkResidencyDeclareDate() {
		return ukResidencyDeclareDate;
	}
	public void setUkResidencyDeclareDate(Date ukResidencyDeclareDate) {
		this.ukResidencyDeclareDate = ukResidencyDeclareDate;
	}
	public Date getLastContactDate() {
		return lastContactDate;
	}
	public void setLastContactDate(Date lastContactDate) {
		this.lastContactDate = lastContactDate;
	}
	public String getPromoted() {
		return promoted;
	}
	public void setPromoted(String promoted) {
		this.promoted = promoted;
	}
	public String getLastContactOutcome() {
		return lastContactOutcome;
	}
	public void setLastContactOutcome(String lastContactOutcome) {
		this.lastContactOutcome = lastContactOutcome;
	}
	public String getLastContactType() {
		return lastContactType;
	}
	public void setLastContactType(String lastContactType) {
		this.lastContactType = lastContactType;
	}
	public boolean isHazardWarningNote() {
		return isHazardWarningNote;
	}
	public void setHazardWarningNote(boolean isHazardWarningNote) {
		this.isHazardWarningNote = isHazardWarningNote;
	}
	public boolean isVATInvoice() {
		return isVATInvoice;
	}
	public void setVATInvoice(boolean isVATInvoice) {
		this.isVATInvoice = isVATInvoice;
	}
	public boolean isAnonymous() {
		return isAnonymous;
	}
	public void setAnonymous(boolean isAnonymous) {
		this.isAnonymous = isAnonymous;
	}
	public String getCutomerPhase() {
		return cutomerPhase;
	}
	public void setCutomerPhase(String cutomerPhase) {
		this.cutomerPhase = cutomerPhase;
	}
}
