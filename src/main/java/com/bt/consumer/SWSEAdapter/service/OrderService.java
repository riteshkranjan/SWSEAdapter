package com.bt.consumer.SWSEAdapter.service;

import com.bt.consumer.SWSEAdapter.dto.Offers;
import com.bt.consumer.SWSEAdapter.dto.OrderDetails;

public interface OrderService {

	public OrderDetails getAssetDetails(String assetId);

	public String addOrderItem(String orderNumber, Offers o, int cadAfter) throws Exception;

}
