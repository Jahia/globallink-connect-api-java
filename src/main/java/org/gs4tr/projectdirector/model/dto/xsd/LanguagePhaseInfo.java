
package org.gs4tr.projectdirector.model.dto.xsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LanguagePhaseInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LanguagePhaseInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="phaseStartDate" type="{http://dto.model.projectdirector.gs4tr.org/xsd}Date"/>
 *         &lt;element name="sourceFileList" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="tmStatistics" type="{http://dto.model.projectdirector.gs4tr.org/xsd}TmStatistics"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LanguagePhaseInfo", propOrder = {
    "phaseStartDate",
    "sourceFileList",
    "tmStatistics"
})
public class LanguagePhaseInfo {

    @XmlElement(required = true, nillable = true)
    protected Date phaseStartDate;
    @XmlElement(nillable = true)
    protected List<String> sourceFileList;
    @XmlElement(required = true, nillable = true)
    protected TmStatistics tmStatistics;

    /**
     * Gets the value of the phaseStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getPhaseStartDate() {
        return phaseStartDate;
    }

    /**
     * Sets the value of the phaseStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setPhaseStartDate(Date value) {
        this.phaseStartDate = value;
    }

    /**
     * Gets the value of the sourceFileList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sourceFileList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSourceFileList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSourceFileList() {
        if (sourceFileList == null) {
            sourceFileList = new ArrayList<String>();
        }
        return this.sourceFileList;
    }

    /**
     * Gets the value of the tmStatistics property.
     * 
     * @return
     *     possible object is
     *     {@link TmStatistics }
     *     
     */
    public TmStatistics getTmStatistics() {
        return tmStatistics;
    }

    /**
     * Sets the value of the tmStatistics property.
     * 
     * @param value
     *     allowed object is
     *     {@link TmStatistics }
     *     
     */
    public void setTmStatistics(TmStatistics value) {
        this.tmStatistics = value;
    }

}
