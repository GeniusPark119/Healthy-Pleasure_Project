package com.ssafit.pjt.model.service;

import com.ssafit.pjt.model.dto.Board;
import com.ssafit.pjt.model.dto.Contributor;


public interface MypageService {
	
	//오늘 수행한 미션 개수
	int getCnt(Board board);
	
	//이번달 수행한 미션 개수
	int getAllCnt(int userSeq);
	
	//별자리 운세
	String getStr(int starId);
	
	String getStar(int starId);
	
	//mbti 운동 추천
	String getMbti(String mbti);
	
	//기부하면 다 날려
	int removeSkyBoard(int userSeq);
	
	 int registContributor(Contributor contributor);


}
