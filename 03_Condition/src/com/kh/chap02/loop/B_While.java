package com.kh.chap02.loop;

import java.util.Random;

public class B_While {

	/*
	 * while문
	 * 
	 * [ 표현법 ]
	 * 
	 * 초기식;				// 필수는 아님
	 * 
	 * while(조건식){
	 * 		
	 * 		반복적으로 실행하고자 하는 코드;
	 * 		증감식;			// 필수는 아님
	 * 
	 * }
	 * 
	 * while문의 조건식의 결과값이 true일 경우 반복적으로 실행하고자하는 코드가 실행
	 * 
	 * 
	 * for			=> 개발자가 반복의 회수를 명확하게 알고 있다.
	 * while		=> 개발자가 반복의 횟수를 가늠할 수 없음.
	 * 
	 * 무한반복
	 */
	
	public void method1() {
		
		while(true) { // 무한 반복의 용도
			
			System.out.println("");
			
		}
		
	}
	
	public void method2() {
		
		// 초기식, 조건식, 증감식
		
		int i = 0;
		
		while(i < 3) {
			
			i++;
			System.out.println(i);
			
		}
		
	}
	
	
	public void method3() {
		
		// 1 ~ 10까지의 정수 중 짝수의 합 출력
		// System.out.println(2 + 4 + 6 + 8 + 10);
		
		// 1. 1부터 10까지의 합계값 출력
		
//		int i= 1;
//		int sum = 0;
//		while(i <= 10){
//		
//			System.out.println(i);
//			sum += i;
//			i++;
//		
//		}
//		System.out.println("합계: " + sum);
		
		// 2. 짝수일때만 
		int i = 1;
		
		int sum = 0;
		
		while(i <= 10) {
			
			if(i % 2 == 0) // 짝수일때만
				sum += i;
			i++;
		}
		System.out.println("합계: " + sum);
		

	}
	
	
	public void method4() {
		
		// 1부터 시작해서
		// 1 ~ 10사이의 랜덤한 정수까지를 모두 더한 합계를 출력
		// 나온 랜덤의 수: 5
		// 1 ~ 5 합계 출력
		// Random이라는 클래스 존재
		// Math라는 클래스가 가지고 있는 random()을 호출.
		
		// random()의 결과값 : 0.0 ~~ 0.9999999999
		//System.out.println(Math.random());
		
		// 1단계.==============
		// random() 호출 결과 체크
		double num = Math.random();
		System.out.println(num + " << random() 호출 결과 체크");
		System.out.println("");
		// 1 ~ 10
		
		
		// 2_1단계.============
		// num에 10을 곱하면?
		// 0.0 ~~ 9.99999999
		System.out.println(num * 10 + " << num에 10을 곱함");
		System.out.println("");
		
		// 2_2단계.============
		// int형으로 강제형변환
		System.out.println((int) (num * 10) + "		 << int형으로 강제형변환");
		
		// 2_3단계.============
		// +1
		// 1 ~ 10
		int randomNum = (int) (num * 10) + 1;
		System.out.println();
		System.out.println("가공이 끝난 무작위 정수 >> " + randomNum);
		System.out.println("");
		// (int)(Math.random() * 랜덤값의 범위) + 시작값;
		
		
		// 3단계.==============
		// 1부터 랜덤한 수 (1 ~ 10)까지를 모두 더한 합계
		int i = 1;
		int sum = 0;
		
		while(i <= randomNum) {
			sum += i;
			i++;
		}
		System.out.println("1부터 " + randomNum + "까지 더한 결과: " + sum);
		
		
//		int random = (int) (Math.random() * 10);
//		System.out.println(random);
//		
//		int i = 1;
//		int sum = 0;
//		while(i <= random) {
//			
//			sum += i;
//			i++;
//			
//		}
//		System.out.println(sum);
		
	}
	
	
	public void lotto() {
		
		// lotto 번호 생성기
		// 범위 : 1 ~ 45
		// 6개 선택
		// (Math.random() * 45)
		// 0.0 ~ 44.99999999
		// (int) (Math.random() * 45)
		// 0 ~ 44
		// (int) (Math.random() * 45) + 1
		// 1 ~ 45
		
		int num1 = (int) (Math.random() * 45) + 1;
		int num2 = (int) (Math.random() * 45) + 1;
		int num3 = (int) (Math.random() * 45) + 1;
		int num4 = (int) (Math.random() * 45) + 1;
		int num5 = (int) (Math.random() * 45) + 1;
		int num6 = (int) (Math.random() * 45) + 1;
		
		System.out.println("이번주 lotto : ");
		System.out.printf("%d %d %d %d %d + %d", num1, num2, num3, num4, num5, num6);
		
		
	}
	
	/*
	 * do-while
	 * 
	 * 별도의 조건검사 없이 무조건 한 번은 실행
	 * 조건이 true값이 아니더라도 한 번은 꼭 실행
	 * 
	 * [ 표현법 ]
	 * 
	 * 초기식; // 필수 x
	 * 
	 * do {
	 * 		실행코드;
	 * 		증감식; // 필수 x
	 * }while(조건식);
	 */
	
	public void method5() {
		
//		while(false) {
//			System.out.println("dead");
//		}
		
		do {
			System.out.println("한 번은 실행됨.");
		}while(false);
		
	}
	
	
	
	
	
	
}


