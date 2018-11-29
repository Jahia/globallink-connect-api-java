
package org.gs4tr.projectdirector.model.dto.xsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LanguageWorkflowInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LanguageWorkflowInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sourceLanguage" type="{http://dto.model.projectdirector.gs4tr.org/xsd}Language"/>
 *         &lt;element name="targetLanguage" type="{http://dto.model.projectdirector.gs4tr.org/xsd}Language"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LanguageWorkflowInfo", propOrder = {
    "sourceLanguage",
    "targetLanguage"
})
public class LanguageWorkflowInfo {

    @XmlElement(required = true, nillable = true)
    protected Language sourceLanguage;
    @XmlElement(required = true, nillable = true)
    protected Language targetLanguage;

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

}
