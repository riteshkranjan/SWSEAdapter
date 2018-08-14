package com.bt.consumer.SWSEAdapter.service;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.apache.axis.AxisFault;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.bt.consumer.SWSEAdapter.builder.OrderBuilder;
import com.bt.consumer.SWSEAdapter.builder.OrderItemBuilder;
import com.bt.consumer.SWSEAdapter.controller.MainController;
import com.bt.consumer.SWSEAdapter.dto.Offers;
import com.bt.consumer.SWSEAdapter.dto.Order;
import com.bt.consumer.SWSEAdapter.dto.OrderDetails;
import com.bt.consumer.SWSEAdapter.dto.OrderItem;
import com.bt.consumer.SWSEAdapter.enums.Action;
import com.bt.consumer.SWSEAdapter.enums.Status;
import com.bt.consumer.SWSEAdapter.enums.Substatus;
import com.siebel.CustomUI.Create_spcOrder_spc_spcBT_spcDemo_BindingStub;
import com.siebel.CustomUI.Create_spcOrder_spc_spcBT_spcDemo_Input;
import com.siebel.CustomUI.Create_spcOrder_spc_spcBT_spcDemo_Output;
import com.siebel.CustomUI.Create_spcOrder_spc_spcBT_spcDemo_ServiceLocator;

@Service
public class OrderServiceImpl extends
		SiebelRequestBuilderImpl<Create_spcOrder_spc_spcBT_spcDemo_BindingStub, Create_spcOrder_spc_spcBT_spcDemo_ServiceLocator>
		implements OrderService {

	@Autowired
	OfferService offerService;

	@Value("${swse.url}")
	private String url;

	private static Map<String, Order> assetToOrderMap = new HashMap<>();
	private static Map<String, List<OrderItem>> orderToOrderItemsMap = new HashMap<>();
	static {
		assetToOrderMap.put("3-3473578826",
				new OrderBuilder().withOrderDetails("0202789136", "Mr. Jerry Peter", "VOL013-3554374863")
						.withOrderStatus(Status.Pending, Substatus.InProgress).build());
		OrderItem o1 = new OrderItemBuilder().withAction(Action.None)
				.withOrderStatus(Status.Pending, Substatus.InProgress).withCAD("08/12/2017 06:23:14")
				.withOrderDetails("some-value1", "Call Plan UWC", "some-intg-value1", null).build();
		OrderItem o2 = new OrderItemBuilder().withAction(Action.None)
				.withOrderStatus(Status.Pending, Substatus.InProgress).withCAD("08/12/2017 06:23:14")
				.withOrderDetails("some-value2", "Customer PSTN Service", "some-intg-value2", "01154329426")
				.withPrice(0.0).build();
		OrderItem o3 = new OrderItemBuilder().withAction(Action.None)
				.withOrderStatus(Status.Pending, Substatus.InProgress).withCAD("08/12/2017 06:23:14")
				.withOrderDetails("some-value3", "BB Access Service", "some-intg-value3", "01154329426").withPrice(0.0)
				.build();
		OrderItem o4 = new OrderItemBuilder().withAction(Action.None)
				.withOrderStatus(Status.Pending, Substatus.InProgress).withCAD("08/12/2017 06:23:14")
				.withOrderDetails("some-value4", "Multi Play", "some-intg-value4", null).withPrice(0.0).build();
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
		if (MainController.WSDL_MODE && o == null) {
			/*
			 * hardcoding get asset details here as siebel developers are very busy to
			 * expose this api to us. needed something to display on screen hence harcoding
			 */
			o = assetToOrderMap.get("3-3473578826");
		}
		details.setOrder(o);
		details.setOrderItems(orderToOrderItemsMap.get(o.getOrderNumber()));
		return details;
	}

	@Override
	public String addOrderItem(String orderNumber, Offers o, int cadAfter) throws Exception {
		String orderId = "1-" + new Random().nextInt(10000);
		if (MainController.WSDL_MODE) {
			Create_spcOrder_spc_spcBT_spcDemo_Input input = new Create_spcOrder_spc_spcBT_spcDemo_Input();
			input.setProduct_spcId("1-XHCR");
			orderId = ((Create_spcOrder_spc_spcBT_spcDemo_Output) hitSiebel(input)).getOrderNumber();
		}
		List<OrderItem> orderItems = orderToOrderItemsMap.get(orderNumber);
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DAY_OF_MONTH, cadAfter);
		orderItems.add(new OrderItemBuilder().withNewOfferDetails(o, c.getTime()).build());
		Offers discount = offerService.getDiscount(o.getPartNum());
		if (discount != null)
			orderItems.add(new OrderItemBuilder().withNewOfferDetails(discount, c.getTime()).build());

		return orderId;

	}

	@Override
	protected java.io.Serializable hitSiebel(java.io.Serializable input) throws Exception {
		return getSiebelService().create_spcOrder_spc_spcBT_spcDemo((Create_spcOrder_spc_spcBT_spcDemo_Input) input);
	}

	@Override
	public Create_spcOrder_spc_spcBT_spcDemo_BindingStub init() throws AxisFault, MalformedURLException {
		Create_spcOrder_spc_spcBT_spcDemo_ServiceLocator service = new Create_spcOrder_spc_spcBT_spcDemo_ServiceLocator();
		return new Create_spcOrder_spc_spcBT_spcDemo_BindingStub(new URL(url), service);
	}
}
