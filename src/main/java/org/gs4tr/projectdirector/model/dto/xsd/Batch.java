
package org.gs4tr.projectdirector.model.dto.xsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Batch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Batch">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="targetLanguages" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="workflowDefinition" type="{http://dto.model.projectdirector.gs4tr.org/xsd}WorkflowDefinition"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Batch", propOrder = {
    "name",
    "targetLanguages",
    "workflowDefinition"
})
public class Batch {

    @XmlElement(required = true, nillable = true)
    protected String name;
    @XmlElement(nillable = true)
    protected List<String> targetLanguages;
    @XmlElement(required = true, nillable = true)
    protected WorkflowDefinition workflowDefinition;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the targetLanguages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the targetLanguages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTargetLanguages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTargetLanguages() {
        if (targetLanguages == null) {
            targetLanguages = new ArrayList<String>();
        }
        return this.targetLanguages;
    }

    /**
     * Gets the value of the workflowDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link WorkflowDefinition }
     *     
     */
    public WorkflowDefinition getWorkflowDefinition() {
        return workflowDefinition;
    }

    /**
     * Sets the value of the workflowDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkflowDefinition }
     *     
     */
    public void setWorkflowDefinition(WorkflowDefinition value) {
        this.workflowDefinition = value;
    }

}
