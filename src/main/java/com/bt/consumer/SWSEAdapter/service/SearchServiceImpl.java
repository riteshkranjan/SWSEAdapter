package com.bt.consumer.SWSEAdapter.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.bt.consumer.SWSEAdapter.builder.UserDtoBuilder;
import com.bt.consumer.SWSEAdapter.dto.UserDto;

@Service
public class SearchServiceImpl implements SearchService {

	private static final Map<String, UserDto> userData = new HashMap<>();
	static {
		userData.put("123456789",
				new UserDtoBuilder().withEin("123456789").with(true).withConsumer("Mr. Jerry Peter")
						.withSummaries("CCP-Braodband WBC up to 20M,CPS;pkg BB +UWC,WLR3", "",
								"No open opportunities. No open order, No open faults")
						.build());

	}

	@Override
	public UserDto searchByEin(String ein) {
		UserDto u = SearchServiceImpl.userData.get(ein);
		return u == null ? new UserDto() : u;
	}

}
