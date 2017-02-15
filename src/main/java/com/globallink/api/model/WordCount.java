package com.globallink.api.model;

public class WordCount {
    private int exact_100;
    private int fuzzy;
    private int inContextMatch;
    private int nomatch;
    private int repetitions;
    private int total;

    public WordCount(int _inContextMatch, int _exact_100, int _repetitions,
	    int _nomatch, int _total) {
	super();
	this.inContextMatch = _inContextMatch;
	this.exact_100 = _exact_100;
	this.fuzzy = _total - _inContextMatch - _exact_100 - _repetitions - _nomatch;
	this.repetitions = _repetitions;
	this.nomatch = _nomatch;
	this.total = _total;
    }

    public int getExact_100() {
	return exact_100;
    }

    public int getFuzzy() {
	return fuzzy;
    }

    public int getInContextMatch() {
	return inContextMatch;
    }

    public int getNomatch() {
	return nomatch;
    }

    public int getRepetitions() {
	return repetitions;
    }

    public int getTotal() {
	return total;
    }

    public void setExact_100(int exact_100) {
	this.exact_100 = exact_100;
    }

    public void setFuzzy(int fuzzy) {
	this.fuzzy = fuzzy;
    }

    public void setInContextMatch(int inContextMatch) {
	this.inContextMatch = inContextMatch;
    }

    public void setNomatch(int nomatch) {
	this.nomatch = nomatch;
    }

    public void setRepetitions(int repetitions) {
	this.repetitions = repetitions;
    }

    public void setTotal(int total) {
	this.total = total;
    }
}
