
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
 *         &lt;element name="documentId" type="{http://dto.model.projectdirector.gs4tr.org/xsd}DocumentTicket"/>
 *         &lt;element name="targetLocale" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "documentId",
    "targetLocale"
})
@XmlRootElement(name = "cancelTargetByDocumentId")
public class CancelTargetByDocumentId {

    @XmlElement(required = true)
    protected DocumentTicket documentId;
    @XmlElement(required = true)
    protected String targetLocale;

    /**
     * Gets the value of the documentId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentTicket }
     *     
     */
    public DocumentTicket getDocumentId() {
        return documentId;
    }

    /**
     * Sets the value of the documentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentTicket }
     *     
     */
    public void setDocumentId(DocumentTicket value) {
        this.documentId = value;
    }

    /**
     * Gets the value of the targetLocale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetLocale() {
        return targetLocale;
    }

    /**
     * Sets the value of the targetLocale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetLocale(String value) {
        this.targetLocale = value;
    }

}
