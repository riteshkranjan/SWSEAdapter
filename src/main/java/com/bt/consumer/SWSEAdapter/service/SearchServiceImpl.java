package com.bt.consumer.SWSEAdapter.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.bt.consumer.SWSEAdapter.builder.AssetBuilder;
import com.bt.consumer.SWSEAdapter.builder.CustomerBuilder;
import com.bt.consumer.SWSEAdapter.dto.Assets;
import com.bt.consumer.SWSEAdapter.dto.Customer;
import com.bt.consumer.SWSEAdapter.dto.SearchResult;

@Service
public class SearchServiceImpl implements SearchService {

	private static final Map<String, Customer> userData = new HashMap<>();
	private static final Map<String, List<Assets>> assetsData = new HashMap<>();
	private static final Map<String, String> banToEinMap = new HashMap<>();
	static {
		userData.put("123456789",
				new CustomerBuilder().withEin("123456789").with(true).withConsumer("Mr. Jerry Peter")
						.withSummaries("CCP-Braodband WBC up to 20M,CPS;pkg BB +UWC,WLR3", "",
								"No open opportunities. No open order, No open faults")
						.build());
		assetsData.put("123456789", new ArrayList<Assets>() {
			private static final long serialVersionUID = -7730801334474213507L;

			{
				add(new AssetBuilder(1).withAssetDetails("3-3473578826", "Pkg AQ BB+UWC (35.99)(18m)(18m 27 17)")
						.withContractDetails(null, null, "0202789136").withPromotionIntg("S02345").build());
			}
		});
		banToEinMap.put("LV11307993", "123456789");
	}

	@Override
	public Customer searchByEin(String ein) {
		Customer u = SearchServiceImpl.userData.get(ein);
		return u == null ? new Customer() : u;
	}

	@Override
	public SearchResult search(String phoneNumber, String billingActNum) {
		String ein = banToEinMap.get(billingActNum);
		if(ein==null) return null;
		SearchResult s = new SearchResult();
		s.setCustomer(searchByEin(ein));
		s.setAssets(assetsData.get(ein));
		return s;
	}

}
