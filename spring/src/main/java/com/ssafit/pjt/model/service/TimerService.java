package com.ssafit.pjt.model.service;

import java.util.List;
import java.util.Map;

import com.ssafit.pjt.model.dto.Timer;

public interface TimerService {

	//시간 입력하기
	int writeTime(Timer timer);
	
	//시간 불러오기
	List<Map<String, Object>> getAllTime(int userSeq);
	
	String getUrl();
	
}
