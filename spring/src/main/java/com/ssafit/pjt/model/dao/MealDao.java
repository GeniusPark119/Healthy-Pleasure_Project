package com.ssafit.pjt.model.dao;

import java.util.List;

import com.ssafit.pjt.model.dto.Meal;

public interface MealDao {
	
	//게시글 작성
	int insertMeal(Meal meal);
	
	//특정 게시글 불러오기
	Meal selectMeal(int mealSeq);
	
	//게시글 목록 불러오기
	List<Meal> selectMealAll(int userseq);
	
	//게시글 수정하기
	int updateMeal(Meal meal);
	
	//게시글 삭제하기
	int deleteMeal(int mealSeq);

}
