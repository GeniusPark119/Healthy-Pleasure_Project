package com.ssafit.pjt.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafit.pjt.model.dao.MypageDao;
import com.ssafit.pjt.model.dto.Board;
import com.ssafit.pjt.model.dto.Contributor;

@Service
public class MypageServiceImpl implements MypageService{

	
	@Autowired
	MypageDao mypageDao;
	
	@Override
	public int getCnt(Board board) {
		return mypageDao.selectCnt(board);
	}

	@Override
	public int getAllCnt(int userSeq) {
		return mypageDao.selectAllCnt(userSeq);
	}

	@Override
	public String getMbti(String mbti) {
		// TODO Auto-generated method stub
		return mypageDao.selectMbti(mbti);
	}

	@Override
	public String getStr(int starId) {
		return mypageDao.selectStr(starId);
	}

	@Override
	public String getStar(int starId) {
		return mypageDao.selectStar(starId);
	}

	@Override
	public int removeSkyBoard(int userSeq) {
		return mypageDao.deleteSkyBoard(userSeq);
	}
	
    @Override
    public int registContributor(Contributor contributor) {
        return mypageDao.insertContributor(contributor);
    }

}
