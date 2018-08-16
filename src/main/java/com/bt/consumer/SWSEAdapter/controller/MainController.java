package com.bt.consumer.SWSEAdapter.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);

	@Value("${swse.user.name}")
	private String userName;

	@Value("${swse.user.password}")
	private String password;

	@Value("${swse.session.type}")
	private String sessionType;

	@Value("${swse.url}")
	private String url;

	@GetMapping("/")
	public String welcome() throws Exception {
		logger.info("method welcome called  ");
		return "Hurray! server is up and running - available methods are : \n" + "1. /search/{ein} \n"
				+ "2. /search/{phoneNumber}/{billingActNum} \n" + "3. /getAllOffers \n"
				+ "4. /getAssetDetails/{assetId}\n" + "5. /addOrderItem/{OrderNumber}\n"
				+ "6. /addOrderItem/{OrderNumber}/{cadAfter}\n";

	}
}
