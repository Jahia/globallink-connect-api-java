package com.globallink.api.pss.rewriters;

import java.util.ArrayList;
import java.util.List;

import org.jsoup.nodes.Document;

import com.globallink.api.pss.DownloadedFileInfo;

public class CompositeRewriter implements IFileTagRewriter {
    private List<IFileTagRewriter> rewriters;

    public CompositeRewriter() {
	rewriters = new ArrayList<IFileTagRewriter>();
    }

    public void Add(IFileTagRewriter rewriter) {
	rewriters.add(rewriter);
    }

    public void Remove(IFileTagRewriter rewriter) {
	rewriters.remove(rewriter);
    }

    public List<DownloadedFileInfo> RewriteLinks(Document document) {
	List<DownloadedFileInfo> fileInfos = new ArrayList<DownloadedFileInfo>();

	for (IFileTagRewriter rewriter : rewriters) {
	    fileInfos.addAll(rewriter.RewriteLinks(document));
	}

	return fileInfos;
    }
}
