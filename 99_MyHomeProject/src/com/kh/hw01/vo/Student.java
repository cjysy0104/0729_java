package com.kh.hw01.vo;

// 학생을 만드는 설계도
public class Student {

	// [필드부]
	// 속성: 학번, 이름, 나이, 소속반, 취득학점
	public String id;
	public String name;
	public int age;
	public String className;
	public double grade;
	
	// [매서드부]
	public void sayHello() {
		System.out.println(name + "이 인사합니다.");
		System.out.println("'안녕하세요 저는 " + name +"입니다.'");
	}
	
	public void takeClass() {
		System.out.println(name + "이(가) 1.5학점 수업을 듣습니다.");
		grade += 1.5;
	}
	
}
