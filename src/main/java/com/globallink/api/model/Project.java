package com.globallink.api.model;

import org.gs4tr.projectdirector.model.dto.xsd.FileFormatProfile;
import org.gs4tr.projectdirector.model.dto.xsd.ProjectCustomFieldConfiguration;
import org.gs4tr.projectdirector.model.dto.xsd.ProjectLanguageDirection;
import org.gs4tr.projectdirector.model.dto.xsd.WorkflowDefinition;

public class Project {
    /**
     * List of custom attributes configured for this project
     */
    private CustomAttribute[] customAttributes;

    /**
     * List of file format profiles configured for this project. A file format
     * profile defines the parsing rules to identify translatable content and
     * inline non-translatable content (placeholders) within the submitted
     * document. Project Director supports a wide range of formats such as XML,
     * DOC, PPT, XLS, .properties
     */
    private String[] fileFormats;
    /**
     * List of supported language directions
     */
    private LanguageDirection[] languageDirections;
    private String name;
    /**
	 * 
	 */
    private String shortcode;
    private String[] submitters;

    /**
     * Project ticket, an internal ID required for creating submissions
     */
    private String ticket;

    /**
     * List of available workflows configured for this project
     */
    private Workflow[] workflows;

    public Project(org.gs4tr.projectdirector.model.dto.xsd.Project project) {
	super();
	this.shortcode = project.getProjectInfo().getShortCode();
	this.name = project.getProjectInfo().getName();
	this.ticket = project.getTicket();
	 
	int i = 0;
	this.languageDirections = new LanguageDirection[project
		.getProjectLanguageDirections().size()];
	for (ProjectLanguageDirection direction : project
		.getProjectLanguageDirections()) {
	    this.languageDirections[i++] = new LanguageDirection(direction);
	}

	i = 0;
	this.fileFormats = new String[project.getFileFormatProfiles().size()];
	for (FileFormatProfile profile : project.getFileFormatProfiles()) {
	    this.fileFormats[i++] = profile.getProfileName();
	}

	i = 0;
	this.workflows = new Workflow[project.getWorkflowDefinitions().size()];
	for (WorkflowDefinition definition : project.getWorkflowDefinitions()) {
	    this.workflows[i++] = new Workflow(definition);
	}

	
	if (project.getProjectCustomFieldConfiguration() != null) {
	    try {
		i = 0;
		this.customAttributes = new CustomAttribute[project
			.getProjectCustomFieldConfiguration().size()];
		for (ProjectCustomFieldConfiguration customField : project
			.getProjectCustomFieldConfiguration()) {
		    this.customAttributes[i++] = new CustomAttribute(
			    customField);
		}
	    } catch (Exception e) {
	    }
	} else {
	    this.customAttributes = new CustomAttribute[0];
	}
    }


    /**
     * Get Custom Attributes
     * 
     * @return List of configured Custom Attributes for this project
     */
    public CustomAttribute[] getCustomAttributes() {
	return customAttributes;
    }

    /**
     * Get File Formats
     * 
     * @return List of configured file formats for this project
     */
    public String[] getFileFormats() {
	return fileFormats;
    }

    /**
     * Get language directions
     * 
     * @return List of configured language directions for this project
     */
    public LanguageDirection[] getLanguageDirections() {
	return languageDirections;
    }

    /**
     * Get Project Name
     * 
     * @return Descriptive project name
     */
    public String getName() {
	return name;
    }

    /**
     * Get Project Short Code
     * 
     * @return User friendly Project Short Code
     */
    public String getShortcode() {
	return shortcode;
    }

    public String[] getSubmitters() {
	return submitters;
    }

    /**
     * Get Project Ticket
     * 
     * @return Project Ticket that is used for internal API communication
     */
    public String getTicket() {
	return ticket;
    }

    /**
     * Get Workflows
     * 
     * @return List of configured workflows for this project
     */
    public Workflow[] getWorkflows() {
	return workflows;
    }

    public void setSubmitters(String[] submitters) {
	this.submitters = submitters;
    }

}
