package com.ssafit.pjt.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssafit.pjt.model.dao.UserDao;
import com.ssafit.pjt.model.dto.User;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserDao userdao;
	
	//회원가입
	
	@Override
	@Transactional
	public int registUser(User user) {
		return userdao.insertUser(user);
	}

	@Override
	public User getUser(String userId) {
		return userdao.selectUser(userId);
	}
	
	

}
