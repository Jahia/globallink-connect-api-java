
package org.gs4tr.projectdirector.model.dto.xsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Target complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Target">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="availableTasks" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="dateCompleted" type="{http://dto.model.projectdirector.gs4tr.org/xsd}Date"/>
 *         &lt;element name="dateCreated" type="{http://dto.model.projectdirector.gs4tr.org/xsd}Date"/>
 *         &lt;element name="dateEstimated" type="{http://dto.model.projectdirector.gs4tr.org/xsd}Date"/>
 *         &lt;element name="document" type="{http://dto.model.projectdirector.gs4tr.org/xsd}Document"/>
 *         &lt;element name="downloadThresholdTimeStamp" type="{http://dto.model.projectdirector.gs4tr.org/xsd}Date"/>
 *         &lt;element name="dueDate" type="{http://dto.model.projectdirector.gs4tr.org/xsd}Date"/>
 *         &lt;element name="fileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="phases" type="{http://dto.model.projectdirector.gs4tr.org/xsd}Phase" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="refPhase" type="{http://dto.model.projectdirector.gs4tr.org/xsd}Phase"/>
 *         &lt;element name="sourceLanguage" type="{http://dto.model.projectdirector.gs4tr.org/xsd}Language"/>
 *         &lt;element name="sourceWordCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="status" type="{http://dto.model.projectdirector.gs4tr.org/xsd}ItemStatusEnum"/>
 *         &lt;element name="targetInfo" type="{http://dto.model.projectdirector.gs4tr.org/xsd}TargetInfo"/>
 *         &lt;element name="targetLanguage" type="{http://dto.model.projectdirector.gs4tr.org/xsd}Language"/>
 *         &lt;element name="targetWordCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ticket" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tmStatistics" type="{http://dto.model.projectdirector.gs4tr.org/xsd}TmStatistics"/>
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
@XmlType(name = "Target", propOrder = {
    "availableTasks",
    "dateCompleted",
    "dateCreated",
    "dateEstimated",
    "document",
    "downloadThresholdTimeStamp",
    "dueDate",
    "fileName",
    "id",
    "phases",
    "refPhase",
    "sourceLanguage",
    "sourceWordCount",
    "status",
    "targetInfo",
    "targetLanguage",
    "targetWordCount",
    "ticket",
    "tmStatistics",
    "workflowDefinition"
})
public class Target {

    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long availableTasks;
    @XmlElement(required = true, nillable = true)
    protected Date dateCompleted;
    @XmlElement(required = true, nillable = true)
    protected Date dateCreated;
    @XmlElement(required = true, nillable = true)
    protected Date dateEstimated;
    @XmlElement(required = true, nillable = true)
    protected Document document;
    @XmlElement(required = true, nillable = true)
    protected Date downloadThresholdTimeStamp;
    @XmlElement(required = true, nillable = true)
    protected Date dueDate;
    @XmlElement(required = true, nillable = true)
    protected String fileName;
    @XmlElement(required = true, nillable = true)
    protected String id;
    @XmlElement(nillable = true)
    protected List<Phase> phases;
    @XmlElement(required = true, nillable = true)
    protected Phase refPhase;
    @XmlElement(required = true, nillable = true)
    protected Language sourceLanguage;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer sourceWordCount;
    @XmlElement(required = true, nillable = true)
    protected ItemStatusEnum status;
    @XmlElement(required = true, nillable = true)
    protected TargetInfo targetInfo;
    @XmlElement(required = true, nillable = true)
    protected Language targetLanguage;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer targetWordCount;
    @XmlElement(required = true, nillable = true)
    protected String ticket;
    @XmlElement(required = true, nillable = true)
    protected TmStatistics tmStatistics;
    @XmlElement(required = true, nillable = true)
    protected WorkflowDefinition workflowDefinition;

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
     * Gets the value of the document property.
     * 
     * @return
     *     possible object is
     *     {@link Document }
     *     
     */
    public Document getDocument() {
        return document;
    }

    /**
     * Sets the value of the document property.
     * 
     * @param value
     *     allowed object is
     *     {@link Document }
     *     
     */
    public void setDocument(Document value) {
        this.document = value;
    }

    /**
     * Gets the value of the downloadThresholdTimeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getDownloadThresholdTimeStamp() {
        return downloadThresholdTimeStamp;
    }

    /**
     * Sets the value of the downloadThresholdTimeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setDownloadThresholdTimeStamp(Date value) {
        this.downloadThresholdTimeStamp = value;
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
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
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
     * Gets the value of the phases property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phases property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhases().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Phase }
     * 
     * 
     */
    public List<Phase> getPhases() {
        if (phases == null) {
            phases = new ArrayList<Phase>();
        }
        return this.phases;
    }

    /**
     * Gets the value of the refPhase property.
     * 
     * @return
     *     possible object is
     *     {@link Phase }
     *     
     */
    public Phase getRefPhase() {
        return refPhase;
    }

    /**
     * Sets the value of the refPhase property.
     * 
     * @param value
     *     allowed object is
     *     {@link Phase }
     *     
     */
    public void setRefPhase(Phase value) {
        this.refPhase = value;
    }

    /**
     * Gets the value of the sourceLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link Language }
     *     
     */
    public Language getSourceLanguage() {
        return sourceLanguage;
    }

    /**
     * Sets the value of the sourceLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Language }
     *     
     */
    public void setSourceLanguage(Language value) {
        this.sourceLanguage = value;
    }

    /**
     * Gets the value of the sourceWordCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSourceWordCount() {
        return sourceWordCount;
    }

    /**
     * Sets the value of the sourceWordCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSourceWordCount(Integer value) {
        this.sourceWordCount = value;
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
     * Gets the value of the targetInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TargetInfo }
     *     
     */
    public TargetInfo getTargetInfo() {
        return targetInfo;
    }

    /**
     * Sets the value of the targetInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetInfo }
     *     
     */
    public void setTargetInfo(TargetInfo value) {
        this.targetInfo = value;
    }

    /**
     * Gets the value of the targetLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link Language }
     *     
     */
    public Language getTargetLanguage() {
        return targetLanguage;
    }

    /**
     * Sets the value of the targetLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Language }
     *     
     */
    public void setTargetLanguage(Language value) {
        this.targetLanguage = value;
    }

    /**
     * Gets the value of the targetWordCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTargetWordCount() {
        return targetWordCount;
    }

    /**
     * Sets the value of the targetWordCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTargetWordCount(Integer value) {
        this.targetWordCount = value;
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
     * Gets the value of the tmStatistics property.
     * 
     * @return
     *     possible object is
     *     {@link TmStatistics }
     *     
     */
    public TmStatistics getTmStatistics() {
        return tmStatistics;
    }

    /**
     * Sets the value of the tmStatistics property.
     * 
     * @param value
     *     allowed object is
     *     {@link TmStatistics }
     *     
     */
    public void setTmStatistics(TmStatistics value) {
        this.tmStatistics = value;
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
