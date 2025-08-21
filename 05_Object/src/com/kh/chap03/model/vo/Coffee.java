package com.kh.chap03.model.vo;

public class Coffee {
	// 상품명, 가격, 원두, 사이즈
	
	// 필드부
	private String name;
	private String bean;
	private String size;
	private int price;
	
	// 생성자부
	
	// 메서드부 getter / setter / info
	
	// 필드값을 반환해주는 메서드 == getter
	public String getName() {
		return name;
	}
	
	public String getBean() {
		return bean;
	}
	
	public String getSize() {
		return size;
	}
	
	public int getPrice() {
		return price;
	}
	
	// 필드값 세팅하는 메서드 == setter
	public void setName(String name) {
		this.name = name;
	}
	
	public void setBean(String bean) {
		this.bean = bean;
	}
	
	public void setSize(String size) {
		this.size = size;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	// 전체 필드 값 확인위한 메서드 info
	public String info() {
		
		String info = "[ 필드값 - 상품명 : " + name 
						   + ", 원두 : " + bean 
						   + ", 사이즈 : " + size 
						   + ", 가격 : " + price
						   + "]";
		return info;
	}
	
}
