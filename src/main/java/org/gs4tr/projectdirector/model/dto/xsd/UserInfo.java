
package org.gs4tr.projectdirector.model.dto.xsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for UserInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountLocked" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="accountNonExpired" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="autoClaimMultipleTasks" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="claimMultipleJobTasks" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="credentialsNonExpired" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="dateLastLogin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="department" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="emailAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="emailNotification" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="fax" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="phone1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="phone2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="timeZone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserInfo", propOrder = {
    "accountLocked",
    "accountNonExpired",
    "address",
    "autoClaimMultipleTasks",
    "claimMultipleJobTasks",
    "credentialsNonExpired",
    "dateLastLogin",
    "department",
    "emailAddress",
    "emailNotification",
    "enabled",
    "fax",
    "firstName",
    "lastName",
    "password",
    "phone1",
    "phone2",
    "timeZone",
    "userName",
    "userType"
})
public class UserInfo {

    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean accountLocked;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean accountNonExpired;
    @XmlElement(required = true, nillable = true)
    protected String address;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean autoClaimMultipleTasks;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean claimMultipleJobTasks;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean credentialsNonExpired;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateLastLogin;
    @XmlElement(required = true, nillable = true)
    protected String department;
    @XmlElement(required = true, nillable = true)
    protected String emailAddress;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean emailNotification;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean enabled;
    @XmlElement(required = true, nillable = true)
    protected String fax;
    @XmlElement(required = true, nillable = true)
    protected String firstName;
    @XmlElement(required = true, nillable = true)
    protected String lastName;
    @XmlElement(required = true, nillable = true)
    protected String password;
    @XmlElement(required = true, nillable = true)
    protected String phone1;
    @XmlElement(required = true, nillable = true)
    protected String phone2;
    @XmlElement(required = true, nillable = true)
    protected String timeZone;
    @XmlElement(required = true, nillable = true)
    protected String userName;
    @XmlElement(required = true, nillable = true)
    protected String userType;

    /**
     * Gets the value of the accountLocked property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAccountLocked() {
        return accountLocked;
    }

    /**
     * Sets the value of the accountLocked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAccountLocked(Boolean value) {
        this.accountLocked = value;
    }

    /**
     * Gets the value of the accountNonExpired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAccountNonExpired() {
        return accountNonExpired;
    }

    /**
     * Sets the value of the accountNonExpired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAccountNonExpired(Boolean value) {
        this.accountNonExpired = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the autoClaimMultipleTasks property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoClaimMultipleTasks() {
        return autoClaimMultipleTasks;
    }

    /**
     * Sets the value of the autoClaimMultipleTasks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoClaimMultipleTasks(Boolean value) {
        this.autoClaimMultipleTasks = value;
    }

    /**
     * Gets the value of the claimMultipleJobTasks property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClaimMultipleJobTasks() {
        return claimMultipleJobTasks;
    }

    /**
     * Sets the value of the claimMultipleJobTasks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClaimMultipleJobTasks(Boolean value) {
        this.claimMultipleJobTasks = value;
    }

    /**
     * Gets the value of the credentialsNonExpired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCredentialsNonExpired() {
        return credentialsNonExpired;
    }

    /**
     * Sets the value of the credentialsNonExpired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCredentialsNonExpired(Boolean value) {
        this.credentialsNonExpired = value;
    }

    /**
     * Gets the value of the dateLastLogin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateLastLogin() {
        return dateLastLogin;
    }

    /**
     * Sets the value of the dateLastLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateLastLogin(XMLGregorianCalendar value) {
        this.dateLastLogin = value;
    }

    /**
     * Gets the value of the department property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Sets the value of the department property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartment(String value) {
        this.department = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the emailNotification property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmailNotification() {
        return emailNotification;
    }

    /**
     * Sets the value of the emailNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmailNotification(Boolean value) {
        this.emailNotification = value;
    }

    /**
     * Gets the value of the enabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnabled(Boolean value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the phone1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone1() {
        return phone1;
    }

    /**
     * Sets the value of the phone1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone1(String value) {
        this.phone1 = value;
    }

    /**
     * Gets the value of the phone2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone2() {
        return phone2;
    }

    /**
     * Sets the value of the phone2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone2(String value) {
        this.phone2 = value;
    }

    /**
     * Gets the value of the timeZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZone(String value) {
        this.timeZone = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the userType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserType() {
        return userType;
    }

    /**
     * Sets the value of the userType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserType(String value) {
        this.userType = value;
    }

}
