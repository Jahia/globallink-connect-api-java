package com.globallink.api.pss;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;

import org.jsoup.nodes.Document;

public class FileDownloader {

    public static void download(String urlStr, File destination) throws Exception {
	if(urlStr!=null && urlStr.trim().length()>0){
	    try{
		destination.getParentFile().mkdirs();
        	URL url = new URL(urlStr);
                URLConnection c = url.openConnection();
                c.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/65.0.3325.181 Safari/537.36");

                InputStream in = new BufferedInputStream(c.getInputStream());
        	FileOutputStream fos = new FileOutputStream(destination);
        	byte[] buf = new byte[1024];
        	int n = 0;
        	while (-1!=(n=in.read(buf)))
        	{
        	   fos.write(buf, 0, n);
        	}
        	fos.close();
        	in.close();
	    } catch(Exception e){
	    }
	}
    }
    
    public static String downloadAsString(String urlStr) throws Exception {
	if(urlStr!=null && urlStr.trim().length()>0){
	    try{
        	URL url = new URL(urlStr);
        	InputStream in = new BufferedInputStream(url.openStream());
        	ByteArrayOutputStream fos = new ByteArrayOutputStream();
        	byte[] buf = new byte[1024];
        	int n = 0;
        	while (-1!=(n=in.read(buf)))
        	{
        	   fos.write(buf, 0, n);
        	}
        	fos.close();
        	in.close();
        	return new String(fos.toByteArray());
	    } catch(Exception e){
	    }
	}
	return null;
    }
    
    public static void save(String content, File file) throws FileNotFoundException {
	file.getParentFile().mkdirs();
	try(  PrintWriter out = new PrintWriter( file )  ){
	    out.println( content );
	}
    }
    
    public static void save(Document doc, File file) throws FileNotFoundException {
	file.getParentFile().mkdirs();
	try(  PrintWriter out = new PrintWriter( file )  ){
	    out.println( doc.html() );
	}
    }
}
