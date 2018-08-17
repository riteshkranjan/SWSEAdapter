package com.bt.consumer.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.bt.consumer.SWSEAdapter.builder.OrderItemBuilder;
import com.bt.consumer.SWSEAdapter.dto.Assets;
import com.bt.consumer.SWSEAdapter.dto.OrderItem;
import com.bt.consumer.SWSEAdapter.dto.SearchResult;
import com.bt.consumer.SWSEAdapter.enums.Action;

public class ApplicationCache {

	public static String ORDER_ID = "";

	public static Map<String, SearchResult> searchResult = new HashMap<String, SearchResult>();

	public static List<OrderItem> getOrderItems(String assetId) {
		SearchResult searchResult = ApplicationCache.searchResult.get(assetId);
		List<Assets> assets = searchResult.getAssets();

		List<OrderItem> orderItems = new ArrayList<>();
		for (Assets a : assets) {
			orderItems.add(new OrderItemBuilder().withAssetAndAction(a, Action.None.val).build());
		}
		return orderItems;
	}

	public static void updateSearchResult(String orderNumber, Assets a1, Assets a2) {
		SearchResult searchResult = ApplicationCache.searchResult.get(orderNumber);
		if (searchResult != null) {
			List<Assets> assets = searchResult.getAssets();
			assets.add(a1);
			if (a2 != null)
				assets.add(a2);
		}
	}

	public static String getOrderNumber(String assetId) {
		return ORDER_ID.equals("") ? assetId : ORDER_ID;
	}

	public static void updateOrderId(String billingActNum) {
		ORDER_ID = billingActNum;
	}
}
