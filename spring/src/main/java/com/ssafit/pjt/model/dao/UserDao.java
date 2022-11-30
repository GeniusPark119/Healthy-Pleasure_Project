package com.ssafit.pjt.model.dao;

import com.ssafit.pjt.model.dto.User;

public interface UserDao {
	
	//회원가입
	int insertUser(User user);
	
	//로그인?
	User selectUser(String userId);

}
