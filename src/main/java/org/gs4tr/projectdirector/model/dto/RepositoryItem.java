
package org.gs4tr.projectdirector.model.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3._2005._05.xmlmime.Base64Binary;


/**
 * <p>Java class for RepositoryItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RepositoryItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="data" type="{http://www.w3.org/2005/05/xmlmime}base64Binary"/>
 *         &lt;element name="resourceInfo" type="{http://dto.model.projectdirector.gs4tr.org/xsd}ResourceInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RepositoryItem", propOrder = {
    "data",
    "resourceInfo"
})
public class RepositoryItem {

    @XmlElement(required = true, nillable = true)
    protected Base64Binary data;
    @XmlElement(required = true, nillable = true)
    protected ResourceInfo resourceInfo;

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

}
