
package org.gs4tr.projectdirector.model.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TmStatistics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TmStatistics">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fuzzyRepetitionsWordCount1" type="{http://dto.model.projectdirector.gs4tr.org/xsd}FuzzyTmStatistics"/>
 *         &lt;element name="fuzzyRepetitionsWordCount10" type="{http://dto.model.projectdirector.gs4tr.org/xsd}FuzzyTmStatistics"/>
 *         &lt;element name="fuzzyRepetitionsWordCount2" type="{http://dto.model.projectdirector.gs4tr.org/xsd}FuzzyTmStatistics"/>
 *         &lt;element name="fuzzyRepetitionsWordCount3" type="{http://dto.model.projectdirector.gs4tr.org/xsd}FuzzyTmStatistics"/>
 *         &lt;element name="fuzzyRepetitionsWordCount4" type="{http://dto.model.projectdirector.gs4tr.org/xsd}FuzzyTmStatistics"/>
 *         &lt;element name="fuzzyRepetitionsWordCount5" type="{http://dto.model.projectdirector.gs4tr.org/xsd}FuzzyTmStatistics"/>
 *         &lt;element name="fuzzyRepetitionsWordCount6" type="{http://dto.model.projectdirector.gs4tr.org/xsd}FuzzyTmStatistics"/>
 *         &lt;element name="fuzzyRepetitionsWordCount7" type="{http://dto.model.projectdirector.gs4tr.org/xsd}FuzzyTmStatistics"/>
 *         &lt;element name="fuzzyRepetitionsWordCount8" type="{http://dto.model.projectdirector.gs4tr.org/xsd}FuzzyTmStatistics"/>
 *         &lt;element name="fuzzyRepetitionsWordCount9" type="{http://dto.model.projectdirector.gs4tr.org/xsd}FuzzyTmStatistics"/>
 *         &lt;element name="fuzzyWordCount1" type="{http://dto.model.projectdirector.gs4tr.org/xsd}FuzzyTmStatistics"/>
 *         &lt;element name="fuzzyWordCount10" type="{http://dto.model.projectdirector.gs4tr.org/xsd}FuzzyTmStatistics"/>
 *         &lt;element name="fuzzyWordCount2" type="{http://dto.model.projectdirector.gs4tr.org/xsd}FuzzyTmStatistics"/>
 *         &lt;element name="fuzzyWordCount3" type="{http://dto.model.projectdirector.gs4tr.org/xsd}FuzzyTmStatistics"/>
 *         &lt;element name="fuzzyWordCount4" type="{http://dto.model.projectdirector.gs4tr.org/xsd}FuzzyTmStatistics"/>
 *         &lt;element name="fuzzyWordCount5" type="{http://dto.model.projectdirector.gs4tr.org/xsd}FuzzyTmStatistics"/>
 *         &lt;element name="fuzzyWordCount6" type="{http://dto.model.projectdirector.gs4tr.org/xsd}FuzzyTmStatistics"/>
 *         &lt;element name="fuzzyWordCount7" type="{http://dto.model.projectdirector.gs4tr.org/xsd}FuzzyTmStatistics"/>
 *         &lt;element name="fuzzyWordCount8" type="{http://dto.model.projectdirector.gs4tr.org/xsd}FuzzyTmStatistics"/>
 *         &lt;element name="fuzzyWordCount9" type="{http://dto.model.projectdirector.gs4tr.org/xsd}FuzzyTmStatistics"/>
 *         &lt;element name="goldWordCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="noMatchWordCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="oneHundredMatchWordCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="repetitionWordCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="totalWordCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TmStatistics", propOrder = {
    "fuzzyRepetitionsWordCount1",
    "fuzzyRepetitionsWordCount10",
    "fuzzyRepetitionsWordCount2",
    "fuzzyRepetitionsWordCount3",
    "fuzzyRepetitionsWordCount4",
    "fuzzyRepetitionsWordCount5",
    "fuzzyRepetitionsWordCount6",
    "fuzzyRepetitionsWordCount7",
    "fuzzyRepetitionsWordCount8",
    "fuzzyRepetitionsWordCount9",
    "fuzzyWordCount1",
    "fuzzyWordCount10",
    "fuzzyWordCount2",
    "fuzzyWordCount3",
    "fuzzyWordCount4",
    "fuzzyWordCount5",
    "fuzzyWordCount6",
    "fuzzyWordCount7",
    "fuzzyWordCount8",
    "fuzzyWordCount9",
    "goldWordCount",
    "noMatchWordCount",
    "oneHundredMatchWordCount",
    "repetitionWordCount",
    "totalWordCount"
})
public class TmStatistics {

