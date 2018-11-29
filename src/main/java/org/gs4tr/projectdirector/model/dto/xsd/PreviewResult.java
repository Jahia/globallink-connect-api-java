
package org.gs4tr.projectdirector.model.dto.xsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PreviewResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PreviewResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "PreviewResult", propOrder = {
    "message",
    "repositoryItem"
})
public class PreviewResult {

    @XmlElement(required = true, nillable = true)
    protected String message;
    @XmlElement(required = true, nillable = true)
    protected RepositoryItem repositoryItem;

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
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
