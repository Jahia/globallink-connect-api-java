
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
 *         &lt;element name="submissionTicket" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="batchName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="targetLanguage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="phaseName" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "submissionTicket",
    "batchName",
    "targetLanguage",
    "phaseName"
})
@XmlRootElement(name = "getLanguagePhaseInfo")
public class GetLanguagePhaseInfo {

    @XmlElement(required = true)
    protected String submissionTicket;
    @XmlElement(required = true)
    protected String batchName;
    @XmlElement(required = true)
    protected String targetLanguage;
    @XmlElement(required = true)
    protected String phaseName;

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

    /**
     * Gets the value of the batchName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchName() {
        return batchName;
    }

    /**
     * Sets the value of the batchName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchName(String value) {
        this.batchName = value;
    }

    /**
     * Gets the value of the targetLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetLanguage() {
        return targetLanguage;
    }

    /**
     * Sets the value of the targetLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetLanguage(String value) {
        this.targetLanguage = value;
    }

    /**
     * Gets the value of the phaseName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhaseName() {
        return phaseName;
    }

    /**
     * Sets the value of the phaseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhaseName(String value) {
        this.phaseName = value;
    }

}
