package com.bt.consumer.SWSEAdapter.dto;

import java.io.Serializable;
import java.util.Date;

public class Assets implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7951878696829427971L;
	private int sequenceId;
	private String assetNumber;
	private String product;
	private Date contractEndDate;
	private String serviceId;
	private String billingAccountNo;
	private String promotionInteg;
	public int getSequenceId() {
		return sequenceId;
	}
	public void setSequenceId(int sequenceId) {
		this.sequenceId = sequenceId;
	}
	public String getAssetNumber() {
		return assetNumber;
	}
	public void setAssetNumber(String assetNumber) {
		this.assetNumber = assetNumber;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public Date getContractEndDate() {
		return contractEndDate;
	}
	public void setContractEndDate(Date contractEndDate) {
		this.contractEndDate = contractEndDate;
	}
	public String getServiceId() {
		return serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}
	public String getBillingAccountNo() {
		return billingAccountNo;
	}
	public void setBillingAccountNo(String billingAccountNo) {
		this.billingAccountNo = billingAccountNo;
	}
	public String getPromotionInteg() {
		return promotionInteg;
	}
	public void setPromotionInteg(String promotionInteg) {
		this.promotionInteg = promotionInteg;
	} 

}
