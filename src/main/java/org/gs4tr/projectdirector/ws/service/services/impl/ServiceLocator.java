package org.gs4tr.projectdirector.ws.service.services.impl;

import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;
import javax.xml.ws.soap.SOAPBinding;

import org.gs4tr.projectdirector.ws.headers.LoginHeaderHandler;
import org.gs4tr.projectdirector.ws.headers.UserAgentHeaderHandler;

public class ServiceLocator {

    public static final String WS_VERSION = "_4180";
    private static final String HTTP_PREFIX = "http://";
    private static final String HTTP_PROXY_HOST = "http.proxyHost";
    private static final String HTTP_PROXY_PORT = "http.proxyPort";
    private static final String HTTP_PROXY_USER = "http.proxyUser";
    private static final String HTTP_PROXY_PASSWORD = "http.proxyPassword";
    private static final String HTTPS_PREFIX = "https://";
    private static final String HTTPS_PROXY_HOST = "https.proxyHost";
    private static final String HTTPS_PROXY_PORT = "https.proxyPort";
    private static final String HTTPS_PROXY_USER = "https.proxyUser";
    private static final String HTTPS_PROXY_PASSWORD = "https.proxyPassword";
    private ProjectServicePortType projectService;
    private SubmissionServicePortType submissionService;
    private DocumentServicePortType documentService;
    private TargetServicePortType targetService;
    private UserProfileServicePortType userProfileService;
    private WorkflowServicePortType workflowService;
    private ProjectAClientServicePortType projectAClientService;

    public ServiceLocator(String pdUrl, final String username,
	    final String password, final String userAgent, Boolean enableMTOM) {
	this(pdUrl, username, password, userAgent, enableMTOM, null, 0, null,
		null);
    }

    public ServiceLocator(String pdUrl, final String username,
	    final String password, final String userAgent, Boolean enableMTOM,
	    String proxyHost, int proxyPort, final String proxyUser,
	    final String proxyPassword) {
	String url = pdUrl;
	if (!url.endsWith("/")) {
	    url = url + "/";
	}

	HandlerResolver handler = new HandlerResolver() {

	    @SuppressWarnings("rawtypes")
	    @Override
	    public List<Handler> getHandlerChain(PortInfo portInfo) {
		List<Handler> handlerList = new ArrayList<Handler>();
		handlerList.add(new LoginHeaderHandler(username, password));
		handlerList.add(new UserAgentHeaderHandler(userAgent));
		return handlerList;
	    }
	};
	

	SubmissionService4180 ss = new SubmissionService4180(getClass()
		.getResource("/wsdl/SubmissionService" + WS_VERSION + ".wsdl"));
	ss.setHandlerResolver(handler);
	submissionService = ss.getSubmissionServiceHttpSoap11Endpoint();
	setupService((BindingProvider) submissionService, "SubmissionService",
		url, enableMTOM, proxyHost, proxyPort, proxyUser, proxyPassword);

	ProjectService4180 ps = new ProjectService4180(getClass().getResource(
		"/wsdl/ProjectService" + WS_VERSION + ".wsdl"));
	ps.setHandlerResolver(handler);
	projectService = ps.getProjectServiceHttpSoap11Endpoint();
	setupService((BindingProvider) projectService, "ProjectService", url,
		enableMTOM, proxyHost, proxyPort, proxyUser, proxyPassword);

	DocumentService4180 ds = new DocumentService4180(getClass()
		.getResource("/wsdl/DocumentService" + WS_VERSION + ".wsdl"));
	ds.setHandlerResolver(handler);
	documentService = ds.getDocumentServiceHttpSoap11Endpoint();
	setupService((BindingProvider) documentService, "DocumentService", url,
		enableMTOM, proxyHost, proxyPort, proxyUser, proxyPassword);

	TargetService4180 ts = new TargetService4180(getClass().getResource(
		"/wsdl/TargetService" + WS_VERSION + ".wsdl"));
	ts.setHandlerResolver(handler);
	targetService = ts.getTargetServiceHttpSoap11Endpoint();
	setupService((BindingProvider) targetService, "TargetService", url,
		enableMTOM, proxyHost, proxyPort, proxyUser, proxyPassword);
	
        UserProfileService4180 ups = new UserProfileService4180(getClass().getResource(
		"/wsdl/UserProfileService" + WS_VERSION + ".wsdl"));
        ups.setHandlerResolver(handler);
        userProfileService = ups.getUserProfileServiceHttpSoap11Endpoint(); 
        setupService((BindingProvider) userProfileService,
		"UserProfileService", url, enableMTOM, proxyHost, proxyPort,
		proxyUser, proxyPassword);

	WorkflowService4180 ws = new WorkflowService4180(getClass()
		.getResource("/wsdl/WorkflowService" + WS_VERSION + ".wsdl"));
	ws.setHandlerResolver(handler);
	workflowService = ws.getWorkflowServiceHttpSoap11Endpoint();
	setupService((BindingProvider) workflowService, "WorkflowService", url,
		enableMTOM, proxyHost, proxyPort, proxyUser, proxyPassword);
	
	ProjectAClientService4180 pacs = new ProjectAClientService4180(getClass()
		.getResource("/wsdl/ProjectAClientService" + WS_VERSION + ".wsdl"));
	pacs.setHandlerResolver(handler);
	projectAClientService = pacs.getProjectAClientServiceHttpSoap11Endpoint();
	setupService((BindingProvider) projectAClientService, "ProjectAClientService", url,
		enableMTOM, proxyHost, proxyPort, proxyUser, proxyPassword);
	
	if (proxyHost != null) {
		System.setProperty("proxyHost", proxyHost);
		System.setProperty("proxyPort", ""+proxyPort);
		if (proxyUser != null && proxyUser.trim().length() > 0 && proxyPassword != null && proxyPassword.trim().length() > 0) {
			java.net.Authenticator.setDefault(
	          new java.net.Authenticator() {
	            public java.net.PasswordAuthentication getPasswordAuthentication() {
	              return new java.net.PasswordAuthentication(
	                proxyUser, proxyPassword.toCharArray()
	              );
	            }
	          }
	        );
		}
	}
    }

