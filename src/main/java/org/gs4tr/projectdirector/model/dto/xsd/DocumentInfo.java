
package org.gs4tr.projectdirector.model.dto.xsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="childDocumentInfos" type="{http://dto.model.projectdirector.gs4tr.org/xsd}DocumentInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="clientIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dateRequested" type="{http://dto.model.projectdirector.gs4tr.org/xsd}Date"/>
 *         &lt;element name="instructions" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="metadata" type="{http://dto.model.projectdirector.gs4tr.org/xsd}Metadata" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="projectTicket" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sourceLocale" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="submissionTicket" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="targetInfos" type="{http://dto.model.projectdirector.gs4tr.org/xsd}TargetInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="wordCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentInfo", propOrder = {
    "childDocumentInfos",
    "clientIdentifier",
    "dateRequested",
    "instructions",
    "metadata",
    "name",
    "projectTicket",
    "sourceLocale",
    "submissionTicket",
    "targetInfos",
    "wordCount"
})
public class DocumentInfo {

    @XmlElement(nillable = true)
    protected List<DocumentInfo> childDocumentInfos;
    @XmlElement(required = true, nillable = true)
    protected String clientIdentifier;
    @XmlElement(required = true, nillable = true)
    protected Date dateRequested;
    @XmlElement(required = true, nillable = true)
    protected String instructions;
    @XmlElement(nillable = true)
    protected List<Metadata> metadata;
    @XmlElement(required = true, nillable = true)
    protected String name;
    @XmlElement(required = true, nillable = true)
    protected String projectTicket;
    @XmlElement(required = true, nillable = true)
    protected String sourceLocale;
    @XmlElement(required = true, nillable = true)
    protected String submissionTicket;
    @XmlElement(nillable = true)
    protected List<TargetInfo> targetInfos;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer wordCount;

    /**
     * Gets the value of the childDocumentInfos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childDocumentInfos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildDocumentInfos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentInfo }
     * 
     * 
     */
    public List<DocumentInfo> getChildDocumentInfos() {
        if (childDocumentInfos == null) {
            childDocumentInfos = new ArrayList<DocumentInfo>();
        }
        return this.childDocumentInfos;
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
     * Gets the value of the sourceLocale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceLocale() {
        return sourceLocale;
    }

    /**
     * Sets the value of the sourceLocale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceLocale(String value) {
        this.sourceLocale = value;
    }

    /**
     * Gets the value of the submissionTicket property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmissionTicket() {
        return submissionTicket;
    }

    /**
     * Sets the value of the submissionTicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmissionTicket(String value) {
        this.submissionTicket = value;
    }

    /**
     * Gets the value of the targetInfos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the targetInfos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTargetInfos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TargetInfo }
     * 
     * 
     */
    public List<TargetInfo> getTargetInfos() {
        if (targetInfos == null) {
            targetInfos = new ArrayList<TargetInfo>();
        }
        return this.targetInfos;
    }

    /**
     * Gets the value of the wordCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWordCount() {
        return wordCount;
    }

    /**
     * Sets the value of the wordCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWordCount(Integer value) {
        this.wordCount = value;
    }

}
