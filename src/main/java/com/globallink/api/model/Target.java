package com.globallink.api.model;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.gs4tr.projectdirector.model.dto.xsd.Metadata;
import org.gs4tr.projectdirector.model.dto.xsd.TmStatistics;

import com.globallink.api.GLExchange;

public class Target {
    private String clientIdentifier;
    private InputStream data;
    private String documentName;
    private String documentTicket;
    private Map<String, String> metadata;
    private String sourceLocale;
    private String submissionName;
    private String targetLocale;
    private String ticket;
    private WordCount wordCount;

    public Target(org.gs4tr.projectdirector.model.dto.xsd.Target dtoTarget) {
	super();
	this.documentName = dtoTarget.getDocument().getDocumentInfo().getName();
	this.targetLocale = dtoTarget.getTargetLanguage().getLocale();
	this.sourceLocale = dtoTarget.getSourceLanguage().getLocale();
	this.submissionName = dtoTarget.getDocument().getDocumentGroup().getSubmission().getSubmissionInfo().getName();
	
	TmStatistics tmstats = dtoTarget.getTmStatistics();
	if (tmstats != null) {

	    this.wordCount = new WordCount(tmstats.getInContextMatchWordCount(), tmstats
		    .getOneHundredMatchWordCount(), tmstats
		    .getRepetitionWordCount(), tmstats.getNoMatchWordCount(),
		    tmstats.getTotalWordCount());

	}

	this.clientIdentifier = dtoTarget.getDocument().getDocumentInfo()
		.getClientIdentifier();

	this.metadata = new HashMap<String, String>();
	List<Metadata> metadatas = dtoTarget.getDocument().getDocumentInfo()
		.getMetadata();
	if (metadatas != null) {
	    for (Metadata metadata : metadatas) {
		this.metadata.put(metadata.getKey(), metadata.getValue());
	    }
	}

	this.ticket = dtoTarget.getTicket();
	this.documentTicket = dtoTarget.getDocument().getTicket();
    }

    public String getClientIdentifier() {
	return clientIdentifier;
    }

    /**
     * Get Document Name
     * 
     * @return Name of the document that was submitted for translation
     */
    public String getDocumentName() {
	return documentName;
    }

    /**
     * Get Document Ticket
     * 
     * @return Document Ticket of the source document that was submitted for
     *         translation
     */
    public String getDocumentTicket() {
	return documentTicket;
    }

    /**
     * Get metadata in the form of key-value pairs set on the document that was
     * submitted for translation
     * 
     * @return Metadata
     */
    public Map<String, String> getMetadata() {
	return metadata;
    }

    /**
     * Get Source locale
     * 
     * @return Source locale of this target
     */
    public String getSourceLocale() {
	return sourceLocale;
    }

    public String getSubmissionName() {
        return submissionName;
    }

    /**
     * Get the Locale for this target
     * 
     * @return Locale of this target
     */
    public String getTargetLocale() {
	return targetLocale;
    }

    /**
     * Get Target Ticket
     * 
     * @return Target ticket
     */
    public String getTicket() {
	return ticket;
    }

    public WordCount getWordCount() {
	return wordCount;
    }

    /**
     * Get translated data
     * 
     * @return InputStream containing the translated content
     */
    public InputStream getData() {
	return data;
    }
    
    /**
     * Get translated data, download if empty
     * 
     * @return InputStream containing the translated content
     */
    public InputStream getData(GLExchange xchange) {
	if(this.data == null){
	    Target target = xchange.downloadCompletedTarget(this);
	    this.documentName = target.documentName;
	    this.data = target.getData();
	}
	return this.data;
    }

    public void setData(InputStream data) {
	this.data = data;
    }

    /**
     * Set Document Name
     * 
     */
    public void setDocumentName(String documentName) {
	this.documentName = documentName;
    }
   

}
