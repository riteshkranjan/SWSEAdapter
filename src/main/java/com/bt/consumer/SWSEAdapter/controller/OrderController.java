package com.bt.consumer.SWSEAdapter.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bt.consumer.SWSEAdapter.dto.Offers;
import com.bt.consumer.SWSEAdapter.dto.OrderDetails;
import com.bt.consumer.SWSEAdapter.dto.OrderItem;
import com.bt.consumer.SWSEAdapter.service.OfferService;
import com.bt.consumer.SWSEAdapter.service.OrderService;

@RestController
public class OrderController {
	private static final Logger logger = LoggerFactory.getLogger(OrderController.class);

	@Autowired
	OfferService service;

	@Autowired
	OrderService orderService;

	@GetMapping("/getAllOffers")
	public List<Offers> getAllOffers() {
		logger.info("method getAllOffers called ");
		return service.getAllOffers();
	}

	@GetMapping("/getAssetDetails/{assetId}")
	public OrderDetails getAssetDetails(@PathVariable final String assetId) {
		logger.info("method getAssetDetails called with assetId = " + assetId);
		return orderService.getAssetDetails(assetId);
	}

	@PostMapping("/addOrderItem/{orderNumber}")
	public String addOrderItem(@PathVariable final String orderNumber, @RequestBody final Offers o) throws Exception {
		logger.info("method addOrderItem called for  OrderNumber = " + orderNumber);
		return orderService.addOrderItem();
	}
	
	@PostMapping("/generateOrderItem/{orderNumber}")
	public List<OrderItem> generateOrderItem(@PathVariable final String orderNumber, @RequestBody final Offers o) {
		logger.info("method generateOrderItem called with orderNumber = " + orderNumber);
		return orderService.getOrderItems(orderNumber, o);
	}
}
