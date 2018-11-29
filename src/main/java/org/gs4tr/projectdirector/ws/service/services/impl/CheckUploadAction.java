
package org.gs4tr.projectdirector.ws.service.services.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.gs4tr.projectdirector.model.dto.xsd.WorkflowRequestTicket;


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
 *         &lt;element name="workflowRequestTicket" type="{http://dto.model.projectdirector.gs4tr.org/xsd}WorkflowRequestTicket"/>
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
    "workflowRequestTicket"
})
@XmlRootElement(name = "checkUploadAction")
public class CheckUploadAction {

    @XmlElement(required = true)
    protected WorkflowRequestTicket workflowRequestTicket;

    /**
     * Gets the value of the workflowRequestTicket property.
     * 
     * @return
     *     possible object is
     *     {@link WorkflowRequestTicket }
     *     
     */
    public WorkflowRequestTicket getWorkflowRequestTicket() {
        return workflowRequestTicket;
    }

    /**
     * Sets the value of the workflowRequestTicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkflowRequestTicket }
     *     
     */
    public void setWorkflowRequestTicket(WorkflowRequestTicket value) {
        this.workflowRequestTicket = value;
    }

}
