package com.kh.chap02.run;

import com.kh.chap02.model.vo.ItalyFood;
import com.kh.chap02.model.vo.JapanFood;
import com.kh.chap02.model.vo.KoreaFood;
import com.kh.chap03.model.vo.LastTime;

public class Run {

	public static void main(String[] args) {
		
		KoreaFood kr = new KoreaFood();
		kr.setFoodName("비빔밥");
		System.out.println(kr.getFoodName());
		
		// 호출을 하는 메서드가 해당 클래스에 존재하지 않는다면
		// 자도으로 해당 클래스의 부모클래스에 있는 메서드를 호출
		
		ItalyFood it = new ItalyFood("기름파스타", "기름", 15, 5);
		System.out.println(it.information());
		
		JapanFood jp = new JapanFood("스시", "밥", 20, 5);
		System.out.println(jp.information());
		
		// 자식크래스에 메서드를 재정의 했을 경우
		// ★★★자식클래스에 존재하는 메서드가 우선권을 가져서 호출됨!
		
		
		/*
		 * 상속
		 * 
		 * 기존의 클래스를 이용해서 새로운 클래스를 만드는 기술
		 * 
		 * - 중복된 코드를 공통으로 관리
		 * => 보다 적은양의 코드로 새로운 클래스를 만들 수 있음
		 * 
		 * => 생산성 향상, 가독성 향상
		 * 
		 * 객체간의 결합도가 높아짐
		 * 
		 * 상속의 특징
		 * 
		 * - 클래스간 다중상속은 불가능 (단일상속만 가능)
		 * 
		 * - 명시되어있지는 않지만 모든 클래스는 Object클래스의 후손 클래스
		 * 	(내가 만든 클래스, 자바에서 원래 제공하는 클래스)
		 * 
		 * => Object클래스에 있는 멤버를 사용할 수 있음
		 * => Object클래스에 있는 메서드가 마음에 안든다면 재정의 할 수 있음
		 */
		
		LastTime lt = new LastTime();
		System.out.println(lt);
	}
}
