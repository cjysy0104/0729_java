package com.kh.run;

import java.util.Scanner;

import com.kh.model.vo.Restaurant;

public class ArrayRun {

	public static void main(String[] args) {
		
		// 배열의 특징
		//
		// ★논리적인 구조와 물리적인 구조가 동일하다. (=> 자료구조에 대해서 물어보는거임)
		// 동종 모음 == 같은 자료형끼리만
		// 하나의 배열에 여러 값을 담을 수 있다.
		// 메모리상의 공간
		// 참조자료형
		// 인덱스 개념
		// 명확한 크기를 명시해야함 => 크기를 바꾸는 것이 불가능
		
		// int[] nums = new int[3];
		// String[] str = new String[5];
		
		// 자바에서 기본자료형을 제외한 나머지는
		// 전부 참조자료형
		// 참조자료형 공간에 대입될 수 있는 값은 오로지 주소값
		
		// 객체배열의 선언 및 할당
		// [ 표현법 ]
		// 참조자료형[] 배역식별자 = new 클래스이름[배열크기];
		
		// 1절
		Restaurant[] restaurants = new Restaurant[3];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < restaurants.length; i++) {
			
			System.out.println("식당의 상호를 입력해주세요 > ");
			String storeName = sc.nextLine();

			System.out.println("식당의 주소를 입력해주세요 > ");
			String address = sc.nextLine();

			System.out.println("식당의 주력메뉴를 입력해주세요 > ");
			String mainMenu = sc.nextLine();
			
			restaurants[i] = new Restaurant(storeName, address, mainMenu);
		}
		
		// System.out.println(restaurants); => 배열의 주소값
		// System.out.println(retaurants[0]); => 객체 index 0 의 주소값
		/*
		System.out.println(restaurants[0].information());
		System.out.println(restaurants[1].information());
		System.out.println(restaurants[2].information());
		*/
		for(int i = 0; i < 3; i++) {
			System.out.println(restaurants[i].information());
		} // 1절 끝
		
		// 2절
		System.out.println("상호명을 입력해주세요 > ");
		String searched = sc.nextLine();
		
		for(int i = 0; i < restaurants.length; i++) {
			if(searched.equals(restaurants[i].getStoreName())){
				System.out.println("대표메뉴: " + restaurants[i].getMainMenu());
			}
		}
		
	}
	
}
