package com.bt.consumer.SWSEAdapter.service;

import java.net.MalformedURLException;

import org.apache.axis.AxisFault;

public interface SiebelRequestBuilder<E extends org.apache.axis.client.Stub, K extends org.apache.axis.client.Service> {
	
	E init() throws AxisFault, MalformedURLException;
	
}
