
package org.gs4tr.projectdirector.model.dto.xsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProjectLanguageDirection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProjectLanguageDirection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sourceLanguage" type="{http://dto.model.projectdirector.gs4tr.org/xsd}Language"/>
 *         &lt;element name="targetLanguage" type="{http://dto.model.projectdirector.gs4tr.org/xsd}Language"/>
 *         &lt;element name="default" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="frequent" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProjectLanguageDirection", propOrder = {
    "sourceLanguage",
    "targetLanguage",
    "_default",
    "frequent"
})
public class ProjectLanguageDirection {

    @XmlElement(required = true, nillable = true)
    protected Language sourceLanguage;
    @XmlElement(required = true, nillable = true)
    protected Language targetLanguage;
    @XmlElement(name = "default", required = true, type = Boolean.class, nillable = true)
    protected Boolean _default;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean frequent;

    /**
     * Gets the value of the sourceLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link Language }
     *     
     */
    public Language getSourceLanguage() {
        return sourceLanguage;
    }

    /**
     * Sets the value of the sourceLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Language }
     *     
     */
    public void setSourceLanguage(Language value) {
        this.sourceLanguage = value;
    }

    /**
     * Gets the value of the targetLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link Language }
     *     
     */
    public Language getTargetLanguage() {
        return targetLanguage;
    }

    /**
     * Sets the value of the targetLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Language }
     *     
     */
    public void setTargetLanguage(Language value) {
        this.targetLanguage = value;
    }

    /**
     * Gets the value of the default property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefault() {
        return _default;
    }

    /**
     * Sets the value of the default property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefault(Boolean value) {
        this._default = value;
    }

    /**
     * Gets the value of the frequent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFrequent() {
        return frequent;
    }

    /**
     * Sets the value of the frequent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFrequent(Boolean value) {
        this.frequent = value;
    }

}
