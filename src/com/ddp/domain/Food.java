package com.ddp.domain;

public class Food implements java.io.Serializable {

	private Integer id;
	private String upcId;
	private String title;
	private String ingredients;
	private String details;
	private String productUrl;
	private String category;

	public Food() {
	}

	public Food(String upcId, String title) {
		this.upcId = upcId;
		this.title = title;
	}

	public Food(String upcId, String title, String ingredients, String details,
			String productUrl, String category) {
		this.upcId = upcId;
		this.title = title;
		this.ingredients = ingredients;
		this.details = details;
		this.productUrl = productUrl;
		this.category = category;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUpcId() {
		return this.upcId;
	}

	public void setUpcId(String upcId) {
		this.upcId = upcId;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIngredients() {
		return this.ingredients;
	}

	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}

	public String getDetails() {
		return this.details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getProductUrl() {
		return this.productUrl;
	}

	public void setProductUrl(String productUrl) {
		this.productUrl = productUrl;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

}
