package com.bt.consumer.SWSEAdapter.service;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.axis.AxisFault;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.siebel.CustomUI.Create_spcOrder_spc_spcBT_spcDemo_BindingStub;
import com.siebel.CustomUI.Create_spcOrder_spc_spcBT_spcDemo_ServiceLocator;
import com.siebel.CustomUI.Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_BindingStub;

@Service
public class SWSEStubBuilder {

	@Value("${swse.session.type.name}")
	private String sessionTypeTag;

	@Value("${swse.password.text.name}")
	private String passwordTextTag;

	@Value("${swse.username.token.name}")
	private String userNameToken;

	@Value("${swse.header.schema.url}")
	private String headerSchemaUri;

	@Value("${swse.user.name}")
	private String userName;

	@Value("${swse.user.password}")
	private String password;

	@Value("${swse.session.type}")
	private String sessionType;

	@Value("${swse.url}")
	private String url;

	public org.apache.axis.client.Stub getStub(
			org.apache.axis.client.Service service)
			throws AxisFault, MalformedURLException {
		org.apache.axis.client.Stub stub = new Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_BindingStub(
				new URL(url), service);
		addHeader(stub);
		return stub;
	}
	

	private void addHeader(org.apache.axis.client.Stub stub) {
		stub.setHeader(headerSchemaUri, userNameToken, userName);
		stub.setHeader(headerSchemaUri, passwordTextTag, password);
		stub.setHeader(headerSchemaUri, sessionTypeTag, sessionType);
	}


	public org.apache.axis.client.Stub getStub(
			Create_spcOrder_spc_spcBT_spcDemo_ServiceLocator service) throws AxisFault, MalformedURLException {
		org.apache.axis.client.Stub stub = new Create_spcOrder_spc_spcBT_spcDemo_BindingStub(
				new URL(url), service);
		addHeader(stub);
		return stub;
	}
}
