package com.globallink.api.pss;

import com.helger.commons.random.RandomHelper;

public class DownloadedFileInfo {
    public String ResolvedFilePath;
    public String FilePath;
    public String originalEntryUrl;
    public Types type;
    public int index;

    public enum Types {
	IMAGE, CSSIMAGE, SCRIPT, CSS
    }

    public DownloadedFileInfo(String filePath, String originalEntryUrl, Types type, int index) {
	this.type = type;
	this.index = index;
	FilePath = filePath;
	this.originalEntryUrl = originalEntryUrl;

	ResolvedFilePath = GetFileName(FilePath);
    }

    public DownloadedFileInfo(String filePath, Types type, int index) {
	this.type = type;
	this.index = index;
	FilePath = filePath;

	ResolvedFilePath = GetFileName(FilePath);
    }

    private String GetFileName(String url) {
	String fileName = url.substring(url.lastIndexOf('/') + 1);
	String outputName = fileName;
	if (fileName.indexOf('?') >= 0) {
	    if (this.type.equals(Types.CSS)) {
		outputName = "style" + index + ".css";
	    } else if (this.type.equals(Types.SCRIPT)) {
		outputName = "script" + index + ".js";
	    } else {
		if (fileName.indexOf('?') > 0) {
		    fileName = fileName.substring(0, fileName.indexOf('?'));
		}
		outputName = fileName.replaceAll("[^a-zA-Z0-9.-]", "_");
		outputName = trim(outputName, 20);
	    }
	}
	if (outputName.length() == 0) {
	    outputName = "" + RandomHelper.getRandom().nextLong();
	}
	if (this.type.equals(Types.CSS)) {
	    outputName = "css/" + outputName;
	} else if (this.type.equals(Types.SCRIPT)) {
	    outputName = "js/" + outputName;
	} else {
	    outputName = "images/" + outputName;
	}

	return outputName;
    }

    private String trim(String s, int width) {
	if (s.length() > width)
	    return s.substring(0, width - 1);
	else
	    return s;
    }
}
