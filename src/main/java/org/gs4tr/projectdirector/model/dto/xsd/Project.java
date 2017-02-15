
package org.gs4tr.projectdirector.model.dto.xsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Project complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Project">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="announcements" type="{http://dto.model.projectdirector.gs4tr.org/xsd}Announcement" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="contentMonitorPluginInfo" type="{http://dto.model.projectdirector.gs4tr.org/xsd}ContentMonitorPluginInfo"/>
 *         &lt;element name="defaultTargetWorkflowDefinition" type="{http://dto.model.projectdirector.gs4tr.org/xsd}WorkflowDefinition"/>
 *         &lt;element name="defaultTargetWorkflowDefinitionTicket" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fileFormatProfiles" type="{http://dto.model.projectdirector.gs4tr.org/xsd}FileFormatProfile" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="includeSubmissionNameInLocalizationKit" type="{http://www.w3.org/2001/XMLSchema}boolean" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="metadata" type="{http://dto.model.projectdirector.gs4tr.org/xsd}Metadata" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="organizationName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="projectCustomFieldConfiguration" type="{http://dto.model.projectdirector.gs4tr.org/xsd}ProjectCustomFieldConfiguration" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="projectInfo" type="{http://dto.model.projectdirector.gs4tr.org/xsd}ProjectInfo"/>
 *         &lt;element name="projectLanguageDirections" type="{http://dto.model.projectdirector.gs4tr.org/xsd}ProjectLanguageDirection" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ticket" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="workflowDefinitions" type="{http://dto.model.projectdirector.gs4tr.org/xsd}WorkflowDefinition" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Project", propOrder = {
    "announcements",
    "contentMonitorPluginInfo",
    "defaultTargetWorkflowDefinition",
    "defaultTargetWorkflowDefinitionTicket",
    "fileFormatProfiles",
    "includeSubmissionNameInLocalizationKit",
    "metadata",
    "organizationName",
    "projectCustomFieldConfiguration",
    "projectInfo",
    "projectLanguageDirections",
    "ticket",
    "workflowDefinitions"
})
public class Project {

    @XmlElement(nillable = true)
    protected List<Announcement> announcements;
    @XmlElement(required = true, nillable = true)
    protected ContentMonitorPluginInfo contentMonitorPluginInfo;
    @XmlElement(required = true, nillable = true)
    protected WorkflowDefinition defaultTargetWorkflowDefinition;
    @XmlElement(required = true, nillable = true)
    protected String defaultTargetWorkflowDefinitionTicket;
    @XmlElement(nillable = true)
    protected List<FileFormatProfile> fileFormatProfiles;
    @XmlElement(nillable = true)
    protected List<Boolean> includeSubmissionNameInLocalizationKit;
    @XmlElement(nillable = true)
    protected List<Metadata> metadata;
    @XmlElement(required = true, nillable = true)
    protected String organizationName;
    @XmlElement(nillable = true)
    protected List<ProjectCustomFieldConfiguration> projectCustomFieldConfiguration;
    @XmlElement(required = true, nillable = true)
    protected ProjectInfo projectInfo;
    @XmlElement(nillable = true)
    protected List<ProjectLanguageDirection> projectLanguageDirections;
    @XmlElement(required = true, nillable = true)
    protected String ticket;
    @XmlElement(nillable = true)
    protected List<WorkflowDefinition> workflowDefinitions;

    /**
     * Gets the value of the announcements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the announcements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnnouncements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Announcement }
     * 
     * 
     */
    public List<Announcement> getAnnouncements() {
        if (announcements == null) {
            announcements = new ArrayList<Announcement>();
        }
        return this.announcements;
    }

    /**
     * Gets the value of the contentMonitorPluginInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ContentMonitorPluginInfo }
     *     
     */
    public ContentMonitorPluginInfo getContentMonitorPluginInfo() {
        return contentMonitorPluginInfo;
    }

    /**
     * Sets the value of the contentMonitorPluginInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentMonitorPluginInfo }
     *     
     */
    public void setContentMonitorPluginInfo(ContentMonitorPluginInfo value) {
        this.contentMonitorPluginInfo = value;
    }

    /**
     * Gets the value of the defaultTargetWorkflowDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link WorkflowDefinition }
     *     
     */
    public WorkflowDefinition getDefaultTargetWorkflowDefinition() {
        return defaultTargetWorkflowDefinition;
    }

    /**
     * Sets the value of the defaultTargetWorkflowDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkflowDefinition }
     *     
     */
    public void setDefaultTargetWorkflowDefinition(WorkflowDefinition value) {
        this.defaultTargetWorkflowDefinition = value;
    }

    /**
     * Gets the value of the defaultTargetWorkflowDefinitionTicket property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultTargetWorkflowDefinitionTicket() {
        return defaultTargetWorkflowDefinitionTicket;
    }

    /**
     * Sets the value of the defaultTargetWorkflowDefinitionTicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultTargetWorkflowDefinitionTicket(String value) {
        this.defaultTargetWorkflowDefinitionTicket = value;
    }

    /**
     * Gets the value of the fileFormatProfiles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fileFormatProfiles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFileFormatProfiles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FileFormatProfile }
     * 
     * 
     */
    public List<FileFormatProfile> getFileFormatProfiles() {
        if (fileFormatProfiles == null) {
            fileFormatProfiles = new ArrayList<FileFormatProfile>();
        }
        return this.fileFormatProfiles;
    }

    /**
     * Gets the value of the includeSubmissionNameInLocalizationKit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the includeSubmissionNameInLocalizationKit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncludeSubmissionNameInLocalizationKit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Boolean }
     * 
     * 
     */
    public List<Boolean> getIncludeSubmissionNameInLocalizationKit() {
        if (includeSubmissionNameInLocalizationKit == null) {
            includeSubmissionNameInLocalizationKit = new ArrayList<Boolean>();
        }
        return this.includeSubmissionNameInLocalizationKit;
    }

    /**
     * Gets the value of the metadata property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metadata property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetadata().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Metadata }
     * 
     * 
     */
    public List<Metadata> getMetadata() {
        if (metadata == null) {
            metadata = new ArrayList<Metadata>();
        }
        return this.metadata;
    }

    /**
     * Gets the value of the organizationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /**
     * Sets the value of the organizationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationName(String value) {
        this.organizationName = value;
    }

    /**
     * Gets the value of the projectCustomFieldConfiguration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the projectCustomFieldConfiguration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProjectCustomFieldConfiguration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProjectCustomFieldConfiguration }
     * 
     * 
     */
    public List<ProjectCustomFieldConfiguration> getProjectCustomFieldConfiguration() {
        if (projectCustomFieldConfiguration == null) {
            projectCustomFieldConfiguration = new ArrayList<ProjectCustomFieldConfiguration>();
        }
        return this.projectCustomFieldConfiguration;
    }

    /**
     * Gets the value of the projectInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectInfo }
     *     
     */
    public ProjectInfo getProjectInfo() {
        return projectInfo;
    }

    /**
     * Sets the value of the projectInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectInfo }
     *     
     */
    public void setProjectInfo(ProjectInfo value) {
        this.projectInfo = value;
    }

    /**
     * Gets the value of the projectLanguageDirections property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the projectLanguageDirections property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProjectLanguageDirections().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProjectLanguageDirection }
     * 
     * 
     */
    public List<ProjectLanguageDirection> getProjectLanguageDirections() {
        if (projectLanguageDirections == null) {
            projectLanguageDirections = new ArrayList<ProjectLanguageDirection>();
        }
        return this.projectLanguageDirections;
    }

    /**
     * Gets the value of the ticket property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicket() {
        return ticket;
    }

    /**
     * Sets the value of the ticket property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicket(String value) {
        this.ticket = value;
    }

    /**
     * Gets the value of the workflowDefinitions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workflowDefinitions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkflowDefinitions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkflowDefinition }
     * 
     * 
     */
    public List<WorkflowDefinition> getWorkflowDefinitions() {
        if (workflowDefinitions == null) {
            workflowDefinitions = new ArrayList<WorkflowDefinition>();
        }
        return this.workflowDefinitions;
    }

}
