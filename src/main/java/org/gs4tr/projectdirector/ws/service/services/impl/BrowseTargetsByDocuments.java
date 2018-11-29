
package org.gs4tr.projectdirector.ws.service.services.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.gs4tr.projectdirector.model.dto.xsd.PagedListInfo;


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
 *         &lt;element name="documentTickets" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="info" type="{http://dto.model.projectdirector.gs4tr.org/xsd}PagedListInfo"/>
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
    "documentTickets",
    "info"
})
@XmlRootElement(name = "browseTargetsByDocuments")
public class BrowseTargetsByDocuments {

    @XmlElement(required = true)
    protected List<String> documentTickets;
    @XmlElement(required = true)
    protected PagedListInfo info;

    /**
     * Gets the value of the documentTickets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentTickets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentTickets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDocumentTickets() {
        if (documentTickets == null) {
            documentTickets = new ArrayList<String>();
        }
        return this.documentTickets;
    }

    /**
     * Gets the value of the info property.
     * 
     * @return
     *     possible object is
     *     {@link PagedListInfo }
     *     
     */
    public PagedListInfo getInfo() {
        return info;
    }

    /**
     * Sets the value of the info property.
     * 
     * @param value
     *     allowed object is
     *     {@link PagedListInfo }
     *     
     */
    public void setInfo(PagedListInfo value) {
        this.info = value;
    }

}
