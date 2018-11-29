package com.globallink.api.model;

import org.gs4tr.projectdirector.model.dto.xsd.ProjectLanguageDirection;

/**
 * A language direction defines the source and target language direction for
 * which users can submit translation requests.
 */
public class LanguageDirection {

    public String sourceLanguage;
    public String targetLanguage;
    /**
     * Will be implemented for release 5.0
     */
    public TMProfile TM;

    public LanguageDirection(ProjectLanguageDirection direction) {
	super();
	this.sourceLanguage = direction.getSourceLanguage().getLocale();
	this.targetLanguage = direction.getTargetLanguage().getLocale();
    }
}
