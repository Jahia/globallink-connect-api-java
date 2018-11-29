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

public class UserAgentHeaderHandler implements SOAPHandler<SOAPMessageContext> {

	private String userAgent;

	public UserAgentHeaderHandler(String userAgent) {
		this.userAgent = userAgent;
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
		if (userAgent != null || userAgent.trim().length() < 1) {
			if (outboundProperty.booleanValue()) {

				try {
					SOAPEnvelope envelope = smc.getMessage().getSOAPPart().getEnvelope();
					SOAPHeader header = envelope.getHeader();
					if (header == null) {
						header = envelope.addHeader();
					}
					SOAPElement security = header.addChildElement("userAgent", "commons",
							"http://commons.ws.projectdirector.gs4tr.org");
					security.addTextNode(userAgent);

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
		} else {
			throw new NullPointerException("UserAgent is null or empty");
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