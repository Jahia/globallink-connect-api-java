
package org.gs4tr.projectdirector.ws.service.services.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.gs4tr.projectdirector.model.dto.xsd.PagedListInfo;
import org.gs4tr.projectdirector.model.dto.xsd.SubmissionSearchRequest;


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
 *         &lt;element name="submissionSearchRequest" type="{http://dto.model.projectdirector.gs4tr.org/xsd}SubmissionSearchRequest"/>
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
    "submissionSearchRequest",
    "info"
})
@XmlRootElement(name = "searchSubmissions")
public class SearchSubmissions {

    @XmlElement(required = true)
    protected SubmissionSearchRequest submissionSearchRequest;
    @XmlElement(required = true)
    protected PagedListInfo info;

    /**
     * Gets the value of the submissionSearchRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SubmissionSearchRequest }
     *     
     */
    public SubmissionSearchRequest getSubmissionSearchRequest() {
        return submissionSearchRequest;
    }

    /**
     * Sets the value of the submissionSearchRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubmissionSearchRequest }
     *     
     */
    public void setSubmissionSearchRequest(SubmissionSearchRequest value) {
        this.submissionSearchRequest = value;
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