    @XmlElement(required = true, nillable = true)
    protected FuzzyTmStatistics fuzzyRepetitionsWordCount1;
    @XmlElement(required = true, nillable = true)
    protected FuzzyTmStatistics fuzzyRepetitionsWordCount10;
    @XmlElement(required = true, nillable = true)
    protected FuzzyTmStatistics fuzzyRepetitionsWordCount2;
    @XmlElement(required = true, nillable = true)
    protected FuzzyTmStatistics fuzzyRepetitionsWordCount3;
    @XmlElement(required = true, nillable = true)
    protected FuzzyTmStatistics fuzzyRepetitionsWordCount4;
    @XmlElement(required = true, nillable = true)
    protected FuzzyTmStatistics fuzzyRepetitionsWordCount5;
    @XmlElement(required = true, nillable = true)
    protected FuzzyTmStatistics fuzzyRepetitionsWordCount6;
    @XmlElement(required = true, nillable = true)
    protected FuzzyTmStatistics fuzzyRepetitionsWordCount7;
    @XmlElement(required = true, nillable = true)
    protected FuzzyTmStatistics fuzzyRepetitionsWordCount8;
    @XmlElement(required = true, nillable = true)
    protected FuzzyTmStatistics fuzzyRepetitionsWordCount9;
    @XmlElement(required = true, nillable = true)
    protected FuzzyTmStatistics fuzzyWordCount1;
    @XmlElement(required = true, nillable = true)
    protected FuzzyTmStatistics fuzzyWordCount10;
    @XmlElement(required = true, nillable = true)
    protected FuzzyTmStatistics fuzzyWordCount2;
    @XmlElement(required = true, nillable = true)
    protected FuzzyTmStatistics fuzzyWordCount3;
    @XmlElement(required = true, nillable = true)
    protected FuzzyTmStatistics fuzzyWordCount4;
    @XmlElement(required = true, nillable = true)
    protected FuzzyTmStatistics fuzzyWordCount5;
    @XmlElement(required = true, nillable = true)
    protected FuzzyTmStatistics fuzzyWordCount6;
    @XmlElement(required = true, nillable = true)
    protected FuzzyTmStatistics fuzzyWordCount7;
    @XmlElement(required = true, nillable = true)
    protected FuzzyTmStatistics fuzzyWordCount8;
    @XmlElement(required = true, nillable = true)
    protected FuzzyTmStatistics fuzzyWordCount9;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer goldWordCount;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer noMatchWordCount;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer oneHundredMatchWordCount;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer repetitionWordCount;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer totalWordCount;

    /**
     * Gets the value of the fuzzyRepetitionsWordCount1 property.
     * 
     * @return
     *     possible object is
     *     {@link FuzzyTmStatistics }
     *     
     */
    public FuzzyTmStatistics getFuzzyRepetitionsWordCount1() {
        return fuzzyRepetitionsWordCount1;
    }

    /**
     * Sets the value of the fuzzyRepetitionsWordCount1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link FuzzyTmStatistics }
     *     
     */
    public void setFuzzyRepetitionsWordCount1(FuzzyTmStatistics value) {
        this.fuzzyRepetitionsWordCount1 = value;
    }

    /**
     * Gets the value of the fuzzyRepetitionsWordCount10 property.
     * 
     * @return
     *     possible object is
     *     {@link FuzzyTmStatistics }
     *     
     */
    public FuzzyTmStatistics getFuzzyRepetitionsWordCount10() {
        return fuzzyRepetitionsWordCount10;
    }

