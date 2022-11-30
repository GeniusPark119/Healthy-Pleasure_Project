package com.ssafit.pjt.model.dto;

import org.springframework.web.multipart.MultipartFile;

public class Board {
	protected String title;
	protected String content;
	protected String imgName;
	protected String imgUri;
	protected String regDate;
	protected int userSeq;
	protected MultipartFile img;
	protected String yearMonth;


	public String getYearMonth() {
	    return yearMonth;
	}
	public void setYearMonth(String yearMonth) {
	    this.yearMonth = yearMonth;
	}

	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getImgName() {
		return imgName;
	}
	public void setImgName(String imgName) {
		this.imgName = imgName;
	}
	public String getImgUri() {
		return imgUri;
	}
	public void setImgUri(String imgUri) {
		this.imgUri = imgUri;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	public int getUserSeq() {
		return userSeq;
	}
	public void setUserSeq(int userSeq) {
		this.userSeq = userSeq;
	}
	public MultipartFile getImg() {
		return img;
	}
	public void setImg(MultipartFile img) {
		this.img = img;
	}

	
	
	
	

}
