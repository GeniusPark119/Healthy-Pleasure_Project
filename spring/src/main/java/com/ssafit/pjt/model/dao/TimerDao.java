package com.ssafit.pjt.model.dao;

import java.util.List;
import java.util.Map;

import com.ssafit.pjt.model.dto.Timer;

public interface TimerDao {
	
	//시간 입력하기
	int insertTime(Timer timer);
	
	//시간 불러오기
	List<Map<String, Object>> selectAllTimer(int userSeq);
	
	//명상 주소 불러오기
	String selectUrl();

}
