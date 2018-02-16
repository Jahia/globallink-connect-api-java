package com.globallink.api;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Authenticator;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.gs4tr.projectdirector.model.dto.xsd.DocumentInfo;
import org.gs4tr.projectdirector.model.dto.xsd.DocumentTicket;
import org.gs4tr.projectdirector.model.dto.xsd.DownloadActionResult;
import org.gs4tr.projectdirector.model.dto.xsd.DownloadCollateralResult;
import org.gs4tr.projectdirector.model.dto.xsd.ItemStatusEnum;
import org.gs4tr.projectdirector.model.dto.xsd.Metadata;
import org.gs4tr.projectdirector.model.dto.xsd.Priority;
import org.gs4tr.projectdirector.model.dto.xsd.RepositoryItem;
import org.gs4tr.projectdirector.model.dto.xsd.ResourceInfo;
import org.gs4tr.projectdirector.model.dto.xsd.SubmissionCustomFields;
import org.gs4tr.projectdirector.model.dto.xsd.SubmissionInfo;
import org.gs4tr.projectdirector.model.dto.xsd.SubmissionWorkflowInfo;
import org.gs4tr.projectdirector.model.dto.xsd.UploadActionResult;
import org.gs4tr.projectdirector.model.dto.xsd.UserInfo;
import org.gs4tr.projectdirector.model.dto.xsd.UserProfile;
import org.gs4tr.projectdirector.model.dto.xsd.WorkflowRequest;
import org.gs4tr.projectdirector.model.dto.xsd.WorkflowRequestTicket;
import org.gs4tr.projectdirector.ws.service.services.impl.ServiceLocator;
import org.w3._2005._05.xmlmime.Base64Binary;

import com.globallink.api.config.ProjectDirectorConfig;
import com.globallink.api.model.Batch;
import com.globallink.api.model.CustomAttribute;
import com.globallink.api.model.Document;
import com.globallink.api.model.LanguageDirection;
import com.globallink.api.model.LanguagePhaseInfo;
import com.globallink.api.model.Project;
import com.globallink.api.model.ReferenceDocument;
import com.globallink.api.model.Submission;
import com.globallink.api.model.Target;
import com.globallink.api.model.Workflow;

/**
 * This is the primary API class
 */
public class GLExchange {

    public static int DELAY_TIME = 2000;

    private static final String[] EMPTY_ARRAY = new String[0];

    private static final String PDVERSION = "4.18.0";

    private static final int WORKFLOW_LIMIT = 9999; // Sets the max number of

    // workflows that you can
    // claim/download

    private ProjectDirectorConfig pdConfig;

    private ServiceLocator serviceLocator;

    private Submission submission;
    
    private Project[] projects;

    /**
     * Initialize a connection to Project Director
     * 
     * @param connectionConfig
     *            The Project Director server configuration to connect to.
     * @see ProjectDirectorConfig
     */
    public GLExchange(ProjectDirectorConfig connectionConfig) throws Exception {
	super();
	   _setConnectionConfig(connectionConfig);
	
    }
    
    private Batch[] _convertBatchesToInternal(List<org.gs4tr.projectdirector.model.dto.xsd.Batch> batches) {
	List<Batch> result = new ArrayList<Batch>();
	if (batches != null) {
	    for (org.gs4tr.projectdirector.model.dto.xsd.Batch batch : batches) {
		result.add(new Batch(batch));
	    }
	}
	return result.toArray(new Batch[result.size()]);
    }

    private Project[] _convertProjectsToInternal(List<org.gs4tr.projectdirector.model.dto.xsd.Project> projects) {
	List<Project> result = new ArrayList<Project>();
	for (org.gs4tr.projectdirector.model.dto.xsd.Project project : projects) {
	    Project proj = new Project(project);
	    proj.setSubmitters(_getSubmitters(proj.getShortcode()));
	    result.add(proj);

	}
	return result.toArray(new Project[result.size()]);
    }

    private Submission[] _convertSubmissionsToInternal(List<org.gs4tr.projectdirector.model.dto.xsd.Submission> list) {
	List<Submission> result = new ArrayList<Submission>();
	for (org.gs4tr.projectdirector.model.dto.xsd.Submission sub : list) {
	    result.add(new Submission(sub));
	}
	return result.toArray(new Submission[result.size()]);
    }

    private Target[] _convertTargetsToInternal(List<org.gs4tr.projectdirector.model.dto.xsd.Target> targets) {
	List<Target> result = new ArrayList<Target>();
	if (targets != null) {
	    for (org.gs4tr.projectdirector.model.dto.xsd.Target target : targets) {
		result.add(new Target(target));
	    }
	}
	return result.toArray(new Target[result.size()]);
    }

    private Map<String, SubmissionInfo> _createSubmissionInfos() {
	Integer count = null;
	String[] tickets = submission.getTickets();

	// Use counter only if multiple submissions are to be started
	if (tickets.length > 1) {
	    count = 1;
	}

	Map<String, SubmissionInfo> submissionInfos = new HashMap<String, SubmissionInfo>(tickets.length);

	for (String submissionTicket : tickets) {
	    submissionInfos.put(submissionTicket, _createSubmissionInfo(count));
	    if (count != null) {
		count = count + 1;
	    }
	}

	return submissionInfos;
    }

