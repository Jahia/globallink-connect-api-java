
package org.gs4tr.projectdirector.model.dto.xsd;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Organization complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Organization">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="availableTasks" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="parentOrganization" type="{http://dto.model.projectdirector.gs4tr.org/xsd}Organization"/>
 *         &lt;element name="organizationInfo" type="{http://dto.model.projectdirector.gs4tr.org/xsd}OrganizationInfo"/>
 *         &lt;element name="tasks" type="{http://dto.model.projectdirector.gs4tr.org/xsd}Task" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "Organization", propOrder = {
    "availableTasks",
    "parentOrganization",
    "organizationInfo",
    "tasks",
    "ticket"
})
public class Organization {

    @XmlElement(required = true, nillable = true)
    protected BigInteger availableTasks;
    @XmlElement(required = true, nillable = true)
    protected Organization parentOrganization;
    @XmlElement(required = true, nillable = true)
    protected OrganizationInfo organizationInfo;
    @XmlElement(nillable = true)
    protected List<Task> tasks;
    @XmlElement(required = true, nillable = true)
    protected String ticket;

    /**
     * Gets the value of the availableTasks property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAvailableTasks() {
        return availableTasks;
    }

    /**
     * Sets the value of the availableTasks property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAvailableTasks(BigInteger value) {
        this.availableTasks = value;
    }

    /**
     * Gets the value of the parentOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link Organization }
     *     
     */
    public Organization getParentOrganization() {
        return parentOrganization;
    }

    /**
     * Sets the value of the parentOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organization }
     *     
     */
    public void setParentOrganization(Organization value) {
        this.parentOrganization = value;
    }

    /**
     * Gets the value of the organizationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationInfo }
     *     
     */
    public OrganizationInfo getOrganizationInfo() {
        return organizationInfo;
    }

    /**
     * Sets the value of the organizationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationInfo }
     *     
     */
    public void setOrganizationInfo(OrganizationInfo value) {
        this.organizationInfo = value;
    }

    /**
     * Gets the value of the tasks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tasks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTasks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Task }
     * 
     * 
     */
    public List<Task> getTasks() {
        if (tasks == null) {
            tasks = new ArrayList<Task>();
        }
        return this.tasks;
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
