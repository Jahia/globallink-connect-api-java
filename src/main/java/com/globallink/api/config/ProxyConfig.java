package com.globallink.api.config;

public class ProxyConfig {
    /**
     * Proxy server IP address or hostname
     */
    private String proxyHost;
    /**
     * [OPTIONAL] - Proxy user password
     */
    private String proxyPassword;
    /**
     * Proxy server port
     */
    private int proxyPort;
    /**
     * [OPTIONAL] - Proxy user
     */
    private String proxyUser;

    /**
     * Returns proxy server IP address or hostname
     */
    public String getProxyHost() {
	return proxyHost;
    }

    /**
     * [OPTIONAL] - Returns proxy user password
     */
    public String getProxyPassword() {
	return proxyPassword;
    }

    /**
     * Returns proxy server port
     */
    public int getProxyPort() {
	return proxyPort;
    }

    /**
     * [OPTIONAL] - Returns proxy user
     */
    public String getProxyUser() {
	return proxyUser;
    }

    /**
     * Proxy server IP address or hostname
     * 
     * @param proxyHost
     *            Proxy server IP address or hostname
     */
    public void setProxyHost(String proxyHost) {
	this.proxyHost = proxyHost;
    }

    /**
     * [OPTIONAL] - Proxy server user password
     * 
     * @param proxyPassword
     *            Proxy server user password
     */
    public void setProxyPassword(String proxyPassword) {
	this.proxyPassword = proxyPassword;
    }

    /**
     * Proxy server port
     * 
     * @param proxyPort
     *            Proxy server port
     */
    public void setProxyPort(int proxyPort) {
	this.proxyPort = proxyPort;
    }

    /**
     * [OPTIONAL] - Proxy user
     * 
     * @param proxyUser
     *            Proxy server user
     */
    public void setProxyUser(String proxyUser) {
	this.proxyUser = proxyUser;
    }
}
