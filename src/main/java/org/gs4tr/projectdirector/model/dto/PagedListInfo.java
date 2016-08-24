
package org.gs4tr.projectdirector.model.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PagedListInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PagedListInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="index" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="indexesSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sortDirection" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sortProperty" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PagedListInfo", propOrder = {
    "index",
    "indexesSize",
    "size",
    "sortDirection",
    "sortProperty"
})
public class PagedListInfo {

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer index;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer indexesSize;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer size;
    @XmlElement(required = true, nillable = true)
    protected String sortDirection;
    @XmlElement(required = true, nillable = true)
    protected String sortProperty;

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIndex(Integer value) {
        this.index = value;
    }

    /**
     * Gets the value of the indexesSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIndexesSize() {
        return indexesSize;
    }

    /**
     * Sets the value of the indexesSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIndexesSize(Integer value) {
        this.indexesSize = value;
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSize(Integer value) {
        this.size = value;
    }

    /**
     * Gets the value of the sortDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortDirection() {
        return sortDirection;
    }

    /**
     * Sets the value of the sortDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortDirection(String value) {
        this.sortDirection = value;
    }

    /**
     * Gets the value of the sortProperty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortProperty() {
        return sortProperty;
    }

    /**
     * Sets the value of the sortProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortProperty(String value) {
        this.sortProperty = value;
    }

}
