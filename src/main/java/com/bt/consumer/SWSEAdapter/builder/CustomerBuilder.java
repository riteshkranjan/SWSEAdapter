package com.bt.consumer.SWSEAdapter.builder;

import com.bt.consumer.SWSEAdapter.dto.Customer;

public class CustomerBuilder {
	private Customer u;
	public CustomerBuilder() {
		u = new Customer();
	}
	public Customer build() {
		return u;
	}
	
	public CustomerBuilder withEin(String ein) {
		this.u.setEin(ein);
		return this;
	}
	public CustomerBuilder with(boolean t_b) {
		u.setT_b(t_b);
		return this;
	}
	public CustomerBuilder withConsumer(String consumer) {
		u.setConsumer(consumer);
		return this;
	}
	public CustomerBuilder withSummaries(String customerSummary, String billingSummary, String contactSummary){
		u.setBillingSummary(billingSummary);
		u.setCustomerSummary(customerSummary);
		u.setContactSummary(contactSummary);
		return this;
	}
}
