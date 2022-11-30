package com.ssafit.pjt.model.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafit.pjt.model.dao.TimerDao;
import com.ssafit.pjt.model.dto.Timer;

@Service
public class TimerServiceImpl implements TimerService{
	
	@Autowired
	TimerDao timerdao;

	@Override
	public int writeTime(Timer timer) {
		return timerdao.insertTime(timer);
	}

	@Override
	public List<Map<String, Object>> getAllTime(int userSeq) {
		System.out.println("impl: "+timerdao.selectAllTimer(userSeq));
		return timerdao.selectAllTimer(userSeq);
	}

	@Override
	public String getUrl() {
		return timerdao.selectUrl();
	}
	
	

}
