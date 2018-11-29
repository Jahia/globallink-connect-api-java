
package org.gs4tr.projectdirector.model.dto.xsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Notification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Notification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="errorMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="notificationDate" type="{http://dto.model.projectdirector.gs4tr.org/xsd}Date"/>
 *         &lt;element name="notificationPriority" type="{http://dto.model.projectdirector.gs4tr.org/xsd}NotificationPriority"/>
 *         &lt;element name="notificationText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Notification", propOrder = {
    "errorMessage",
    "notificationDate",
    "notificationPriority",
    "notificationText"
})
public class Notification {

    @XmlElement(required = true, nillable = true)
    protected String errorMessage;
    @XmlElement(required = true, nillable = true)
    protected Date notificationDate;
    @XmlElement(required = true, nillable = true)
    protected NotificationPriority notificationPriority;
    @XmlElement(required = true, nillable = true)
    protected String notificationText;

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

    /**
     * Gets the value of the notificationDate property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getNotificationDate() {
        return notificationDate;
    }

    /**
     * Sets the value of the notificationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setNotificationDate(Date value) {
        this.notificationDate = value;
    }

    /**
     * Gets the value of the notificationPriority property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationPriority }
     *     
     */
    public NotificationPriority getNotificationPriority() {
        return notificationPriority;
    }

    /**
     * Sets the value of the notificationPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationPriority }
     *     
     */
    public void setNotificationPriority(NotificationPriority value) {
        this.notificationPriority = value;
    }

    /**
     * Gets the value of the notificationText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationText() {
        return notificationText;
    }

    /**
     * Sets the value of the notificationText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationText(String value) {
        this.notificationText = value;
    }

}
