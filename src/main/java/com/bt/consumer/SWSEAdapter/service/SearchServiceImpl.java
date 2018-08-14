package com.bt.consumer.SWSEAdapter.service;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.axis.AxisFault;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.bt.consumer.SWSEAdapter.builder.AssetBuilder;
import com.bt.consumer.SWSEAdapter.builder.CustomerBuilder;
import com.bt.consumer.SWSEAdapter.controller.MainController;
import com.bt.consumer.SWSEAdapter.dto.Assets;
import com.bt.consumer.SWSEAdapter.dto.Customer;
import com.bt.consumer.SWSEAdapter.dto.SearchResult;
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

	@Value("${swse.url}")
	private String url;

	private static final Map<String, Customer> userData = new HashMap<>();
	private static final Map<String, List<Assets>> assetsData = new HashMap<>();
	private static final Map<String, String> banToEinMap = new HashMap<>();
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
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
	public SearchResult search(String phoneNumber, String billingActNum) throws Exception {
		SearchResult s = new SearchResult();
		if (MainController.WSDL_MODE) {
			Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_1_Input input = new Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_1_Input();
			input.setBillingAccntId(billingActNum);
			Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_1_Output response = (Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_1_Output) hitSiebel(
					input);
			if (response == null || response.getListOfBaseAccount() == null
					|| response.getListOfBaseAccount().length == 0)
				return s;
			Account account = response.getListOfBaseAccount()[0];
			Customer c = new CustomerBuilder().withConsumer(account.getContactId()).build();
			s.setCustomer(c);
			AssetMgmtAssetOrderMgmt[] assets = account.getListOfAssetMgmtAssetOrderMgmt();
			int i = 1;
			for (AssetMgmtAssetOrderMgmt asset : assets) {
				Assets a = new AssetBuilder(i++).withAssetDetails(asset.getServiceAccountId(), asset.getProductName())
						.withPromotionIntg(asset.getIntegrationId())
						.withContractDetails(sdf.parse(asset.getEffectiveEndDate()), asset.getServiceAccountId(),
								asset.getBillingAccountId())
						.build();
				s.getAssets().add(a);
			}
			return s;
		}
		String ein = banToEinMap.get(billingActNum);
		if (ein == null)
			return null;
		s.setCustomer(searchByEin(ein));
		s.setAssets(assetsData.get(ein)); 
		return s;
	}

	@Override
	protected java.io.Serializable hitSiebel(java.io.Serializable input)
			throws AxisFault, MalformedURLException, RemoteException {
		return getSiebelService().customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_1(
				(Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_1_Input) input);
	}

	@Override
	public Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_BindingStub init()
			throws AxisFault, MalformedURLException {
		return new Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_BindingStub(new URL(url),
				new Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_ServiceLocator());
	}
}