    /**
     * Sets the value of the fuzzyRepetitionsWordCount10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link FuzzyTmStatistics }
     *     
     */
    public void setFuzzyRepetitionsWordCount10(FuzzyTmStatistics value) {
        this.fuzzyRepetitionsWordCount10 = value;
    }

    /**
     * Gets the value of the fuzzyRepetitionsWordCount2 property.
     * 
     * @return
     *     possible object is
     *     {@link FuzzyTmStatistics }
     *     
     */
    public FuzzyTmStatistics getFuzzyRepetitionsWordCount2() {
        return fuzzyRepetitionsWordCount2;
    }

    /**
     * Sets the value of the fuzzyRepetitionsWordCount2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link FuzzyTmStatistics }
     *     
     */
    public void setFuzzyRepetitionsWordCount2(FuzzyTmStatistics value) {
        this.fuzzyRepetitionsWordCount2 = value;
    }

    /**
     * Gets the value of the fuzzyRepetitionsWordCount3 property.
     * 
     * @return
     *     possible object is
     *     {@link FuzzyTmStatistics }
     *     
     */
    public FuzzyTmStatistics getFuzzyRepetitionsWordCount3() {
        return fuzzyRepetitionsWordCount3;
    }

    /**
     * Sets the value of the fuzzyRepetitionsWordCount3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link FuzzyTmStatistics }
     *     
     */
    public void setFuzzyRepetitionsWordCount3(FuzzyTmStatistics value) {
        this.fuzzyRepetitionsWordCount3 = value;
    }

    /**
     * Gets the value of the fuzzyRepetitionsWordCount4 property.
     * 
     * @return
     *     possible object is
     *     {@link FuzzyTmStatistics }
     *     
     */
    public FuzzyTmStatistics getFuzzyRepetitionsWordCount4() {
        return fuzzyRepetitionsWordCount4;
    }

    /**
     * Sets the value of the fuzzyRepetitionsWordCount4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link FuzzyTmStatistics }
     *     
     */
    public void setFuzzyRepetitionsWordCount4(FuzzyTmStatistics value) {
        this.fuzzyRepetitionsWordCount4 = value;
    }

    /**
     * Gets the value of the fuzzyRepetitionsWordCount5 property.
     * 
     * @return
     *     possible object is
     *     {@link FuzzyTmStatistics }
     *     
     */
    public FuzzyTmStatistics getFuzzyRepetitionsWordCount5() {
        return fuzzyRepetitionsWordCount5;
    }

    /**
     * Sets the value of the fuzzyRepetitionsWordCount5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link FuzzyTmStatistics }
     *     
     */
    public void setFuzzyRepetitionsWordCount5(FuzzyTmStatistics value) {
        this.fuzzyRepetitionsWordCount5 = value;
    }

    /**
     * Gets the value of the fuzzyRepetitionsWordCount6 property.
     * 
     * @return
     *     possible object is
     *     {@link FuzzyTmStatistics }
     *     
     */
    public FuzzyTmStatistics getFuzzyRepetitionsWordCount6() {
        return fuzzyRepetitionsWordCount6;
    }

    /**
     * Sets the value of the fuzzyRepetitionsWordCount6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link FuzzyTmStatistics }
     *     
     */
    public void setFuzzyRepetitionsWordCount6(FuzzyTmStatistics value) {
        this.fuzzyRepetitionsWordCount6 = value;
    }

    /**
     * Gets the value of the fuzzyRepetitionsWordCount7 property.
     * 
     * @return
     *     possible object is
     *     {@link FuzzyTmStatistics }
     *     
     */
    public FuzzyTmStatistics getFuzzyRepetitionsWordCount7() {
        return fuzzyRepetitionsWordCount7;
    }

