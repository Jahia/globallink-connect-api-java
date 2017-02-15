
package org.gs4tr.projectdirector.model.dto.xsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TargetSearchRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TargetSearchRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dateCreated" type="{http://dto.model.projectdirector.gs4tr.org/xsd}Date"/>
 *         &lt;element name="folder" type="{http://dto.model.projectdirector.gs4tr.org/xsd}ItemFolderEnum"/>
 *         &lt;element name="projectTickets" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="sourceLocaleId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="submissionTicket" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="targetLocaleId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TargetSearchRequest", propOrder = {
    "dateCreated",
    "folder",
    "projectTickets",
    "sourceLocaleId",
    "submissionTicket",
    "targetLocaleId"
})
public class TargetSearchRequest {

    @XmlElement(required = true, nillable = true)
    protected Date dateCreated;
    @XmlElement(required = true, nillable = true)
    protected ItemFolderEnum folder;
    @XmlElement(nillable = true)
    protected List<String> projectTickets;
    @XmlElement(required = true, nillable = true)
    protected String sourceLocaleId;
    @XmlElement(required = true, nillable = true)
    protected String submissionTicket;
    @XmlElement(required = true, nillable = true)
    protected String targetLocaleId;

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
     * Gets the value of the folder property.
     * 
     * @return
     *     possible object is
     *     {@link ItemFolderEnum }
     *     
     */
    public ItemFolderEnum getFolder() {
        return folder;
    }

    /**
     * Sets the value of the folder property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemFolderEnum }
     *     
     */
    public void setFolder(ItemFolderEnum value) {
        this.folder = value;
    }

    /**
     * Gets the value of the projectTickets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the projectTickets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProjectTickets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getProjectTickets() {
        if (projectTickets == null) {
            projectTickets = new ArrayList<String>();
        }
        return this.projectTickets;
    }

    /**
     * Gets the value of the sourceLocaleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceLocaleId() {
        return sourceLocaleId;
    }

    /**
     * Sets the value of the sourceLocaleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceLocaleId(String value) {
        this.sourceLocaleId = value;
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
     * Gets the value of the targetLocaleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetLocaleId() {
        return targetLocaleId;
    }

    /**
     * Sets the value of the targetLocaleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetLocaleId(String value) {
        this.targetLocaleId = value;
    }

}
