package com.globallink.api;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import com.globallink.api.pss.PageDownloader;
import com.globallink.api.pss.rewriters.CompositeRewriter;
import com.globallink.api.pss.rewriters.CssRewriter;
import com.globallink.api.pss.rewriters.ImgTagRewriter;
import com.globallink.api.pss.rewriters.ScriptRewriter;

public class GLPss {

    private static File tempFolder;
    private static List<String> fileList = new ArrayList<String>();

    public static String CreateZip(String url, File outputFilePath) throws Exception {
	String result = null;
	try {
	    tempFolder = outputFilePath;
	    CompositeRewriter compositeRewriter = new CompositeRewriter();
	    compositeRewriter.Add(new CssRewriter());
	    compositeRewriter.Add(new ScriptRewriter());
	    compositeRewriter.Add(new ImgTagRewriter());
	    PageDownloader downloader = new PageDownloader(compositeRewriter, tempFolder.getAbsolutePath());
	    downloader.DownloadPageWithResources(url);

	    result = doZip();
	} finally {
	    if (tempFolder != null && tempFolder.exists()) {
		tempFolder.delete();
	    }
	}
	return result;
    }

    public static String CreateZip(String url) throws Exception {
	return CreateZip(url, Files.createTempDirectory("pss").toFile());
    }

    public static InputStream CreateZipAsInputStream(String url) throws Exception {
	String zipPath = CreateZip(url, Files.createTempDirectory("pss").toFile());
	return new FileInputStream(zipPath);
    }

    private static String doZip() {

	String zipFile = tempFolder.getParent() + File.separator + tempFolder.getName() + ".zip";
	generateFileList(tempFolder);
	byte[] buffer = new byte[1024];
	FileOutputStream fos = null;
	ZipOutputStream zos = null;
	try {
	    fos = new FileOutputStream(zipFile);
	    zos = new ZipOutputStream(fos);

	    FileInputStream in = null;

	    for (String file : fileList) {
		ZipEntry ze = new ZipEntry(file);
		zos.putNextEntry(ze);
		try {
		    in = new FileInputStream(tempFolder + File.separator + file);
		    int len;
		    while ((len = in.read(buffer)) > 0) {
			zos.write(buffer, 0, len);
		    }
		} finally {
		    in.close();
		}
	    }

	    zos.closeEntry();

	} catch (IOException ex) {
	    ex.printStackTrace();
	} finally {
	    try {
		zos.close();
	    } catch (IOException e) {
		e.printStackTrace();
	    }
	}

	return zipFile;
    }

    private static void generateFileList(File node) {
	if (node.isFile()) {
	    fileList.add(generateZipEntry(node.toString()));
	}

	if (node.isDirectory()) {
	    String[] subNote = node.list();
	    for (String filename : subNote) {
		generateFileList(new File(node, filename));
	    }
	}
    }

    private static String generateZipEntry(String file) {
	return file.substring(tempFolder.getAbsolutePath().length() + 1, file.length());
    }

}
