
package org.gs4tr.projectdirector.model.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileProgressData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FileProgressData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numberOfAvailableFiles" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numberOfCanceledFiles" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numberOfCompletedFiles" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numberOfDeliveredFiles" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numberOfFailedFiles" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numberOfInProcessFiles" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="overallProgressPercent" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileProgressData", propOrder = {
    "numberOfAvailableFiles",
    "numberOfCanceledFiles",
    "numberOfCompletedFiles",
    "numberOfDeliveredFiles",
    "numberOfFailedFiles",
    "numberOfInProcessFiles",
    "overallProgressPercent"
})
public class FileProgressData {

    protected int numberOfAvailableFiles;
    protected int numberOfCanceledFiles;
    protected int numberOfCompletedFiles;
    protected int numberOfDeliveredFiles;
    protected int numberOfFailedFiles;
    protected int numberOfInProcessFiles;
    protected int overallProgressPercent;

    /**
     * Gets the value of the numberOfAvailableFiles property.
     * 
     */
    public int getNumberOfAvailableFiles() {
        return numberOfAvailableFiles;
    }

    /**
     * Sets the value of the numberOfAvailableFiles property.
     * 
     */
    public void setNumberOfAvailableFiles(int value) {
        this.numberOfAvailableFiles = value;
    }

    /**
     * Gets the value of the numberOfCanceledFiles property.
     * 
     */
    public int getNumberOfCanceledFiles() {
        return numberOfCanceledFiles;
    }

    /**
     * Sets the value of the numberOfCanceledFiles property.
     * 
     */
    public void setNumberOfCanceledFiles(int value) {
        this.numberOfCanceledFiles = value;
    }

    /**
     * Gets the value of the numberOfCompletedFiles property.
     * 
     */
    public int getNumberOfCompletedFiles() {
        return numberOfCompletedFiles;
    }

    /**
     * Sets the value of the numberOfCompletedFiles property.
     * 
     */
    public void setNumberOfCompletedFiles(int value) {
        this.numberOfCompletedFiles = value;
    }

    /**
     * Gets the value of the numberOfDeliveredFiles property.
     * 
     */
    public int getNumberOfDeliveredFiles() {
        return numberOfDeliveredFiles;
    }

    /**
     * Sets the value of the numberOfDeliveredFiles property.
     * 
     */
    public void setNumberOfDeliveredFiles(int value) {
        this.numberOfDeliveredFiles = value;
    }

    /**
     * Gets the value of the numberOfFailedFiles property.
     * 
     */
    public int getNumberOfFailedFiles() {
        return numberOfFailedFiles;
    }

    /**
     * Sets the value of the numberOfFailedFiles property.
     * 
     */
    public void setNumberOfFailedFiles(int value) {
        this.numberOfFailedFiles = value;
    }

    /**
     * Gets the value of the numberOfInProcessFiles property.
     * 
     */
    public int getNumberOfInProcessFiles() {
        return numberOfInProcessFiles;
    }

    /**
     * Sets the value of the numberOfInProcessFiles property.
     * 
     */
    public void setNumberOfInProcessFiles(int value) {
        this.numberOfInProcessFiles = value;
    }

    /**
     * Gets the value of the overallProgressPercent property.
     * 
     */
    public int getOverallProgressPercent() {
        return overallProgressPercent;
    }

    /**
     * Sets the value of the overallProgressPercent property.
     * 
     */
    public void setOverallProgressPercent(int value) {
        this.overallProgressPercent = value;
    }

}
