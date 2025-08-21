package com.kh.run;

import java.util.Scanner;

import com.kh.model.vo.Restaurant;

public class Run {

	public static void main(String[] args) {

		// test
//		Restaurant res = new Restaurant();
//		System.out.println(res.information());

		// 1절
		// 사용자에게 식당의 정보를 입력받아서
		// 입력받은 식당의 정보를 출력해주는 프로그램
		// 3개의 식당정보를 입력받겠다고 가정

		// 2절
		// 사용자에게 상호명을 입력받아서
		// 입력받은 상호와 일치하는 식당을 검색해서 출력해주는 프로그램

		// 1절
		Scanner sc = new Scanner(System.in);

		/*
		 * System.out.println("식당의 상호를 입력해주세요 > "); String storeName = sc.nextLine();
		 * 
		 * System.out.println("식당의 주소를 입력해주세요 > "); String address = sc.nextLine();
		 * 
		 * System.out.println("식당의 주력메뉴를 입력해주세요 > "); String mainMenu = sc.nextLine();
		 * 
		 * System.out.println("식당의 상호를 입력해주세요 > "); String storeName2 = sc.nextLine();
		 * 
		 * System.out.println("식당의 주소를 입력해주세요 > "); String address2 = sc.nextLine();
		 * 
		 * System.out.println("식당의 주력메뉴를 입력해주세요 > "); String mainMenu2 = sc.nextLine();
		 * 
		 * 
		 * System.out.println("식당의 상호를 입력해주세요 > "); String storeName3 = sc.nextLine();
		 * 
		 * System.out.println("식당의 주소를 입력해주세요 > "); String address3 = sc.nextLine();
		 * 
		 * System.out.println("식당의 주력메뉴를 입력해주세요 > "); String mainMenu3 = sc.nextLine();
		 * 
		 * // 1. setter 호출 ( ) // 2. 생성자 매개변수로 인자값을 전달 (V) Restaurant r1 = new
		 * Restaurant(storeName, address, mainMenu); Restaurant r2 = new
		 * Restaurant(storeName2, address2, mainMenu2); Restaurant r3 = new
		 * Restaurant(storeName3, address3, mainMenu3);
		 * 
		 * System.out.println(r1.information()); System.out.println(r2.information());
		 * System.out.println(r3.information());
		 */
		// 배운 진도로 중복제거 시도해보기
		Restaurant r1 = null;
		Restaurant r2 = null;
		Restaurant r3 = null;

		for (int i = 0; i < 3; i++) {
			System.out.println("식당의 상호를 입력해주세요 > ");
			String storeName = sc.nextLine();

			System.out.println("식당의 주소를 입력해주세요 > ");
			String address = sc.nextLine();

			System.out.println("식당의 주력메뉴를 입력해주세요 > ");
			String mainMenu = sc.nextLine();

			if (i == 0) {
				r1 = new Restaurant(storeName, address, mainMenu);
			} else if (i == 1) {
				r2 = new Restaurant(storeName, address, mainMenu);
			} else if (i == 2) {
				r3 = new Restaurant(storeName, address, mainMenu);
			}
		}
		System.out.println(r1.information());
		System.out.println(r2.information());
		System.out.println(r3.information());// 1절 끝

		// 2절
		System.out.println("가게명을 입력하세요 > ");
		String searched = sc.nextLine();

		if (searched.equals(r1.getStoreName())) {
			System.out.println(r1.getMainMenu());
		}

		if (searched.equals(r2.getStoreName())) {
			System.out.println(r2.getMainMenu());
		}

		if (searched.equals(r3.getStoreName())) {
			System.out.println(r3.getMainMenu());
		}
		// 중복제거가 힘듬

	}
}
