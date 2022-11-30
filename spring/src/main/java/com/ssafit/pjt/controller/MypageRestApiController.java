package com.ssafit.pjt.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafit.pjt.model.dto.Contributor;
import com.ssafit.pjt.model.service.MypageService;

@RestController
@RequestMapping("/mypageapi")
@CrossOrigin("*")
public class MypageRestApiController {

	@Autowired
	MypageService mservice;

	@PostMapping("/{userSeq}")
	public ResponseEntity<?> registContributorUser(@PathVariable int userSeq) {
		Contributor contributor = new Contributor();
		contributor.setUserSeq(userSeq);
		
	    Date date2 = new Date();
	    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM");
	    String yearMonth = simpleDateFormat.format(date2);
		contributor.setYearMonth(yearMonth);
		int result = mservice.registContributor(contributor);
		return ResponseEntity.status(HttpStatus.CREATED).body(result);
	}
}