    /**
     * Sets the value of the fuzzyRepetitionsWordCount7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link FuzzyTmStatistics }
     *     
     */
    public void setFuzzyRepetitionsWordCount7(FuzzyTmStatistics value) {
        this.fuzzyRepetitionsWordCount7 = value;
    }

    /**
     * Gets the value of the fuzzyRepetitionsWordCount8 property.
     * 
     * @return
     *     possible object is
     *     {@link FuzzyTmStatistics }
     *     
     */
    public FuzzyTmStatistics getFuzzyRepetitionsWordCount8() {
        return fuzzyRepetitionsWordCount8;
    }

    /**
     * Sets the value of the fuzzyRepetitionsWordCount8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link FuzzyTmStatistics }
     *     
     */
    public void setFuzzyRepetitionsWordCount8(FuzzyTmStatistics value) {
        this.fuzzyRepetitionsWordCount8 = value;
    }

    /**
     * Gets the value of the fuzzyRepetitionsWordCount9 property.
     * 
     * @return
     *     possible object is
     *     {@link FuzzyTmStatistics }
     *     
     */
    public FuzzyTmStatistics getFuzzyRepetitionsWordCount9() {
        return fuzzyRepetitionsWordCount9;
    }

    /**
     * Sets the value of the fuzzyRepetitionsWordCount9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link FuzzyTmStatistics }
     *     
     */
    public void setFuzzyRepetitionsWordCount9(FuzzyTmStatistics value) {
        this.fuzzyRepetitionsWordCount9 = value;
    }

    /**
     * Gets the value of the fuzzyWordCount1 property.
     * 
     * @return
     *     possible object is
     *     {@link FuzzyTmStatistics }
     *     
     */
    public FuzzyTmStatistics getFuzzyWordCount1() {
        return fuzzyWordCount1;
    }

    /**
     * Sets the value of the fuzzyWordCount1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link FuzzyTmStatistics }
     *     
     */
    public void setFuzzyWordCount1(FuzzyTmStatistics value) {
        this.fuzzyWordCount1 = value;
    }

    /**
     * Gets the value of the fuzzyWordCount10 property.
     * 
     * @return
     *     possible object is
     *     {@link FuzzyTmStatistics }
     *     
     */
    public FuzzyTmStatistics getFuzzyWordCount10() {
        return fuzzyWordCount10;
    }

    /**
     * Sets the value of the fuzzyWordCount10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link FuzzyTmStatistics }
     *     
     */
    public void setFuzzyWordCount10(FuzzyTmStatistics value) {
        this.fuzzyWordCount10 = value;
    }

    /**
     * Gets the value of the fuzzyWordCount2 property.
     * 
     * @return
     *     possible object is
     *     {@link FuzzyTmStatistics }
     *     
     */
    public FuzzyTmStatistics getFuzzyWordCount2() {
        return fuzzyWordCount2;
    }

    /**
     * Sets the value of the fuzzyWordCount2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link FuzzyTmStatistics }
     *     
     */
    public void setFuzzyWordCount2(FuzzyTmStatistics value) {
        this.fuzzyWordCount2 = value;
    }

    /**
     * Gets the value of the fuzzyWordCount3 property.
     * 
     * @return
     *     possible object is
     *     {@link FuzzyTmStatistics }
     *     
     */
    public FuzzyTmStatistics getFuzzyWordCount3() {
        return fuzzyWordCount3;
    }

    /**
     * Sets the value of the fuzzyWordCount3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link FuzzyTmStatistics }
     *     
     */
    public void setFuzzyWordCount3(FuzzyTmStatistics value) {
        this.fuzzyWordCount3 = value;
    }

    /**
     * Gets the value of the fuzzyWordCount4 property.
     * 
     * @return
     *     possible object is
     *     {@link FuzzyTmStatistics }
     *     
     */
    public FuzzyTmStatistics getFuzzyWordCount4() {
        return fuzzyWordCount4;
    }

    /**
     * Sets the value of the fuzzyWordCount4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link FuzzyTmStatistics }
     *     
     */
    public void setFuzzyWordCount4(FuzzyTmStatistics value) {
        this.fuzzyWordCount4 = value;
    }

