package com.bt.consumer.SWSEAdapter.enums;

import org.junit.Assert;
import org.junit.Test;


public class EnumTest {

	@Test
	public void test() {
		Assert.assertEquals("-", Action.None.val);
		Assert.assertEquals("Delete", Action.Delete.val);
		Assert.assertEquals("Update", Action.Update.val);
		Assert.assertEquals("Add", Action.Add.val);
		
		Assert.assertEquals("Closed", Status.Closed.name());
		Assert.assertEquals("Open", Status.Open.name());
		Assert.assertEquals("Pending", Status.Pending.name());
		
		Assert.assertEquals("Closed", Substatus.Closed.name());
		Assert.assertEquals("Open", Substatus.Open.name());
		Assert.assertEquals("Pending", Substatus.Pending.name());
		Assert.assertEquals("InProgress", Substatus.InProgress.name());
		
		
		Assert.assertEquals("Product", OfferType.Product.name());
		Assert.assertEquals("Promotion", OfferType.Promotion.name());
		
		Assert.assertEquals("OneOff", PriceType.OneOff.name());
		Assert.assertEquals("Recurring", PriceType.Recurring.name());
		
		
	}

}
