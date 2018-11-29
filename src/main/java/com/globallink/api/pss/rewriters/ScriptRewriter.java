package com.globallink.api.pss.rewriters;

import java.util.ArrayList;
import java.util.List;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.globallink.api.pss.DownloadedFileInfo;
import com.globallink.api.pss.DownloadedFileInfo.Types;

public class ScriptRewriter implements IFileTagRewriter {
    public List<DownloadedFileInfo> RewriteLinks(Document document)
    {
        List<DownloadedFileInfo> fileInfos = new ArrayList<DownloadedFileInfo>();
        Elements els = document.select("script[src]");
        int i=0;
        for(Element el : els){
            i++;
        	String sourceUrl = el.attr("abs:src");
                DownloadedFileInfo fileInfo = new DownloadedFileInfo(sourceUrl, Types.SCRIPT, i);
                el.attr("src", fileInfo.ResolvedFilePath);
                fileInfos.add(fileInfo);
        }

        return fileInfos;
    }
}