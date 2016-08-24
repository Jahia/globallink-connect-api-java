
package org.gs4tr.projectdirector.model.dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SimpleSubmissionSearchModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SimpleSubmissionSearchModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alerts" type="{http://dto.model.projectdirector.gs4tr.org/xsd}Notification" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="availableTasks" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="budgetStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="claimScope" type="{http://dto.model.projectdirector.gs4tr.org/xsd}ClaimScopeEnum"/>
 *         &lt;element name="customFields" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="date" type="{http://dto.model.projectdirector.gs4tr.org/xsd}Date"/>
 *         &lt;element name="dateArchived" type="{http://dto.model.projectdirector.gs4tr.org/xsd}Date"/>
 *         &lt;element name="dateCompleted" type="{http://dto.model.projectdirector.gs4tr.org/xsd}Date"/>
 *         &lt;element name="dateStarted" type="{http://dto.model.projectdirector.gs4tr.org/xsd}Date"/>
 *         &lt;element name="dueDate" type="{http://dto.model.projectdirector.gs4tr.org/xsd}Date"/>
 *         &lt;element name="fileCount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="fileProgress" type="{http://dto.model.projectdirector.gs4tr.org/xsd}FileProgressData"/>
 *         &lt;element name="gate" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="instructions" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="officeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="owner" type="{http://dto.model.projectdirector.gs4tr.org/xsd}UserData" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="paClientName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="parentSubmissionName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="parentTicket" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pmNotes" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="projectName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="projectTicket" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="quote" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="reserved" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="sourceLanguage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="status" type="{http://dto.model.projectdirector.gs4tr.org/xsd}ItemStatusEnum"/>
 *         &lt;element name="submissionBackground" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="submissionName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="submitterFullName" type="{http://dto.model.projectdirector.gs4tr.org/xsd}UserData" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ticket" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="wordCount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="workflowDueDate" type="{http://dto.model.projectdirector.gs4tr.org/xsd}Date"/>
 *         &lt;element name="workflowStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleSubmissionSearchModel", propOrder = {
    "alerts",
    "availableTasks",
    "budgetStatus",
    "claimScope",
    "customFields",
    "date",
    "dateArchived",
    "dateCompleted",
    "dateStarted",
    "dueDate",
    "fileCount",
    "fileProgress",
    "gate",
    "id",
    "instructions",
    "officeName",
    "owner",
    "paClientName",
    "parentSubmissionName",
    "parentTicket",
    "pmNotes",
    "priority",
    "projectName",
    "projectTicket",
    "quote",
    "reserved",
    "sourceLanguage",
    "status",
    "submissionBackground",
    "submissionName",
    "submitterFullName",
    "ticket",
    "wordCount",
    "workflowDueDate",
    "workflowStatus"
})
public class SimpleSubmissionSearchModel {

    @XmlElement(nillable = true)
    protected List<Notification> alerts;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long availableTasks;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer budgetStatus;
    @XmlElement(required = true, nillable = true)
    protected ClaimScopeEnum claimScope;
    @XmlElement(nillable = true)
    protected List<String> customFields;
    @XmlElement(required = true, nillable = true)
    protected Date date;
    @XmlElement(required = true, nillable = true)
    protected Date dateArchived;
    @XmlElement(required = true, nillable = true)
    protected Date dateCompleted;
    @XmlElement(required = true, nillable = true)
    protected Date dateStarted;
    @XmlElement(required = true, nillable = true)
    protected Date dueDate;
    protected long fileCount;
    @XmlElement(required = true, nillable = true)
    protected FileProgressData fileProgress;
    @XmlElement(required = true, type = Byte.class, nillable = true)
    protected Byte gate;
    @XmlElement(required = true, nillable = true)
    protected String id;
    @XmlElement(required = true, nillable = true)
    protected String instructions;
    @XmlElement(required = true, nillable = true)
    protected String officeName;
    @XmlElement(nillable = true)
    protected List<UserData> owner;
    @XmlElement(required = true, nillable = true)
    protected String paClientName;
    @XmlElement(required = true, nillable = true)
    protected String parentSubmissionName;
    @XmlElement(required = true, nillable = true)
    protected String parentTicket;
    @XmlElement(required = true, nillable = true)
    protected String pmNotes;
    @XmlElement(required = true, nillable = true)
    protected String priority;
    @XmlElement(required = true, nillable = true)
    protected String projectName;
    @XmlElement(required = true, nillable = true)
    protected String projectTicket;
    @XmlElement(required = true, type = Byte.class, nillable = true)
    protected Byte quote;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean reserved;
    @XmlElement(required = true, nillable = true)
    protected String sourceLanguage;
    @XmlElement(required = true, nillable = true)
    protected ItemStatusEnum status;
    @XmlElement(required = true, nillable = true)
    protected String submissionBackground;
    @XmlElement(required = true, nillable = true)
    protected String submissionName;
    @XmlElement(nillable = true)
    protected List<UserData> submitterFullName;
    @XmlElement(required = true, nillable = true)
    protected String ticket;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long wordCount;
    @XmlElement(required = true, nillable = true)
    protected Date workflowDueDate;
    @XmlElement(required = true, nillable = true)
    protected String workflowStatus;

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
     *     {@link Long }
     *     
     */
    public Long getAvailableTasks() {
        return availableTasks;
    }

    /**
     * Sets the value of the availableTasks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAvailableTasks(Long value) {
        this.availableTasks = value;
    }

    /**
     * Gets the value of the budgetStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBudgetStatus() {
        return budgetStatus;
    }

    /**
     * Sets the value of the budgetStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBudgetStatus(Integer value) {
        this.budgetStatus = value;
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
     * Gets the value of the customFields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customFields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCustomFields() {
        if (customFields == null) {
            customFields = new ArrayList<String>();
        }
        return this.customFields;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setDate(Date value) {
        this.date = value;
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
     * Gets the value of the dateStarted property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getDateStarted() {
        return dateStarted;
    }

    /**
     * Sets the value of the dateStarted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setDateStarted(Date value) {
        this.dateStarted = value;
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
     * Gets the value of the fileCount property.
     * 
     */
    public long getFileCount() {
        return fileCount;
    }

    /**
     * Sets the value of the fileCount property.
     * 
     */
    public void setFileCount(long value) {
        this.fileCount = value;
    }

    /**
     * Gets the value of the fileProgress property.
     * 
     * @return
     *     possible object is
     *     {@link FileProgressData }
     *     
     */
    public FileProgressData getFileProgress() {
        return fileProgress;
    }

    /**
     * Sets the value of the fileProgress property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileProgressData }
     *     
     */
    public void setFileProgress(FileProgressData value) {
        this.fileProgress = value;
    }

    /**
     * Gets the value of the gate property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getGate() {
        return gate;
    }

    /**
     * Sets the value of the gate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setGate(Byte value) {
        this.gate = value;
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
     * Gets the value of the owner property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the owner property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOwner().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserData }
     * 
     * 
     */
    public List<UserData> getOwner() {
        if (owner == null) {
            owner = new ArrayList<UserData>();
        }
        return this.owner;
    }

    /**
     * Gets the value of the paClientName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaClientName() {
        return paClientName;
    }

    /**
     * Sets the value of the paClientName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaClientName(String value) {
        this.paClientName = value;
    }

    /**
     * Gets the value of the parentSubmissionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentSubmissionName() {
        return parentSubmissionName;
    }

    /**
     * Sets the value of the parentSubmissionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentSubmissionName(String value) {
        this.parentSubmissionName = value;
    }

    /**
     * Gets the value of the parentTicket property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentTicket() {
        return parentTicket;
    }

    /**
     * Sets the value of the parentTicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentTicket(String value) {
        this.parentTicket = value;
    }

    /**
     * Gets the value of the pmNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmNotes() {
        return pmNotes;
    }

    /**
     * Sets the value of the pmNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmNotes(String value) {
        this.pmNotes = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriority(String value) {
        this.priority = value;
    }

    /**
     * Gets the value of the projectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * Sets the value of the projectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectName(String value) {
        this.projectName = value;
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
     * Gets the value of the quote property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getQuote() {
        return quote;
    }

    /**
     * Sets the value of the quote property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setQuote(Byte value) {
        this.quote = value;
    }

    /**
     * Gets the value of the reserved property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReserved() {
        return reserved;
    }

    /**
     * Sets the value of the reserved property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReserved(Boolean value) {
        this.reserved = value;
    }

    /**
     * Gets the value of the sourceLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceLanguage() {
        return sourceLanguage;
    }

    /**
     * Sets the value of the sourceLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceLanguage(String value) {
        this.sourceLanguage = value;
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
     * Gets the value of the submissionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmissionName() {
        return submissionName;
    }

    /**
     * Sets the value of the submissionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmissionName(String value) {
        this.submissionName = value;
    }

    /**
     * Gets the value of the submitterFullName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the submitterFullName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubmitterFullName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserData }
     * 
     * 
     */
    public List<UserData> getSubmitterFullName() {
        if (submitterFullName == null) {
            submitterFullName = new ArrayList<UserData>();
        }
        return this.submitterFullName;
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
     * Gets the value of the wordCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWordCount() {
        return wordCount;
    }

    /**
     * Sets the value of the wordCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWordCount(Long value) {
        this.wordCount = value;
    }

    /**
     * Gets the value of the workflowDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getWorkflowDueDate() {
        return workflowDueDate;
    }

    /**
     * Sets the value of the workflowDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setWorkflowDueDate(Date value) {
        this.workflowDueDate = value;
    }

    /**
     * Gets the value of the workflowStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkflowStatus() {
        return workflowStatus;
    }

    /**
     * Sets the value of the workflowStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkflowStatus(String value) {
        this.workflowStatus = value;
    }

}
