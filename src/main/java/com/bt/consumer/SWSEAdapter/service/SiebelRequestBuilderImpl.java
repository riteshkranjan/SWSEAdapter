package com.bt.consumer.SWSEAdapter.service;

import java.net.MalformedURLException;

import org.apache.axis.AxisFault;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service
public abstract class SiebelRequestBuilderImpl <E extends org.apache.axis.client.Stub, K extends org.apache.axis.client.Service> implements SiebelRequestBuilder<E, K>{
	
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
	
	private E stub;

	public void authenticate() throws AxisFault, MalformedURLException{
		stub = init();
		addHeader(stub);
	}
	
	public E getSiebelService() throws AxisFault, MalformedURLException {
		authenticate();
		return stub;
	}
	
	private void addHeader(org.apache.axis.client.Stub stub) {
		stub.setHeader(headerSchemaUri, userNameToken, userName);
		stub.setHeader(headerSchemaUri, passwordTextTag, password);
		stub.setHeader(headerSchemaUri, sessionTypeTag, sessionType);
	}

	protected abstract java.io.Serializable hitSiebel(java.io.Serializable input) throws Exception;
	
}
