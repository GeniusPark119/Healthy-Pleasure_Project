package com.ssafit.pjt.model.dao;

import java.util.List;
import java.util.Map;

import com.ssafit.pjt.model.dto.Sky;

public interface SkyDao {
	
	//게시글 작성
	int insertSky(Sky sky);
	//특정 게시글 불러오기
	Sky selectSky(int skySeq);
	
	//게시글 목록 불러오기
	List<Sky> selectAllSky(int userSeq);
	
	//게시글 수정하기
	int updateSky(Sky sky);
	
	//게시글 삭제하기
	int deleteSky(int skySeq);
	
	//파일 정보 가져오기
	Map<String, Object> selectfile(String imgName);

}
