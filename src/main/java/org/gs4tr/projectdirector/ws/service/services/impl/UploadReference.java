
package org.gs4tr.projectdirector.ws.service.services.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.gs4tr.projectdirector.model.dto.ResourceInfo;
import org.w3._2005._05.xmlmime.Base64Binary;


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
 *         &lt;element name="submissionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="resourceInfo" type="{http://dto.model.projectdirector.gs4tr.org/xsd}ResourceInfo"/>
 *         &lt;element name="data" type="{http://www.w3.org/2005/05/xmlmime}base64Binary"/>
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
    "submissionId",
    "resourceInfo",
    "data"
})
@XmlRootElement(name = "uploadReference")
public class UploadReference {

    @XmlElement(required = true)
    protected String submissionId;
    @XmlElement(required = true)
    protected ResourceInfo resourceInfo;
    @XmlElement(required = true)
    protected Base64Binary data;

    /**
     * Gets the value of the submissionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmissionId() {
        return submissionId;
    }

    /**
     * Sets the value of the submissionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmissionId(String value) {
        this.submissionId = value;
    }

    /**
     * Gets the value of the resourceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceInfo }
     *     
     */
    public ResourceInfo getResourceInfo() {
        return resourceInfo;
    }

    /**
     * Sets the value of the resourceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceInfo }
     *     
     */
    public void setResourceInfo(ResourceInfo value) {
        this.resourceInfo = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link Base64Binary }
     *     
     */
    public Base64Binary getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link Base64Binary }
     *     
     */
    public void setData(Base64Binary value) {
        this.data = value;
    }

}
