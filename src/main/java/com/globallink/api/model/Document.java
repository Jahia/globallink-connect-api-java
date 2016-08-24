package com.globallink.api.model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.gs4tr.projectdirector.model.dto.DocumentInfo;
import org.gs4tr.projectdirector.model.dto.Metadata;
import org.gs4tr.projectdirector.model.dto.ResourceInfo;
import org.gs4tr.projectdirector.model.dto.TargetInfo;

public class Document extends ReferenceDocument {

	// optional
	private String clientIdentifier; // unique id for document from the client's

	// CMS
	private String encoding = "UTF-8";

	private String fileformat;

	private String instructions;

	private HashMap<String,String> metadata = new HashMap<String,String>();

	// Mandatory
	private String sourceLanguage;

	private String[] targetLanguages;

	private HashMap<String,String> targetWorkflowNames = new HashMap<String,String>();

	public Document() {
		super();
	}

	/**
	 * Internal method used by the UCF API
	 * 
	 * @return TargetInfo array
	 */
	private List<TargetInfo> _getTargetInfos( Submission submission ) {
		List<TargetInfo> targetInfos = new ArrayList<TargetInfo>();
		for( int j = 0; j < targetLanguages.length; j++ ) {
			TargetInfo targetInfo = new TargetInfo();
			targetInfo.setTargetLocale( targetLanguages[j] );
			targetInfo.setEncoding( encoding );
			if( targetWorkflowNames.size() > 0 ) {
				for( Map.Entry<String,String> entry : targetWorkflowNames.entrySet() ) {
					if( entry.getKey().equals( targetLanguages[j] ) ) {
						for( Workflow workflow : submission.getProject().getWorkflows() ) {
							if( workflow.name.equals( entry.getValue() ) ) {
								targetInfo.setWorkflowDefinitionTicket( workflow.ticket );
								break;
							}
						}
						break;
					}
				}
			}
			targetInfos.add( targetInfo );
		}
		return targetInfos;
	}

	/**
	 * Internal method used by the UCF API
	 * 
	 * @return DocumentInfo object
	 */
	public DocumentInfo getDocumentInfo( Submission submission ) {
		DocumentInfo documentInfo = new DocumentInfo();
		documentInfo.setName( name );
		documentInfo.setSourceLocale( sourceLanguage );
		documentInfo.setProjectTicket( submission.getProject().getTicket() );

		// Set active submission ticket if one exists
		String[] tickets = submission.getTickets();
		if( tickets != null && tickets.length > 0 ) {
			documentInfo.setSubmissionTicket( tickets[tickets.length - 1] );
		}
		if( metadata != null && metadata.size() > 0 ) {
			List<Metadata> pdMetadatas = new ArrayList<Metadata>();
			for( Map.Entry<String,String> entry : metadata.entrySet() ) {
				Metadata pdMetadata = new Metadata();
				pdMetadata.setKey( entry.getKey().length() > 255 ? entry.getKey().substring( 0, 255 ) : entry.getKey() );
				pdMetadata.setValue( entry.getValue().length() > 1024 ? entry.getValue().substring( 0, 1024 ) : entry
						.getValue() );
				pdMetadatas.add( pdMetadata );
			}
			documentInfo.setMetadata( pdMetadatas );
		}
		if( clientIdentifier != null ) {
			documentInfo.setClientIdentifier( clientIdentifier );
		}
		if( instructions != null ) {
			documentInfo.setInstructions( instructions );
		} else if( submission.getInstructions() != null && submission.getInstructions().trim().length() > 0 ) {
			documentInfo.setInstructions( submission.getInstructions() );
		}

		documentInfo.setTargetInfos( _getTargetInfos( submission ) );

		return documentInfo;
	}

	public String getFileformat() {
		return fileformat;
	}

	/**
	 * Internal method used by the UCF API
	 * 
	 * @return ResourceInfo object
	 * @throws IOException
	 */
	public ResourceInfo getResourceInfo() {
		ResourceInfo resourceInfo = new ResourceInfo();
		resourceInfo.setName( name );
		resourceInfo.setClassifier( fileformat );
		resourceInfo.setEncoding( encoding );
		if( clientIdentifier != null ) {
			resourceInfo.setClientIdentifier( clientIdentifier );
		}
		resourceInfo.setSize( (long)data.length );
		return resourceInfo;
	}

	public String getSourceLanguage() {
		return sourceLanguage;
	}

	public String[] getTargetLanguages() {
		return targetLanguages;
	}

	public HashMap<String,String> getTargetWorkflowNames() {
		return targetWorkflowNames;
	}

	/**
	 * [OPTIONAL] Specify a unique identifier for this document (if one exists)
	 * in the content management system
	 * 
	 * @param clientIdentifier
	 *            Unique identifier for this document
	 */
	public void setClientIdentifier( String clientIdentifier ) {
		this.clientIdentifier = clientIdentifier;
	}

	/**
	 * [OPTIONAL] - Set encoding
	 * 
	 * @param encoding
	 *            Encoding of the content if the data is textual. Defaults to
	 *            UTF-8
	 */
	public void setEncoding( String encoding ) {
		this.encoding = encoding;
	}

	/**
	 * [OPTIONAL] - Defaults to configured fileFormat on project director
	 * 
	 * @param fileformat
	 *            File Format profile that defines the parsing rules for the
	 *            document
	 */

	public void setFileformat( String fileformat ) {
		this.fileformat = fileformat;
	}

	/**
	 * [OPTIONAL] Specify translation instructions
	 * 
	 * @param instructions
	 *            Instructions for translators
	 */

	public void setInstructions( String instructions ) {
		this.instructions = instructions;
	}

	/**
	 * [OPTIONAL] Additional metadata that you may want to attach to your
	 * document
	 * 
	 * @param metadata
	 *            Metadata in Key-Value format
	 */

	public void setMetadata( HashMap<String,String> metadata ) {
		this.metadata = metadata;
	}

	/**
	 * Set Source Language of the document
	 * 
	 * @param sourceLanguage
	 *            Locale code in xx-XX format.
	 */
	public void setSourceLanguage( String sourceLanguage ) {
		this.sourceLanguage = sourceLanguage;
	}

	/**
	 * Set target languages into which this document will be translated
	 * 
	 * @param targetLanguages
	 *            Array of Locale code in xx-XX format.
	 */
	public void setTargetLanguages( String[] targetLanguages ) {
		this.targetLanguages = targetLanguages;
	}

	public void setTargetWorkflowNames( HashMap<String,String> targetWorkflowNames ) {
		this.targetWorkflowNames = targetWorkflowNames;
	}

}
