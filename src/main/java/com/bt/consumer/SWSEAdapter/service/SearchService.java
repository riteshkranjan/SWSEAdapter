package com.bt.consumer.SWSEAdapter.service;

import com.bt.consumer.SWSEAdapter.dto.UserDto;

public interface SearchService {
	
	UserDto searchByEin(String ein);

}
