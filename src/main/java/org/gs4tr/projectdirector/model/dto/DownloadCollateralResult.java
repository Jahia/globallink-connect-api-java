
package org.gs4tr.projectdirector.model.dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DownloadCollateralResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DownloadCollateralResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="errorMessages" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="processingFinished" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="repositoryItem" type="{http://dto.model.projectdirector.gs4tr.org/xsd}RepositoryItem"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DownloadCollateralResult", propOrder = {
    "errorMessages",
    "processingFinished",
    "repositoryItem"
})
public class DownloadCollateralResult {

    @XmlElement(nillable = true)
    protected List<String> errorMessages;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean processingFinished;
    @XmlElement(required = true, nillable = true)
    protected RepositoryItem repositoryItem;

    /**
     * Gets the value of the errorMessages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errorMessages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrorMessages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getErrorMessages() {
        if (errorMessages == null) {
            errorMessages = new ArrayList<String>();
        }
        return this.errorMessages;
    }

    /**
     * Gets the value of the processingFinished property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProcessingFinished() {
        return processingFinished;
    }

    /**
     * Sets the value of the processingFinished property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProcessingFinished(Boolean value) {
        this.processingFinished = value;
    }

    /**
     * Gets the value of the repositoryItem property.
     * 
     * @return
     *     possible object is
     *     {@link RepositoryItem }
     *     
     */
    public RepositoryItem getRepositoryItem() {
        return repositoryItem;
    }

    /**
     * Sets the value of the repositoryItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepositoryItem }
     *     
     */
    public void setRepositoryItem(RepositoryItem value) {
        this.repositoryItem = value;
    }

}
