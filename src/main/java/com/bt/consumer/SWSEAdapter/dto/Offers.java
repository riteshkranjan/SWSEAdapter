package com.bt.consumer.SWSEAdapter.dto;

import java.io.Serializable;

import com.bt.consumer.SWSEAdapter.enums.OfferType;
import com.bt.consumer.SWSEAdapter.enums.PriceType;

public class Offers implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3593262047234605185L;
	private String name;
	private String partNum;
	private boolean trackAsAsset;
	private double price;
	private OfferType type;
	private PriceType priceType;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPartNum() {
		return partNum;
	}
	public void setPartNum(String partNum) {
		this.partNum = partNum;
	}
	public boolean isTrackAsAsset() {
		return trackAsAsset;
	}
	public void setTrackAsAsset(boolean trackAsAsset) {
		this.trackAsAsset = trackAsAsset;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public OfferType getType() {
		return type;
	}
	public void setType(OfferType type) {
		this.type = type;
	}
	public PriceType getPriceType() {
		return priceType;
	}
	public void setPriceType(PriceType priceType) {
		this.priceType = priceType;
	}

}
