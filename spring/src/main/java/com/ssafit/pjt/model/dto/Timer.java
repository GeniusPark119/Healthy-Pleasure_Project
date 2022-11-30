package com.ssafit.pjt.model.dto;

public class Timer {
	private int timeSeq;
	private int time; //초로 받아올것
	private int userSeq;
	private String regDate;
	
	public Timer() {
		
	}
	
	public int getTimeSeq() {
		return timeSeq;
	}
	public void setTimeSeq(int timeSeq) {
		this.timeSeq = timeSeq;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public int getUserSeq() {
		return userSeq;
	}
	public void setUserSeq(int userSeq) {
		this.userSeq = userSeq;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return "Timer [timeSeq=" + timeSeq + ", time=" + time + ", userSeq=" + userSeq + ", regDate=" + regDate + "]";
	}
	
	

}
