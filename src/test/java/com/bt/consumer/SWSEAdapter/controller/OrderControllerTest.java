package com.bt.consumer.SWSEAdapter.controller;

import static org.mockito.Mockito.times;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.Matchers;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.hamcrest.MockitoHamcrest;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import com.bt.consumer.SWSEAdapter.builder.OfferBuilder;
import com.bt.consumer.SWSEAdapter.builder.OrderBuilder;
import com.bt.consumer.SWSEAdapter.builder.OrderItemBuilder;
import com.bt.consumer.SWSEAdapter.dto.Offers;
import com.bt.consumer.SWSEAdapter.dto.Order;
import com.bt.consumer.SWSEAdapter.dto.OrderDetails;
import com.bt.consumer.SWSEAdapter.dto.OrderItem;
import com.bt.consumer.SWSEAdapter.enums.Action;
import com.bt.consumer.SWSEAdapter.enums.OfferType;
import com.bt.consumer.SWSEAdapter.enums.PriceType;
import com.bt.consumer.SWSEAdapter.enums.Status;
import com.bt.consumer.SWSEAdapter.enums.Substatus;
import com.bt.consumer.SWSEAdapter.service.OfferService;
import com.bt.consumer.SWSEAdapter.service.OrderService;

@RunWith(SpringRunner.class)
@WebMvcTest(value = OrderController.class, secure = false)
public class OrderControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private OrderService orderService;
	@MockBean
	private OfferService offerService;

	@Test
	public void testGetAllOffers() throws Exception {
		List<Offers> offerList = new ArrayList<>();
		offerList.add(new OfferBuilder().withNameAndPartNum("Broadband Service", "S0123", OfferType.Product)
				.withPricingDetails(0.0, true, PriceType.OneOff).build());
		Mockito.when(
				offerService.getAllOffers()).thenReturn(offerList);
		MvcResult result = mockMvc.perform(get("/getAllOffers")).andExpect(status().isOk()).andReturn();
		JSONArray jsonArray = new JSONArray(result.getResponse().getContentAsString());
		JSONObject expected = new JSONObject("{\"price\":0,\"name\":\"Broadband Service\",\"trackAsAsset\":true,\"priceType\":\"OneOff\",\"type\":\"Product\",\"partNum\":\"S0123\"}");
		JSONAssert.assertEquals(expected, jsonArray.getJSONObject(0), true);
	}

	@Test
	public void testGetAssetDetails() throws Exception {
		final String assetId = "someAssetId";
		OrderDetails orderDtails = new OrderDetails();
		OrderItem o1 = new OrderItemBuilder().withAction(Action.None)
				.withOrderStatus(Status.Pending, Substatus.InProgress).withCAD("08/12/2017 06:23:14")
				.withOrderDetails("some-value1", "Call Plan UWC", "some-intg-value1", null).build();
		List<OrderItem> item = new ArrayList<>();
		item.add(o1);
		Order order =   new OrderBuilder().withOrderDetails("0202789136", "Mr. Jerry Peter", "VOL013-3554374863")
		.withOrderStatus(Status.Pending, Substatus.InProgress).build();
		orderDtails.setOrder(order);
		orderDtails.setOrderItems(item);
		Mockito.when(
				orderService.getAssetDetails(assetId)).thenReturn(orderDtails);
		
		MvcResult result = mockMvc.perform(get("/getAssetDetails/{assetId}", assetId)).andExpect(status().isOk()).andReturn();
		JSONObject expected = new JSONObject(result.getResponse().getContentAsString());
		Assert.assertEquals("0202789136", expected.getJSONObject("order").getString("billingAccountNumber"));
		Assert.assertEquals(1, expected.getJSONArray("orderItems").length());
	}

	@Test
	public void testAddOrderItemStringOffers() throws Exception {
		final String orderNumber = "someOrderNumber";
		String exampleCourseJson = "{\"price\":0,\"name\":\"Broadband Service\",\"trackAsAsset\":true,\"priceType\":\"OneOff\",\"type\":\"Product\",\"partNum\":\"S0123\"}";
		MvcResult result = mockMvc.perform(post("/addOrderItem/{orderNumber}", orderNumber).accept(MediaType.APPLICATION_JSON).content(exampleCourseJson).contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk()).andReturn();
		Mockito.verify(orderService, times(1)).addOrderItem(Mockito.anyString(), Mockito.any(Offers.class), MockitoHamcrest.intThat(Matchers.equalTo(5)));
		System.out.println(result.getResponse().getContentAsString());
	}

	@Test
	public void testAddOrderItemStringIntOffers() throws Exception {
		final String orderNumber = "someOrderNumber";
		String exampleCourseJson = "{\"price\":0,\"name\":\"Broadband Service\",\"trackAsAsset\":true,\"priceType\":\"OneOff\",\"type\":\"Product\",\"partNum\":\"S0123\"}";
		MvcResult result = mockMvc.perform(post("/addOrderItem/{orderNumber}/{cadAfter}", orderNumber,10).accept(MediaType.APPLICATION_JSON).content(exampleCourseJson).contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk()).andReturn();
		Mockito.verify(orderService, times(1)).addOrderItem(Mockito.anyString(), Mockito.any(Offers.class), MockitoHamcrest.intThat(Matchers.equalTo(10)));
		System.out.println(result.getResponse().getContentAsString());
	}
	
	@Test
	public void testAddOrderItemStringIntOffers2() throws Exception {
		final String orderNumber = "someOrderNumber";
		String exampleCourseJson = "{\"price\":0,\"name\":\"Broadband Service\",\"trackAsAsset\":true,\"priceType\":\"OneOff\",\"type\":\"Product\",\"partNum\":\"S0123\"}";
		MvcResult result = mockMvc.perform(post("/addOrderItem/{orderNumber}/{cadAfter}", orderNumber,-1).accept(MediaType.APPLICATION_JSON).content(exampleCourseJson).contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk()).andReturn();
		Mockito.verify(orderService, times(1)).addOrderItem(Mockito.anyString(), Mockito.any(Offers.class), MockitoHamcrest.intThat(Matchers.equalTo(5)));
		System.out.println(result.getResponse().getContentAsString());
	}

}
