
package org.gs4tr.projectdirector.model.dto.xsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WorkflowRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkflowRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="batchWorkflowInfos" type="{http://dto.model.projectdirector.gs4tr.org/xsd}BatchWorkflowInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="languageWorkflowInfos" type="{http://dto.model.projectdirector.gs4tr.org/xsd}LanguageWorkflowInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="phaseName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="submissionTicket" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="targetWorkflowInfos" type="{http://dto.model.projectdirector.gs4tr.org/xsd}TargetWorkflowInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkflowRequest", propOrder = {
    "batchWorkflowInfos",
    "languageWorkflowInfos",
    "phaseName",
    "submissionTicket",
    "targetWorkflowInfos"
})
public class WorkflowRequest {

    @XmlElement(nillable = true)
    protected List<BatchWorkflowInfo> batchWorkflowInfos;
    @XmlElement(nillable = true)
    protected List<LanguageWorkflowInfo> languageWorkflowInfos;
    @XmlElement(required = true, nillable = true)
    protected String phaseName;
    @XmlElement(required = true, nillable = true)
    protected String submissionTicket;
    @XmlElement(nillable = true)
    protected List<TargetWorkflowInfo> targetWorkflowInfos;

    /**
     * Gets the value of the batchWorkflowInfos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the batchWorkflowInfos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBatchWorkflowInfos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BatchWorkflowInfo }
     * 
     * 
     */
    public List<BatchWorkflowInfo> getBatchWorkflowInfos() {
        if (batchWorkflowInfos == null) {
            batchWorkflowInfos = new ArrayList<BatchWorkflowInfo>();
        }
        return this.batchWorkflowInfos;
    }

    /**
     * Gets the value of the languageWorkflowInfos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the languageWorkflowInfos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLanguageWorkflowInfos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageWorkflowInfo }
     * 
     * 
     */
    public List<LanguageWorkflowInfo> getLanguageWorkflowInfos() {
        if (languageWorkflowInfos == null) {
            languageWorkflowInfos = new ArrayList<LanguageWorkflowInfo>();
        }
        return this.languageWorkflowInfos;
    }

    /**
     * Gets the value of the phaseName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhaseName() {
        return phaseName;
    }

    /**
     * Sets the value of the phaseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhaseName(String value) {
        this.phaseName = value;
    }

    /**
     * Gets the value of the submissionTicket property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmissionTicket() {
        return submissionTicket;
    }

    /**
     * Sets the value of the submissionTicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmissionTicket(String value) {
        this.submissionTicket = value;
    }

    /**
     * Gets the value of the targetWorkflowInfos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the targetWorkflowInfos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTargetWorkflowInfos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TargetWorkflowInfo }
     * 
     * 
     */
    public List<TargetWorkflowInfo> getTargetWorkflowInfos() {
        if (targetWorkflowInfos == null) {
            targetWorkflowInfos = new ArrayList<TargetWorkflowInfo>();
        }
        return this.targetWorkflowInfos;
    }

}
