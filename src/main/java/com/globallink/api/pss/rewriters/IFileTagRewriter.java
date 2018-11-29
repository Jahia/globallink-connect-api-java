package com.globallink.api.pss.rewriters;

import java.util.List;

import org.jsoup.nodes.Document;

import com.globallink.api.pss.DownloadedFileInfo;

public interface IFileTagRewriter {

    List<DownloadedFileInfo> RewriteLinks(Document document);
}
