
package org.gs4tr.projectdirector.model.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileFormatProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FileFormatProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="configurable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isDefault" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mimeType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pluginId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pluginName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="profileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="targetWorkflowDefinition" type="{http://dto.model.projectdirector.gs4tr.org/xsd}WorkflowDefinition"/>
 *         &lt;element name="ticket" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileFormatProfile", propOrder = {
    "configurable",
    "isDefault",
    "mimeType",
    "pluginId",
    "pluginName",
    "profileName",
    "targetWorkflowDefinition",
    "ticket"
})
public class FileFormatProfile {

    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean configurable;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean isDefault;
    @XmlElement(required = true, nillable = true)
    protected String mimeType;
    @XmlElement(required = true, nillable = true)
    protected String pluginId;
    @XmlElement(required = true, nillable = true)
    protected String pluginName;
    @XmlElement(required = true, nillable = true)
    protected String profileName;
    @XmlElement(required = true, nillable = true)
    protected WorkflowDefinition targetWorkflowDefinition;
    @XmlElement(required = true, nillable = true)
    protected String ticket;

    /**
     * Gets the value of the configurable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConfigurable() {
        return configurable;
    }

    /**
     * Sets the value of the configurable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConfigurable(Boolean value) {
        this.configurable = value;
    }

    /**
     * Gets the value of the isDefault property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDefault() {
        return isDefault;
    }

    /**
     * Sets the value of the isDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDefault(Boolean value) {
        this.isDefault = value;
    }

    /**
     * Gets the value of the mimeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMimeType() {
        return mimeType;
    }

    /**
     * Sets the value of the mimeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMimeType(String value) {
        this.mimeType = value;
    }

    /**
     * Gets the value of the pluginId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPluginId() {
        return pluginId;
    }

    /**
     * Sets the value of the pluginId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPluginId(String value) {
        this.pluginId = value;
    }

    /**
     * Gets the value of the pluginName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPluginName() {
        return pluginName;
    }

    /**
     * Sets the value of the pluginName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPluginName(String value) {
        this.pluginName = value;
    }

    /**
     * Gets the value of the profileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileName() {
        return profileName;
    }

    /**
     * Sets the value of the profileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileName(String value) {
        this.profileName = value;
    }

    /**
     * Gets the value of the targetWorkflowDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link WorkflowDefinition }
     *     
     */
    public WorkflowDefinition getTargetWorkflowDefinition() {
        return targetWorkflowDefinition;
    }

    /**
     * Sets the value of the targetWorkflowDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkflowDefinition }
     *     
     */
    public void setTargetWorkflowDefinition(WorkflowDefinition value) {
        this.targetWorkflowDefinition = value;
    }

    /**
     * Gets the value of the ticket property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicket() {
        return ticket;
    }

    /**
     * Sets the value of the ticket property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicket(String value) {
        this.ticket = value;
    }

}
