package org.gs4tr.projectdirector.ws.headers;

import java.util.HashSet;
import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPHeader;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

public class LoginHeaderHandler implements SOAPHandler<SOAPMessageContext> {

	private String username;
	private String password;

	public LoginHeaderHandler(String username, String password) {
		this.username = username;
		this.password = password;
	}

	@Override
	public void close(MessageContext context) {

	}

	@Override
	public boolean handleFault(SOAPMessageContext context) {
		return false;
	}

	@Override
	public boolean handleMessage(SOAPMessageContext smc) {

		Boolean outboundProperty = (Boolean) smc.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
		if(this.username == null || this.username.trim().length()<1){
			throw new NullPointerException("Username is null or empty");
		}
		if(this.password == null || this.password.trim().length()<1){
			throw new NullPointerException("Password is null or empty");
		}
		if (outboundProperty.booleanValue()) {

			try {

				SOAPEnvelope envelope = smc.getMessage().getSOAPPart().getEnvelope();
				SOAPHeader header = envelope.getHeader();
				if (header == null) {
					header = envelope.addHeader();
				}
				SOAPElement security = header.addChildElement("Security", "wsse",
						"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd");

				SOAPElement usernameToken = security.addChildElement("UsernameToken", "wsse");
				usernameToken.addAttribute(new QName("xmlns:wsu"),
						"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd");

				SOAPElement username = usernameToken.addChildElement("Username", "wsse");
				username.addTextNode(this.username);

				SOAPElement password = usernameToken.addChildElement("Password", "wsse");
				password.setAttribute("Type",
						"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText");
				password.addTextNode(this.password);

			} catch (Exception e) {
				e.printStackTrace();
			}

		} else {
			try {
				// SOAPMessage message = smc.getMessage();
				// message.writeTo(System.out);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}

		return outboundProperty;

	}

	@Override
	public Set<QName> getHeaders() {
		final QName securityHeader = new QName(
				"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "Security",
				"wsse");

		final HashSet<QName> headers = new HashSet<QName>();
		headers.add(securityHeader);

		return headers;
	}

}
