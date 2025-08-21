package com.kh.chap06.controller;

public class OverloadingController {

	/*
	 * 메서드 오버로딩(Method Overloading) ★★★
	 * 
	 * - 하나의 클래스 안에 동일한 메서드 식별자로 여러 개의 메서드들을 정의할 수 있는 기술 
	 * - 매개변수 자료형의 개수, 순서, 종류 다르게 작성해야함 
	 * - 매개변수 식별자, 접근제한자, 반환타입은 메서드 오버로딩에 아무런 영향을 끼치지 않음
	 */
	
	// 메서드명은 test 통일
	public void test() {
		System.out.println("메서드 오버로딩 테스트");
	}
	/* !!Duplicate method test() in type OverloadingController!! > 매개변수를 다르게
	public void test() {
		System.out.println("메서드 오버로딩 테스트2");
	}
	*/
	
	public void test(int a) {
		System.out.println("메서드 오버로딩 테스트2");
	}

	public void test(String a) {
		System.out.println("메서드 오버로딩 테스트3");
	}
	
	public void test(int a, int b) {
		System.out.println("메서드 오버로딩 테스트4");
	}
	// !!public void test(int c, int d){} >> X, 매개변수식별자와는 관계없다!!
	// !!public int test(int a, int b){} >> X, 반환형 역시 관계없다!!
	// !!private void test(int a, int b){} >> X, 접근제한자 관계없다!!
	// 메서드 호출하는 시점에서 구분이 가는가를 생각하자
	
	

}
