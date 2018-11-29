package com.globallink.api.model;

import java.util.List;

public class Batch {

    private String name;
    private List<String> targetLanguages;
    private Workflow workflowDefinition;

    public Batch(org.gs4tr.projectdirector.model.dto.xsd.Batch batch) {
	this.name = batch.getName();
	this.targetLanguages = batch.getTargetLanguages();
	this.workflowDefinition = new Workflow(batch.getWorkflowDefinition());
    }

    public String getName() {
	return name;
    }

    public List<String> getTargetLanguages() {
	return targetLanguages;
    }

    public Workflow getWorkflowDefinition() {
	return workflowDefinition;
    }

    public void setName(String name) {
	this.name = name;
    }

    public void setTargetLanguages(List<String> targetLanguages) {
	this.targetLanguages = targetLanguages;
    }

    public void setWorkflowDefinition(Workflow workflowDefinition) {
	this.workflowDefinition = workflowDefinition;
    }
}
