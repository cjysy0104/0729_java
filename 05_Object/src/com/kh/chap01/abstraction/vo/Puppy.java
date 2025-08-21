package com.kh.chap01.abstraction.vo;
/*
 * 양식
 * 
 * public class 클래스식별자{
 * 
 * 		// 필드부
 * 
 * 		// 생성자부
 * 
 * 		// 매서드부
 * 
 * }
 */

// 강아지를 만드는 설계도
public class Puppy {

	// [ 필드부 ]
	// 접근제한자 자료형 필드식별자;

	// 접근제한자: 이 필드에 접근할 수 있는 접근권한을 제어하는 역할
	// public > protected > default > private
	// 클래스 내부에 필드를 선언할 때는 반드시 접근제한자를 붙일 것!

	// 속성: 종, 이름, 나이, 성별, 색상, 몸무게
	public String species;

	public String name;

	public int age;

	public String gender;

	public String color;

	public int weight;

	// [ 생성자부 ]

	// [ 메서드부 ]
	public void sniff() {
		// System.out.println("킁킁거리며 냄새를 맡습니다.");
		System.out.println(name + "가 킁킁거리며 냄새를 맡습니다."); // 내부 name 사용
	}

	public void bark() {
		
		if(weight > 15) {
			
			System.out.println(name + "가 멍하고 짖습니다.");
			weight -= 5;
		} else {
			System.out.println(name + "가 말합니다. 너나 짖어라.");
		}
	}
}