    private void setupService(BindingProvider bp, String serviceName,
	    String url, Boolean enableMTOM, String proxyHost, int proxyPort,
	    String proxyUser, String proxyPassword) {
	bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
		url + "services/" + serviceName + WS_VERSION);
	if (proxyHost != null) {
	    if (proxyHost.startsWith(HTTP_PREFIX)) {
		bp.getRequestContext().put(HTTP_PROXY_HOST, proxyHost);
		bp.getRequestContext().put(HTTP_PROXY_PORT, proxyPort);
		if (proxyUser != null && proxyUser.trim().length() > 0) {
		    bp.getRequestContext().put(HTTP_PROXY_USER, proxyUser);
		    bp.getRequestContext().put(HTTP_PROXY_PASSWORD,
			    proxyPassword);
		}
	    } else if (proxyHost.startsWith(HTTPS_PREFIX)) {
		bp.getRequestContext().put(HTTPS_PROXY_HOST, proxyHost);
		bp.getRequestContext().put(HTTPS_PROXY_PORT, proxyPort);
		if (proxyUser != null && proxyUser.trim().length() > 0) {
		    bp.getRequestContext().put(HTTPS_PROXY_USER, proxyUser);
		    bp.getRequestContext().put(HTTPS_PROXY_PASSWORD,
			    proxyPassword);
		}
	    }
	}
	SOAPBinding binding = (SOAPBinding) bp.getBinding();
	binding.setMTOMEnabled(enableMTOM);
	
	
    }

    public ProjectServicePortType getProjectService() {
	return this.projectService;
    }

    public SubmissionServicePortType getSubmissionService() {
	return this.submissionService;
    }

    public TargetServicePortType getTargetService() {
	return this.targetService;
    }

    public DocumentServicePortType getDocumentService() {
	return this.documentService;
    }

    public UserProfileServicePortType getUserProfileService() {
	return this.userProfileService;
    }

    public WorkflowServicePortType getWorkflowService() {
	return this.workflowService;
    }

    public ProjectAClientServicePortType getProjectAClientService() {
	return projectAClientService;
    }

}
