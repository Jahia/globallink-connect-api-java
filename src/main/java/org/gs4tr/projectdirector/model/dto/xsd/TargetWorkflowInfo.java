
package org.gs4tr.projectdirector.model.dto.xsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TargetWorkflowInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TargetWorkflowInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="batchName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="documentName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sourceLanguage" type="{http://dto.model.projectdirector.gs4tr.org/xsd}Language"/>
 *         &lt;element name="targetLanguage" type="{http://dto.model.projectdirector.gs4tr.org/xsd}Language"/>
 *         &lt;element name="targetTicket" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TargetWorkflowInfo", propOrder = {
    "batchName",
    "documentName",
    "fileName",
    "sourceLanguage",
    "targetLanguage",
    "targetTicket"
})
public class TargetWorkflowInfo {

    @XmlElement(required = true, nillable = true)
    protected String batchName;
    @XmlElement(required = true, nillable = true)
    protected String documentName;
    @XmlElement(required = true, nillable = true)
    protected String fileName;
    @XmlElement(required = true, nillable = true)
    protected Language sourceLanguage;
    @XmlElement(required = true, nillable = true)
    protected Language targetLanguage;
    @XmlElement(required = true, nillable = true)
    protected String targetTicket;

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
     * Gets the value of the documentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentName() {
        return documentName;
    }

    /**
     * Sets the value of the documentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentName(String value) {
        this.documentName = value;
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
     * Gets the value of the targetTicket property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetTicket() {
        return targetTicket;
    }

    /**
     * Sets the value of the targetTicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetTicket(String value) {
        this.targetTicket = value;
    }

}
