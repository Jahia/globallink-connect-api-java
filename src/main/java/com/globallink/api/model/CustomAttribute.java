package com.globallink.api.model;

import org.gs4tr.projectdirector.model.dto.ProjectCustomFieldConfiguration;

/**
 * Each project can be configured to allow users to specify custom attributes
 * for their submissions. The custom attributes can be either plain text, or an
 * enum. Custom attributes can be used for reporting, billing etc. eg. You could
 * specify a Cost Center as a custom attribute and instruct your account manager
 * to invoice by cost-center
 */
public class CustomAttribute {

    public boolean mandatory;
    public String name;
    public String type;
    public String values;

    public CustomAttribute(boolean mandatory, String name, String type,
	    String values) {
	this.mandatory = mandatory;
	this.name = name;
	this.type = type;
	this.values = values;
    }

    public CustomAttribute(ProjectCustomFieldConfiguration customField) {
	this.name = customField.getName();
	this.type = customField.getType();
	this.values = customField.getValues();
	this.mandatory = customField.isMandatory();
    }
}
