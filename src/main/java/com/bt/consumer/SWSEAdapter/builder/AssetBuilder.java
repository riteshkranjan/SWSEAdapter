package com.bt.consumer.SWSEAdapter.builder;

import java.util.Date;

import com.bt.consumer.SWSEAdapter.dto.Assets;

public class AssetBuilder {
	private Assets a;
	public AssetBuilder() {
		a = new Assets();
	}
    public AssetBuilder withAssetDetails(String assetNumber, String product) {
    	a.setAssetNumber(assetNumber);
    	a.setProduct(product);
    	return this;
    }
    public AssetBuilder withContractDetails(Date contractEndDate, String serviceId, String billingAccountNo) {
    	a.setContractEndDate(contractEndDate);
    	a.setServiceId(serviceId);
    	a.setBillingAccountNo(billingAccountNo);
    	return this;
    }
    public AssetBuilder withPromotionIntg(String promotionInteg) {
    	a.setPromotionInteg(promotionInteg);
    	return this;
    }
    
    public Assets build() {
    	return a;
    }
}
