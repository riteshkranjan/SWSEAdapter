package com.bt.consumer.SWSEAdapter.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.bt.consumer.SWSEAdapter.builder.OrderBuilder;
import com.bt.consumer.SWSEAdapter.builder.OrderItemBuilder;
import com.bt.consumer.SWSEAdapter.dto.Offers;
import com.bt.consumer.SWSEAdapter.dto.Order;
import com.bt.consumer.SWSEAdapter.dto.OrderDetails;
import com.bt.consumer.SWSEAdapter.dto.OrderItem;
import com.bt.consumer.SWSEAdapter.enums.Action;
import com.bt.consumer.SWSEAdapter.enums.Status;
import com.bt.consumer.SWSEAdapter.enums.Substatus;

@Service
public class OrderServiceImpl implements OrderService{
	private static Map<String, Order> assetToOrderMap = new HashMap<>();
	private static Map<String, List<OrderItem>> orderToOrderItemsMap = new HashMap<>();
	static {
		assetToOrderMap.put("3-3473578826", new OrderBuilder().withOrderDetails("0202789136", "Mr. Jerry Peter", "VOL013-3554374863").withOrderStatus(Status.Pending, Substatus.InProgress).build());
		OrderItem o1 = new OrderItemBuilder().withAction(Action.Delete).withOrderStatus(Status.Pending, Substatus.InProgress).withCAD("08/12/2017 06:23:14").withOrderDetails("some-value1", "Call Plan UWC", "some-intg-value1", null).build();
		OrderItem o2 = new OrderItemBuilder().withAction(Action.Update).withOrderStatus(Status.Pending, Substatus.InProgress).withCAD("08/12/2017 06:23:14").withOrderDetails("some-value2", "Customer PSTN Service", "some-intg-value2", "01154329426").withPrice(0.0).build();
		OrderItem o3 = new OrderItemBuilder().withAction(Action.Update).withOrderStatus(Status.Pending, Substatus.InProgress).withCAD("08/12/2017 06:23:14").withOrderDetails("some-value3", "BB Access Service", "some-intg-value3", "01154329426").withPrice(0.0).build();
		OrderItem o4 = new OrderItemBuilder().withAction(Action.Update).withOrderStatus(Status.Pending, Substatus.InProgress).withCAD("08/12/2017 06:23:14").withOrderDetails("some-value4", "Multi Play", "some-intg-value4", null).withPrice(0.0).build();
		List<OrderItem> l = new ArrayList<>();
		l.add(o1);
		l.add(o2);
		l.add(o3);
		l.add(o4);
		orderToOrderItemsMap.put("VOL013-3554374863", l);
	}
	
	@Override
	public OrderDetails getAssetDetails(String assetId) {
		OrderDetails details = new OrderDetails();
		Order o = assetToOrderMap.get(assetId);
		details.setOrder(o);
		details.setOrderItems(orderToOrderItemsMap.get(o.getOrderNumber()));
		return details;
	}

	@Override
	public void addOrderItem(String orderNumber, Offers o, int cadAfter) {
		List<OrderItem> orderItems = orderToOrderItemsMap.get(orderNumber);
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DAY_OF_MONTH, cadAfter);
		orderItems.add(new OrderItemBuilder().withNewOfferDetails(o, c.getTime()).build());
		
	}

}
