package com.globallink.api.model;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import org.gs4tr.projectdirector.model.dto.xsd.ResourceInfo;

/**
 * Reference documents contain additional information which provide more context
 * about the Documents that have been submitted for translation. eg. While
 * submitting Indesign documents, the reference files usually contain the
 * published source PDF
 * 
 * The ReferenceDocuments do not require translation and are not accounted for
 * in the translation wordcounts.
 */
public class ReferenceDocument {

    protected byte[] data;
    protected String name;

    public byte[] getData() {
	return data;
    }

    /**
     * Gets data as InputStream
     * 
     * @return InputStream
     */
    public InputStream getDataAsInputStream() {
	return new ByteArrayInputStream(this.data);
    }

    /**
     * Gets the name of the document
     */

    public String getName() {
	return name;
    }

    public ResourceInfo getResourceInfo() {
	ResourceInfo resourceInfo = new ResourceInfo();
	resourceInfo.setName(name.trim());
	resourceInfo.setSize((long) data.length);
	return resourceInfo;
    }

    /**
     * Set data from byte array
     * 
     * @param data
     *            Byte array containing data that needs to be translated
     */
    public void setData(byte[] data) {
	this.data = data;
    }

    /**
     * Set data from InputStream
     * 
     * @param inputStream
     *            InputStream containing data that needs to be translated
     * @throws IOException
     */
    public void setData(InputStream inputStream) throws IOException {
	int len;
	ByteArrayOutputStream bos = new ByteArrayOutputStream();
	byte[] buf = new byte[1024];
	while ((len = inputStream.read(buf, 0, 1024)) != -1) {
	    bos.write(buf, 0, len);
	}
	this.data = bos.toByteArray();

    }

    /**
     * Set data from string
     * 
     * @param data
     *            String containing data that needs to be translated
     * @throws UnsupportedEncodingException
     */
    public void setData(String data) throws UnsupportedEncodingException {
	setData(data, "UTF-8");
    }

    /**
     * Set data(byte[]) from string using encoding
     * 
     * @param data
     *            String containing data that needs to be translated
     * @param encoding
     *            Encoding of provided data string
     * 
     * @throws UnsupportedEncodingException
     */
    public void setData(String data, String encoding)
	    throws UnsupportedEncodingException {
	this.data = data.getBytes(encoding);
    }

    /**
     * Set document name
     * 
     * @param name
     *            Document name
     */

    public void setName(String name) {
	this.name = name != null ? name.trim() : name;
    }
}
