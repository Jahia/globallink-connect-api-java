
package org.gs4tr.projectdirector.ws.service.services.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.gs4tr.projectdirector.model.dto.xsd.DocumentTicket;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="documentTicket" type="{http://dto.model.projectdirector.gs4tr.org/xsd}DocumentTicket"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "documentTicket"
})
@XmlRootElement(name = "cancelDocument")
public class CancelDocument {

    @XmlElement(required = true)
    protected DocumentTicket documentTicket;

    /**
     * Gets the value of the documentTicket property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentTicket }
     *     
     */
    public DocumentTicket getDocumentTicket() {
        return documentTicket;
    }

    /**
     * Sets the value of the documentTicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentTicket }
     *     
     */
    public void setDocumentTicket(DocumentTicket value) {
        this.documentTicket = value;
    }

}
