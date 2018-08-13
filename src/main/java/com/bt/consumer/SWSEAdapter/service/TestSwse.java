/*package com.bt.consumer.SWSEAdapter.service;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import org.apache.axis.AxisFault;

import com.siebel.CustomUI.Create_spcOrder_spc_spcBT_spcDemo_BindingStub;
import com.siebel.CustomUI.Create_spcOrder_spc_spcBT_spcDemo_Input;
import com.siebel.CustomUI.Create_spcOrder_spc_spcBT_spcDemo_Output;
import com.siebel.CustomUI.Create_spcOrder_spc_spcBT_spcDemo_ServiceLocator;
import com.siebel.CustomUI.Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_1_Input;
import com.siebel.CustomUI.Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_1_Output;
import com.siebel.CustomUI.Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_BindingStub;
import com.siebel.CustomUI.Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_ServiceLocator;
import com.siebel.www.xml.BaseAccount.Account;

public class TestSwse {
	private static String userName = "sadmin";
	private static String password = "sadm1nip16";
	private static String sessionType = "None";
	private static String url = "http://blp02b14hsedb01/eai_enu/start.swe?SWEExtSource=WebService&SWEExtCmd=Execute&WSSOAP=1";
	private static String sessionTypeTag = "SessionType";
	private static String passwordTextTag = "PasswordText";
	private static String userNameToken = "UsernameToken";
	private static String headerSchemaUri = "http://siebel.com/webservices";

	public static void main(String[] args) throws Exception {
		//testSearchCustomer();
		testAddOrder();

	}

	private static void testAddOrder() throws Exception {
		Create_spcOrder_spc_spcBT_spcDemo_ServiceLocator service = new Create_spcOrder_spc_spcBT_spcDemo_ServiceLocator();
		Create_spcOrder_spc_spcBT_spcDemo_BindingStub stub = new Create_spcOrder_spc_spcBT_spcDemo_BindingStub(new URL(url), service);
		stub.setHeader(headerSchemaUri, userNameToken, userName);
		stub.setHeader(headerSchemaUri, passwordTextTag, password);
		stub.setHeader(headerSchemaUri, sessionTypeTag, sessionType);
		Create_spcOrder_spc_spcBT_spcDemo_Input input = new Create_spcOrder_spc_spcBT_spcDemo_Input();
		input.setProduct_spcId("1-XHCR");
		Create_spcOrder_spc_spcBT_spcDemo_Output output = stub.create_spcOrder_spc_spcBT_spcDemo(input);
		System.out.println(output.getOrderNumber());
		
	}

	private static void testSearchCustomer() throws AxisFault, MalformedURLException, RemoteException {
		Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_ServiceLocator service = new Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_ServiceLocator();

		Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_1_Input input = new Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_1_Input();
		input.setBillingAccntId("1-AQP");
		Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_BindingStub stub = new Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_BindingStub(
				new URL(url), service);
		org.apache.axis.message.SOAPHeaderElement header = new org.apache.axis.message.SOAPHeaderElement(
				headerSchemaUri, userNameToken, userName);
		stub.setHeader(header);
		stub.setHeader(headerSchemaUri, passwordTextTag, password);
		stub.setHeader(headerSchemaUri, sessionTypeTag, sessionType);

		Customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_1_Output response = stub
				.customer_spcAsset_spcSearch_spcWF_spc_spcBT_spcDemo_1(input);
		Account account = response.getListOfBaseAccount()[0];
		System.out.println(account.getCSN());
	}

}
*/