
package org.gs4tr.projectdirector.model.dto.xsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TargetInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TargetInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dateRequested" type="{http://dto.model.projectdirector.gs4tr.org/xsd}Date"/>
 *         &lt;element name="encoding" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="instructions" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="metadata" type="{http://dto.model.projectdirector.gs4tr.org/xsd}Metadata" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="priority" type="{http://dto.model.projectdirector.gs4tr.org/xsd}Priority"/>
 *         &lt;element name="requestedDueDate" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="targetLocale" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="workflowDefinitionTicket" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TargetInfo", propOrder = {
    "dateRequested",
    "encoding",
    "instructions",
    "metadata",
    "priority",
    "requestedDueDate",
    "targetLocale",
    "workflowDefinitionTicket"
})
public class TargetInfo {

    @XmlElement(required = true, nillable = true)
    protected Date dateRequested;
    @XmlElement(required = true, nillable = true)
    protected String encoding;
    @XmlElement(required = true, nillable = true)
    protected String instructions;
    @XmlElement(nillable = true)
    protected List<Metadata> metadata;
    @XmlElement(required = true, nillable = true)
    protected Priority priority;
    protected long requestedDueDate;
    @XmlElement(required = true, nillable = true)
    protected String targetLocale;
    @XmlElement(required = true, nillable = true)
    protected String workflowDefinitionTicket;

    /**
     * Gets the value of the dateRequested property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getDateRequested() {
        return dateRequested;
    }

    /**
     * Sets the value of the dateRequested property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setDateRequested(Date value) {
        this.dateRequested = value;
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
     * Gets the value of the instructions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstructions() {
        return instructions;
    }

    /**
     * Sets the value of the instructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstructions(String value) {
        this.instructions = value;
    }

    /**
     * Gets the value of the metadata property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metadata property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetadata().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Metadata }
     * 
     * 
     */
    public List<Metadata> getMetadata() {
        if (metadata == null) {
            metadata = new ArrayList<Metadata>();
        }
        return this.metadata;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link Priority }
     *     
     */
    public Priority getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Priority }
     *     
     */
    public void setPriority(Priority value) {
        this.priority = value;
    }

    /**
     * Gets the value of the requestedDueDate property.
     * 
     */
    public long getRequestedDueDate() {
        return requestedDueDate;
    }

    /**
     * Sets the value of the requestedDueDate property.
     * 
     */
    public void setRequestedDueDate(long value) {
        this.requestedDueDate = value;
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

    /**
     * Gets the value of the workflowDefinitionTicket property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkflowDefinitionTicket() {
        return workflowDefinitionTicket;
    }

    /**
     * Sets the value of the workflowDefinitionTicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkflowDefinitionTicket(String value) {
        this.workflowDefinitionTicket = value;
    }

}
