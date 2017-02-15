
package org.gs4tr.projectdirector.model.dto.xsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContentMonitorPluginInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContentMonitorPluginInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pluginId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pluginName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentMonitorPluginInfo", propOrder = {
    "pluginId",
    "pluginName"
})
public class ContentMonitorPluginInfo {

    @XmlElement(required = true, nillable = true)
    protected String pluginId;
    @XmlElement(required = true, nillable = true)
    protected String pluginName;

    /**
     * Gets the value of the pluginId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPluginId() {
        return pluginId;
    }

    /**
     * Sets the value of the pluginId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPluginId(String value) {
        this.pluginId = value;
    }

    /**
     * Gets the value of the pluginName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPluginName() {
        return pluginName;
    }

    /**
     * Sets the value of the pluginName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPluginName(String value) {
        this.pluginName = value;
    }

}
