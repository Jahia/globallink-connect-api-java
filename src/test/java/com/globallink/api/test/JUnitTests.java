package com.globallink.api.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;

import com.globallink.api.GLExchange;
import com.globallink.api.config.ProjectDirectorConfig;
import com.globallink.api.model.Document;
import com.globallink.api.model.Project;
import com.globallink.api.model.ReferenceDocument;
import com.globallink.api.model.Submission;

public class JUnitTests {

    private static final String pdurl = "https://gl-connect2.translations.com/PD/";
    private static final String username = "flip";
    private static final String password = "ChangeMe1!";
    private static final String userAgent = "ucf.java";
    private static final String submissionName = "unittest ucf.java";

    //@Test
    public void testExchangeCreation() throws Exception {
	System.setProperty("jsse.enableSNIExtension", "false");

	ProjectDirectorConfig pdConfig = new ProjectDirectorConfig();
	pdConfig.setUrl(pdurl + "incorrect");

	boolean thrown = false;
	@SuppressWarnings("unused")
	GLExchange xchange = null;
	try {
	    xchange = new GLExchange(pdConfig);
	} catch (Exception e) {
	    thrown = true;
	}
	assertTrue(thrown);

	pdConfig.setUrl(pdurl);
	pdConfig.setUsername("wrongName");
	pdConfig.setPassword(password);

	thrown = false;
	try {
	    xchange = new GLExchange(pdConfig);
	} catch (Exception e) {
	    thrown = true;
	}
	assertTrue(thrown);

	pdConfig.setUsername(username);
	thrown = false;
	try {
	    xchange = new GLExchange(pdConfig);
	} catch (Exception e) {
	    thrown = true;
	}
	assertTrue(thrown);

	pdConfig.setUserAgent(userAgent);
	xchange = new GLExchange(pdConfig);
    }

    //@Test
    public void testInitSubmission() throws Exception {
	ProjectDirectorConfig pdConfig = new ProjectDirectorConfig();
	pdConfig.setUrl(pdurl);
	pdConfig.setUsername(username);
	pdConfig.setPassword(password);
	pdConfig.setUserAgent(userAgent);
	GLExchange xchange = new GLExchange(pdConfig);
	Project[] projects = xchange.getProjects();
	Project project = projects[0];
	Submission submission = new Submission();

	boolean thrown = false;
	try {
	    xchange.initSubmission(submission);
	} catch (Exception e) {
	    thrown = true;
	}
	assertTrue(thrown);

	thrown = false;
	submission.setName(submissionName);
	try {
	    xchange.initSubmission(submission);
	} catch (Exception e) {
	    thrown = true;
	}
	assertTrue(thrown);

	thrown = false;
	submission.setProject(project);
	submission.setName(null);
	try {
	    xchange.initSubmission(submission);
	} catch (Exception e) {
	    thrown = true;
	}
	assertTrue(thrown);

	thrown = false;
	submission.setName(submissionName);
	submission.setSubmitter("incorrectUser");
	try {
	    xchange.initSubmission(submission);
	} catch (Exception e) {
	    thrown = true;
	}
	assertTrue(thrown);

	thrown = false;
	submission.setSubmitter(null);
	submission.setDueDate((new SimpleDateFormat("dd/MM/yyyy"))
		.parse("01/01/2000"));
	try {
	    xchange.initSubmission(submission);
	} catch (Exception e) {
	    thrown = true;
	}
	assertTrue(thrown);

	submission.setDueDate((new SimpleDateFormat("dd/MM/yyyy"))
		.parse("01/01/2099"));
	xchange.initSubmission(submission);
    }

