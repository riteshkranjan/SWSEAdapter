package com.bt.consumer.SWSEAdapter.controller;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import com.bt.consumer.SWSEAdapter.builder.AssetBuilder;
import com.bt.consumer.SWSEAdapter.builder.CustomerBuilder;
import com.bt.consumer.SWSEAdapter.dto.Assets;
import com.bt.consumer.SWSEAdapter.dto.Customer;
import com.bt.consumer.SWSEAdapter.dto.SearchResult;
import com.bt.consumer.SWSEAdapter.service.SearchService;

@RunWith(SpringRunner.class)
@WebMvcTest(value = SearchController.class, secure = false)
public class SearchControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private SearchService service;
	
	

	
	@Test
	public void testSearchStringString() throws Exception {
		final String billingActNum = "987654321";
		SearchResult searchResult = new SearchResult();
		
		Customer customer = new CustomerBuilder().withEin("987654321").with(true).withConsumer("Jerry")
		.withSummaries("somecustomersummary", "",
				"somecontactsummary")
		.build();
		
		searchResult.setCustomer(customer);
		searchResult.setAssets(new ArrayList<Assets>() {
			private static final long serialVersionUID = -7730801334474213507L;

			{
				add(new AssetBuilder(1).withAssetDetails("3-3473578826", "someassetdetails")
						.withContractDetails(null, null, "0202789136").withPromotionIntg("S02345").build());
			}
		});
		Mockito.when(
				service.search("someNumber", billingActNum)).thenReturn(searchResult);

		
		MvcResult result = mockMvc.perform(get("/search/{phoneNumber}/{billingActNum}","someNumber", "987654321"))
	            .andExpect(status().isOk()).andReturn();
		
		String expected = "{\"customer\":{\"ein\":\"987654321\",\"consumer\":\"Jerry\",\"customerSummary\":\"somecustomersummary\",\"billingSummary\":\"\",\"contactSummary\":\"somecontactsummary\",\"t_b\":true},\"assets\":[{\"sequenceId\":1,\"assetNumber\":\"3-3473578826\",\"product\":\"someassetdetails\",\"contractEndDate\":null,\"serviceId\":null,\"billingAccountNo\":\"0202789136\",\"promotionInteg\":\"S02345\"}]}";
		JSONAssert.assertEquals(expected, result.getResponse().getContentAsString(), true);
	}

}
