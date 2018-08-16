package com.bt.consumer.SWSEAdapter.service;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.bt.consumer.SWSEAdapter.BaseTest;
import com.bt.consumer.SWSEAdapter.dto.Offers;
import com.bt.consumer.SWSEAdapter.enums.OfferType;
import com.bt.consumer.SWSEAdapter.enums.PriceType;

public class OfferServiceImplTest extends BaseTest{
	@Autowired
	OfferService service;

	@Test
	public void testGetAllOffers() {
		List<Offers> allOffers = service.getAllOffers();
		Assert.assertEquals(3, allOffers.size());
		Offers o = allOffers.get(0);
		Assert.assertEquals(o.getName(), "Infinity offer 12 months 3 pounds disocunt");
		Assert.assertEquals(o.getPartNum(), "S0129");
		Assert.assertTrue(o.isTrackAsAsset());
		Assert.assertTrue(0.0 == o.getPrice());
		Assert.assertTrue(OfferType.Promotion == o.getType());
		Assert.assertTrue(PriceType.Recurring == o.getPriceType());

	}
	
	@Test
	public void testGetDiscount() {
		Assert.assertNull(service.getDiscount("S0123"));
		Offers discount = service.getDiscount("S0129");
		Assert.assertEquals(discount.getPartNum(), "S0132");
	}

}
