package com.bt.consumer.SWSEAdapter.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bt.consumer.SWSEAdapter.dto.Customer;
import com.bt.consumer.SWSEAdapter.dto.SearchResult;
import com.bt.consumer.SWSEAdapter.service.SearchService;

@RestController
public class MainController {
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);
	
	@GetMapping("/")
	public String welcome( ) {
		logger.info("method welcome called  ");
		return "Hurray! server is up and running - available methods are : \n"
				+ "1. /search/{ein} \n"
				+ "2. /search/{phoneNumber}/{billingActNum} \n"
				+ "3. /getAllOffers";
	}
	


}
