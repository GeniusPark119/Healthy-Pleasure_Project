package com.ssafit.pjt.model.dto;

public class Article {
	private int articleId;
	private String mbti;
	private String articleUrl;
	
	public Article() {
		
	}

	public int getArticleId() {
		return articleId;
	}

	public void setArticleId(int articleId) {
		this.articleId = articleId;
	}

	public String getMbti() {
		return mbti;
	}

	public void setMbti(String mbti) {
		this.mbti = mbti;
	}

	public String getArticleUrl() {
		return articleUrl;
	}

	public void setArticleUrl(String articleUrl) {
		this.articleUrl = articleUrl;
	}

	@Override
	public String toString() {
		return "Article [articleId=" + articleId + ", mbti=" + mbti + ", articleUrl=" + articleUrl + "]";
	}
	
	

}
