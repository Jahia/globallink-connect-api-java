
package org.gs4tr.projectdirector.model.dto.xsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Phase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Phase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dateEnded" type="{http://dto.model.projectdirector.gs4tr.org/xsd}Date"/>
 *         &lt;element name="dueDate" type="{http://dto.model.projectdirector.gs4tr.org/xsd}Date"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="status" type="{http://dto.model.projectdirector.gs4tr.org/xsd}ItemStatusEnum"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Phase", propOrder = {
    "dateEnded",
    "dueDate",
    "name",
    "status"
})
public class Phase {

    @XmlElement(required = true, nillable = true)
    protected Date dateEnded;
    @XmlElement(required = true, nillable = true)
    protected Date dueDate;
    @XmlElement(required = true, nillable = true)
    protected String name;
    @XmlElement(required = true, nillable = true)
    protected ItemStatusEnum status;

    /**
     * Gets the value of the dateEnded property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getDateEnded() {
        return dateEnded;
    }

    /**
     * Sets the value of the dateEnded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setDateEnded(Date value) {
        this.dateEnded = value;
    }

    /**
     * Gets the value of the dueDate property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getDueDate() {
        return dueDate;
    }

    /**
     * Sets the value of the dueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setDueDate(Date value) {
        this.dueDate = value;
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ItemStatusEnum }
     *     
     */
    public ItemStatusEnum getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemStatusEnum }
     *     
     */
    public void setStatus(ItemStatusEnum value) {
        this.status = value;
    }

}
