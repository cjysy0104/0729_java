package com.kh.chap03.model.run;

import java.util.Scanner;

import com.kh.chap03.model.vo.Coffee;

public class Run {
	
	public static void main(String[] args) {

		// Coffee라는 클래스(설계도)가지고 객체 생성
		// new Coffee(); // <- 객체(Object) 생성 == instance화
		Coffee co = new Coffee();
		// 1. 참조자료형(Reference Type)
		// 클래스를 만든다는 행위 == 사용자 정의 자료형을 만들겠다.
		// 2. 여러 개의 자료형에 여러 개의 값을 보관 + 기능
		// 3. 주소값을 저장
		
		System.out.println(co.info());
		// 기본값이 들어있음
		// => 정수 : 0, 실수 : 0.0, 참조형 : null, 문자 : ' ', boolean : false
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("커피명이 뭔가요 > ");
		String name = sc.nextLine();
		co.setName(name);
		String coffeeName = co.getName();
		System.out.println(coffeeName);
		
		System.out.println("사용 원두는 뭔가요");
		String bean = sc.nextLine();
		co.setBean(bean);
		System.out.println("사이즈는 뭔가요");
		String size = sc.nextLine();
		co.setSize(size);
		System.out.println("가격은 얼마인가요");
		int price = sc.nextInt();
		co.setPrice(price);
		
		String info = co.info();
		System.out.println(info);
		
		/*
		System.out.println("커피명이 뭔가요 > ");
		co.setName(sc.nextLine()); 
		
		System.out.println("사용 원두는 뭔가요 > ");
		co.setBean(sc.nextLine()); 
		
		System.out.println("사이즈는 뭔가요 > ");
		co.setSize(sc.nextLine()); 
		
		System.out.println("가격은 얼마인가요 > ");
		co.setPrice(sc.nextInt()); 
		
		
		System.out.println(co.getName());
		
		System.out.println(co.info());
		*/
	}
}
