
package org.gs4tr.projectdirector.model.dto.xsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TargetPagedList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TargetPagedList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="elements" type="{http://dto.model.projectdirector.gs4tr.org/xsd}Target" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="pagedListInfo" type="{http://dto.model.projectdirector.gs4tr.org/xsd}PagedListInfo"/>
 *         &lt;element name="tasks" type="{http://dto.model.projectdirector.gs4tr.org/xsd}Task" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="totalCount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TargetPagedList", propOrder = {
    "elements",
    "pagedListInfo",
    "tasks",
    "totalCount"
})
public class TargetPagedList {

    @XmlElement(nillable = true)
    protected List<Target> elements;
    @XmlElement(required = true, nillable = true)
    protected PagedListInfo pagedListInfo;
    @XmlElement(nillable = true)
    protected List<Task> tasks;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long totalCount;

    /**
     * Gets the value of the elements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the elements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Target }
     * 
     * 
     */
    public List<Target> getElements() {
        if (elements == null) {
            elements = new ArrayList<Target>();
        }
        return this.elements;
    }

    /**
     * Gets the value of the pagedListInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PagedListInfo }
     *     
     */
    public PagedListInfo getPagedListInfo() {
        return pagedListInfo;
    }

    /**
     * Sets the value of the pagedListInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PagedListInfo }
     *     
     */
    public void setPagedListInfo(PagedListInfo value) {
        this.pagedListInfo = value;
    }

    /**
     * Gets the value of the tasks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tasks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTasks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Task }
     * 
     * 
     */
    public List<Task> getTasks() {
        if (tasks == null) {
            tasks = new ArrayList<Task>();
        }
        return this.tasks;
    }

    /**
     * Gets the value of the totalCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalCount() {
        return totalCount;
    }

    /**
     * Sets the value of the totalCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalCount(Long value) {
        this.totalCount = value;
    }

}
