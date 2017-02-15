
package org.gs4tr.projectdirector.model.dto.xsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FuzzyTmStatistics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FuzzyTmStatistics">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fuzzyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="wordCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FuzzyTmStatistics", propOrder = {
    "fuzzyName",
    "wordCount"
})
public class FuzzyTmStatistics {

    @XmlElement(required = true, nillable = true)
    protected String fuzzyName;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer wordCount;

    /**
     * Gets the value of the fuzzyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFuzzyName() {
        return fuzzyName;
    }

    /**
     * Sets the value of the fuzzyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFuzzyName(String value) {
        this.fuzzyName = value;
    }

    /**
     * Gets the value of the wordCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWordCount() {
        return wordCount;
    }

    /**
     * Sets the value of the wordCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWordCount(Integer value) {
        this.wordCount = value;
    }

}
