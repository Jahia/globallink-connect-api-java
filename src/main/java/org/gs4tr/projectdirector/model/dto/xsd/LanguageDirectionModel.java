
package org.gs4tr.projectdirector.model.dto.xsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LanguageDirectionModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LanguageDirectionModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dateCompleted" type="{http://dto.model.projectdirector.gs4tr.org/xsd}Date"/>
 *         &lt;element name="fileCount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="fileFormatProgressData" type="{http://dto.model.projectdirector.gs4tr.org/xsd}FileFormatProgressData" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fileProgress" type="{http://dto.model.projectdirector.gs4tr.org/xsd}FileProgressData"/>
 *         &lt;element name="sourceLanguage" type="{http://dto.model.projectdirector.gs4tr.org/xsd}Language"/>
 *         &lt;element name="targetLanguage" type="{http://dto.model.projectdirector.gs4tr.org/xsd}Language"/>
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
@XmlType(name = "LanguageDirectionModel", propOrder = {
    "dateCompleted",
    "fileCount",
    "fileFormatProgressData",
    "fileProgress",
    "sourceLanguage",
    "targetLanguage",
    "workflowDueDate",
    "workflowStatus"
})
public class LanguageDirectionModel {

    @XmlElement(required = true, nillable = true)
    protected Date dateCompleted;
    protected long fileCount;
    @XmlElement(nillable = true)
    protected List<FileFormatProgressData> fileFormatProgressData;
    @XmlElement(required = true, nillable = true)
    protected FileProgressData fileProgress;
    @XmlElement(required = true, nillable = true)
    protected Language sourceLanguage;
    @XmlElement(required = true, nillable = true)
    protected Language targetLanguage;
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
     * Gets the value of the fileFormatProgressData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fileFormatProgressData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFileFormatProgressData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FileFormatProgressData }
     * 
     * 
     */
    public List<FileFormatProgressData> getFileFormatProgressData() {
        if (fileFormatProgressData == null) {
            fileFormatProgressData = new ArrayList<FileFormatProgressData>();
        }
        return this.fileFormatProgressData;
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
