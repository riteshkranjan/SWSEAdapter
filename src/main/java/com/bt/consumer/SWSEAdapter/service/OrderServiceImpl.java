package com.bt.consumer.SWSEAdapter.service;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.axis.AxisFault;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.bt.consumer.SWSEAdapter.builder.AssetBuilder;
import com.bt.consumer.SWSEAdapter.builder.OrderBuilder;
import com.bt.consumer.SWSEAdapter.builder.OrderItemBuilder;
import com.bt.consumer.SWSEAdapter.dto.Assets;
import com.bt.consumer.SWSEAdapter.dto.Offers;
import com.bt.consumer.SWSEAdapter.dto.OrderDetails;
import com.bt.consumer.SWSEAdapter.dto.OrderItem;
import com.bt.consumer.SWSEAdapter.enums.Action;
import com.bt.consumer.utils.ApplicationCache;
import com.siebel.CustomUI.Create_spcOrder_spc_spcBT_spcDemo_BindingStub;
import com.siebel.CustomUI.Create_spcOrder_spc_spcBT_spcDemo_Input;
import com.siebel.CustomUI.Create_spcOrder_spc_spcBT_spcDemo_Output;
import com.siebel.CustomUI.Create_spcOrder_spc_spcBT_spcDemo_ServiceLocator;

@Service
public class OrderServiceImpl extends
		SiebelRequestBuilderImpl<Create_spcOrder_spc_spcBT_spcDemo_BindingStub, Create_spcOrder_spc_spcBT_spcDemo_ServiceLocator>
		implements OrderService {

	private static final Logger logger = LoggerFactory.getLogger(OrderServiceImpl.class);

	@Autowired
	OfferService offerService;

	@Value("${swse.url}")
	private String url;

	@Override
	public OrderDetails getAssetDetails(String assetId) {
		OrderDetails details = new OrderDetails();
		List<OrderItem> orderItems = ApplicationCache.getOrderItems(assetId);
		details.setOrderItems(orderItems);
		details.setOrder(new OrderBuilder()
				.withOrderDetails("", "", ApplicationCache.getOrderNumber(assetId))
				.build());
		return details;
	}

	@Override
	public String addOrderItem(String orderNumber, Offers o, int cadAfter) throws Exception {
		Create_spcOrder_spc_spcBT_spcDemo_Input input = new Create_spcOrder_spc_spcBT_spcDemo_Input();
		input.setProduct_spcId("1-XHCR");
		logger.info("Hitting siebel to search at url = " + url);
		logger.info("with input = " + input.toString());
		String orderId = ((Create_spcOrder_spc_spcBT_spcDemo_Output) hitSiebel(input)).getOrderNumber();

		List<OrderItem> orderItems = ApplicationCache.getOrderItems(orderNumber);
		orderItems.addAll(getOrderItems(orderNumber, o));
		ApplicationCache.ORDER_ID = orderId;
		return orderId;
	}

	@Override
	public List<OrderItem> getOrderItems(String orderNumber, Offers o) {
		List<OrderItem> orderItems = new ArrayList<>();
		Assets a1 = new AssetBuilder(orderItems.size() + 1).withAssetDetails(orderNumber, o.getName())
				.withContractDetails(new Date(), orderNumber, null).build();
		orderItems.add(new OrderItemBuilder().withAssetAndAction(a1, Action.None.val).build());
		Offers discount = offerService.getDiscount(o.getPartNum());

		
		Assets a2 = null;
		if (discount != null) {
			a2 = new AssetBuilder(orderItems.size() + 2).withAssetDetails(orderNumber, discount.getName())
					.withContractDetails(new Date(), orderNumber, null).build();
			orderItems.add(new OrderItemBuilder().withAssetAndAction(a2, Action.None.val).build());
		}
		ApplicationCache.updateSearchResult(orderNumber, a1, a2);
		return orderItems;
	}

	@Override
	protected java.io.Serializable hitSiebel(java.io.Serializable input) throws Exception {

		Create_spcOrder_spc_spcBT_spcDemo_Output output = getSiebelService()
				.create_spcOrder_spc_spcBT_spcDemo((Create_spcOrder_spc_spcBT_spcDemo_Input) input);
		logger.info("Received response from siebel = " + output.toString());
		return output;
	}

	@Override
	public Create_spcOrder_spc_spcBT_spcDemo_BindingStub init() throws AxisFault, MalformedURLException {
		Create_spcOrder_spc_spcBT_spcDemo_ServiceLocator service = new Create_spcOrder_spc_spcBT_spcDemo_ServiceLocator();
		return new Create_spcOrder_spc_spcBT_spcDemo_BindingStub(new URL(url), service);
	}

}
