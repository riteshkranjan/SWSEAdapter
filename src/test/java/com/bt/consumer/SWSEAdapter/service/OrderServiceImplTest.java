package com.bt.consumer.SWSEAdapter.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
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
	private static final String ORDER_NUMBER = "VOL013-3554374863";
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	@Autowired
	OrderService service;

	/*
	 * @Test public void testGetAssetDetails() throws ParseException { OrderDetails
	 * assetDetails = service.getAssetDetails("3-3473578826"); Order o =
	 * assetDetails.getOrder(); Assert.assertEquals("0202789136",
	 * o.getBillingAccountNumber()); Assert.assertEquals("Mr. Jerry Peter",
	 * o.getCustomerId()); Assert.assertEquals(ORDER_NUMBER, o.getOrderNumber());
	 * Assert.assertEquals(Status.Pending, o.getStatus());
	 * Assert.assertEquals(Substatus.InProgress, o.getSubStatus()); List<OrderItem>
	 * l = assetDetails.getOrderItems(); Assert.assertEquals(expectedOrderItemSize,
	 * l.size()); validateOrderItems(l); }
	 */
	private void validateOrderItems(List<OrderItem> l) throws ParseException {
		OrderItem i = l.get(0);
		Assert.assertEquals(Action.None.val, i.getAction());
		Assert.assertEquals(sdf.parse("08/12/2017 06:23:14").getTime(), i.getCustomerAgreedDate().getTime());
		Assert.assertNull(i.getPrice());
		Assert.assertNull(i.getServiceId());
		Assert.assertEquals(Status.Pending, i.getStatus());
		Assert.assertEquals("Call Plan UWC", i.getProduct());
		Assert.assertEquals("some-value1", i.getAssetIntegId());
		Assert.assertEquals("some-intg-value1", i.getPromIntegrationId());
		Assert.assertEquals(Substatus.InProgress, i.getSubStatus());

		i = l.get(1);
		Assert.assertEquals(Action.None.val, i.getAction());
		Assert.assertEquals(sdf.parse("08/12/2017 06:23:14").getTime(), i.getCustomerAgreedDate().getTime());
		Assert.assertEquals(0.0, i.getPrice().doubleValue(), 0.0);
		Assert.assertEquals(Status.Pending, i.getStatus());
		Assert.assertEquals("Customer PSTN Service", i.getProduct());
		Assert.assertEquals(Substatus.InProgress, i.getSubStatus());
		Assert.assertEquals("some-value2", i.getAssetIntegId());
		Assert.assertEquals("some-intg-value2", i.getPromIntegrationId());
		Assert.assertEquals("01154329426", i.getServiceId());

	}

	@Test
	public void testAddOrderItem() throws Exception {
		int expectedOrderItemSize = 4;
		OrderDetails assetDetails = service.getAssetDetails("3-3473578826");
		Order o = assetDetails.getOrder();
		Assert.assertEquals("0202789136", o.getBillingAccountNumber());
		Assert.assertEquals("Mr. Jerry Peter", o.getCustomerId());
		Assert.assertEquals(ORDER_NUMBER, o.getOrderNumber());
		Assert.assertEquals(Status.Pending, o.getStatus());
		Assert.assertEquals(Substatus.InProgress, o.getSubStatus());
		List<OrderItem> l = assetDetails.getOrderItems();
		Assert.assertEquals(expectedOrderItemSize, l.size());
		validateOrderItems(l);

		Offers offers = new OfferBuilder().withNameAndPartNum("Call Plan UAC", "some-part-number", OfferType.Product)
				.withPricingDetails(10.0, true, PriceType.Recurring).build();
		service.addOrderItem(ORDER_NUMBER, offers, 5);
		assetDetails = service.getAssetDetails("3-3473578826");
		o = assetDetails.getOrder();
		Assert.assertEquals("0202789136", o.getBillingAccountNumber());
		Assert.assertEquals("Mr. Jerry Peter", o.getCustomerId());
		Assert.assertEquals(ORDER_NUMBER, o.getOrderNumber());
		Assert.assertEquals(Status.Pending, o.getStatus());
		Assert.assertEquals(Substatus.InProgress, o.getSubStatus());
		l = assetDetails.getOrderItems();
		Assert.assertEquals(++expectedOrderItemSize, l.size());
		validateOrderItems(l);

		OrderItem i = l.get(4);
		Assert.assertEquals(Action.Add.val, i.getAction());
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DAY_OF_MONTH, 5);
		Assert.assertTrue((i.getCustomerAgreedDate().getTime() - c.getTimeInMillis()) <= 100);
		Assert.assertEquals(10.0, i.getPrice().doubleValue(), 0.0);
		Assert.assertEquals(Status.Pending, i.getStatus());
		Assert.assertEquals("Call Plan UAC", i.getProduct());
		Assert.assertEquals(Substatus.InProgress, i.getSubStatus());
		
		offers = new OfferBuilder().withNameAndPartNum("Infinity offer 12 months 3 pounds disocunt", "S0129", OfferType.Product)
				.withPricingDetails(10.0, true, PriceType.Recurring).build();
		service.addOrderItem(ORDER_NUMBER, offers, 5);
		assetDetails = service.getAssetDetails("3-3473578826");
		o = assetDetails.getOrder();
		l = assetDetails.getOrderItems();
		Assert.assertEquals(expectedOrderItemSize + 2, l.size());
		validateOrderItems(l);

		i = l.get(5);
		Assert.assertEquals(Action.Add.val, i.getAction());
		Assert.assertEquals("Infinity offer 12 months 3 pounds disocunt", i.getProduct());
		
		i = l.get(6);
		Assert.assertEquals(Action.Add.val, i.getAction());
		Assert.assertEquals("Infinity Disc 12 months 3 pounds", i.getProduct());
	}

}
