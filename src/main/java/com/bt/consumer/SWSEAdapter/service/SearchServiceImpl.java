package com.bt.consumer.SWSEAdapter.service;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.axis.AxisFault;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.bt.consumer.SWSEAdapter.builder.AssetBuilder;
import com.bt.consumer.SWSEAdapter.builder.CustomerBuilder;
import com.bt.consumer.SWSEAdapter.dto.Assets;
import com.bt.consumer.SWSEAdapter.dto.Customer;
import com.bt.consumer.SWSEAdapter.dto.SearchResult;
import com.bt.consumer.utils.ApplicationCache;
import com.siebel.CustomUI.Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_1_Input;
import com.siebel.CustomUI.Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_1_Output;
import com.siebel.CustomUI.Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_BindingStub;
import com.siebel.CustomUI.Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_ServiceLocator;
import com.siebel.www.xml.BaseAccount.Account;
import com.siebel.www.xml.BaseAccount.AssetMgmtAssetOrderMgmt;

@Service
public class SearchServiceImpl extends
		SiebelRequestBuilderImpl<Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_BindingStub, Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_ServiceLocator>
		implements SearchService {

	private static final Logger logger = LoggerFactory.getLogger(SearchServiceImpl.class);

	@Value("${swse.url}")
	private String url;

	private final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	@Override
	public SearchResult search(String phoneNumber, String billingActNum) throws Exception {
		SearchResult s = new SearchResult();
		//Prepare siebel customer search input
		Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_1_Input input = new Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_1_Input();
		input.setBillingAccntId(billingActNum);
		logger.info("Hitting siebel to search at url = " + url);
		logger.info("with input = " + input.toString());
		Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_1_Output response = (Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_1_Output) 
				hitSiebel(input);
		if (response == null || response.getListOfBaseAccount() == null || response.getListOfBaseAccount().length == 0)
			return s;
		//Read account info from siebel response - for demo read only first account
		Account account = response.getListOfBaseAccount()[0];
		Customer c = new CustomerBuilder().withConsumer(account.getContactId()).build();
		s.setCustomer(c);
		//Read all assets from siebel response
		AssetMgmtAssetOrderMgmt[] assets = account.getListOfAssetMgmtAssetOrderMgmt();
		int assetCounter = 1;
		for (AssetMgmtAssetOrderMgmt asset : assets) {
			//Iterate each siebel asset and build data transter object 
			Date d = parseEffectiveEndDate(asset.getEffectiveEndDate());
			Assets a = new AssetBuilder(assetCounter++).withAssetDetails(asset.getServiceAccountId(), asset.getProductName())
					.withPromotionIntg(asset.getIntegrationId())
					.withContractDetails(d, asset.getServiceAccountId(), asset.getBillingAccountId()).build();
			s.getAssets().add(a);
		}
		ApplicationCache.saveSearchResult(billingActNum, s);
		ApplicationCache.updateOrderId(billingActNum);
		return s;
	}

	private Date parseEffectiveEndDate(String date) {
		Date d = null;
		try {
			sdf.parse(date);
		} catch (ParseException e) {
			logger.error("Contract end date is not in format dd/mm/yyyy so setting it to null");
		}
		return d;
	}

	@Override
	protected java.io.Serializable hitSiebel(java.io.Serializable input)
			throws AxisFault, MalformedURLException, RemoteException {

		Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_1_Output output = getSiebelService()
				.customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_1(
						(Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_1_Input) input);
		logger.info("Received response from siebel = " + output);
		return output;
	}

	@Override
	public Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_BindingStub init()
			throws AxisFault, MalformedURLException {
		return new Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_BindingStub(new URL(url),
				new Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_ServiceLocator());
	}
}
