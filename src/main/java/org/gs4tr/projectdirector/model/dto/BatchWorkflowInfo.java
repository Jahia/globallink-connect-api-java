
package org.gs4tr.projectdirector.model.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BatchWorkflowInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BatchWorkflowInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="batchName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="languageWorkflowInfo" type="{http://dto.model.projectdirector.gs4tr.org/xsd}LanguageWorkflowInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchWorkflowInfo", propOrder = {
    "batchName",
    "languageWorkflowInfo"
})
public class BatchWorkflowInfo {

    @XmlElement(required = true, nillable = true)
    protected String batchName;
    @XmlElement(required = true, nillable = true)
    protected LanguageWorkflowInfo languageWorkflowInfo;

    /**
     * Gets the value of the batchName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchName() {
        return batchName;
    }

    /**
     * Sets the value of the batchName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchName(String value) {
        this.batchName = value;
    }

    /**
     * Gets the value of the languageWorkflowInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LanguageWorkflowInfo }
     *     
     */
    public LanguageWorkflowInfo getLanguageWorkflowInfo() {
        return languageWorkflowInfo;
    }

    /**
     * Sets the value of the languageWorkflowInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageWorkflowInfo }
     *     
     */
    public void setLanguageWorkflowInfo(LanguageWorkflowInfo value) {
        this.languageWorkflowInfo = value;
    }

}
