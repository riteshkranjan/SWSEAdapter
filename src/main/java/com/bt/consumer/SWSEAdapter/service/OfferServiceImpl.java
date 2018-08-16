package com.bt.consumer.SWSEAdapter.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.bt.consumer.SWSEAdapter.builder.OfferBuilder;
import com.bt.consumer.SWSEAdapter.dto.Offers;
import com.bt.consumer.SWSEAdapter.enums.OfferType;
import com.bt.consumer.SWSEAdapter.enums.PriceType;

@Service
public class OfferServiceImpl implements OfferService {
	private static List<Offers> offerList = new ArrayList<>();
	private static Map<String, Offers> discounts = new HashMap<>();
	static {
		offerList.add(new OfferBuilder()
				.withNameAndPartNum("Infinity offer 12 months 3 pounds disocunt", "S0129", OfferType.Promotion)
				.withPricingDetails(0.0, true, PriceType.Recurring).build());
		offerList.add(new OfferBuilder()
				.withNameAndPartNum("Infinity offer 6 months 2 pounds disocunt", "S0130", OfferType.Promotion)
				.withPricingDetails(0.0, true, PriceType.Recurring).build());
		offerList.add(new OfferBuilder()
				.withNameAndPartNum("Infinity offer 18 months 5 pounds disocunt", "S0131", OfferType.Promotion)
				.withPricingDetails(0.0, true, PriceType.Recurring).build());
		discounts.put("S0129",
				new OfferBuilder().withNameAndPartNum("Infinity Disc 12 months 3 pounds", "S0132", OfferType.Product)
						.withPricingDetails(-3.0, true, PriceType.Recurring).build());

		discounts.put("S0130",
				new OfferBuilder().withNameAndPartNum("Infinity Disc 6 months 2 pounds", "S0133", OfferType.Product)
						.withPricingDetails(-2.0, true, PriceType.Recurring).build());
		discounts.put("S0131",
				new OfferBuilder().withNameAndPartNum("Infinity Disc 12 months 3 pounds", "S0132", OfferType.Product)
						.withPricingDetails(-3.0, true, PriceType.Recurring).build());
	}

	@Override
	public List<Offers> getAllOffers() {
		return offerList;
	}

	public Offers getDiscount(String productId) {
		return discounts.get(productId);
	}

}
