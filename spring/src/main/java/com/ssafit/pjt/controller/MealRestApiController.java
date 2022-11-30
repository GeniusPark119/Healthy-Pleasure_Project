package com.ssafit.pjt.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.ssafit.pjt.model.dto.Meal;
import com.ssafit.pjt.model.service.MealService;

@RestController
@RequestMapping("/mealapi")
@CrossOrigin("*")
public class MealRestApiController {

@Autowired
MealService mealservice;

@Autowired
ResourceLoader resLoader;

@PostMapping("/meal")
public ResponseEntity<?> registMeal(Meal meal, MultipartFile file) throws IllegalStateException, IOException{
    
    
    
    int result = mealservice.writeMeal(meal);
    return ResponseEntity.status(HttpStatus.CREATED).body(result);
}
	
	@GetMapping("/meal/{mealSeq}")
	public ResponseEntity<?> showMealboard(@PathVariable int mealSeq){
		다혜가 짱
		Meal result = mealservice.getMeal(mealSeq);
		return ResponseEntity.status(HttpStatus.OK).body(result);
	}
	
	@GetMapping("/meal/{userSeq}")
	public ResponseEntity<?> showMealList(@PathVariable int userSeq){
		List<Meal> result = mealservice.getMealAll(userSeq);
		return ResponseEntity.status(HttpStatus.OK).body(result);
	}
	
	@PutMapping("/meal")
	public ResponseEntity<?> modifyMealboard(Meal meal){
		int result = mealservice.modifyMeal(meal);
		return ResponseEntity.status(HttpStatus.OK).body(result);
	}
	
	@Delete("/meal/{mealSeq}")
	public ResponseEntity<?> removeMealboard(@PathVariable int mealSeq){
		int result = mealservice.removeMeal(mealSeq);
		return ResponseEntity.status(HttpStatus.OK).body(result);
	}
	
	
}
