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
import com.bt.consumer.SWSEAdapter.dto.Assets;
import com.bt.consumer.SWSEAdapter.dto.Offers;
import com.bt.consumer.SWSEAdapter.dto.OrderDetails;
import com.bt.consumer.SWSEAdapter.dto.OrderItem;
import com.bt.consumer.SWSEAdapter.dto.SearchResult;
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

	private static final Logger logger = LoggerFactory.getLogger(OrderServiceImpl.class);

	@Autowired
	OfferService offerService;

	@Value("${swse.url}")
	private String url;

	@Override
	public OrderDetails getAssetDetails(String assetId) {
		OrderDetails details = new OrderDetails();
		List<OrderItem> orderItems = getOrderItems(assetId);
		details.setOrderItems(orderItems);
		details.setOrder(new OrderBuilder()
				.withOrderDetails("", "", SearchServiceImpl.ORDER_ID.equals("") ? assetId : SearchServiceImpl.ORDER_ID)
				.build());
		return details;
	}

	private List<OrderItem> getOrderItems(String assetId) {
		SearchResult searchResult = SearchServiceImpl.searchResult.get(assetId);
		List<Assets> assets = searchResult.getAssets();

		List<OrderItem> orderItems = new ArrayList<>();
		for (Assets a : assets) {
			OrderItem o = assetToOrderItemMapping(a, Action.None.val);
			orderItems.add(o);
		}
		return orderItems;
	}

	private OrderItem assetToOrderItemMapping(Assets a, String action) {
		OrderItem o = new OrderItem();
		o.setAction(action);
		o.setCustomerAgreedDate(new Date());
		o.setProduct(a.getProduct());
		o.setStatus(Status.Pending);
		o.setSubStatus(Substatus.InProgress);
		o.setPromIntegrationId(a.getPromotionInteg());
		o.setServiceId(a.getServiceId());
		return o;
	}

	@Override
	public String addOrderItem(String orderNumber, Offers o, int cadAfter) throws Exception {
		Create_spcOrder_spc_spcBT_spcDemo_Input input = new Create_spcOrder_spc_spcBT_spcDemo_Input();
		input.setProduct_spcId("1-XHCR");
		logger.info("Hitting siebel to search at url = " + url);
		logger.info("with input = " + input.toString());
		String orderId = ((Create_spcOrder_spc_spcBT_spcDemo_Output) hitSiebel(input)).getOrderNumber();

		List<OrderItem> orderItems = getOrderItems(orderNumber);
		orderItems.addAll(getOrderItems(orderNumber, o));
		SearchServiceImpl.ORDER_ID = orderId;
		return orderId;
	}

	@Override
	public List<OrderItem> getOrderItems(String orderNumber, Offers o) {
		List<OrderItem> orderItems = new ArrayList<>();
		Assets a1 = new AssetBuilder(orderItems.size() + 1).withAssetDetails(orderNumber, o.getName())
				.withContractDetails(new Date(), orderNumber, null).build();
		orderItems.add(assetToOrderItemMapping(a1, Action.Add.val));
		Offers discount = offerService.getDiscount(o.getPartNum());

		SearchResult searchResult = SearchServiceImpl.searchResult.get(orderNumber);
		Assets a2 = null;
		if (discount != null) {
			a2 = new AssetBuilder(orderItems.size() + 1).withAssetDetails(orderNumber, discount.getName())
					.withContractDetails(new Date(), orderNumber, null).build();
			orderItems.add(assetToOrderItemMapping(a1, Action.Add.val));
		}
		if (searchResult != null) {
			List<Assets> assets = searchResult.getAssets();
			assets.add(a1);
			if (a2 != null)
				assets.add(a2);
		}
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