    private SubmissionInfo _createSubmissionInfo(Integer count) {
	SubmissionInfo submissionInfo = new SubmissionInfo();
	if (submission.getCustomAttributes() != null && submission.getCustomAttributes().size() > 0) {
	    for (Map.Entry<String, String> entry : submission.getCustomAttributes().entrySet()) {
		SubmissionCustomFields customField = new SubmissionCustomFields();
		customField.setFieldName(entry.getKey());
		customField.setFieldValue(entry.getValue());
		submissionInfo.getSubmissionCustomFields().add(customField);
	    }
	}

	if (submission.getDueDate() != null) {
	    org.gs4tr.projectdirector.model.dto.xsd.Date date = new org.gs4tr.projectdirector.model.dto.xsd.Date();
	    date.setDate(submission.getDueDate().getTime());
	    submissionInfo
		    .setDateRequested(date);
	}

	submissionInfo.setProjectTicket(submission.getProject().getTicket());

	if (count == null) {
	    submissionInfo.setName(submission.getName());
	} else {
	    submissionInfo.setName(submission.getName() + "(" + count.intValue() + ")");
	}
	if (!_isEmpty(submission.getPmNotes())) {
	    submissionInfo.setInternalNotes(submission.getPmNotes());
	}
	if (submission.getMetadata() != null) {
	    for (Map.Entry<String, String> entry : submission.getMetadata().entrySet()) {
		Metadata data = new Metadata();
		data.setKey(entry.getKey().length() > 255 ? entry.getKey().substring(0, 255) : entry.getKey());
		data.setValue(
			entry.getValue().length() > 1024 ? entry.getValue().substring(0, 1024) : entry.getValue());
		submissionInfo.getMetadata().add(data);
	    }
	}

	if (submission.isUrgent()) {
	    Priority priority = new Priority();
	    priority.setValue(2);
	    submissionInfo.setPriority(priority);
	}
	if (!_isEmpty(submission.getSubmitter())) {
	    submissionInfo.getSubmitters().add(submission.getSubmitter());
	}
	if (submission.getWorkflow() != null && !_isEmpty(submission.getWorkflow().ticket)) {
	    submissionInfo.setWorkflowDefinitionTicket(submission.getWorkflow().ticket);
	}

	return submissionInfo;
    }

    private WorkflowRequest _createWorkflowRequest(SubmissionWorkflowInfo submissionWorkflowInfo) {
	// create workflow request from submissionWorkflowInfo
	WorkflowRequest workflowRequest = new WorkflowRequest();
	workflowRequest.setSubmissionTicket(submissionWorkflowInfo.getSubmissionTicket());
	workflowRequest.setPhaseName(submissionWorkflowInfo.getPhaseName());
	workflowRequest.getBatchWorkflowInfos().addAll(submissionWorkflowInfo.getBatchWorkflowInfos());
	workflowRequest.getLanguageWorkflowInfos().addAll(submissionWorkflowInfo.getLanguageWorkflowInfos());
	workflowRequest.getTargetWorkflowInfos().addAll(submissionWorkflowInfo.getTargetWorkflowInfos());

	return workflowRequest;
    }

