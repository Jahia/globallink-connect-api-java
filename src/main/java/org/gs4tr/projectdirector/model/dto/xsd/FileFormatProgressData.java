
package org.gs4tr.projectdirector.model.dto.xsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileFormatProgressData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FileFormatProgressData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dateCompleted" type="{http://dto.model.projectdirector.gs4tr.org/xsd}Date"/>
 *         &lt;element name="fileCount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="fileFormatName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fileProgressData" type="{http://dto.model.projectdirector.gs4tr.org/xsd}FileProgressData"/>
 *         &lt;element name="jobTicket" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "FileFormatProgressData", propOrder = {
    "dateCompleted",
    "fileCount",
    "fileFormatName",
    "fileProgressData",
    "jobTicket",
    "workflowDueDate",
    "workflowStatus"
})
public class FileFormatProgressData {

    @XmlElement(required = true, nillable = true)
    protected Date dateCompleted;
    protected long fileCount;
    @XmlElement(required = true, nillable = true)
    protected String fileFormatName;
    @XmlElement(required = true, nillable = true)
    protected FileProgressData fileProgressData;
    @XmlElement(required = true, nillable = true)
    protected String jobTicket;
    @XmlElement(required = true, nillable = true)
    protected Date workflowDueDate;
    @XmlElement(required = true, nillable = true)
    protected String workflowStatus;

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
     * Gets the value of the fileFormatName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileFormatName() {
        return fileFormatName;
    }

    /**
     * Sets the value of the fileFormatName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileFormatName(String value) {
        this.fileFormatName = value;
    }

    /**
     * Gets the value of the fileProgressData property.
     * 
     * @return
     *     possible object is
     *     {@link FileProgressData }
     *     
     */
    public FileProgressData getFileProgressData() {
        return fileProgressData;
    }

    /**
     * Sets the value of the fileProgressData property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileProgressData }
     *     
     */
    public void setFileProgressData(FileProgressData value) {
        this.fileProgressData = value;
    }

    /**
     * Gets the value of the jobTicket property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobTicket() {
        return jobTicket;
    }

    /**
     * Sets the value of the jobTicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobTicket(String value) {
        this.jobTicket = value;
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
