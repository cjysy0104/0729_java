package com.kh.chap02.model.vo;

public class JapanFood extends Food {

	// 필드부
	// 부모로부터 상속받은 부분은 기술하지 않는다.
	private int fresh;
	
	// 생성자부
	public JapanFood() {}
	
	// 매개변수 생성자
	// foodName, meaterial, cookingTime : 부모클래스의 필드에 대입해야함
	// fresh : 내 필드에 대입
	public JapanFood(
			String foodName, 
			String material, 
			int cookingTime, 
			int fresh) {
		
		super(foodName, material, cookingTime);
		this.fresh = fresh;
	}
	
	// 메서드부
	public int getFresh() {
		return fresh;
	}
	public void setFresh(int fresh) {
		this.fresh = fresh;
	}
	
	// 메서드를 상속받았지만 발전시키고 싶다.
	// 메서드를 다시 쓸 수 있음 ==> 재정의(Override)
	public String information() {
		
		/* 중복제거마려움
		return "음식정보 [음식이름: " + super.getFoodName() +
			   ", 원재료: " + super.getMaterial() +
			   ", 조리시간: " + super.getCookingTime() +
			   ", 신선도: " + fresh + 
			   "]";
		*/
		return super.information() + ", 신선도: " + fresh;
	}
}
