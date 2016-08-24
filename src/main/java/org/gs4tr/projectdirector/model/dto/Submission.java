
package org.gs4tr.projectdirector.model.dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Submission complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Submission">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alerts" type="{http://dto.model.projectdirector.gs4tr.org/xsd}Notification" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="availableTasks" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dateArchived" type="{http://dto.model.projectdirector.gs4tr.org/xsd}Date"/>
 *         &lt;element name="dateCompleted" type="{http://dto.model.projectdirector.gs4tr.org/xsd}Date"/>
 *         &lt;element name="dateCreated" type="{http://dto.model.projectdirector.gs4tr.org/xsd}Date"/>
 *         &lt;element name="dateEstimated" type="{http://dto.model.projectdirector.gs4tr.org/xsd}Date"/>
 *         &lt;element name="documents" type="{http://dto.model.projectdirector.gs4tr.org/xsd}Document" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dueDate" type="{http://dto.model.projectdirector.gs4tr.org/xsd}Date"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="owner" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="project" type="{http://dto.model.projectdirector.gs4tr.org/xsd}Project"/>
 *         &lt;element name="status" type="{http://dto.model.projectdirector.gs4tr.org/xsd}ItemStatusEnum"/>
 *         &lt;element name="submissionInfo" type="{http://dto.model.projectdirector.gs4tr.org/xsd}SubmissionInfo"/>
 *         &lt;element name="submitterFullNames" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ticket" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="workflowDefinition" type="{http://dto.model.projectdirector.gs4tr.org/xsd}WorkflowDefinition"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Submission", propOrder = {
    "alerts",
    "availableTasks",
    "dateArchived",
    "dateCompleted",
    "dateCreated",
    "dateEstimated",
    "documents",
    "dueDate",
    "id",
    "owner",
    "project",
    "status",
    "submissionInfo",
    "submitterFullNames",
    "ticket",
    "workflowDefinition"
})
public class Submission {

    @XmlElement(nillable = true)
    protected List<Notification> alerts;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer availableTasks;
    @XmlElement(required = true, nillable = true)
    protected Date dateArchived;
    @XmlElement(required = true, nillable = true)
    protected Date dateCompleted;
    @XmlElement(required = true, nillable = true)
    protected Date dateCreated;
    @XmlElement(required = true, nillable = true)
    protected Date dateEstimated;
    @XmlElement(nillable = true)
    protected List<Document> documents;
    @XmlElement(required = true, nillable = true)
    protected Date dueDate;
    @XmlElement(required = true, nillable = true)
    protected String id;
    @XmlElement(required = true, nillable = true)
    protected String owner;
    @XmlElement(required = true, nillable = true)
    protected Project project;
    @XmlElement(required = true, nillable = true)
    protected ItemStatusEnum status;
    @XmlElement(required = true, nillable = true)
    protected SubmissionInfo submissionInfo;
    @XmlElement(nillable = true)
    protected List<String> submitterFullNames;
    @XmlElement(required = true, nillable = true)
    protected String ticket;
    @XmlElement(required = true, nillable = true)
    protected WorkflowDefinition workflowDefinition;

    /**
     * Gets the value of the alerts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alerts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlerts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Notification }
     * 
     * 
     */
    public List<Notification> getAlerts() {
        if (alerts == null) {
            alerts = new ArrayList<Notification>();
        }
        return this.alerts;
    }

    /**
     * Gets the value of the availableTasks property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAvailableTasks() {
        return availableTasks;
    }

    /**
     * Sets the value of the availableTasks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAvailableTasks(Integer value) {
        this.availableTasks = value;
    }

    /**
     * Gets the value of the dateArchived property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getDateArchived() {
        return dateArchived;
    }

    /**
     * Sets the value of the dateArchived property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setDateArchived(Date value) {
        this.dateArchived = value;
    }

    /**
     * Gets the value of the dateCompleted property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getDateCompleted() {
        return dateCompleted;
    }

    /**
     * Sets the value of the dateCompleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setDateCompleted(Date value) {
        this.dateCompleted = value;
    }

    /**
     * Gets the value of the dateCreated property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getDateCreated() {
        return dateCreated;
    }

    /**
     * Sets the value of the dateCreated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setDateCreated(Date value) {
        this.dateCreated = value;
    }

    /**
     * Gets the value of the dateEstimated property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getDateEstimated() {
        return dateEstimated;
    }

    /**
     * Sets the value of the dateEstimated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setDateEstimated(Date value) {
        this.dateEstimated = value;
    }

    /**
     * Gets the value of the documents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocuments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Document }
     * 
     * 
     */
    public List<Document> getDocuments() {
        if (documents == null) {
            documents = new ArrayList<Document>();
        }
        return this.documents;
    }

    /**
     * Gets the value of the dueDate property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getDueDate() {
        return dueDate;
    }

    /**
     * Sets the value of the dueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setDueDate(Date value) {
        this.dueDate = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwner(String value) {
        this.owner = value;
    }

    /**
     * Gets the value of the project property.
     * 
     * @return
     *     possible object is
     *     {@link Project }
     *     
     */
    public Project getProject() {
        return project;
    }

    /**
     * Sets the value of the project property.
     * 
     * @param value
     *     allowed object is
     *     {@link Project }
     *     
     */
    public void setProject(Project value) {
        this.project = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ItemStatusEnum }
     *     
     */
    public ItemStatusEnum getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemStatusEnum }
     *     
     */
    public void setStatus(ItemStatusEnum value) {
        this.status = value;
    }

    /**
     * Gets the value of the submissionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SubmissionInfo }
     *     
     */
    public SubmissionInfo getSubmissionInfo() {
        return submissionInfo;
    }

    /**
     * Sets the value of the submissionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubmissionInfo }
     *     
     */
    public void setSubmissionInfo(SubmissionInfo value) {
        this.submissionInfo = value;
    }

    /**
     * Gets the value of the submitterFullNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the submitterFullNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubmitterFullNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSubmitterFullNames() {
        if (submitterFullNames == null) {
            submitterFullNames = new ArrayList<String>();
        }
        return this.submitterFullNames;
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

    /**
     * Gets the value of the workflowDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link WorkflowDefinition }
     *     
     */
    public WorkflowDefinition getWorkflowDefinition() {
        return workflowDefinition;
    }

    /**
     * Sets the value of the workflowDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkflowDefinition }
     *     
     */
    public void setWorkflowDefinition(WorkflowDefinition value) {
        this.workflowDefinition = value;
    }

}
