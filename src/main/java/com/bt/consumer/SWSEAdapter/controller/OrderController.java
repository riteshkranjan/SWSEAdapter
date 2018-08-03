package com.bt.consumer.SWSEAdapter.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bt.consumer.SWSEAdapter.dto.Offers;
import com.bt.consumer.SWSEAdapter.service.OfferService;

@RestController
public class OrderController {
	private static final Logger logger = LoggerFactory.getLogger(OrderController.class);
	
	@Autowired
	OfferService service;
	
	@GetMapping("/getAllOffers")
	public List<Offers> searchByEin() {
		logger.info("method getAllOffers called ");
		return service.getAllOffers();
	}
}
