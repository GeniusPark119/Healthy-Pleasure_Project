package com.ssafit.pjt.model.dto;

public class Meal extends Board{
	private int mealSeq;
	
	public Meal() {
		
	}

	public int getMealSeq() {
		return mealSeq;
	}

	public void setMealSeq(int mealSeq) {
		this.mealSeq = mealSeq;
	}

	@Override
	public String toString() {
		return "Meal [mealSeq=" + mealSeq + ", title=" + title + ", content=" + content + ", img=" + imgName + ", regDate="
				+ regDate + ", userSeq=" + userSeq + "]";
	}



}
