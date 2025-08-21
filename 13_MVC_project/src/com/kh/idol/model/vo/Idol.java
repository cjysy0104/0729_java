package com.kh.idol.model.vo;

public class Idol {

	private String name;
	private String position;
	private String color;
	private String image;
	
	public Idol() {
		super();
	}
	public Idol(String name, String position, String color) {
		super();
		this.name = name;
		this.position = position;
		this.color = color;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	@Override
	public String toString() {
		return "Idol [name=" + name + ", position=" + position + ", color=" + color + "]";
	}
	
	
}
