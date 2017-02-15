
package org.gs4tr.projectdirector.model.dto.xsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProjectInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProjectInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clientIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="defaultJobWorkflowDefinitionTicket" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="defaultSubmissionWorkflowDefinitionTicket" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="defaultTargetWorkflowDefinitionTicket" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="shortCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProjectInfo", propOrder = {
    "clientIdentifier",
    "defaultJobWorkflowDefinitionTicket",
    "defaultSubmissionWorkflowDefinitionTicket",
    "defaultTargetWorkflowDefinitionTicket",
    "enabled",
    "name",
    "shortCode"
})
public class ProjectInfo {

    @XmlElement(required = true, nillable = true)
    protected String clientIdentifier;
    @XmlElement(required = true, nillable = true)
    protected String defaultJobWorkflowDefinitionTicket;
    @XmlElement(required = true, nillable = true)
    protected String defaultSubmissionWorkflowDefinitionTicket;
    @XmlElement(required = true, nillable = true)
    protected String defaultTargetWorkflowDefinitionTicket;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean enabled;
    @XmlElement(required = true, nillable = true)
    protected String name;
    @XmlElement(required = true, nillable = true)
    protected String shortCode;

    /**
     * Gets the value of the clientIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientIdentifier() {
        return clientIdentifier;
    }

    /**
     * Sets the value of the clientIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientIdentifier(String value) {
        this.clientIdentifier = value;
    }

    /**
     * Gets the value of the defaultJobWorkflowDefinitionTicket property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultJobWorkflowDefinitionTicket() {
        return defaultJobWorkflowDefinitionTicket;
    }

    /**
     * Sets the value of the defaultJobWorkflowDefinitionTicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultJobWorkflowDefinitionTicket(String value) {
        this.defaultJobWorkflowDefinitionTicket = value;
    }

    /**
     * Gets the value of the defaultSubmissionWorkflowDefinitionTicket property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultSubmissionWorkflowDefinitionTicket() {
        return defaultSubmissionWorkflowDefinitionTicket;
    }

    /**
     * Sets the value of the defaultSubmissionWorkflowDefinitionTicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultSubmissionWorkflowDefinitionTicket(String value) {
        this.defaultSubmissionWorkflowDefinitionTicket = value;
    }

    /**
     * Gets the value of the defaultTargetWorkflowDefinitionTicket property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultTargetWorkflowDefinitionTicket() {
        return defaultTargetWorkflowDefinitionTicket;
    }

    /**
     * Sets the value of the defaultTargetWorkflowDefinitionTicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultTargetWorkflowDefinitionTicket(String value) {
        this.defaultTargetWorkflowDefinitionTicket = value;
    }

    /**
     * Gets the value of the enabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnabled(Boolean value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the shortCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortCode() {
        return shortCode;
    }

    /**
     * Sets the value of the shortCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortCode(String value) {
        this.shortCode = value;
    }

}
