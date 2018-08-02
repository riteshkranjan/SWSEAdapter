package com.bt.consumer.SWSEAdapter.builder;

import com.bt.consumer.SWSEAdapter.dto.UserDto;

public class UserDtoBuilder {
	private UserDto u;
	public UserDtoBuilder() {
		u = new UserDto();
	}
	public UserDto build() {
		return u;
	}
	
	public UserDtoBuilder withEin(String ein) {
		this.u.setEin(ein);
		return this;
	}
	public UserDtoBuilder with(boolean t_b) {
		this.u.setT_b(t_b);
		return this;
	}
	public UserDtoBuilder withConsumer(String consumer) {
		this.u.setConsumer(consumer);
		return this;
	}
	public UserDtoBuilder withSummaries(String customerSummary, String billingSummary, String contactSummary){
		this.u.setBillingSummary(billingSummary);
		this.u.setCustomerSummary(customerSummary);
		this.u.setContactSummary(contactSummary);
		return this;
	}
}
