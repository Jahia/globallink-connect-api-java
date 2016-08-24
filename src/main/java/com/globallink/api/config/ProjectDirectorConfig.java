package com.globallink.api.config;

/**
 * Project director configuration
 * 
 */
public class ProjectDirectorConfig {

    private Boolean enableMTOM = true; // optional

    /**
     * Project director password.
     */
    private String password;

    private ProxyConfig proxy; // optional

    /**
     * [Optional] - Response Timeout in miliseconds (Default is 3000)
     */
    private int timeOut; // optional

    /**
     * URL of the project director server to connect to.
     */
    private String url;
    /**
     * Client user Agent to be recorder in project director logs.
     */
    private String userAgent;

    /**
     * Project director username.
     */
    private String username;

    /**
     * Returns project director password.
     */
    public String getPassword() {
	return password;
    }

    /**
     * 
     * Returns proxy configuration for outbound traffic.
     */
    public ProxyConfig getProxy() {
	return this.proxy;
    }

    /**
     * Returns response timeout for webservice calls.
     */
    public int getTimeOut() {
	return this.timeOut;
    }

    /**
     * Returns URL or IP address of the project director server.
     */
    public String getUrl() {
	return url;
    }

    /**
     * Returns user Agent for this client
     */
    public String getUserAgent() {
	return userAgent;
    }

    /**
     * Returns project director username.
     */
    public String getUsername() {
	return username;
    }

    /**
     * 
     * Returns if MTOM is enabled.
     */
    public Boolean isEnableMTOM() {
	return this.enableMTOM;
    }

    /**
     * 
     * [Optional] - Set to false to disable MTOM. Default is true.
     * 
     * 
     * @param enableMTOM
     *            Set to false to disable MTOM. Default is true.
     */
    public void setEnableMTOM(Boolean enableMTOM) {
	this.enableMTOM = enableMTOM;
    }

    /**
     * Project director password.
     */
    public void setPassword(String password) {
	this.password = password;
    }

    /**
     * 
     * [Optional] - Set proxy configuration for outbound traffic.
     * 
     * @param proxy
     *            ProxyConfig
     */
    public void setProxy(ProxyConfig proxy) {
	this.proxy = proxy;
    }

    /**
     * [Optional] - Set response timeout for webservice calls.
     * 
     * @param timeOut
     *            Timeout value in miliseconds. (Default value is 60 seconds)
     */
    public void setTimeOut(int timeOut) {
	this.timeOut = timeOut;
    }

    /**
     * URL of the project director server to connect to.
     * 
     * @param url
     *            IP address or hostname
     */
    public void setUrl(String url) {
	this.url = url;
    }

    /**
     * Sets the user Agent for this client. A user agent is any user friendly
     * identifier which is used to categorize the logging on GlobalLink.
     */
    public void setUserAgent(String userAgent) {
	this.userAgent = userAgent;
    }

    /**
     * Project director username.
     */
    public void setUsername(String username) {
	this.username = username;
    }

}
