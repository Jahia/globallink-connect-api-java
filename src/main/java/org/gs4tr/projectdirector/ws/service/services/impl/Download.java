
package org.gs4tr.projectdirector.ws.service.services.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.gs4tr.projectdirector.model.dto.WorkflowRequest;


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
 *         &lt;element name="workflowRequest" type="{http://dto.model.projectdirector.gs4tr.org/xsd}WorkflowRequest"/>
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
    "workflowRequest"
})
@XmlRootElement(name = "download")
public class Download {

    @XmlElement(required = true)
    protected WorkflowRequest workflowRequest;

    /**
     * Gets the value of the workflowRequest property.
     * 
     * @return
     *     possible object is
     *     {@link WorkflowRequest }
     *     
     */
    public WorkflowRequest getWorkflowRequest() {
        return workflowRequest;
    }

    /**
     * Sets the value of the workflowRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkflowRequest }
     *     
     */
    public void setWorkflowRequest(WorkflowRequest value) {
        this.workflowRequest = value;
    }

}
