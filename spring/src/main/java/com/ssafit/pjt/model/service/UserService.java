package com.ssafit.pjt.model.service;

import com.ssafit.pjt.model.dto.User;

public interface UserService {
	
	//회원가입
	int registUser(User user);
	
	//로그인을 위해 회원을 찾아옵니다
	User getUser(String userId);

}
