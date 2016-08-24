
package org.gs4tr.projectdirector.model.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Date complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Date">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="critical" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Date", propOrder = {
    "critical",
    "date"
})
public class Date {

    protected boolean critical;
    protected long date;

    public Date() {
		
	}
    
    public Date(long time) {
		this.date = time;
	}
    
    public Date(boolean critical, long time) {
		this.date = time;
		this.critical = critical;
	}

	/**
     * Gets the value of the critical property.
     * 
     */
    public boolean isCritical() {
        return critical;
    }

    /**
     * Sets the value of the critical property.
     * 
     */
    public void setCritical(boolean value) {
        this.critical = value;
    }

    /**
     * Gets the value of the date property.
     * 
     */
    public long getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     */
    public void setDate(long value) {
        this.date = value;
    }

}
