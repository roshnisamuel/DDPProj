package com.ddp.domain;

public class Ingredients implements java.io.Serializable {

	private Integer id;
	private String name;
	private String details;

	public Ingredients() {
	}

	public Ingredients(String name, String details) {
		this.name = name;
		this.details = details;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetails() {
		return this.details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

}
