package com.bt.consumer.SWSEAdapter.service;

import java.net.URL;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

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
public class OrderServiceImpl implements OrderService {

	@Autowired
	OfferService offerService;

	@Value("${swse.session.type.name}")
	private String sessionTypeTag;

	@Value("${swse.password.text.name}")
	private String passwordTextTag;

	@Value("${swse.username.token.name}")
	private String userNameToken;

	@Value("${swse.header.schema.url}")
	private String headerSchemaUri;

	@Value("${swse.user.name}")
	private String userName;

	@Value("${swse.user.password}")
	private String password;

	@Value("${swse.session.type}")
	private String sessionType;

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
		details.setOrder(o);
		details.setOrderItems(orderToOrderItemsMap.get(o.getOrderNumber()));
		return details;
	}

	@Override
	public String addOrderItem(String orderNumber, Offers o, int cadAfter) throws Exception {
		String orderId = "1-" + new Random().nextInt(10000);
		if (MainController.WSDL_MODE) {
			orderId =  createOrderAtSiebel("1-XHCR");
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

	private String createOrderAtSiebel(String productId) throws Exception {
		Create_spcOrder_spc_spcBT_spcDemo_ServiceLocator service = new Create_spcOrder_spc_spcBT_spcDemo_ServiceLocator();
		Create_spcOrder_spc_spcBT_spcDemo_BindingStub stub = new Create_spcOrder_spc_spcBT_spcDemo_BindingStub(
				new URL(url), service);
		stub.setHeader(headerSchemaUri, userNameToken, userName);
		stub.setHeader(headerSchemaUri, passwordTextTag, password);
		stub.setHeader(headerSchemaUri, sessionTypeTag, sessionType);
		Create_spcOrder_spc_spcBT_spcDemo_Input input = new Create_spcOrder_spc_spcBT_spcDemo_Input();
		input.setProduct_spcId(productId);
		Create_spcOrder_spc_spcBT_spcDemo_Output output = stub.create_spcOrder_spc_spcBT_spcDemo(input);
		return output.getOrderNumber();
	}
}
