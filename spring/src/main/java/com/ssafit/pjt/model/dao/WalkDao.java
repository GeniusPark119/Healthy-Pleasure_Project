package com.ssafit.pjt.model.dao;

import java.util.List;

import com.ssafit.pjt.model.dto.Walk;

public interface WalkDao {
	
	//게시글 작성
	int insertWalk(Walk walk);
	
	//특정 게시글 불러오기
	Walk selectWalk(int walkSeq);
	
	//회원별 게시글 목록 불러오기
	List<Walk> selectWalkAll(int userSeq);
	
	
	//게시글 수정하기
	int updateWalk(Walk walk);
	
	
	//게시글 삭제하기
	int deleteWalk(int walkSeq);
}
