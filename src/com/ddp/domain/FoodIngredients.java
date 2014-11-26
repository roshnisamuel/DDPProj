package com.ddp.domain;

public class FoodIngredients implements java.io.Serializable {

	private Integer id;
	private String foodId;
	private String ingredientId;

	public FoodIngredients() {
	}

	public FoodIngredients(String foodId, String ingredientId) {
		this.foodId = foodId;
		this.ingredientId = ingredientId;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFoodId() {
		return this.foodId;
	}

	public void setFoodId(String foodId) {
		this.foodId = foodId;
	}

	public String getIngredientId() {
		return this.ingredientId;
	}

	public void setIngredientId(String ingredientId) {
		this.ingredientId = ingredientId;
	}

}
