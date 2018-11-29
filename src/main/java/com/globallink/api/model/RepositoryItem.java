package com.globallink.api.model;

public class RepositoryItem {

    private String name;
    private String description;
    private String identifier;
    private String classifier;
    private byte[] data;

    public RepositoryItem(org.gs4tr.projectdirector.model.dto.xsd.RepositoryItem item) {
	this.data = item.getData().getValue();
	this.name = item.getResourceInfo().getName();
	this.description = item.getResourceInfo().getDescription();
	this.identifier = item.getResourceInfo().getClientIdentifier();
	this.classifier = item.getResourceInfo().getClassifier();
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getDescription() {
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
    }

    public String getIdentifier() {
	return identifier;
    }

    public void setIdentifier(String identifier) {
	this.identifier = identifier;
    }

    public String getClassifier() {
	return classifier;
    }

    public void setClassifier(String classifier) {
	this.classifier = classifier;
    }

    public byte[] getData() {
	return data;
    }

    public void setData(byte[] data) {
	this.data = data;
    }

}
