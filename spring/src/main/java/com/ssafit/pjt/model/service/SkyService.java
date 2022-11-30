package com.ssafit.pjt.model.service;

import java.net.MalformedURLException;
import java.util.List;
import java.util.Map;

import org.springframework.core.io.Resource;

import com.ssafit.pjt.model.dto.Sky;

public interface SkyService {
	
	//게시글 작성
	int writeSky(Sky sky);
	//특정 게시글 불러오기
	Sky getSky(int skySeq);
	
	//게시글 목록 불러오기
	List<Sky> getAllSky(int userSeq);
	
	//게시글 수정하기
	int modifySky(Sky sky);
	
	//게시글 삭제하기
	int removeSky(int skySeq);
//	
//	Map<String, Object> getfile(String imgName);
//
//	Resource load(String imgName);
}
