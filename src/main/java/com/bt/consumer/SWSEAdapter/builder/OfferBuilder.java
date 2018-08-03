package com.bt.consumer.SWSEAdapter.builder;

import com.bt.consumer.SWSEAdapter.dto.Offers;
import com.bt.consumer.SWSEAdapter.enums.OfferType;
import com.bt.consumer.SWSEAdapter.enums.PriceType;

public class OfferBuilder {
	
	private Offers o;
	public OfferBuilder() {
		o = new Offers();
	}

	public Offers build() {
		return o;
	}
	
	public OfferBuilder withNameAndPartNum(String name, String partNum, OfferType type) {
		o.setName(name);
		o.setPartNum(partNum);
		o.setType(type);
		return this;
	}
	public OfferBuilder withPricingDetails(double price, boolean trackAsAsset, PriceType priceType) {
		o.setPrice(price);
		o.setTrackAsAsset(trackAsAsset);
		o.setPriceType(priceType);
		return this;
		
	}
}
