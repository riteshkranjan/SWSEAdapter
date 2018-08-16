package com.bt.consumer.SWSEAdapter.service;

import com.bt.consumer.SWSEAdapter.dto.SearchResult;

public interface SearchService {
	
	SearchResult search(String phoneNumber, String billingActNum) throws Exception;

}
