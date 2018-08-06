package com.bt.consumer.SWSEAdapter.service;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.bt.consumer.SWSEAdapter.SwseAdapterApplicationTests;
import com.bt.consumer.SWSEAdapter.dto.Assets;
import com.bt.consumer.SWSEAdapter.dto.Customer;
import com.bt.consumer.SWSEAdapter.dto.SearchResult;

public class SearchServiceImplTest extends SwseAdapterApplicationTests {
	@Autowired
	SearchService service;

	@Test
	public void testSearchByEin() {
		Customer c = service.searchByEin("123456789");
		Assert.assertNotNull(c);
		Assert.assertEquals(c.getConsumer(), "Mr. Jerry Peter");
		Assert.assertEquals(c.getEin(), "123456789");
		Assert.assertNull(service.searchByEin("123456788").getEin());
	}

	@Test
	public void testSearch() {
		SearchResult s = service.search("someNumber", "LV11307993");
		Assert.assertNotNull(s);
		Customer c = s.getCustomer();
		Assert.assertNotNull(c);
		Assert.assertEquals(c.getConsumer(), "Mr. Jerry Peter");
		Assert.assertEquals(c.getEin(), "123456789");
		Assert.assertNotNull(c.getBillingSummary());
		Assert.assertNotNull(c.getContactSummary());
		Assert.assertNotNull(c.getCustomerSummary());
		List<Assets> assets = s.getAssets();
		Assert.assertNotNull(assets);
		Assert.assertEquals(1, assets.size());
		Assets a = assets.get(0);
		Assert.assertEquals("3-3473578826", a.getAssetNumber());
		Assert.assertEquals(1, a.getSequenceId());
		Assert.assertEquals("Pkg AQ BB+UWC (35.99)(18m)(18m 27 17)", a.getProduct());
		Assert.assertNull(a.getContractEndDate());
		Assert.assertNull(a.getServiceId());
		Assert.assertEquals("0202789136", a.getBillingAccountNo());
		Assert.assertEquals("S02345", a.getPromotionInteg());
	}
}
