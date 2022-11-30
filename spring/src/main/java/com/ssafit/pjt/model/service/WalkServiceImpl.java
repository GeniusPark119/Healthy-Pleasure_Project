package com.ssafit.pjt.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssafit.pjt.model.dao.WalkDao;
import com.ssafit.pjt.model.dto.Walk;

@Service
public class WalkServiceImpl implements WalkService{

	@Autowired
	WalkDao walkdao;
	
	@Override
	@Transactional
	public int registWalk(Walk walk) {
		return walkdao.insertWalk(walk);
	}

	@Override
	public Walk getWalk(int walkSeq) {
		return walkdao.selectWalk(walkSeq);
	}

	@Override
	public List<Walk> getWalkAll(int userSeq) {

		return walkdao.selectWalkAll(userSeq);
	}

	@Override
	@Transactional
	public int modifyWalk(Walk walk) {
		return walkdao.updateWalk(walk);
	}

	@Override
	public int deleteWalk(int walkSeq) {
		return walkdao.deleteWalk(walkSeq);
	}
	
	

}
