package com.kh.chap02.loop;

import java.util.Scanner;

public class A_For {

	public void method0() {
		/*
		System.out.println("asdf");
		System.out.println("asdf");
		System.out.println("asdf");
		*/
		// 반복해야하는 횟수가 XXXXX...번 이라면?
		
		/*
		 * for( 초기식; 조건식; 증감식) { }
		 */ 
		
		for(int i=0; i<10; i++) {
			
			System.out.println("asdf");
			System.out.println(i);
			
		}
		
	}
	
	/*
	 * for문
	 * 
	 * 괄호 안은 반복의 횟수를 지정하는 부분
	 * 초기식; 조건식; 증감식 세 가지로 이루어짐
	 * ; 세미클론으로 구분함
	 * 
	 * [ 표현법 ]
	 * 
	 * for( 초기식; 조건식; 증감식) {
	 * 		반복적으로 실행하고자 하는 코드;
	 * }
	 * 
	 * - 초기식 : 반복문을 시작할 때 "초기에 단 한번만 실행"될 구문
	 * 			반복을 할 때 필요한 변수를 선언하고 초기화 하는 구문(제어변수) => int i = 0;
	 * 
	 * - 조건식 : "반복문이 실행될 조건"을 작성하는 구문
	 * 			조건식의 결과가 true일 경우 반복을 수행
	 * 			조건식의 결과가 false일 경우 반복문을 멈추고 for문 블럭을 빠져나옴 => i < 5;
	 * 
	 * - 증감식 : "반복문을 제어하는 변수에 대입된 값"을 증감하는 구문
	 * 			보통 초기식에서 선언된 변수를 가지고 증감식 작성
	 * 			이 때, 보편적으로 증감연산자를 사용함					=> i++
	 */ 
	
	public void method1() {
		
		// 출력
		// 1
		// 2
		// 3
		// 4
		// 5
		
		/* System.out.println(1);
		 * System.out.println(2);
		 * System.out.println(3);
		 * System.out.println(4);
		 * System.out.println(5);
		 */
		
//		for(int i = 1; i < 10; i++) {
//			
//			System.out.println("*");
//			
//		}
		
		// 1 > 2 > 3 > 4 > 2 > 3 > 4 > ... > 2
		for(/* 1 */int i = 1;/* 2 */ i <= 5;/* 4 */ i++) {
			
			/* 3 */System.out.println(i + "번 반복");
			
		}
		
		
		// for문을 이용해서 반복을 3번 한다고 가정
		// i, j, k
		for(int i = 0; i < 10; i+=2) {
			System.out.println(i);
		}
		System.out.println("-------------------------");
		
		for(int i = 100; i > 0; i--) {
			System.out.println(i);
		}
		

	}
	
	
	public void gugudan() {
		
		// 구구단 프로그램
		// 
		// 사용자에게 정수를 입력받아서
		// 사용자가 입력한 정수를 이용해서 구구단을 출력해보기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("※구구단을 외우자※");
		System.out.println("몇단을 외울까(숫자 입력) :");
		int num = sc.nextInt();
		System.out.println(num + "단을 외우자 (❁´◡`❁)");
		
		/*
		System.out.println(num + " × " + 1 + " = " + num * 1);
		System.out.println(num + " × " + 2 + " = " + num * 2);
		System.out.println(num + " × " + 3 + " = " + num * 3);
		System.out.println(num + " × " + 4 + " = " + num * 4);
		System.out.println(num + " × " + 5 + " = " + num * 5);
		System.out.println(num + " × " + 6 + " = " + num * 6);
		System.out.println(num + " × " + 7 + " = " + num * 7);
		System.out.println(num + " × " + 8 + " = " + num * 8);
		System.out.println(num + " × " + 9 + " = " + num * 9);
		*/
		for(int i = 1; i < 10; i++) {
			
			System.out.println(num + " × " + i + " = " + num * i);
		}	
		

	}
	
	public void method2() {
		
		// ***
		// ***
		// ***
		
//		System.out.println("***");
//		System.out.println("***");
//		System.out.println("***");
		
//		for(int i = 0; i < 3; i++) {
//			System.out.println("***");
//		}
		
//		for(int i = 0; i < 10; i++) {
//			
//			for(int j = 0; j < 8; j++) {
//				
//				System.out.print("*");
//			}
//			
//			System.out.println("");
//			
//		}
		
		// 출력 : X번째 반복입니다.
		// 		10번째 반복마다 ♡를 하나씩 찍어주기
		for(int i = 0; i < 100; i++) {
			
			System.out.println((i + 1) + "번째 반복입니다.");
			if((i+1) % 10 == 0) System.out.println("♡");
			
		}
	}
	
	
	public void method3() {
		
		// for(;;)
		while(true) {
			
			System.out.println("===구구단 프로그램===");
			System.out.println("1. 구구단 프로그램 시작하기");
			System.out.println("2. 구구단 프로그램 설명보기");
			System.out.println("3. 프로그램 종료하기");
			System.out.println("=================");
			Scanner sc = new Scanner(System.in);
		
			System.out.println("메뉴 번호를 입력: ");
			int menuNum = sc.nextInt();
		
			switch(menuNum) {
		
			case 1 : 
			
				System.out.println("숫자를 입력하세요: ");
				int num = sc.nextInt();
			
				for(int i = 1; i < 10; i++)
				System.out.println(num + " × " + i + " = " + num * i);
				break;
			
			case 2 : 
			
				System.out.println("숫자를 입력하면 다음과 같이 1 ~ 9 까지 곱한 값을 출력합니다.");
				System.out.println("(입력한 숫자) × 1 = (결과값)");
				System.out.println("");
				break;
			
			
			case 3 : System.out.println("프로그램을 종료합니다."); return;
		
				default : System.out.println("잘못된 메뉴 입력입니다.");
				System.out.println("");
			}
		}
		
		
		
		
	}
	
	
	
	
	
}
