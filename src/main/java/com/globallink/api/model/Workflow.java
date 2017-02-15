package com.globallink.api.model;

import org.gs4tr.projectdirector.model.dto.xsd.WorkflowDefinition;

public class Workflow {
    public String name;
    public String ticket;

    public Workflow(WorkflowDefinition definition) {
	this.name = definition.getName();
	this.ticket = definition.getTicket();
    }
}