    private void _endpointExists() throws Exception {
	String urlStr = pdConfig.getUrl();
	Proxy proxy = null;
	if (pdConfig.getProxy() != null && !_isEmpty(pdConfig.getProxy().getProxyHost())) {
	    proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(pdConfig.getProxy().getProxyHost(), pdConfig.getProxy().getProxyPort()!=0?pdConfig.getProxy().getProxyPort():80));
	    if(pdConfig.getProxy().getProxyUser()!=null && pdConfig.getProxy().getProxyPassword()!=null){
		Authenticator.setDefault (new Authenticator() {
		    protected PasswordAuthentication getPasswordAuthentication() {
		        return new PasswordAuthentication (pdConfig.getProxy().getProxyUser(), pdConfig.getProxy().getProxyPassword().toCharArray());
		    }
		});
	    }
	}
	try {
	    URL url = new URL(urlStr);
	    URLConnection conn = null;
	    if(proxy!=null){
		conn = url.openConnection(proxy);
	    } else {
		conn = url.openConnection();
	    }
	    conn.getInputStream();
	} catch (Exception e) {
	    throw new Exception("No connection to "+urlStr, e);
	}
	if (!urlStr.endsWith("/")) {
	    urlStr = urlStr + "/";
	}
	try {
	    URL url = new URL(urlStr + "services/ProjectService" + ServiceLocator.WS_VERSION + ".wsdl");
	    URLConnection conn = null;
	    if(proxy!=null){
		conn = url.openConnection(proxy);
	    } else {
		conn = url.openConnection();
	    }
	    conn.getInputStream();
	} catch (Exception e) {
	    throw new Exception("Unsupported PD version, needs to be " + PDVERSION + " or higher.");
	}
    }

    private Boolean _isEmpty(String value) {
	if (value == null || value.trim().length() <= 0) {
	    return true;
	} else {
	    return false;
	}
    }

    private String[] _getSubmitters(String projectShortCode) {
	List<UserProfile> submitters = serviceLocator.getUserProfileService().getSubmitters(projectShortCode);
	ArrayList<String> submitterUsers = new ArrayList<String>();
	for (UserProfile profile : submitters) {
	    UserInfo info = profile.getUserInfo();
	    if (info.getUserName() != null && !info.getUserName().equals("") && info.isEnabled()
		    && !info.isAccountLocked() && info.isAccountNonExpired()) {
		submitterUsers.add(info.getUserName());
	    }
	}
	String[] retVal = submitterUsers.toArray(new String[submitterUsers.size()]);
	return retVal;
    }

    private boolean _isSubmitterValid(String projectShortCode, String submitter) {
	String[] submitters = _getSubmitters(projectShortCode);
	for (String user : submitters) {
	    if (user.equals(submitter)) {
		return true;
	    }
	}
	return false;
    }

    /**
     * 
     * Set/update Project Director connection configuration
     * 
     * @param connectionConfig
     *            Project Director Connection Configuration
     * @throws Exception
     */
    private void _setConnectionConfig(ProjectDirectorConfig connectionConfig) throws Exception {
	pdConfig = connectionConfig;

	/*try {
	    _endpointExists();
	} catch (Exception e) {
	    throw e;
	}*/
	pdConfig.setEnableMTOM(false); // PDII-12096
	if (_isEmpty(pdConfig.getUrl()))
	    throw new Exception("Invalid URL");
	if (_isEmpty(pdConfig.getUsername()))
	    throw new Exception("Invalid username");
	if (_isEmpty(pdConfig.getPassword()))
	    throw new Exception("Invalid Password");
	if (_isEmpty(pdConfig.getUserAgent()))
	    throw new Exception("Invalid User Agent");

	try {
	    if (pdConfig.getProxy() != null && !_isEmpty(pdConfig.getProxy().getProxyHost())) {
		serviceLocator = new ServiceLocator(pdConfig.getUrl(), pdConfig.getUsername(), pdConfig.getPassword(),
			pdConfig.getUserAgent(), pdConfig.isEnableMTOM(), pdConfig.getProxy().getProxyHost(),
			pdConfig.getProxy().getProxyPort(), pdConfig.getProxy().getProxyUser(),
			pdConfig.getProxy().getProxyPassword());
	    } else {
		serviceLocator = new ServiceLocator(pdConfig.getUrl(), pdConfig.getUsername(), pdConfig.getPassword(),
			pdConfig.getUserAgent(), pdConfig.isEnableMTOM());
	    }
	    this.projects = getProjects();
	} catch (Exception e) {
	    throw new Exception("Invalid Config: " + e.getMessage(), e);
	}
    }

    private void _validateDocument(Document document) throws Exception {
	if (document == null || document.getData() == null || document.getData().length <= 0) {
	    throw new Exception("Document is empty");
	}
	if (_isEmpty(document.getName())) {
	    throw new Exception("Document name not set");
	}

	Project project = submission.getProject();
	if (!document.getFileformat().equalsIgnoreCase("Non-Parsable")) {
	    Boolean isFileFormatCorrect = false;
	    for (String fileFormat : project.getFileFormats()) {
		if (fileFormat.equals(document.getFileformat())) {
		    isFileFormatCorrect = true;
		    break;
		}
	    }
	    if (!isFileFormatCorrect) {
		throw new Exception("File format '" + document.getFileformat() + "' doesn`t exist in project '"
			+ project.getShortcode() + "'");
	    }
	}

	if (_isEmpty(document.getSourceLanguage())) {
	    throw new Exception("Source language not set");
	}
	if (document.getTargetLanguages() == null || document.getTargetLanguages().length <= 0) {
	    throw new Exception("Target languages are not set");
	}

	for (String targetLanguage : document.getTargetLanguages()) {
	    Boolean isTargetLanguageFound = false;
	    for (LanguageDirection direction : project.getLanguageDirections()) {
		if (direction.sourceLanguage.equals(document.getSourceLanguage())
			&& direction.targetLanguage.equals(targetLanguage)) {
		    isTargetLanguageFound = true;
		    break;
		}
	    }
	    if (!isTargetLanguageFound) {
		throw new Exception("Project is not configured for language direction " + document.getSourceLanguage()
			+ "->" + targetLanguage);
	    }
	}
	for (String targetLanguage : document.getTargetLanguages()) {
	    for (Map.Entry<String, String> targetWorkflow : document.getTargetWorkflowNames().entrySet()) {
		if (targetWorkflow.getKey().equals(targetLanguage)) {
		    boolean found = false;
		    for (Workflow workflow : submission.getProject().getWorkflows()) {
			if (workflow.name.equals(targetWorkflow.getValue())) {
			    found = true;
			    break;
			}
		    }
		    if (!found) {
			throw new Exception("Workflow with name '" + targetWorkflow.getValue()
				+ "' for target language " + targetWorkflow.getKey() + " not found in project "
				+ submission.getProject().getShortcode());
		    }
		}
	    }
	}
    }

    private void _validateSubmission() throws Exception {
	if (submission == null) {
	    throw new Exception("Please initialize submission first.");
	}
	if (submission.getProject() == null) {
	    throw new Exception("Please set submission project");
	}
	if (_isEmpty(submission.getName())) {
	    throw new Exception("Please set submission name");
	}
	if (submission.getWorkflow() != null) {
	    Workflow[] workflows = submission.getProject().getWorkflows();
	    Boolean isSet = false;
	    for (Workflow workflow : workflows) {
		if (workflow.ticket.equals(submission.getWorkflow().ticket)) {
		    isSet = true;
		    break;
		}
	    }
	    if (!isSet) {
		throw new Exception("Invalid submission workflow '" + submission.getWorkflow().name);
	    }
	}

	if (submission.getProject().getCustomAttributes() != null) {
	    for (CustomAttribute custom : submission.getProject().getCustomAttributes()) {
		if (custom.mandatory) {
		    Boolean isSet = false;
		    for (Map.Entry<String, String> entry : submission.getCustomAttributes().entrySet()) {
			if (entry.getKey().equals(custom.name)) {
			    isSet = true;
			    break;
			}
		    }
		    if (!isSet) {
			throw new Exception("Mandatory custom field '" + custom.name + "' is not set");
		    }
		}
	    }
	}
	if (!_isEmpty(submission.getSubmitter())) {
	    if (!_isSubmitterValid(submission.getProject().getShortcode(), submission.getSubmitter())) {
		throw new Exception("Specified submitter '" + submission.getSubmitter()
			+ "' doesn't exist, for chosen project: " + submission.getProject().getName());
	    }
	}

	if (!_isEmpty(submission.getOwner()) && !submission.getOwner().equals(submission.getSubmitter())) {
	    if (!_isSubmitterValid(submission.getProject().getShortcode(), submission.getOwner())) {
		throw new Exception("Specified owner '" + submission.getOwner()
			+ "' doesn't exist, for chosen project: " + submission.getProject().getName());
	    }
	}

	if (submission.getDueDate() != null && submission.getDueDate().before(new Date())) {
	    throw new Exception("Submission due date should be greater than current date");

	}

    }

    /**
     * Cancel document for all languages
     * 
     * @param documentTicket
     *            Document ticket to cancel
     */

    public String cancelDocument(String documentTicket) {
	return serviceLocator.getTargetService().cancelTarget(documentTicket);
    }

    /**
     * Cancel document for specified target language
     * 
     * @param documentTicket
     *            Document ticket to cancel
     * @param locale
     *            Target locale to cancel
     */
    public String cancelDocument(String documentTicket, String locale) {
	DocumentTicket dticket = new DocumentTicket();
	dticket.setTicketId(documentTicket);
	return serviceLocator.getTargetService().cancelTargetByDocumentId(dticket, locale);
    }

    /**
     * Cancel Submission for all languages
     * 
     * @param submissionTicket
     *            Submission ticket to cancel
     */

    public String cancelSubmission(String submissionTicket) {
	return serviceLocator.getSubmissionService().cancelSubmission(submissionTicket);
    }

    /**
     * Cancel Submission for all languages with comment
     * 
     * @param submissionTicket
     *            Submission ticket to cancel
     * @param comment
     *            Cancellation comment
     */

    public String cancelSubmission(String submissionTicket, String comment) {
	return serviceLocator.getSubmissionService().cancelSubmissionWithComment(submissionTicket, comment);
    }

    /**
     * Downloads target document from PD
     * 
     * @param ticket
     *            Target ticket to download
     */
    public InputStream downloadCompletedTarget(String ticket) {
	return new ByteArrayInputStream(
		serviceLocator.getTargetService().downloadTargetResource(ticket).getData().getValue());
    }

    /**
     * Downloads target document from PD
     * 
     * @param Target
     *            Target to download
     */
    public Target downloadCompletedTarget(Target target) {
	RepositoryItem item = serviceLocator.getTargetService().downloadTargetResource(target.getTicket());
	target.setData(new ByteArrayInputStream(item.getData().getValue()));
	target.setDocumentName(item.getResourceInfo().getName());
	return target;
    }
    
    /**
     * Downloads the collateral documents for a given submission
     * 
     * @param submissionTicket
     *            Submission ticket
     * @throws Exception 
     */
    public com.globallink.api.model.RepositoryItem downloadSubmissionCollateral(String submissionTicket) throws Exception {
	return doDownloadCollateral(serviceLocator.getSubmissionService().downloadDeliverableCollateralBySubmissionTicket(submissionTicket));
    }

    /**
     * Downloads the collateral documents for a given submission and the requested target languages
     * 
     * @param submissionTicket
     *            Submission ticket
     * @param targetLanguages
     *            Array of requested target languages
     * @throws Exception 
     *            
     */
    public com.globallink.api.model.RepositoryItem downloadCollaterals(String submissionTicket, String[] targetLanguages) throws Exception
    {
	return doDownloadCollateral(serviceLocator.getSubmissionService().downloadDeliverableCollateralBySubmissionTicketAndTargetLanguages(submissionTicket, Arrays.asList(targetLanguages)));
    }
    
    private com.globallink.api.model.RepositoryItem doDownloadCollateral(String ticket) throws Exception{
	Boolean processingFinished = false;
	int waitCycles = 0;
	// Wait till processing finished
	while (!processingFinished) {
	    // sleep current thread for certain period
	    Thread.sleep(DELAY_TIME);
		
	    waitCycles++;
	    DownloadCollateralResult result = serviceLocator.getSubmissionService().checkDownloadDeliverableCollateral(ticket);
	    processingFinished = result.isProcessingFinished();
	    if(processingFinished){
		if(result.getRepositoryItem()!=null){
		    return new com.globallink.api.model.RepositoryItem(result.getRepositoryItem());
		} else {
		    throw new Exception(Arrays.toString(result.getErrorMessages().toArray()));
		}
	    }
	    // avoid endless loop, exit after 10 min
	    if (waitCycles == 300) {
		break;
	    }
	}
	return null;
    }
    
    /**
     * Downloads translation preview when the submission has not been completed
     * 
     * @param submissionWorkflowInfo
     *            SubmissionWorkflowInfo object
     * @param doClaim
     *            Boolean doClaim
     */
    public InputStream[] downloadPreliminaryTargets(SubmissionWorkflowInfo submissionWorkflowInfo, boolean doClaim)
	    throws InterruptedException {

	List<InputStream> repositoryItems = new ArrayList<InputStream>();
	List<String> submissionTickets = new ArrayList<String>();
	submissionTickets.add(submissionWorkflowInfo.getSubmissionTicket());
	// 1. Claim
	if (doClaim) {
	    WorkflowRequest workflowRequestForClaim = _createWorkflowRequest(submissionWorkflowInfo);

	    serviceLocator.getWorkflowService().claim(workflowRequestForClaim);

	    // 2. Wait until all claimed become available for download
	    List<SubmissionWorkflowInfo> availableSubmissions = serviceLocator.getWorkflowService()
		    .findAvailableWorkflowInfosForDownloadBySubmissionTickets(submissionTickets);
	    int waitCycles = 0;
	    // Wait till all submissions are claimed
	    while (availableSubmissions.size() != submissionTickets.size()) {
		// sleep current thread for certain period
		Thread.sleep(DELAY_TIME);
		waitCycles++;
		availableSubmissions = serviceLocator.getWorkflowService()
			.findAvailableWorkflowInfosForDownloadBySubmissionTickets(submissionTickets);

		// avoid endless loop, exit after 10 min
		if (waitCycles == 300) {
		    break;
		}
	    }
	}

	// 2. Wait until all claimed become available for download
	List<SubmissionWorkflowInfo> downloadableSubmissions = serviceLocator.getWorkflowService()
		.findAvailableWorkflowInfosForDownloadBySubmissionTickets(submissionTickets);
	// 3. Send download preview requests
	List<WorkflowRequestTicket> workflowRequestTickets = new ArrayList<WorkflowRequestTicket>();
	for (SubmissionWorkflowInfo submissionWorkflowInfoint : downloadableSubmissions) {
	    WorkflowRequest workflowRequestForDownload = _createWorkflowRequest(submissionWorkflowInfoint);

	    WorkflowRequestTicket workflowRequestTicket = serviceLocator.getWorkflowService()
		    .downloadPreview(workflowRequestForDownload);

	    workflowRequestTickets.add(workflowRequestTicket);
	}

	// 4. Download
	while (workflowRequestTickets.size() > 0) {
	    Iterator<WorkflowRequestTicket> workflowRequestTicketsIterator = workflowRequestTickets.iterator();
	    while (workflowRequestTicketsIterator.hasNext()) {
		WorkflowRequestTicket workflowRequestTicket = (WorkflowRequestTicket) workflowRequestTicketsIterator
			.next();

		DownloadActionResult downloadActionResult = serviceLocator.getWorkflowService()
			.checkDownloadAction(workflowRequestTicket);

		// if download is done save repositoryItem
		if (downloadActionResult.isProcessingFinished().booleanValue()) {
		    RepositoryItem repositoryItem = downloadActionResult.getRepositoryItem();
		    repositoryItems.add(new ByteArrayInputStream(repositoryItem.getData().getValue()));
		    workflowRequestTicketsIterator.remove();
		}
	    }
	}
	return repositoryItems.toArray(new InputStream[repositoryItems.size()]);
    }

    public InputStream[] downloadTranslationKit(SubmissionWorkflowInfo submissionWorkflowInfo) throws Exception {
	List<InputStream> repositoryItems = new ArrayList<InputStream>();

	ArrayList<WorkflowRequestTicket> workflowRequestTickets = new ArrayList<WorkflowRequestTicket>();
	WorkflowRequest workflowRequest = _createWorkflowRequest(submissionWorkflowInfo);

	WorkflowRequestTicket downloadWorkflowRequestTicket = serviceLocator.getWorkflowService()
		.download(workflowRequest);

	workflowRequestTickets.add(downloadWorkflowRequestTicket);

	// Ping server for checking if download has finished
	while (workflowRequestTickets.size() > 0) {
	    // Create delay between checkDownloadAction() calls
	    Thread.sleep(DELAY_TIME);

	    Iterator<WorkflowRequestTicket> workflowRequestTicketsIterator = workflowRequestTickets.iterator();

	    while (workflowRequestTicketsIterator.hasNext()) {
		WorkflowRequestTicket workflowRequestTicket = (WorkflowRequestTicket) workflowRequestTicketsIterator
			.next();

		// Check if download has finished for specific submission
		DownloadActionResult downloadActionResult = serviceLocator.getWorkflowService()
			.checkDownloadAction(workflowRequestTicket);

		// If download is done save file, or print error message
		if (downloadActionResult.isProcessingFinished().booleanValue()) {
		    RepositoryItem repositoryItem = downloadActionResult.getRepositoryItem();
		    repositoryItems.add(new ByteArrayInputStream(repositoryItem.getData().getValue()));
		    workflowRequestTicketsIterator.remove();
		}
	    }
	}
	return repositoryItems.toArray(new InputStream[repositoryItems.size()]);
    }
    
    /**
     * Finds available workflowInfos for claim
     * 
     * @param limit
     *            SubmissionWorkflowInfos limit
     */
    public SubmissionWorkflowInfo[] findAvailableWorkflowInfosForClaim(int limit) {
	List<SubmissionWorkflowInfo> result = serviceLocator.getWorkflowService()
		.findAvailableWorkflowInfosForClaim(limit);
	if (result != null) {
	    return result.toArray(new SubmissionWorkflowInfo[result.size()]);
	} else {
	    return null;
	}
    }

    /**
     * Finds available workflowInfos for download
     * 
     * @param limit
     *            SubmissionWorkflowInfos limit
     */
    public SubmissionWorkflowInfo[] findAvailableWorkflowInfosForDownload(int limit) {
	List<SubmissionWorkflowInfo> result = serviceLocator.getWorkflowService()
		.findAvailableWorkflowInfosForDownload(limit);
	if (result != null) {
	    return result.toArray(new SubmissionWorkflowInfo[result.size()]);
	} else {
	    return null;
	}
    }
    
    /**
     * Finds available language directions for all available projects
     * 
     * @param limit
     *            WorkflowInfos limit
     */
    public Map<String, Set<String>> getAvailableLanguageDirections() throws Exception {
	Map<String, Set<String>> result = new HashMap<String, Set<String>>();
	for(Project project : projects){
	    for(LanguageDirection direction : project.getLanguageDirections()){
		if(result.containsKey(direction.sourceLanguage)){
		    result.get(direction.sourceLanguage).add(direction.targetLanguage);
		} else {
		    Set<String> targetLanguages = new HashSet<String>();
		    targetLanguages.add(direction.targetLanguage);
		    result.put(direction.sourceLanguage, targetLanguages);
		}
	    }
	}
	return result;
    }

    /**
     * Finds available target locales for all available projects
     * 
     * @param limit
     *            WorkflowInfos limit
     */
    public String[] getAvailableTargetLocales() throws Exception {
	Set<String> targetLanguages = new HashSet<String>();
	for(Project project : projects){
	    for(LanguageDirection direction : project.getLanguageDirections()){
		targetLanguages.add(direction.targetLanguage);
	    }
	}
	return targetLanguages.toArray(new String[targetLanguages.size()]);
    }

    public String[] getAvailableSubmissions(String STATE) throws Exception {
	List<SubmissionWorkflowInfo> swi = null;
	if (STATE.equalsIgnoreCase("CLAIM")) {
	    swi = serviceLocator.getWorkflowService().findAvailableWorkflowInfosForClaim(WORKFLOW_LIMIT);
	} else if (STATE.equalsIgnoreCase("DOWNLOAD")) {
	    swi = serviceLocator.getWorkflowService().findAvailableWorkflowInfosForDownload(WORKFLOW_LIMIT);
	} else {
	    throw new Exception("Invalid state: " + STATE + ". Valid states are CLAIM or DOWNLOAD");
	}
	if (swi.size() == 0) {
	    return null;
	}
	List<String> submissions = new ArrayList<String>();
	for (SubmissionWorkflowInfo submissionWorkflowInfo : swi) {
	    submissions.add(submissionWorkflowInfo.getSubmissionTicket());
	}
	return submissions.toArray(new String[submissions.size()]);
    }

    /**
     * Get cancelled targets for all projects
     * 
     * @param maxResults
     *            Maximum number of cancelled targets to return. This
     *            configuration is to avoid time-outs in case the number of
     *            targets is very large.
     * @return Array of cancelled targets
     */
    public Target[] getCancelledTargets(int maxResults) {
	List<String> projectTickets = new ArrayList<String>();
	for (Project userProject : this.projects) {
	    projectTickets.add(userProject.getTicket());
	}
	List<org.gs4tr.projectdirector.model.dto.xsd.Target> targets = serviceLocator.getTargetService()
		.getCanceledTargetsByProjects(projectTickets, maxResults);
	return _convertTargetsToInternal(targets);
    }
    
    /**
     * Get cancelled targets for a array of submissions
     * 
     * @param submissionTickets
     *            Array of submission tickets
     * @param maxResults
     *            Maximum number of cancelled targets to return. This
     *            configuration is to avoid time-outs in case the number of
     *            targets is very large.
     * @return Array of cancelled targets
     */

    public Target[] getCancelledTargetsBySubmissions(String[] submissionTickets, int maxResults) {
	List<org.gs4tr.projectdirector.model.dto.xsd.Target> targets = serviceLocator.getTargetService()
		.getCanceledTargetsBySubmissions(Arrays.asList(submissionTickets), maxResults);
	return _convertTargetsToInternal(targets);
    }
    
    /**
     * Get cancelled targets for an array of document tickets
     * 
     * @param documentTickets
     *            Array of document tickets
     * @param maxResults
     *            Maximum number of cancelled targets to return. This
     *            configuration is to avoid time-outs in case the number of
     *            targets is very large.
     * @return Array of cancelled targets
     */

    public Target[] getCancelledTargetsByDocuments(String[] documentTickets, int maxResults) {
	List<org.gs4tr.projectdirector.model.dto.xsd.Target> targets = serviceLocator.getTargetService()
		.getCanceledTargetsByDocuments(Arrays.asList(documentTickets), maxResults);
	return _convertTargetsToInternal(targets);
    }
    
    /**
     * Get cancelled targets for an array of projects
     * 
     * @param projects
     *            Array of projects
     * @param maxResults
     *            Maximum number of cancelled targets to return. This
     *            configuration is to avoid time-outs in case the number of
     *            targets is very large.
     * @return Array of cancelled targets
     */

    public Target[] getCancelledTargetsByProjects(Project[] projects, int maxResults) {
	List<String> tickets = new ArrayList<String>();
	for(Project project : projects){
	    tickets.add(project.getTicket());
	}
	List<org.gs4tr.projectdirector.model.dto.xsd.Target> targets = serviceLocator.getTargetService()
		.getCanceledTargetsByProjects(tickets, maxResults);
	return _convertTargetsToInternal(targets);
    }
    
    /**
     * Get cancelled targets for an array of project tickets
     * 
     * @param projects
     *            Array of project tickets
     * @param maxResults
     *            Maximum number of cancelled targets to return. This
     *            configuration is to avoid time-outs in case the number of
     *            targets is very large.
     * @return Array of cancelled targets
     */

    public Target[] getCancelledTargetsByProjectTickets(String[] projectTickets, int maxResults) {
	List<org.gs4tr.projectdirector.model.dto.xsd.Target> targets = serviceLocator.getTargetService()
		.getCanceledTargetsByProjects(Arrays.asList(projectTickets), maxResults);
	return _convertTargetsToInternal(targets);
    }

    /**
     * Get cancelled targets for a submission
     * 
     * @param submissionTicket
     *            Submission ticket
     * @param maxResults
     *            Maximum number of cancelled targets to return. This
     *            configuration is to avoid time-outs in case the number of
     *            targets is very large.
     * @return Array of cancelled targets
     */

    public Target[] getCancelledTargetsBySubmission(String submissionTicket, int maxResults) {
	List<org.gs4tr.projectdirector.model.dto.xsd.Target> targets = serviceLocator.getTargetService()
		.getCanceledTargetsBySubmissions(Arrays.asList(submissionTicket), maxResults);
	return _convertTargetsToInternal(targets);
    }

    /**
     * Get completed targets for all projects
     * 
     * @param maxResults
     *            Maximum number of completed targets to return in this call.
     * @return Array of completed targets
     */
    public Target[] getCompletedTargets(int maxResults) {
	List<String> projectTickets = new ArrayList<String>();
	for (Project userProject : projects) {
	    projectTickets.add(userProject.getTicket());
	}
	List<org.gs4tr.projectdirector.model.dto.xsd.Target> targets = serviceLocator.getTargetService()
		.getCompletedTargetsByProjects(projectTickets, maxResults);
	return _convertTargetsToInternal(targets);
    }
    
    /**
     * Get completed targets for array of projects
     * 
     * @param projects
     *            Array of projects for which completed targets are requested
     * @param maxResults
     *            Maximum number of completed targets to return in this call.
     * @return Array of completed targets
     */

    public Target[] getCompletedTargetsByProjects(Project[] projects, int maxResults) {
	List<String> tickets = new ArrayList<String>();
	for(Project project : projects){
	    tickets.add(project.getTicket());
	}
	List<org.gs4tr.projectdirector.model.dto.xsd.Target> targets = serviceLocator.getTargetService()
		.getCompletedTargetsByProjects(tickets, maxResults);
	return _convertTargetsToInternal(targets);
    }
    
    /**
     * Get completed targets for array of project tickets
     * 
     * @param projectTickets
     *            Array of project tickets for which completed targets are requested
     * @param maxResults
     *            Maximum number of completed targets to return in this call.
     * @return Array of completed targets
     */

    public Target[] getCompletedTargetsByProjectTickets(String[] projectTickets, int maxResults) {
	List<org.gs4tr.projectdirector.model.dto.xsd.Target> targets = serviceLocator.getTargetService()
		.getCompletedTargetsByProjects(Arrays.asList(projectTickets), maxResults);
	return _convertTargetsToInternal(targets);
    }

    /**
     * Get completed targets for specified project
     * 
     * @param project
     *            Project for which completed targets are requested
     * @param maxResults
     *            Maximum number of completed targets to return in this call.
     * @return Array of completed targets
     */

    public Target[] getCompletedTargetsByProject(Project project, int maxResults) {
	List<String> tickets = new ArrayList<String>();
	tickets.add(project.getTicket());
	List<org.gs4tr.projectdirector.model.dto.xsd.Target> targets = serviceLocator.getTargetService()
		.getCompletedTargetsByProjects(tickets, maxResults);
	return _convertTargetsToInternal(targets);
    }
    
    /**
     * Get completed targets for list of submissions
     * 
     * @param submissionTickets
     *            List of submission tickets for which completed targets are requested
     * @param maxResults
     *            Maximum number of completed targets to return in this call.
     * @return Array of completed targets
     */
    public Target[] getCompletedTargetsBySubmissions(String[] submissionTickets, int maxResults) {
	List<org.gs4tr.projectdirector.model.dto.xsd.Target> targets = serviceLocator.getTargetService()
		.getCompletedTargetsBySubmissions(Arrays.asList(submissionTickets), maxResults);
	return _convertTargetsToInternal(targets);
    }

    /**
     * Get completed targets for submission
     * 
     * @param submissionTicket
     *            Submission for which completed targets are requested
     * @param maxResults
     *            Maximum number of completed targets to return in this call.
     * @return Array of completed targets
     */
    public Target[] getCompletedTargetsBySubmission(String submissionTicket, int maxResults) {
	List<org.gs4tr.projectdirector.model.dto.xsd.Target> targets = serviceLocator.getTargetService()
		.getCompletedTargetsBySubmissions(Arrays.asList(submissionTicket), maxResults);
	return _convertTargetsToInternal(targets);
    }
    
    /**
     * Get completed targets by array of document tickets
     * 
     * @param documentTickets
     *            Array of document tickets
     * @param maxResults
     *            Maximum number of completed targets to return in this call.
     * @return Array of completed targets
     */
    public Target[] getCompletedTargetsByDocuments(String[] documentTickets, int maxResults) {
	List<org.gs4tr.projectdirector.model.dto.xsd.Target> targets = serviceLocator.getTargetService()
		.getCompletedTargetsByDocuments(Arrays.asList(documentTickets), maxResults);
	return _convertTargetsToInternal(targets);
    }
    
    /**
     * Get completed targets by specified document ticket
     * 
     * @param documentTicket
     *            Document ticket
     * @param maxResults
     *            Maximum number of completed targets to return in this call.
     * @return Array of completed targets
     */
    public Target[] getCompletedTargetsByDocument(String documentTicket, int maxResults) {
	List<String> tickets = new ArrayList<String>();
	tickets.add(documentTicket);
	List<org.gs4tr.projectdirector.model.dto.xsd.Target> targets = serviceLocator.getTargetService()
		.getCompletedTargetsByDocuments(Arrays.asList(documentTicket), maxResults);
	return _convertTargetsToInternal(targets);
    }

    /**
     * Get language phase info with TMStatistics
     * 
     * @param submissionTicket
     *            Submission`s ticket
     * @param batchName
     *            Batch name
     * @param targetLanguage
     *            Target language
     * @param phaseName
     *            Phase name
     * @return LanguagePhaseInfo object
     */
    public LanguagePhaseInfo getLanguagePhaseInfo(String submissionTicket, String batchName, String targetLanguage, String phaseName){
	org.gs4tr.projectdirector.model.dto.xsd.LanguagePhaseInfo result = serviceLocator.getTargetService().getLanguagePhaseInfo(submissionTicket, batchName, targetLanguage, phaseName);
	if (result != null) {
	    return new LanguagePhaseInfo(result);
	}
	return null;
    }

    /**
     * Get project by it`s shortcode
     * 
     * @param shortCode
     *            Project`s shortcode.
     * @return Project with specified shortcode
     */
    public Project getProject(String shortCode) {
	for(Project project : projects){
	    if(shortCode.equals(project.getShortcode())){
		return project;
	    }
	}
	org.gs4tr.projectdirector.model.dto.xsd.Project project = serviceLocator.getProjectService()
		.findProjectByShortCode(shortCode);
	Project proj = new Project(project);
	proj.setSubmitters(_getSubmitters(shortCode));
	return proj;
    }

    /**
     * Get all user projects
     * 
     * @return Array of Projects with subprojects to which the logged in user
     *         has access to
     */
    public Project[] getProjects() {
	List<org.gs4tr.projectdirector.model.dto.xsd.Project> projects = serviceLocator.getProjectService()
		.getUserProjects(true);
	return _convertProjectsToInternal(projects);
    }
    
    /**
     * Get Submission batches
     * 
     * @param submissionTicket
     *            Submission`s ticket
     * @return Array of submission Batches
     */
    public Batch[] getSubmissionBatches(String submissionTicket){
	return _convertBatchesToInternal(serviceLocator.getSubmissionService().findByTicket(submissionTicket).getBatches());
    }
    
    /**
     * Get Submission Id
     * 
     * @param submissionTicket
     *            Submission`s ticket
     * @return Submission Id
     */
    public Long getSubmissionId(String submissionTicket){
	return serviceLocator.getSubmissionService().findByTicket(submissionTicket).getSubmissionId();
    }

    /**
     * Get Submission for specified ticket.
     * 
     * @return Submission name for the specified ticket.
     * @throws Exception
     */
    public String getSubmissionName(String submissionTicket) throws Exception {
	org.gs4tr.projectdirector.model.dto.xsd.Submission sub = serviceLocator.getSubmissionService()
		.findByTicket(submissionTicket);
	if (sub != null) {
	    return sub.getSubmissionInfo().getName();
	} else {
	    throw new Exception("Invalid submission ticket");
	}
    }

    /**
     * Get Submission ticket if a submission has been initialized.
     * 
     * @return Submission ticket.
     */
    public String[] getSubmissionTickets() throws Exception {
	if (submission != null) {
	    return submission.getTickets();
	} else {
	    throw new Exception("Submission not initialized");
	}
    }

    /**
     * Get Unstarted Submissions.
     * 
     * @return Array of Submissions that have not been started.
     */
    public Submission[] getUnstartedSubmissions(Project project) {
	return _convertSubmissionsToInternal(serviceLocator.getSubmissionService()
		.findCreatingSubmissionsByProjectShortCode(project.getShortcode()));
    }

    /**
     * Initialize a new Submission
     * 
     * @param submission
     *            Submission configuration to initialize a new submission
     * @throws Exception
     */

    public void initSubmission(Submission submission) throws Exception {
	this.submission = submission;
	_validateSubmission();
	submission.setTickets(EMPTY_ARRAY);
    }

    /**
     * Get Submission status for specified ticket.
     * 
     * @return True if submission is complete.
     * @throws Exception
     */
    public boolean isSubmissionComplete(String submissionTicket) throws Exception {
	org.gs4tr.projectdirector.model.dto.xsd.Submission sub = serviceLocator.getSubmissionService()
		.findByTicket(submissionTicket);
	boolean status = false;
	if (sub != null && sub.getStatus().equals(ItemStatusEnum.PROCESSED)) {
	    status = true;
	}

	return status;

    }

    /**
     * Get Submission status for specified ticket.
     * 
     * @return Submission status in ItemStatusEnum object
     * @throws Exception
     */
    public com.globallink.api.model.ItemStatusEnum getSubmissionStatus(String submissionTicket) throws Exception {
	org.gs4tr.projectdirector.model.dto.xsd.Submission sub = serviceLocator.getSubmissionService()
		.findByTicket(submissionTicket);

	if (sub != null) {
	    return new com.globallink.api.model.ItemStatusEnum(sub.getStatus().getValue());
	} else {
	    return null;
	}

    }

    /**
     * Sends confirmation that the target resources was downloaded successfully
     * by the customer.
     * 
     * @param targetTicket
     *            Downloaded target`s ticket
     */
    public String sendDownloadConfirmation(String targetTicket) {
	return serviceLocator.getTargetService().sendDownloadConfirmation(targetTicket);
    }

    /**
     * 
     * Start Submission
     * 
     * @return Submission Ticket
     * @throws Exception
     */
    public String[] startSubmission() throws Exception {
	if (submission == null || submission.getProject() == null || _isEmpty(submission.getName())) {
	    throw new Exception("Please initialize submission first.");
	}

	if (submission.getTickets().length == 0) {
	    throw new Exception("Please upload a translatable document first.");
	}

	// Start each submission
	String[] tickets = submission.getTickets();
	Map<String, SubmissionInfo> submissionInfos = _createSubmissionInfos();
	for (String submissionTicket : tickets) {
	    serviceLocator.getSubmissionService().startSubmission(submissionTicket,
		    submissionInfos.get(submissionTicket));
	    if (!_isEmpty(submission.getOwner())) {
		try {
		    serviceLocator.getSubmissionService().addOwner(submissionTicket, submission.getOwner());
		} catch (Exception e) {
		    // DO nothing for now.
		}
	    }
	}

	submission = null;
	return tickets;
    }

    /**
     * 
     * Upload reference file for submission
     * 
     * @param referenceDocument
     *            Reference document
     * @throws Exception
     */
    public String uploadReference(ReferenceDocument referenceDocument) throws Exception {
	if (referenceDocument == null || referenceDocument.getData() == null
		|| referenceDocument.getData().length <= 0) {
	    throw new Exception("Document is empty");
	}
	if (_isEmpty(referenceDocument.getName())) {
	    throw new Exception("Document name not set");
	}

	if (submission == null) {
	    throw new Exception("Submission not initialized.");
	}

	String[] tickets = submission.getTickets();
	if (tickets.length == 0) {
	    throw new Exception(
		    "Invalid submission ticket. Please upload a translatable document before attempting to upload reference documents.");
	}
	Base64Binary data = new Base64Binary();
	data.setValue(referenceDocument.getData());
	return serviceLocator.getSubmissionService().uploadReference(tickets[tickets.length - 1],
		referenceDocument.getResourceInfo(), data);
    }

    /**
     * Uploads the document to project director for translation
     * 
     * @param document
     *            Document that requires translation
     * @return Document Ticket
     * @throws Exception
     */
    public String uploadTranslatable(Document document) throws Exception {

	if (submission == null) {
	    throw new Exception("Submission not initialized.");
	}
	_validateDocument(document);

	DocumentInfo di = document.getDocumentInfo(submission);
	ResourceInfo ri = document.getResourceInfo();
	Base64Binary data = new Base64Binary();
	data.setValue(document.getData());
	DocumentTicket documentTicket = serviceLocator.getDocumentService().submitDocumentWithBinaryResource(di, ri,
		data);
	if (documentTicket != null) {
	    // Add the returned submission ticket in case a new submission got
	    // created within PD
	    submission.addTicket(documentTicket.getSubmissionTicket());
	}

	return documentTicket.getTicketId();

    }

    public String uploadTranslationKit(String fileName, byte[] inputStream) throws InterruptedException, IOException {
	StringBuffer result = new StringBuffer();
	ResourceInfo resourceInfo = new ResourceInfo();
	resourceInfo.setName(fileName);
	resourceInfo.setSize(new Long(inputStream.length));

	// Upload file
	Base64Binary data = new Base64Binary();
	data.setValue(inputStream);
	WorkflowRequestTicket workflowRequestTicket = serviceLocator.getWorkflowService().upload(resourceInfo, data);

	// Wait until upload is done, or print error message if it failed
	boolean uploadFinished = false;
	while (!uploadFinished) {
	    // Create delay between two checkUploadAction calls
	    Thread.sleep(DELAY_TIME);

	    UploadActionResult uploadActionResult = serviceLocator.getWorkflowService()
		    .checkUploadAction(workflowRequestTicket);

	    uploadFinished = uploadActionResult.isProcessingFinished().booleanValue();
	    if (uploadFinished && uploadActionResult.getMessages() != null) {
		for (String message : uploadActionResult.getMessages()) {
		    result.append(message + ";");
		}
	    }
	}
	return result.toString();
    }

}
