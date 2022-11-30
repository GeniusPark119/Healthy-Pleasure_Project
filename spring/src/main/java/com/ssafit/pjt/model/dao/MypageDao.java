package com.ssafit.pjt.model.dao;

import com.ssafit.pjt.model.dto.Board;
import com.ssafit.pjt.model.dto.Contributor;

public interface MypageDao {

	// 오늘 수행한 미션 개수
	int selectCnt(Board board);

	// 이번달 수행한 미션 개수
	int selectAllCnt(int userSeq);

	// 별자리 운세 //자바스크립트에서 하루에 한 번만 누를 수 있는 버튼으로 1~100사이 숫자 넘겨줘
	String selectStr(int starId);

	String selectStar(int starId);

	// mbti 운동 추천
	String selectMbti(String mbti);

	// 기부하면 다 날려
	int deleteSkyBoard(int userSeq);

	int insertContributor(Contributor contributor);

}
