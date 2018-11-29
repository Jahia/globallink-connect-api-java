package com.globallink.api.pss;

import java.io.File;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import com.globallink.api.pss.DownloadedFileInfo.Types;
import com.globallink.api.pss.rewriters.IFileTagRewriter;
import com.helger.css.ECSSVersion;
import com.helger.css.decl.CSSDeclaration;
import com.helger.css.decl.CSSExpressionMemberTermURI;
import com.helger.css.decl.CascadingStyleSheet;
import com.helger.css.decl.ICSSTopLevelRule;
import com.helger.css.decl.visit.CSSVisitor;
import com.helger.css.decl.visit.DefaultCSSUrlVisitor;
import com.helger.css.reader.CSSReader;
import com.helger.css.reader.errorhandler.DoNothingCSSParseErrorHandler;

public class PageDownloader {

    private final String INDEX_PAGE_NAME = "index.html";

    private final IFileTagRewriter rewriter;

    private String siteRoot;
    private String locationPath;

    private HashMap<String, DownloadedFileInfo> processedUrls;

    public PageDownloader(IFileTagRewriter rewriter, String downloadsLocation) {
	this.rewriter = rewriter;
	locationPath = downloadsLocation;
	if (!locationPath.endsWith(File.pathSeparator)) {
	    locationPath = locationPath + File.separatorChar;
	}
	this.processedUrls = new HashMap<String, DownloadedFileInfo>();
    }

    public void DownloadPageWithResources(String url) throws Exception {
	siteRoot = url;

	Document doc = Jsoup.connect(url).userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/65.0.3325.181 Safari/537.36").ignoreHttpErrors(true).ignoreContentType(true).get();

	List<DownloadedFileInfo> fileInfos = RewriteTags(doc);

	FileDownloader.save(doc, new File(locationPath + INDEX_PAGE_NAME));

	DownloadFromFileInfos(fileInfos);
    }

    private List<DownloadedFileInfo> RewriteTags(Document doc) {
	List<DownloadedFileInfo> fileInfos = new ArrayList<DownloadedFileInfo>();

	fileInfos.addAll(rewriter.RewriteLinks(doc));

	return fileInfos;
    }

    private List<DownloadedFileInfo> processCss(final DownloadedFileInfo fileInfo, File file) throws Exception {
	final List<DownloadedFileInfo> additionalFileInfos = new ArrayList<DownloadedFileInfo>();

	final URI uri = URI.create(fileInfo.FilePath);
	String cssContent = FileDownloader.downloadAsString(uri.toString());
	if (cssContent == null) {
	    return additionalFileInfos;
	}
	try {
	    final CascadingStyleSheet aCSS = CSSReader.readFromString(cssContent, StandardCharsets.UTF_8,
		    ECSSVersion.CSS30, new DoNothingCSSParseErrorHandler());
	    if (aCSS != null) {
		final String root = siteRoot.endsWith("/") ? siteRoot.substring(0, siteRoot.length() - 1) : siteRoot;

		CSSVisitor.visitCSSUrl(aCSS, new DefaultCSSUrlVisitor() {
		    int j = 1000;

		    @Override
		    public void onUrlDeclaration(ICSSTopLevelRule aTopLevelRule, CSSDeclaration aDeclaration,
			    CSSExpressionMemberTermURI aURITerm) {
			try {
			    if (!aURITerm.getURI().isDataURL()) {
				j++;
				String url = aURITerm.getURIString();
				if (url.startsWith("//")) {
				    url = root.substring(0, root.indexOf(':')) + ":" + url;
				} else if (url.startsWith("/")) {
				    int endIndex = root.indexOf('/', 10);
				    url = root.substring(0, endIndex) + url;
				} else if (url.indexOf("://") > 0) {
				    url = aURITerm.getURIString();
				} else {
				    url = root + aURITerm.getURIString();
				}
				
				if (!processedUrls.containsKey(url)) {
				    DownloadedFileInfo newInfo = new DownloadedFileInfo(url, aURITerm.getURIString(),
					    Types.CSSIMAGE, j);
				    additionalFileInfos.add(newInfo);
				    aURITerm.setURIString(newInfo.ResolvedFilePath);
				    processedUrls.put(url, newInfo);
				} else {
				    additionalFileInfos.add(processedUrls.get(url));
				    aURITerm.setURIString(processedUrls.get(url).ResolvedFilePath);
				}
			    }
			} catch (Exception e) {
			}
		    }
		});
	    }
	} catch (Exception e) {
	}

	for (DownloadedFileInfo afi : additionalFileInfos) {
	    if(afi.type.equals(Types.CSSIMAGE)){
		cssContent = cssContent.replaceAll(afi.originalEntryUrl, "../"+afi.ResolvedFilePath);
	    } else {
		cssContent = cssContent.replaceAll(afi.originalEntryUrl, afi.ResolvedFilePath);
	    }
	}
	FileDownloader.save(cssContent, file);

	return additionalFileInfos;
    }

    private void DownloadFromFileInfos(List<DownloadedFileInfo> fileInfos) throws Exception {
	final List<DownloadedFileInfo> additionalFileInfos = new ArrayList<DownloadedFileInfo>();
	for (DownloadedFileInfo fileInfo : fileInfos) {
	    URI uri = null;
	    try {
		uri = URI.create(fileInfo.FilePath);
	    } catch (Exception e) {
		continue;
	    }

	    File file = new File(locationPath + fileInfo.ResolvedFilePath);
	    if (fileInfo.type != Types.CSS) {
		FileDownloader.download(uri.toString(), file);
	    } else {
		additionalFileInfos.addAll(processCss(fileInfo, file));
	    }
	}
	
	for (DownloadedFileInfo fileInfo : additionalFileInfos) {
	    URI uri = URI.create(fileInfo.FilePath);
	    File file = new File(locationPath + fileInfo.ResolvedFilePath);
	    FileDownloader.download(uri.toString(), file);
	}

    }

}
