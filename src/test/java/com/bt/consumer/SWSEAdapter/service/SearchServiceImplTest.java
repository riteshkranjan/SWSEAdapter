package com.bt.consumer.SWSEAdapter.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bt.consumer.SWSEAdapter.dto.Customer;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SearchServiceImplTest {
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

}
