package com.globallink.api.model;

public class TMProfile {
    private String password;
    private String TMName;
    private String url;
    private String username;

    public TMProfile(String url, String username, String password, String tMName) {
	super();
	this.url = url;
	this.username = username;
	this.password = password;
	TMName = tMName;
    }

    public String getPassword() {
	return password;
    }

    public String getTMName() {
	return TMName;
    }

    public String getUrl() {
	return url;
    }

    public String getUsername() {
	return username;
    }

}
