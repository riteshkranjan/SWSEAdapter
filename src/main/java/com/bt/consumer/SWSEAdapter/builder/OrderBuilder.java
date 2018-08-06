package com.bt.consumer.SWSEAdapter.builder;

import com.bt.consumer.SWSEAdapter.dto.Order;
import com.bt.consumer.SWSEAdapter.enums.Status;
import com.bt.consumer.SWSEAdapter.enums.Substatus;

public class OrderBuilder {

	private Order o;

	public OrderBuilder() {
		this.o = new Order();
	}

	public Order build() {
		return this.o;
	}

	public OrderBuilder withOrderDetails(String billingAccountNumber, String customerId, String orderNumber) {
		o.setBillingAccountNumber(billingAccountNumber);
		o.setCustomerId(customerId);
		o.setOrderNumber(orderNumber);
		return this;
	}

	public OrderBuilder withOrderStatus(Status status, Substatus subStatus) {
		o.setStatus(status);
		o.setSubStatus(subStatus);
		return this;
	}

}
