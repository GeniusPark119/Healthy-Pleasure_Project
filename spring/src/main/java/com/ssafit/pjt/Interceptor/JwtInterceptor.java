package com.ssafit.pjt.Interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import com.ssafit.pjt.util.JwtUtil;

//로그인이 필요한 곳에 가면 토큰 내놔!! 역할
//토큰이 유효한지 아닌지 판단함

@Component
public class JwtInterceptor implements HandlerInterceptor{
	
	private static final String HEADER_AUTH = "access-token";
	
	@Autowired
	private JwtUtil jwtUtil;
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		if(request.getMethod().equals("OPTIONS")) return true;
		
		final String token = request.getHeader(HEADER_AUTH);
		
		if(token != null) { //일단 토큰이 있다면
			jwtUtil.valid(token);
			
			return true;
		}
		
		throw new Exception("유효하지 않은 접근입니다");
		
	}
	

}

