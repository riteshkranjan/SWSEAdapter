package com.bt.consumer.SWSEAdapter.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SearchResult implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 151994936477298208L;
	private Customer customer;
	private List<Assets> assets = new ArrayList<>();
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public List<Assets> getAssets() {
		return assets;
	}
	public void setAssets(List<Assets> assets) {
		this.assets = assets;
	}
	
	
}
