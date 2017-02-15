package com.globallink.api.model;

public class LanguagePhaseInfo {

    private long phaseStartDate;
    private String[] sourceFileList;
    private WordCount tmStatistics;

    public LanguagePhaseInfo(org.gs4tr.projectdirector.model.dto.xsd.LanguagePhaseInfo languagePhaseInfo) {
	this.phaseStartDate = languagePhaseInfo.getPhaseStartDate().getDate();
	this.sourceFileList = languagePhaseInfo.getSourceFileList().toArray(new String[languagePhaseInfo.getSourceFileList().size()]);
	this.tmStatistics = new WordCount(languagePhaseInfo.getTmStatistics().getInContextMatchWordCount(), languagePhaseInfo.getTmStatistics().getOneHundredMatchWordCount(), languagePhaseInfo.getTmStatistics().getRepetitionWordCount(), languagePhaseInfo.getTmStatistics().getNoMatchWordCount(), languagePhaseInfo.getTmStatistics().getTotalWordCount());
    }

    public long getPhaseStartDate() {
	return phaseStartDate;
    }

    public String[] getSourceFileList() {
	return sourceFileList;
    }

    public WordCount getTmStatistics() {
	return tmStatistics;
    }

    public void setPhaseStartDate(long phaseStartDate) {
	this.phaseStartDate = phaseStartDate;
    }

    public void setSourceFileList(String[] sourceFileList) {
	this.sourceFileList = sourceFileList;
    }

    public void setTmStatistics(WordCount tmStatistics) {
	this.tmStatistics = tmStatistics;
    }
}
