package com.ssafit.pjt.model.dto;

public class Contributor {

	private int contributorSeq;
	private int userSeq;
	private String yearMonth;

	public Contributor() {
	    
	}

	public int getContributorSeq() {
	    return contributorSeq;
	}
	public void setContributorSeq(int contributorSeq) {
	    this.contributorSeq = contributorSeq;
	}
	public int getUserSeq() {
	    return userSeq;
	}
	public void setUserSeq(int userSeq) {
	    this.userSeq = userSeq;
	}
	public String getYearMonth() {
	    return yearMonth;
	}
	public void setYearMonth(String yearMonth) {
	    this.yearMonth = yearMonth;
	}

	@Override
	public String toString() {
	    return "Contributor [contributorSeq=" + contributorSeq + ", userSeq=" + userSeq + ", yearMonth=" + yearMonth
	            + "]";
	}
	
}
