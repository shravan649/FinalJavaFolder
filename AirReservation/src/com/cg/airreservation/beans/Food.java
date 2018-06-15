package com.cg.airreservation.beans;

public class Food {
	private String foodAppliedStatus,typeOfFood;
	public Food(){}
	public Food(String foodAppliedStatus, String typeOfFood) {
		super();
		this.foodAppliedStatus = foodAppliedStatus;
		this.typeOfFood = typeOfFood;
	}
	public String getFoodAppliedStatus() {
		return foodAppliedStatus;
	}
	public void setFoodAppliedStatus(String foodAppliedStatus) {
		this.foodAppliedStatus = foodAppliedStatus;
	}
	public String getTypeOfFood() {
		return typeOfFood;
	}
	public void setTypeOfFood(String typeOfFood) {
		this.typeOfFood = typeOfFood;
	}
	
}
