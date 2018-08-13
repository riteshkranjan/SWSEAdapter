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
		Assert.assertEquals(9, allOffers.size());
		Offers o = allOffers.get(0);
		Assert.assertEquals(o.getName(), "Broadband Service");
		Assert.assertEquals(o.getPartNum(), "S0123");
		Assert.assertTrue(o.isTrackAsAsset());
		Assert.assertTrue(0.0 == o.getPrice());
		Assert.assertTrue(OfferType.Product == o.getType());
		Assert.assertTrue(PriceType.OneOff == o.getPriceType());

	}
	
	@Test
	public void testGetDiscount() {
		Assert.assertNull(service.getDiscount("S0123"));
		Offers discount = service.getDiscount("S0129");
		Assert.assertEquals(discount.getPartNum(), "S0132");
	}

}
