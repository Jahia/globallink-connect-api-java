
package org.gs4tr.projectdirector.ws.service.services.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.gs4tr.projectdirector.model.dto.xsd.SubmissionInfo;


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
 *         &lt;element name="submissionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="submissionInfo" type="{http://dto.model.projectdirector.gs4tr.org/xsd}SubmissionInfo"/>
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
    "submissionId",
    "submissionInfo"
})
@XmlRootElement(name = "startSubmission")
public class StartSubmission {

    @XmlElement(required = true)
    protected String submissionId;
    @XmlElement(required = true, nillable = true)
    protected SubmissionInfo submissionInfo;

    /**
     * Gets the value of the submissionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmissionId() {
        return submissionId;
    }

    /**
     * Sets the value of the submissionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmissionId(String value) {
        this.submissionId = value;
    }

    /**
     * Gets the value of the submissionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SubmissionInfo }
     *     
     */
    public SubmissionInfo getSubmissionInfo() {
        return submissionInfo;
    }

    /**
     * Sets the value of the submissionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubmissionInfo }
     *     
     */
    public void setSubmissionInfo(SubmissionInfo value) {
        this.submissionInfo = value;
    }

}
