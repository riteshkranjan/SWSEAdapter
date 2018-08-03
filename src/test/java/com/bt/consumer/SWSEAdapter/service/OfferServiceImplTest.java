package com.bt.consumer.SWSEAdapter.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bt.consumer.SWSEAdapter.dto.Offers;
import com.bt.consumer.SWSEAdapter.enums.OfferType;
import com.bt.consumer.SWSEAdapter.enums.PriceType;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OfferServiceImplTest {
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
