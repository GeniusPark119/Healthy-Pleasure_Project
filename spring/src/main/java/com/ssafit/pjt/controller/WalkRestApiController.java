package com.ssafit.pjt.controller;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.ssafit.pjt.model.dto.User;
import com.ssafit.pjt.model.dto.Walk;
import com.ssafit.pjt.model.service.WalkService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/walkapi")
@CrossOrigin("*")
public class WalkRestApiController {

	@Autowired
	WalkService wservice;

	@PostMapping("/walk")
	@ApiOperation(value = "walk 게시글 등록", notes="Walk객체를 이용하여 글을 등록한다", response = Walk.class)
	public ResponseEntity<?> writeWalk(Walk walk) {
		int result = wservice.registWalk(walk);

		return ResponseEntity.status(HttpStatus.CREATED).body(result);
	}

	@GetMapping("/walk/{walkSeq}")
	@ApiOperation(value = "walk 게시글 조회", notes="특정한 게시글을 조회한다", response = Walk.class)
	public ResponseEntity<?> showWalk(@PathVariable int walkSeq) {
		return ResponseEntity.status(HttpStatus.OK).body(wservice.getWalk(walkSeq));
	}

	@GetMapping("/walk/{userSeq}")
	@ApiOperation(value = "모든 walk 게시글 조회", notes="회원이 등록한 게시글을 조회한다", response = Walk.class)
	public ResponseEntity<?> showList(@PathVariable int userSeq) {
		return ResponseEntity.status(HttpStatus.OK).body(wservice.getWalkAll(userSeq));
	}

	@PutMapping("/walk")
	@ApiOperation(value = "walk 업데이트", notes="walk 게시글을 수정한다", response = Walk.class)
	public ResponseEntity<?> modifyWalk(Walk walk) {
		int result = wservice.modifyWalk(walk);

		return ResponseEntity.status(HttpStatus.OK).body(result);
	}

	@DeleteMapping("/walk/{walkSeq}")
	@ApiOperation(value = "walk 게시글 삭제", notes="특정 게시글을 삭제한다")
	public ResponseEntity<?> removeWalk(@PathVariable int walkSeq) {
		int result = wservice.deleteWalk(walkSeq);
		return ResponseEntity.status(HttpStatus.OK).body(result);
	}
}