    /**
     * Gets the value of the fuzzyWordCount5 property.
     * 
     * @return
     *     possible object is
     *     {@link FuzzyTmStatistics }
     *     
     */
    public FuzzyTmStatistics getFuzzyWordCount5() {
        return fuzzyWordCount5;
    }

    /**
     * Sets the value of the fuzzyWordCount5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link FuzzyTmStatistics }
     *     
     */
    public void setFuzzyWordCount5(FuzzyTmStatistics value) {
        this.fuzzyWordCount5 = value;
    }

    /**
     * Gets the value of the fuzzyWordCount6 property.
     * 
     * @return
     *     possible object is
     *     {@link FuzzyTmStatistics }
     *     
     */
    public FuzzyTmStatistics getFuzzyWordCount6() {
        return fuzzyWordCount6;
    }

    /**
     * Sets the value of the fuzzyWordCount6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link FuzzyTmStatistics }
     *     
     */
    public void setFuzzyWordCount6(FuzzyTmStatistics value) {
        this.fuzzyWordCount6 = value;
    }

    /**
     * Gets the value of the fuzzyWordCount7 property.
     * 
     * @return
     *     possible object is
     *     {@link FuzzyTmStatistics }
     *     
     */
    public FuzzyTmStatistics getFuzzyWordCount7() {
        return fuzzyWordCount7;
    }

    /**
     * Sets the value of the fuzzyWordCount7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link FuzzyTmStatistics }
     *     
     */
    public void setFuzzyWordCount7(FuzzyTmStatistics value) {
        this.fuzzyWordCount7 = value;
    }

    /**
     * Gets the value of the fuzzyWordCount8 property.
     * 
     * @return
     *     possible object is
     *     {@link FuzzyTmStatistics }
     *     
     */
    public FuzzyTmStatistics getFuzzyWordCount8() {
        return fuzzyWordCount8;
    }

    /**
     * Sets the value of the fuzzyWordCount8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link FuzzyTmStatistics }
     *     
     */
    public void setFuzzyWordCount8(FuzzyTmStatistics value) {
        this.fuzzyWordCount8 = value;
    }

    /**
     * Gets the value of the fuzzyWordCount9 property.
     * 
     * @return
     *     possible object is
     *     {@link FuzzyTmStatistics }
     *     
     */
    public FuzzyTmStatistics getFuzzyWordCount9() {
        return fuzzyWordCount9;
    }

    /**
     * Sets the value of the fuzzyWordCount9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link FuzzyTmStatistics }
     *     
     */
    public void setFuzzyWordCount9(FuzzyTmStatistics value) {
        this.fuzzyWordCount9 = value;
    }

    /**
     * Gets the value of the goldWordCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGoldWordCount() {
        return goldWordCount;
    }

    /**
     * Sets the value of the goldWordCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGoldWordCount(Integer value) {
        this.goldWordCount = value;
    }

    /**
     * Gets the value of the noMatchWordCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNoMatchWordCount() {
        return noMatchWordCount;
    }

    /**
     * Sets the value of the noMatchWordCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNoMatchWordCount(Integer value) {
        this.noMatchWordCount = value;
    }

    /**
     * Gets the value of the oneHundredMatchWordCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOneHundredMatchWordCount() {
        return oneHundredMatchWordCount;
    }

    /**
     * Sets the value of the oneHundredMatchWordCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOneHundredMatchWordCount(Integer value) {
        this.oneHundredMatchWordCount = value;
    }

    /**
     * Gets the value of the repetitionWordCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRepetitionWordCount() {
        return repetitionWordCount;
    }

    /**
     * Sets the value of the repetitionWordCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRepetitionWordCount(Integer value) {
        this.repetitionWordCount = value;
    }

    /**
     * Gets the value of the totalWordCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalWordCount() {
        return totalWordCount;
    }

    /**
     * Sets the value of the totalWordCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalWordCount(Integer value) {
        this.totalWordCount = value;
    }

}
