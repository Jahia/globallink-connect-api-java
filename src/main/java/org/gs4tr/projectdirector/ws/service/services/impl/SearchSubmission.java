
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
 *         &lt;element name="command" type="{http://dto.model.projectdirector.gs4tr.org/xsd}SubmissionSearchRequest"/>
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
    "command",
    "info"
})
@XmlRootElement(name = "search")
public class SearchSubmission {

    @XmlElement(required = true)
    protected SubmissionSearchRequest command;
    @XmlElement(required = true)
    protected PagedListInfo info;

    /**
     * Gets the value of the command property.
     * 
     * @return
     *     possible object is
     *     {@link SubmissionSearchRequest }
     *     
     */
    public SubmissionSearchRequest getCommand() {
        return command;
    }

    /**
     * Sets the value of the command property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubmissionSearchRequest }
     *     
     */
    public void setCommand(SubmissionSearchRequest value) {
        this.command = value;
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
