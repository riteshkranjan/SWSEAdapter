package com.bt.consumer.SWSEAdapter.service;

import java.util.List;

import com.bt.consumer.SWSEAdapter.dto.Offers;
import com.bt.consumer.SWSEAdapter.dto.OrderDetails;
import com.bt.consumer.SWSEAdapter.dto.OrderItem;

public interface OrderService {

	public OrderDetails getAssetDetails(String assetId);

	public String addOrderItem(String orderNumber, Offers o, int cadAfter) throws Exception;
	
	public List<OrderItem> getOrderItems(String orderNumber, Offers o);

}
