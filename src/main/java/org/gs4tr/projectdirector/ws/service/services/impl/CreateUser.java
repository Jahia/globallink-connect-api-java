
package org.gs4tr.projectdirector.ws.service.services.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.gs4tr.projectdirector.model.dto.xsd.TiUserInfo;
import org.gs4tr.projectdirector.model.dto.xsd.UserInfo;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userInfo" type="{http://dto.model.projectdirector.gs4tr.org/xsd}UserInfo"/>
 *         &lt;element name="tiUserInfo" type="{http://dto.model.projectdirector.gs4tr.org/xsd}TiUserInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "userInfo",
    "tiUserInfo"
})
@XmlRootElement(name = "createUser")
public class CreateUser {

    @XmlElement(required = true)
    protected UserInfo userInfo;
    @XmlElement(required = true)
    protected TiUserInfo tiUserInfo;

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
     * Gets the value of the tiUserInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TiUserInfo }
     *     
     */
    public TiUserInfo getTiUserInfo() {
        return tiUserInfo;
    }

    /**
     * Sets the value of the tiUserInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TiUserInfo }
     *     
     */
    public void setTiUserInfo(TiUserInfo value) {
        this.tiUserInfo = value;
    }

}
