package com.bt.consumer.SWSEAdapter.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.bt.consumer.SWSEAdapter.BaseTest;
import com.bt.consumer.SWSEAdapter.builder.OfferBuilder;
import com.bt.consumer.SWSEAdapter.dto.Offers;
import com.bt.consumer.SWSEAdapter.dto.Order;
import com.bt.consumer.SWSEAdapter.dto.OrderDetails;
import com.bt.consumer.SWSEAdapter.dto.OrderItem;
import com.bt.consumer.SWSEAdapter.enums.Action;
import com.bt.consumer.SWSEAdapter.enums.OfferType;
import com.bt.consumer.SWSEAdapter.enums.PriceType;
import com.bt.consumer.SWSEAdapter.enums.Status;
import com.bt.consumer.SWSEAdapter.enums.Substatus;

public class OrderServiceImplTest extends BaseTest {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	@Autowired
	OrderService service;

	@Autowired
	SearchService search;

	private void validateOrderItems(List<OrderItem> l) throws ParseException {
		OrderItem i = l.get(0);
		Assert.assertEquals(Action.None.val, i.getAction());
		Assert.assertEquals(Status.Pending, i.getStatus());
		Assert.assertEquals(Substatus.InProgress, i.getSubStatus());
		Assert.assertEquals("Broadband Service", i.getProduct());
		Assert.assertEquals("1-XHTR", i.getPromIntegrationId());
		Assert.assertEquals("1-AQP", i.getServiceId());

		i = l.get(1);
		Assert.assertEquals(Action.None.val, i.getAction());
		Assert.assertEquals(Status.Pending, i.getStatus());
		Assert.assertEquals(Substatus.InProgress, i.getSubStatus());
		Assert.assertEquals("PSTN Service", i.getProduct());
		Assert.assertEquals("1-XHU2", i.getPromIntegrationId());
		Assert.assertEquals("1-AQP", i.getServiceId());

	}

	@Test
	public void testAddOrderItem() throws Exception {
		search.search("123456789", "1-AQP");
		int expectedOrderItemSize = 6;
		OrderDetails assetDetails = service.getAssetDetails("1-AQP");
		Order o = assetDetails.getOrder();
		Assert.assertEquals("1-AQP", o.getOrderNumber());
		List<OrderItem> l = assetDetails.getOrderItems();
		Assert.assertEquals(expectedOrderItemSize, l.size());
		validateOrderItems(l);

		Offers offers = new OfferBuilder()
				.withNameAndPartNum("Infinity offer 12 months 3 pounds disocunt", "S0129", OfferType.Product)
				.withPricingDetails(10.0, true, PriceType.Recurring).build();
		String newOrderId = service.addOrderItem("1-AQP", offers, 5);
		System.out.println("new Order created at sieble : " + newOrderId);
		assetDetails = service.getAssetDetails("1-AQP");
		o = assetDetails.getOrder();
		l = assetDetails.getOrderItems();
		Assert.assertEquals(expectedOrderItemSize + 2, l.size());
		validateOrderItems(l);

		OrderItem i = l.get(expectedOrderItemSize);
		Assert.assertEquals(Action.None.val, i.getAction());
		Assert.assertEquals("Infinity offer 12 months 3 pounds disocunt", i.getProduct());

		i = l.get(expectedOrderItemSize + 1);
		Assert.assertEquals(Action.None.val, i.getAction());
		Assert.assertEquals("Infinity Disc 12 months 3 pounds", i.getProduct());
	}

}
