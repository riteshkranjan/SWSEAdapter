package com.bt.consumer.SWSEAdapter.service;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.bt.consumer.SWSEAdapter.SwseAdapterApplicationTests;
import com.bt.consumer.SWSEAdapter.dto.Offers;
import com.bt.consumer.SWSEAdapter.enums.OfferType;
import com.bt.consumer.SWSEAdapter.enums.PriceType;

public class OfferServiceImplTest extends SwseAdapterApplicationTests{
	@Autowired
	OfferService service;

	@Test
	public void testGetAllOffers() {
		List<Offers> allOffers = service.getAllOffers();
		Assert.assertEquals(12, allOffers.size());
		Offers o = allOffers.get(0);
		Assert.assertEquals(o.getName(), "Broadband Service");
		Assert.assertEquals(o.getPartNum(), "S0123");
		Assert.assertTrue(o.isTrackAsAsset());
		Assert.assertTrue(0.0 == o.getPrice());
		Assert.assertTrue(OfferType.Product == o.getType());
		Assert.assertTrue(PriceType.OneOff == o.getPriceType());

	}

}
