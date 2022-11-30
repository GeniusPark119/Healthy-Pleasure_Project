package com.ssafit.pjt.model.dto;

public class Sky extends Board{
	
	private int skySeq;
	
	public Sky() {
		
	}

	public int getSkySeq() {
		return skySeq;
	}

	public void setSkySeq(int skySeq) {
		this.skySeq = skySeq;
	}

	@Override
	public String toString() {
		return "Sky [skySeq=" + skySeq + ", title=" + title + ", content=" + content + ", imgName=" + imgName
				+ ", imgUri=" + imgUri + ", regDate=" + regDate + ", userSeq=" + userSeq + ", img=" + img
				+ ", yearMonth=" + yearMonth + "]";
	}





}
