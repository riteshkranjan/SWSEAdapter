package com.bt.consumer.SWSEAdapter.builder;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bt.consumer.SWSEAdapter.dto.Assets;
import com.bt.consumer.SWSEAdapter.dto.Offers;
import com.bt.consumer.SWSEAdapter.dto.OrderItem;
import com.bt.consumer.SWSEAdapter.enums.Action;
import com.bt.consumer.SWSEAdapter.enums.Status;
import com.bt.consumer.SWSEAdapter.enums.Substatus;

public class OrderItemBuilder {
	private static final Logger logger = LoggerFactory.getLogger(OrderItemBuilder.class);
	private OrderItem o = new OrderItem();

	public OrderItemBuilder() {
		this.o = new OrderItem();
	}

	public OrderItem build() {
		return this.o;
	}
	
	public OrderItemBuilder withAssetAndAction(Assets a, String action) {
		o.setAction(action);
		o.setCustomerAgreedDate(new Date());
		o.setProduct(a.getProduct());
		o.setStatus(Status.Pending);
		o.setSubStatus(Substatus.InProgress);
		o.setPromIntegrationId(a.getPromotionInteg());
		o.setServiceId(a.getServiceId());
		return this;
	}

	public OrderItemBuilder withNewOfferDetails(Offers offer, Date cad) {
		o.setProduct(offer.getName());
		o.setAction(Action.Add.val());
		o.setPrice(offer.getPrice());
		o.setStatus(Status.Pending);
		o.setSubStatus(Substatus.InProgress);
		o.setCustomerAgreedDate(cad);
		return this;
	}

	public OrderItemBuilder withOrderDetails(String assetIntegId, String product, String promIntegrationId,
			String serviceId) {
		o.setAssetIntegId(assetIntegId);
		o.setProduct(product);
		o.setPromIntegrationId(promIntegrationId);
		o.setServiceId(serviceId);
		o.getAssetIntegId();
		return this;
	}

	public OrderItemBuilder withOrderStatus(Status status, Substatus subStatus) {
		o.setStatus(status);
		o.setSubStatus(subStatus);
		return this;
	}

	public OrderItemBuilder withAction(Action action) {
		o.setAction(action.val());
		return this;
	}

	public OrderItemBuilder withCAD(Date customerAgreedDate) {
		o.setCustomerAgreedDate(customerAgreedDate);
		return this;
	}

	public OrderItemBuilder withCAD(String customerAgreedDate) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		try {
			o.setCustomerAgreedDate(sdf.parse(customerAgreedDate));
		} catch (ParseException e) {
			logger.error(e.getMessage());
		}
		return this;
	}

	public OrderItemBuilder withPrice(Double price) {
		o.setPrice(price);
		return this;
	}
}
