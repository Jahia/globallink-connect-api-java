
package org.gs4tr.projectdirector.model.dto.xsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubmissionSearchRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubmissionSearchRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="folder" type="{http://dto.model.projectdirector.gs4tr.org/xsd}ItemFolderEnum"/>
 *         &lt;element name="projectTickets" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="submissionDate" type="{http://dto.model.projectdirector.gs4tr.org/xsd}Date"/>
 *         &lt;element name="submissionDueDate" type="{http://dto.model.projectdirector.gs4tr.org/xsd}Date"/>
 *         &lt;element name="submissionName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubmissionSearchRequest", propOrder = {
    "folder",
    "projectTickets",
    "submissionDate",
    "submissionDueDate",
    "submissionName"
})
public class SubmissionSearchRequest {

    @XmlElement(required = true, nillable = true)
    protected ItemFolderEnum folder;
    @XmlElement(nillable = true)
    protected List<String> projectTickets;
    @XmlElement(required = true, nillable = true)
    protected Date submissionDate;
    @XmlElement(required = true, nillable = true)
    protected Date submissionDueDate;
    @XmlElement(required = true, nillable = true)
    protected String submissionName;

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
     * Gets the value of the submissionDate property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getSubmissionDate() {
        return submissionDate;
    }

    /**
     * Sets the value of the submissionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setSubmissionDate(Date value) {
        this.submissionDate = value;
    }

    /**
     * Gets the value of the submissionDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getSubmissionDueDate() {
        return submissionDueDate;
    }

    /**
     * Sets the value of the submissionDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setSubmissionDueDate(Date value) {
        this.submissionDueDate = value;
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

}
