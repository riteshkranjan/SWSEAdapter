package com.bt.consumer.SWSEAdapter.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);

	public static boolean WSDL_MODE = false; // risky code - just added for demo

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

	/*
	 * it should be post method but for demo keeping it GET
	 */
	@GetMapping("/toggleMode")
	public String toggleMode() {
		WSDL_MODE = !WSDL_MODE;
		return "Now Running in " + (WSDL_MODE
				? String.format("wsdl mode </br>username = %s</br>password = %s</br>sesstion type = %s</br>url = %s",
						userName, password, sessionType, url)
				: "stub mode - with in momory data only");
	}

}
