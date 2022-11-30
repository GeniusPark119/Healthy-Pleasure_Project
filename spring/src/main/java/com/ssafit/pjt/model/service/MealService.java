package com.ssafit.pjt.model.service;

import java.util.List;

import com.ssafit.pjt.model.dto.Meal;

public interface MealService {

	//게시글 작성
	int writeMeal(Meal meal);
	
	//특정 게시글 불러오기
	Meal getMeal(int mealSeq);
	
	//게시글 목록 불러오기
	List<Meal> getMealAll(int userSeq);
	
	//게시글 수정하기
	int modifyMeal(Meal meal);
	
	//게시글 삭제하기
	int removeMeal(int mealSeq);
	
}
