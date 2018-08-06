package com.bt.consumer.SWSEAdapter.service;

import com.bt.consumer.SWSEAdapter.dto.Customer;
import com.bt.consumer.SWSEAdapter.dto.SearchResult;

public interface SearchService {
	
	Customer searchByEin(String ein);

	SearchResult search(String phoneNumber, String billingActNum);

}
