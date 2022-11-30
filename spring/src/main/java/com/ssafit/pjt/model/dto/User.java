package com.ssafit.pjt.model.dto;

import java.sql.Date;

public class User {
	private int userSeq; //유저 고유 번호
	private String userId; //유저 아이디
	private String userPass; //유저 비밀번호
	private String userName; //유저 이름
	private String nickname; //유저 별명
	private Date birth; //유저 생일
	private String mbti; //유저 mbti
	private String email; //유저 이메일
	private int starId; //유저 별자리
	
	public User() {
		
	}
	
	public int getUserSeq() {
		return userSeq;
	}
	public void setUserSeq(int userSeq) {
		this.userSeq = userSeq;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public String getMbti() {
		return mbti;
	}
	public void setMbti(String mbti) {
		this.mbti = mbti;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}


	public int getStarId() {
		return starId;
	}

	public void setStarId(int starId) {
		this.starId = starId;
	}

	@Override
	public String toString() {
		return "User [userSeq=" + userSeq + ", userId=" + userId + ", userPass=" + userPass + ", userName=" + userName
				+ ", nickname=" + nickname + ", birth=" + birth + ", mbti=" + mbti + ", email=" + email + ", starId="
				+ starId + "]";
	}

	
	
	
}
