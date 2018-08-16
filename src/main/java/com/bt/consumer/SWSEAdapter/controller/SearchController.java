package com.bt.consumer.SWSEAdapter.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bt.consumer.SWSEAdapter.dto.SearchResult;
import com.bt.consumer.SWSEAdapter.service.SearchService;

@RestController
public class SearchController {
	private static final Logger logger = LoggerFactory.getLogger(SearchController.class);
	
	@Autowired
	SearchService service;
	
	@GetMapping("/search/{phoneNumber}/{billingActNum}")
	public SearchResult search( @PathVariable final String phoneNumber, @PathVariable final String billingActNum) throws Exception{
		logger.info(String.format("method searchByEin called with %s and %s ",phoneNumber, billingActNum));
		return service.search(phoneNumber, billingActNum);
	}
}
