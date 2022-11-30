package com.ssafit.pjt.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafit.pjt.model.dao.MealDao;
import com.ssafit.pjt.model.dto.Meal;

@Service
public class MealServiceImpl implements MealService{

	@Autowired
	MealDao mealdao;
	
	@Override
	public int writeMeal(Meal meal) {
		return mealdao.insertMeal(meal);
	}

	@Override
	public Meal getMeal(int mealSeq) {
		return mealdao.selectMeal(mealSeq);
	}

	@Override
	public List<Meal> getMealAll(int userSeq) {
		return mealdao.selectMealAll(userSeq);
	}

	@Override
	public int modifyMeal(Meal meal) {
		return mealdao.updateMeal(meal);
	}

	@Override
	public int removeMeal(int mealSeq) {
		return mealdao.deleteMeal(mealSeq);
	}

}
