package com.ssafit.pjt.controller;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafit.pjt.model.dto.Board;
import com.ssafit.pjt.model.dto.User;
import com.ssafit.pjt.model.service.MypageService;
import com.ssafit.pjt.model.service.UserService;
import com.ssafit.pjt.util.JwtUtil;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/userapi")
@CrossOrigin("*")
public class UserRestApiController {

	@Autowired
	UserService uservice;
	
	@Autowired
	MypageService mservice;
				
	@Autowired
	private JwtUtil jwtUtil;
	// 회원가입
	@PostMapping("/user")
	@ApiOperation(value = "회원가입", notes = "User객체를 이용하여 회원가입한다", response = User.class)
	public ResponseEntity<Integer> joinUser(User user) {
		System.out.println(user.toString());
		int result = uservice.registUser(user);

		return ResponseEntity.status(HttpStatus.CREATED).body(result);
	}

	private static final String SUCCESS = "success";
	private static final String FAIL = "fail";

	// 로그인
	@GetMapping("/login")
	public ResponseEntity<Map<String, Object>> login(User user) {

		System.out.println(user.toString());
		HashMap<String, Object> result = new HashMap<>();
		HttpStatus status = null;
		// user를 받아서 DB에서 확인을 해야죠.!!!!!!
		// service -> dao -> db -> 그결과를 가지고 뚜따뚜따 해야함
		try {
			if (user.getUserId() != null && uservice.getUser(user.getUserId()).getUserPass().equals(user.getUserPass())) {
				Map<String, Object> loginuser = new HashMap<String, Object>();
				loginuser.put("id", user.getUserId());
				User user2 = uservice.getUser(user.getUserId());
				result.put("nickname", user2.getNickname());
				System.out.println("cnt: "+mservice.getAllCnt(user2.getUserSeq()));
				result.put("success", 100);
				Board board = new Board();
				board.setUserSeq(user2.getUserSeq());
				board.setRegDate(LocalDate.now().toString());
				result.put("today", mservice.getCnt(board));
				result.put("luck", mservice.getStr(user2.getStarId()));
				//유저정보 보낼게
				result.put("userSeq", user2.getUserSeq());
				result.put("userMbti", user2.getMbti());
				result.put("userStar", mservice.getStar(user2.getStarId()));
				
				result.put("access-token", jwtUtil.createToken(loginuser));
				result.put("message", SUCCESS);
				status = HttpStatus.ACCEPTED;
			} else {
				result.put("message", FAIL);
				status = HttpStatus.ACCEPTED;
			}
		} catch (UnsupportedEncodingException e) {
			result.put("message", FAIL);
			status = HttpStatus.INTERNAL_SERVER_ERROR;
		}
		return new ResponseEntity<Map<String, Object>>(result, status);
	}

//	@GetMapping("/logout")
//	public ResponseEntity<?> logout(HttpSession session) {
//		session.invalidate();
//		return ResponseEntity.status(HttpStatus.OK).body(SUCCESS);
//	}
	
	//기부하면 다 날려
	@DeleteMapping("/user/{userSeq}")
	public ResponseEntity<?> removeAllSkyBoardEachUser(@PathVariable int userSeq){
		int result = mservice.removeSkyBoard(userSeq);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).body(result);
	}

//	@PostMapping("/login")
//	@ApiOperation(value = "로그인", notes="아이디와 비밀번호를 입력하여 로그인 한다")
//	public ResponseEntity<Map<String, Object>> login(User user) {
//		HashMap<String, Object> result = new HashMap<>();
//		HttpStatus status = null;
//		
//		// 유저가 존재하고 패스워드가 맞으면
//		try {
//			if (uservice.getUser(user.getUserId()) != null
//					&& uservice.getUser(user.getUserId()).getUserPass().equals(user.getUserPass())) {
//				result.put("access-token", jwtUtil.createToken("id", user.getUserId()));
//				result.put("message", SUCCESS);
//				status = HttpStatus.ACCEPTED;
//			} else {
//				result.put("message", FAIL);
//				status = HttpStatus.ACCEPTED;
//			}
//		} catch (UnsupportedEncodingException e) {
//			result.put("message", FAIL);
//			status = HttpStatus.INTERNAL_SERVER_ERROR;
//		}
//		
//		return new ResponseEntity<Map<String, Object>>(result, status);
//	}

}