    //@Test
    public void testUploadDocument() throws Exception {
	ProjectDirectorConfig pdConfig = new ProjectDirectorConfig();
	pdConfig.setUrl(pdurl);
	pdConfig.setUsername(username);
	pdConfig.setPassword(password);
	pdConfig.setUserAgent(userAgent);
	GLExchange xchange = new GLExchange(pdConfig);
	Project[] projects = xchange.getProjects();
	Project project = projects[0];

	Submission submission = new Submission();
	Document document = new Document();
	ReferenceDocument reference = new ReferenceDocument();
	reference.setData("test data");
	reference.setName("reference name");

	boolean thrown = false;
	try {
	    xchange.uploadReference(reference);
	} catch (Exception e) {
	    thrown = true;
	}
	assertTrue(thrown);

	thrown = false;
	try {
	    xchange.uploadTranslatable(document);
	} catch (Exception e) {
	    thrown = true;
	}
	assertTrue(thrown);

	thrown = false;
	submission.setProject(project);
	submission.setName(submissionName);
	xchange.initSubmission(submission);
	try {
	    xchange.uploadTranslatable(document);
	} catch (Exception e) {
	    thrown = true;
	}
	assertTrue(thrown);

	thrown = false;
	try {
	    xchange.uploadReference(reference);
	} catch (Exception e) {
	    thrown = true;
	}
	assertTrue(thrown);

	thrown = false;
	document = initDocument(project);
	document.setName(null);
	try {
	    xchange.uploadTranslatable(document);
	} catch (Exception e) {
	    thrown = true;
	}
	assertTrue(thrown);

	thrown = false;
	document = initDocument(project);
	document.setData(new byte[0]);
	try {
	    xchange.uploadTranslatable(document);
	} catch (Exception e) {
	    thrown = true;
	}
	assertTrue(thrown);

	thrown = false;
	document = initDocument(project);
	document.setFileformat("incorrectFormat");
	try {
	    xchange.uploadTranslatable(document);
	} catch (Exception e) {
	    thrown = true;
	}
	assertTrue(thrown);

	thrown = false;
	document = initDocument(project);
	document.setSourceLanguage("incorrectLanguage");
	try {
	    xchange.uploadTranslatable(document);
	} catch (Exception e) {
	    thrown = true;
	}
	assertTrue(thrown);

	thrown = false;
	document = initDocument(project);
	document.setTargetLanguages(new String[] { "incorrectLanguage" });
	try {
	    xchange.uploadTranslatable(document);
	} catch (Exception e) {
	    thrown = true;
	}
	assertTrue(thrown);

	thrown = false;
	document = initDocument(project);
	HashMap<String, String> workflows = new HashMap<String, String>();
	workflows.put(document.getTargetLanguages()[0], "incorrectWorkflow");
	document.setTargetWorkflowNames(workflows);
	try {
	    xchange.uploadTranslatable(document);
	} catch (Exception e) {
	    thrown = true;
	}
	assertTrue(thrown);

	document = initDocument(project);
	workflows = new HashMap<String, String>();
	workflows.put(document.getTargetLanguages()[0],
		project.getWorkflows()[0].name);
	document.setTargetWorkflowNames(workflows);
	xchange.uploadTranslatable(document);

	thrown = false;
	reference.setData(new byte[0]);
	try {
	    xchange.uploadReference(reference);
	} catch (Exception e) {
	    thrown = true;
	}
	assertTrue(thrown);

	thrown = false;
	reference.setData("test data");
	reference.setName(null);
	try {
	    xchange.uploadReference(reference);
	} catch (Exception e) {
	    thrown = true;
	}
	assertTrue(thrown);

	reference.setName("reference name");
	xchange.uploadReference(reference);

	String[] submissionTickets = xchange.startSubmission();

	/*
	 * Submission pdSubmission = convertSubmission(xchange
	 * .getSubmission(submissionTicket)); assertTrue(pdSubmission != null);
	 * assertTrue(pdSubmission.getName().equals(submission.getName()));
	 * assertTrue((pdSubmission.getDueDate() == null && submission
	 * .getDueDate() == null) ||
	 * pdSubmission.getDueDate().compareTo(submission.getDueDate()) == 0);
	 * assertTrue((pdSubmission.getPmNotes() == null && submission
	 * .getPmNotes() == null) ||
	 * pdSubmission.getPmNotes().equals(submission.getPmNotes()));
	 * assertTrue(pdSubmission.isUrgent() == submission.isUrgent());
	 * assertTrue((pdSubmission.getMetadata() == null && submission
	 * .getMetadata() == null) || pdSubmission.getMetadata().size() ==
	 * submission .getMetadata().size()); if (pdSubmission.getMetadata() !=
	 * null && pdSubmission.getMetadata().size() > 0) { for
	 * (Map.Entry<String, String> pdentry : pdSubmission.getMetadata()
	 * .entrySet()) { boolean found = false; for (Map.Entry<String, String>
	 * entry : submission.getMetadata() .entrySet()) { if
	 * (entry.getKey().equals(pdentry.getKey()) &&
	 * entry.getValue().equals(pdentry.getValue())) { found = true; break; }
	 * } assertTrue(found); } }
	 * 
	 * if (pdSubmission.getCustomAttributes().size() > 0) { for
	 * (Map.Entry<String, String> pdentry : pdSubmission
	 * .getCustomAttributes().entrySet()) { boolean found = false; for
	 * (Map.Entry<String, String> entry : submission
	 * .getCustomAttributes().entrySet()) { if
	 * (entry.getKey().equals(pdentry.getKey()) &&
	 * entry.getValue().equals(pdentry.getValue())) { found = true; break; }
	 * } assertTrue(found); } }
	 */
		String cancelTicket;
		for( String submissionTicket : submissionTickets ) {
			cancelTicket = xchange.cancelSubmission( submissionTicket );
			assertNotNull( "No cancel ticket returned for submission ticket " + submissionTicket, cancelTicket );
		}
    }

    private Document initDocument(Project project)
	    throws UnsupportedEncodingException {
	Document document = new Document();
	document.setData("Some text to translate");
	document.setName("Name");
	document.setFileformat(project.getFileFormats()[0]);
	document
		.setSourceLanguage(project.getLanguageDirections()[0].sourceLanguage);
	document.setTargetLanguages(new String[] { project
		.getLanguageDirections()[0].targetLanguage });
	return document;
    }

}
