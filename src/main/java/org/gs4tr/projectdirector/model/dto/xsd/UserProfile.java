
package org.gs4tr.projectdirector.model.dto.xsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="availableTasks" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="organizationName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="systemRoles" type="{http://dto.model.projectdirector.gs4tr.org/xsd}Role" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="tasks" type="{http://dto.model.projectdirector.gs4tr.org/xsd}Task" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ticket" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userInfo" type="{http://dto.model.projectdirector.gs4tr.org/xsd}UserInfo"/>
 *         &lt;element name="vendorName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserProfile", propOrder = {
    "availableTasks",
    "organizationName",
    "systemRoles",
    "tasks",
    "ticket",
    "userInfo",
    "vendorName"
})
public class UserProfile {

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer availableTasks;
    @XmlElement(required = true, nillable = true)
    protected String organizationName;
    @XmlElement(nillable = true)
    protected List<Role> systemRoles;
    @XmlElement(nillable = true)
    protected List<Task> tasks;
    @XmlElement(required = true, nillable = true)
    protected String ticket;
    @XmlElement(required = true, nillable = true)
    protected UserInfo userInfo;
    @XmlElement(required = true, nillable = true)
    protected String vendorName;

    /**
     * Gets the value of the availableTasks property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAvailableTasks() {
        return availableTasks;
    }

    /**
     * Sets the value of the availableTasks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAvailableTasks(Integer value) {
        this.availableTasks = value;
    }

    /**
     * Gets the value of the organizationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /**
     * Sets the value of the organizationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationName(String value) {
        this.organizationName = value;
    }

    /**
     * Gets the value of the systemRoles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the systemRoles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSystemRoles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Role }
     * 
     * 
     */
    public List<Role> getSystemRoles() {
        if (systemRoles == null) {
            systemRoles = new ArrayList<Role>();
        }
        return this.systemRoles;
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

    /**
     * Gets the value of the userInfo property.
     * 
     * @return
     *     possible object is
     *     {@link UserInfo }
     *     
     */
    public UserInfo getUserInfo() {
        return userInfo;
    }

    /**
     * Sets the value of the userInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserInfo }
     *     
     */
    public void setUserInfo(UserInfo value) {
        this.userInfo = value;
    }

    /**
     * Gets the value of the vendorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorName() {
        return vendorName;
    }

    /**
     * Sets the value of the vendorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorName(String value) {
        this.vendorName = value;
    }

}
