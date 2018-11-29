package com.globallink.api.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Submission {

    /**
     * OPTIONAL
     */
    private Map<String, String> customAttributes = new HashMap<String, String>();

    /**
     * OPTIONAL
     */
    private Date dueDate;

    /**
     * OPTIONAL
     */
    private String instructions;

    /**
     * OPTIONAL
     */
    private boolean isUrgent;

    /**
     * OPTIONAL
     */
    private Map<String, String> metadata = new HashMap<String, String>();

    private String name;

    private String owner;

    /**
     * OPTIONAL
     */
    private String pmNotes;

    private Project project;

    /**
     * OPTIONAL
     */
    private String submitter;

    private List<String> tickets = new ArrayList<String>();

    private Workflow workflow;

    public Submission() {
	super();
    }

    public Submission(org.gs4tr.projectdirector.model.dto.xsd.Submission submission) {
	super();
	if (submission != null) {
	    this.tickets.add(submission.getTicket());
	    this.name = submission.getSubmissionInfo().getName();
	}
    }

    public Map<String, String> getCustomAttributes() {
	return customAttributes;
    }

    /**
     * 
     * Returns due date of submission
     * 
     */
    public Date getDueDate() {
	return dueDate;
    }

    /**
     * 
     * Returns submission instructions
     * 
     */
    public String getInstructions() {
	return instructions;
    }

    /**
     * 
     * Returns submission metadata
     * 
     */
    public Map<String, String> getMetadata() {
	return metadata;
    }

    /**
     * 
     * Returns submission name
     * 
     */
    public String getName() {
	return name;
    }

    public String getOwner() {
	return owner;
    }

    /**
     * 
     * Returns submission pm notes
     * 
     */
    public String getPmNotes() {
	return pmNotes;
    }

    /**
     * 
     * Returns submission project
     * 
     */
    public Project getProject() {
	return project;
    }

    /**
     * 
     * Returns submission submitter
     * 
     */
    public String getSubmitter() {
	return submitter;
    }

    public String[] getTickets() {
	return tickets.toArray(new String[tickets.size()]);
    }

    public Workflow getWorkflow() {
	return workflow;
    }

    /**
     * 
     * Returns is submission is urgent
     * 
     */
    public boolean isUrgent() {
	return isUrgent;
    }

    /**
     * 
     * [OPTIONAL] - Set custom attributes. Project.getCustomAttributes() gets
     * you the list of configured attributes for the project.
     * 
     * @param customAttributes
     *            Key-Value pairs of custom attributes to set on the submission
     */
    public void setCustomAttributes(Map<String, String> customAttributes) {
	this.customAttributes = customAttributes;
    }

    /**
     * 
     * [OPTIONAL] - Due date by when the submission should be completed in
     * Project Director. This should always be greater than current date. If due
     * date is not specified, Project Director will rely on the configured
     * language model to calculate a due date.
     * 
     * @param dueDate
     *            Submission Due date
     */
    public void setDueDate(Date dueDate) {
	this.dueDate = dueDate;
    }

    /**
     * 
     * [OPTIONAL] - Set instructions for the translators
     * 
     * @param instructions
     *            Instructions for the translators
     */
    public void setInstructions(String instructions) {
	this.instructions = instructions;
    }

    /**
     * 
     * [OPTIONAL] - Key-value pair of metadata
     * 
     * @param metadata
     *            Key-value pair of metadata
     */
    public void setMetadata(Map<String, String> metadata) {
	this.metadata = metadata;
    }

    /**
     * 
     * Name of the submission that will show up in Project Director
     * 
     * @param submissionName
     *            Submission Name
     */
    public void setName(String submissionName) {
	this.name = submissionName;
    }

    /**
     * [OPTIONAL] - Set the submitter to a user other than the logged in user.
     * 
     * @param submitter
     *            Needs to be a valid Project Director user name.
     */
    public void setOwner(String owner) {
	this.owner = owner;
    }

    /**
     * 
     * [OPTIONAL] - Notes for the project managers
     * 
     * @param pmNotes
     *            PM Notes (max 1024 charachters)
     */
    public void setPmNotes(String pmNotes) {
	this.pmNotes = pmNotes;
    }

    /**
     * Set the project for which this submission will be created
     * 
     * @param project
     */
    public void setProject(Project project) {
	this.project = project;
    }

    /**
     * [OPTIONAL] - Set the submitter to a user other than the logged in user.
     * 
     * @param submitter
     *            Needs to be a valid Project Director user name.
     */
    public void setSubmitter(String submitter) {
	this.submitter = submitter;
    }

    public void setTickets(String[] tickets) {
	this.tickets = new ArrayList<String>();
	if (tickets != null && tickets.length > 0) {
	    for (String ticket : tickets) {
		addTicket(ticket);
	    }
	}
    }

    public void addTicket(String ticket) {
	if (ticket == null) {
	    throw new NullPointerException("Invalid NULL ticket.");
	} else if (ticket.length() == 0) {
	    throw new NullPointerException("Invalid EMPTY ticket.");
	}
	if (!tickets.contains(ticket)) {
	    this.tickets.add(ticket);
	}
    }

    /**
     * [OPTIONAL] - Set priority. Defaults to Normal
     * 
     * @param isUrgent
     */
    public void setUrgent(boolean isUrgent) {
	this.isUrgent = isUrgent;
    }

    public void setWorkflow(Workflow workflow) {
	this.workflow = workflow;
    }

}
