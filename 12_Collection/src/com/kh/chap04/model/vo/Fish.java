package com.kh.chap04.model.vo;

public class Fish {

	private String taste;
	private String recipe;
	
	public Fish() {
		super();
	}
	public Fish(String taste, String recipe) {
		super();
		this.taste = taste;
		this.recipe = recipe;
	}
	
	public String getTaste() {
		return taste;
	}
	public void setTaste(String taste) {
		this.taste = taste;
	}
	public String getRecipes() {
		return recipe;
	}
	public void setRecipes(String recipes) {
		this.recipe = recipes;
	}
	
	@Override
	public String toString() {
		return "Fish [taste=" + taste + ", recipes=" + recipe + "]";
	}
	
	
}
