
package org.gs4tr.projectdirector.ws.service.services.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="referenceText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="referenceDocumentName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="encoding" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="submissionTicket" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "referenceText",
    "referenceDocumentName",
    "encoding",
    "submissionTicket"
})
@XmlRootElement(name = "addReferenceAsText")
public class AddReferenceAsText {

    @XmlElement(required = true)
    protected String referenceText;
    @XmlElement(required = true)
    protected String referenceDocumentName;
    @XmlElement(required = true)
    protected String encoding;
    @XmlElement(required = true)
    protected String submissionTicket;

    /**
     * Gets the value of the referenceText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceText() {
        return referenceText;
    }

    /**
     * Sets the value of the referenceText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceText(String value) {
        this.referenceText = value;
    }

    /**
     * Gets the value of the referenceDocumentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceDocumentName() {
        return referenceDocumentName;
    }

    /**
     * Sets the value of the referenceDocumentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceDocumentName(String value) {
        this.referenceDocumentName = value;
    }

    /**
     * Gets the value of the encoding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncoding() {
        return encoding;
    }

    /**
     * Sets the value of the encoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncoding(String value) {
        this.encoding = value;
    }

    /**
     * Gets the value of the submissionTicket property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmissionTicket() {
        return submissionTicket;
    }

    /**
     * Sets the value of the submissionTicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmissionTicket(String value) {
        this.submissionTicket = value;
    }

}
