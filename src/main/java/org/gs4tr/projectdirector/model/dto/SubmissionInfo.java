
package org.gs4tr.projectdirector.model.dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubmissionInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubmissionInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="additionalCosts" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="autoStartChilds" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="claimScope" type="{http://dto.model.projectdirector.gs4tr.org/xsd}ClaimScopeEnum"/>
 *         &lt;element name="clientIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dateRequested" type="{http://dto.model.projectdirector.gs4tr.org/xsd}Date"/>
 *         &lt;element name="internalNotes" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="metadata" type="{http://dto.model.projectdirector.gs4tr.org/xsd}Metadata" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="officeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="paClientTicket" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="paJobNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="priority" type="{http://dto.model.projectdirector.gs4tr.org/xsd}Priority"/>
 *         &lt;element name="projectTicket" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="revenue" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="submissionBackground" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="submissionCustomFields" type="{http://dto.model.projectdirector.gs4tr.org/xsd}SubmissionCustomFields" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="submitters" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "SubmissionInfo", propOrder = {
    "additionalCosts",
    "autoStartChilds",
    "claimScope",
    "clientIdentifier",
    "dateRequested",
    "internalNotes",
    "metadata",
    "name",
    "officeName",
    "paClientTicket",
    "paJobNumber",
    "priority",
    "projectTicket",
    "revenue",
    "submissionBackground",
    "submissionCustomFields",
    "submitters",
    "workflowDefinitionTicket"
})
public class SubmissionInfo {

    @XmlElement(required = true, nillable = true)
    protected String additionalCosts;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean autoStartChilds;
    @XmlElement(required = true, nillable = true)
    protected ClaimScopeEnum claimScope;
    @XmlElement(required = true, nillable = true)
    protected String clientIdentifier;
    @XmlElement(required = true, nillable = true)
    protected Date dateRequested;
    @XmlElement(required = true, nillable = true)
    protected String internalNotes;
    @XmlElement(nillable = true)
    protected List<Metadata> metadata;
    @XmlElement(required = true, nillable = true)
    protected String name;
    @XmlElement(required = true, nillable = true)
    protected String officeName;
    @XmlElement(required = true, nillable = true)
    protected String paClientTicket;
    @XmlElement(required = true, nillable = true)
    protected String paJobNumber;
    @XmlElement(required = true, nillable = true)
    protected Priority priority;
    @XmlElement(required = true, nillable = true)
    protected String projectTicket;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double revenue;
    @XmlElement(required = true, nillable = true)
    protected String submissionBackground;
    @XmlElement(nillable = true)
    protected List<SubmissionCustomFields> submissionCustomFields;
    @XmlElement(nillable = true)
    protected List<String> submitters;
    @XmlElement(required = true, nillable = true)
    protected String workflowDefinitionTicket;

    /**
     * Gets the value of the additionalCosts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalCosts() {
        return additionalCosts;
    }

    /**
     * Sets the value of the additionalCosts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalCosts(String value) {
        this.additionalCosts = value;
    }

    /**
     * Gets the value of the autoStartChilds property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoStartChilds() {
        return autoStartChilds;
    }

    /**
     * Sets the value of the autoStartChilds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoStartChilds(Boolean value) {
        this.autoStartChilds = value;
    }

    /**
     * Gets the value of the claimScope property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimScopeEnum }
     *     
     */
    public ClaimScopeEnum getClaimScope() {
        return claimScope;
    }

    /**
     * Sets the value of the claimScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimScopeEnum }
     *     
     */
    public void setClaimScope(ClaimScopeEnum value) {
        this.claimScope = value;
    }

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
     * Gets the value of the internalNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalNotes() {
        return internalNotes;
    }

    /**
     * Sets the value of the internalNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalNotes(String value) {
        this.internalNotes = value;
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
    
	public void setMetadata(List<Metadata> metadata) {
		this.metadata = metadata;
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
     * Gets the value of the officeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficeName() {
        return officeName;
    }

    /**
     * Sets the value of the officeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficeName(String value) {
        this.officeName = value;
    }

    /**
     * Gets the value of the paClientTicket property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaClientTicket() {
        return paClientTicket;
    }

    /**
     * Sets the value of the paClientTicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaClientTicket(String value) {
        this.paClientTicket = value;
    }

    /**
     * Gets the value of the paJobNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaJobNumber() {
        return paJobNumber;
    }

    /**
     * Sets the value of the paJobNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaJobNumber(String value) {
        this.paJobNumber = value;
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
     * Gets the value of the projectTicket property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectTicket() {
        return projectTicket;
    }

    /**
     * Sets the value of the projectTicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectTicket(String value) {
        this.projectTicket = value;
    }

    /**
     * Gets the value of the revenue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRevenue() {
        return revenue;
    }

    /**
     * Sets the value of the revenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRevenue(Double value) {
        this.revenue = value;
    }

    /**
     * Gets the value of the submissionBackground property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmissionBackground() {
        return submissionBackground;
    }

    /**
     * Sets the value of the submissionBackground property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmissionBackground(String value) {
        this.submissionBackground = value;
    }

    /**
     * Gets the value of the submissionCustomFields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the submissionCustomFields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubmissionCustomFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubmissionCustomFields }
     * 
     * 
     */
    public List<SubmissionCustomFields> getSubmissionCustomFields() {
        if (submissionCustomFields == null) {
            submissionCustomFields = new ArrayList<SubmissionCustomFields>();
        }
        return this.submissionCustomFields;
    }
    
    public void setSubmissionCustomFields(List<SubmissionCustomFields> customFields) {
		this.submissionCustomFields = customFields;
	}

    /**
     * Gets the value of the submitters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the submitters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubmitters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSubmitters() {
        if (submitters == null) {
            submitters = new ArrayList<String>();
        }
        return this.submitters;
    }
    
    public void setSubmitters(List<String> submitters) {
		this.submitters = submitters;
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
