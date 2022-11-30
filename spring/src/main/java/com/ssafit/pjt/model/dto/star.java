package com.ssafit.pjt.model.dto;

public class star {
	private int starId;
	private String starName;
	
	public star() {
		
	}
	
	public int getStarId() {
		return starId;
	}
	public void setStarId(int starId) {
		this.starId = starId;
	}
	public String getStarName() {
		return starName;
	}
	public void setStarName(String starName) {
		this.starName = starName;
	}
	@Override
	public String toString() {
		return "star [starId=" + starId + ", starName=" + starName + "]";
	}

}
