package com.bt.consumer.utils;

import java.io.ByteArrayOutputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;

import javax.xml.soap.MessageFactory;
import javax.xml.soap.Name;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPBodyElement;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPHeaderElement;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class CallSEWSEServer {
	private static final String CUS_TAG = "cus";
	private static final String SOAPENV = "soapenv";
	private static final String HEADER = "header";
	private static final String SIEBEL_COM_WEBSERVICES = "http://siebel.com/webservices";
	private static final String methodName = "Customer_spcAsset_spcSearch_spcWF_spc-_spcBT_spcDemo_1_Input";
	private static final String CUSTOM_UI = "http://siebel.com/CustomUI";
	private static String url = "http://blp02b14hsedb01/eai_enu/start.swe?SWEExtSource=WebService&SWEExtCmd=Execute&WSSOAP=1&UserName=SADMIN&Password=sadm1nip16";

	public static void main(String[] args) throws Exception {
		
		SOAPMessage message = createSoapMessage();
		URL endPt = new URL(url);
		SOAPConnectionFactory factory = SOAPConnectionFactory.newInstance();
		SOAPConnection conn = factory.createConnection();
		SOAPMessage reply = conn.call(message, endPt);
		printFormattedXML(message);
		printFormattedXML(reply);
		conn.close();

	}

	private static SOAPMessage createSoapMessage() throws SOAPException {
		MessageFactory myMsgFct = MessageFactory.newInstance();
		SOAPMessage message = myMsgFct.createMessage();
		SOAPPart mySPart = message.getSOAPPart();
		SOAPEnvelope myEnvp = mySPart.getEnvelope();
		myEnvp.addNamespaceDeclaration(CUS_TAG, CUSTOM_UI);
		myEnvp.addNamespaceDeclaration(HEADER, SIEBEL_COM_WEBSERVICES);
		myEnvp.setPrefix(SOAPENV);
		generateHeader(myEnvp);

		SOAPBody body = myEnvp.getBody();
		body.setPrefix(SOAPENV);
		Name bodyName = myEnvp.createName(methodName, CUS_TAG,
				CUSTOM_UI);
		SOAPBodyElement gltp = body.addBodyElement(bodyName);
		Name myContent = myEnvp.createName("BillingAccntId", CUS_TAG, CUSTOM_UI);
		SOAPElement mySymbol = gltp.addChildElement(myContent);
		mySymbol.addTextNode("1-AQP");

		message.saveChanges();
		return message;
	}

	private static void generateHeader(SOAPEnvelope myEnvp) throws SOAPException {
		SOAPHeader header = myEnvp.getHeader();
		header.setPrefix(SOAPENV);
		Name userName = myEnvp.createName("UsernameToken", HEADER, SIEBEL_COM_WEBSERVICES);
		Name password = myEnvp.createName("PasswordText", HEADER, SIEBEL_COM_WEBSERVICES);
		Name sesstionType = myEnvp.createName("SessionType", HEADER, SIEBEL_COM_WEBSERVICES);
		SOAPHeaderElement uName = header.addHeaderElement(userName);
		SOAPHeaderElement pName = header.addHeaderElement(password);
		SOAPHeaderElement sType = header.addHeaderElement(sesstionType);
		uName.addTextNode("sadmin");
		pName.addTextNode("sadm1nip16");
		sType.addTextNode("None");
	}

	public static void printFormattedXML(SOAPMessage message) throws Exception {
		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		message.writeTo(bout);
		String xml = bout.toString();

		Source xmlInput = new StreamSource(new StringReader(xml));
		StringWriter stringWriter = new StringWriter();
		StreamResult xmlOutput = new StreamResult(stringWriter);
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		transformerFactory.setAttribute("indent-number", 5);
		Transformer transformer = transformerFactory.newTransformer();
		transformer.setOutputProperty(OutputKeys.INDENT, "yes");
		transformer.transform(xmlInput, xmlOutput);
		String xmlString = xmlOutput.getWriter().toString();

		System.out.println(xmlString);
	}

}
