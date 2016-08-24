
package org.gs4tr.projectdirector.model.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Document complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Document">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="documentGroup" type="{http://dto.model.projectdirector.gs4tr.org/xsd}DocumentGroup"/>
 *         &lt;element name="documentInfo" type="{http://dto.model.projectdirector.gs4tr.org/xsd}DocumentInfo"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sourceLanguage" type="{http://dto.model.projectdirector.gs4tr.org/xsd}Language"/>
 *         &lt;element name="sourceWordCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "Document", propOrder = {
    "documentGroup",
    "documentInfo",
    "id",
    "sourceLanguage",
    "sourceWordCount",
    "ticket"
})
public class Document {

    @XmlElement(required = true, nillable = true)
    protected DocumentGroup documentGroup;
    @XmlElement(required = true, nillable = true)
    protected DocumentInfo documentInfo;
    @XmlElement(required = true, nillable = true)
    protected String id;
    @XmlElement(required = true, nillable = true)
    protected Language sourceLanguage;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer sourceWordCount;
    @XmlElement(required = true, nillable = true)
    protected String ticket;

    /**
     * Gets the value of the documentGroup property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentGroup }
     *     
     */
    public DocumentGroup getDocumentGroup() {
        return documentGroup;
    }

    /**
     * Sets the value of the documentGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentGroup }
     *     
     */
    public void setDocumentGroup(DocumentGroup value) {
        this.documentGroup = value;
    }

    /**
     * Gets the value of the documentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentInfo }
     *     
     */
    public DocumentInfo getDocumentInfo() {
        return documentInfo;
    }

    /**
     * Sets the value of the documentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentInfo }
     *     
     */
    public void setDocumentInfo(DocumentInfo value) {
        this.documentInfo = value;
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
