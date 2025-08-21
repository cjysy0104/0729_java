package com.kh.chap02.model.vo;

public class ItalyFood extends Food {

	// 필드부
	private int oil;
	
	// 생성자부
	public ItalyFood() {
		super(); // 생략가능
	}
	public ItalyFood(
			String foodName, 
			String material, 
			int cookingTime, 
			int oil) {
		// this.foodName = foodName; // 필드 접근제한자를 private 설정했기때문에 안보임
		
		// 해결방법
		
		// 1. 부모클래스의 접근제한자를 바꿔버림
		// 캡슐화 원칙 X => 적합한 방법은 아님
		// super.foodName = foodName; // foodName 필드를 protected로: 상속클래스는 접근가능
		
		// 2. setter 메서드 호출
		/*
		super.setFoodName(foodName);
		super.setMaterial(material);
		super.setCookingTime(cookingTime);
		*/
		
		// 3. 부모클래스가 가지고 있는 매개변수 생성자를 호출
		super(foodName, material, cookingTime);
		this.oil = oil;
		/* !!주의: 부모클래스객체 생성 후 자식클래스객체가 생기므로 다음과 같이 서순에 주의
		 * this.oil = oil;
		 * super.(foodName, material, cookingTime)
		 */
	}

	// 메서드부
	public int getOil() {
		return oil;
	}
	public void setOil(int oil) {
		this.oil = oil;
	}
	
}
