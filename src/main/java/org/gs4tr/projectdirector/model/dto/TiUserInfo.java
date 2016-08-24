
package org.gs4tr.projectdirector.model.dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TiUserInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TiUserInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="languageDirections" type="{http://dto.model.projectdirector.gs4tr.org/xsd}LanguageDirection" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="organizationId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="projectRoles" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="projectTicket" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="systemRoles" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="vendorId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TiUserInfo", propOrder = {
    "languageDirections",
    "organizationId",
    "projectRoles",
    "projectTicket",
    "systemRoles",
    "vendorId"
})
public class TiUserInfo {

    @XmlElement(nillable = true)
    protected List<LanguageDirection> languageDirections;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long organizationId;
    @XmlElement(nillable = true)
    protected List<String> projectRoles;
    @XmlElement(nillable = true)
    protected List<String> projectTicket;
    @XmlElement(nillable = true)
    protected List<String> systemRoles;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long vendorId;

    /**
     * Gets the value of the languageDirections property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the languageDirections property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLanguageDirections().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageDirection }
     * 
     * 
     */
    public List<LanguageDirection> getLanguageDirections() {
        if (languageDirections == null) {
            languageDirections = new ArrayList<LanguageDirection>();
        }
        return this.languageDirections;
    }

    /**
     * Gets the value of the organizationId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOrganizationId() {
        return organizationId;
    }

    /**
     * Sets the value of the organizationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOrganizationId(Long value) {
        this.organizationId = value;
    }

    /**
     * Gets the value of the projectRoles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the projectRoles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProjectRoles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getProjectRoles() {
        if (projectRoles == null) {
            projectRoles = new ArrayList<String>();
        }
        return this.projectRoles;
    }

    /**
     * Gets the value of the projectTicket property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the projectTicket property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProjectTicket().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getProjectTicket() {
        if (projectTicket == null) {
            projectTicket = new ArrayList<String>();
        }
        return this.projectTicket;
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
     * {@link String }
     * 
     * 
     */
    public List<String> getSystemRoles() {
        if (systemRoles == null) {
            systemRoles = new ArrayList<String>();
        }
        return this.systemRoles;
    }

    /**
     * Gets the value of the vendorId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVendorId() {
        return vendorId;
    }

    /**
     * Sets the value of the vendorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVendorId(Long value) {
        this.vendorId = value;
    }

}
