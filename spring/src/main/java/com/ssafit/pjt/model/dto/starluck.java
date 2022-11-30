package com.ssafit.pjt.model.dto;

public class starluck {
	
	private int luckId;
	private String luckMsg;
	
	public starluck() {
		
	}
	
	public int getLuckId() {
		return luckId;
	}
	public void setLuckId(int luckId) {
		this.luckId = luckId;
	}
	public String getLuckMsg() {
		return luckMsg;
	}
	public void setLuckMsg(String luckMsg) {
		this.luckMsg = luckMsg;
	}

	@Override
	public String toString() {
		return "starluck [luckId=" + luckId + ", luckMsg=" + luckMsg + "]";
	}
	
	
}
