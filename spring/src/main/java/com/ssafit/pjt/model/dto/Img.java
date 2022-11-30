package com.ssafit.pjt.model.dto;

import org.springframework.web.multipart.MultipartFile;

public class Img {
	
	private MultipartFile img;
	private String imgUri;
	private String imgName;
	public MultipartFile getImg() {
		return img;
	}
	public void setImg(MultipartFile img) {
		this.img = img;
	}
	public String getImgUri() {
		return imgUri;
	}
	public void setImgUri(String imgUri) {
		this.imgUri = imgUri;
	}
	public String getImgName() {
		return imgName;
	}
	public void setImgName(String imgName) {
		this.imgName = imgName;
	}
	@Override
	public String toString() {
		return "Img [img=" + img + ", imgUri=" + imgUri + ", imgName=" + imgName + "]";
	}

}
