package com.ssafit.pjt.model.dto;

public class Walk extends Board{
	
	private int walkSeq;
	
	public Walk() {
		
	}

	public int getWalkSeq() {
		return walkSeq;
	}

	public void setWalkSeq(int walkSeq) {
		this.walkSeq = walkSeq;
	}

	@Override
	public String toString() {
		return "Walk [walkSeq=" + walkSeq + ", title=" + title + ", content=" + content + ", imgName=" + imgName
				+ ", imgUri=" + imgUri + ", regDate=" + regDate + ", userSeq=" + userSeq + "]";
	}


	

}
