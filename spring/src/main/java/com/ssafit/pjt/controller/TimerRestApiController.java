package com.ssafit.pjt.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafit.pjt.model.dto.Timer;
import com.ssafit.pjt.model.service.TimerService;

@RestController
@RequestMapping("/timeapi")
@CrossOrigin("*")
public class TimerRestApiController {
	
	@Autowired
	TimerService timerservice;
	
	@PostMapping("/timer")
	public ResponseEntity<?> registTime(Timer timer){
		System.out.println("여기오닝");
		LocalDate data = LocalDate.now();
		timer.setRegDate(data.toString());
		int result = timerservice.writeTime(timer);
		return ResponseEntity.status(HttpStatus.CREATED).body(result);
	}
	
	@GetMapping("/timer/{userSeq}")
	public ResponseEntity<?> showTimeList(@PathVariable int userSeq){
		List<Map<String, Object>> result = timerservice.getAllTime(userSeq);
		System.out.println(result.toString());
		return ResponseEntity.status(HttpStatus.OK).body(result);
	}
	
	@GetMapping("/timer")
	public ResponseEntity<?> showVideo(){
		String Url = timerservice.getUrl();
		System.out.println(Url);
		return ResponseEntity.status(HttpStatus.OK).body(Url);
	}

}
