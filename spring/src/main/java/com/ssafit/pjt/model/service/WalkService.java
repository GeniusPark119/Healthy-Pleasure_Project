package com.ssafit.pjt.model.service;

import java.util.List;

import com.ssafit.pjt.model.dto.Walk;

public interface WalkService {

	//게시글 작성
	int registWalk(Walk walk);
	
	//특정 게시글 불러오기
	Walk getWalk(int walkSeq);
	
	//게시글 목록 불러오기
	List<Walk> getWalkAll(int userSeq);
	
	//게시글 수정하기
	int modifyWalk(Walk walk);
	
	//게시글 삭제하기
	int deleteWalk(int walkSeq);
	
}
