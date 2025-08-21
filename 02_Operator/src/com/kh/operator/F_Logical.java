package com.kh.operator;

import java.util.Scanner;

public class F_Logical {

	/*
	 * 논리 연산자 : 두개의 논리값을 연산하는 연산자
	 * 
	 * [ 표현법 ]
	 * 
	 * 논리값 논리연산자 논리값 => (3) 결과값도 논리값
	 * 
	 * 종류
	 * 
	 * 1. AND연산자 : 논리값 && 논리값
	 * 좌항과 우항의 값이 모두 true여야만 최종 결과값이 true
	 * 
	 * 2. OR연산자 : 논리값 || 논리값
	 * 좌항과 우항의 값 중 하나라도 true일 경우 최종 결과값이 true
	 */
	
	// AND
	public void method1() {
		
		// 목표
		//
		// 사용자에게 정수값을 하나 입력받은 후
		// 사용자가 입력한 정수 값이 0보다 크면서 짝수인지 판별
		// 그리고 나서 결과를 출력
		
		// 0.
		Scanner sc = new Scanner(System.in);
		
		// 1.
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		//System.out.println(num);
		
		// 2.
		// 무슨 값? == num
		// 무슨 연산? 
		//  (1) 0보다 큰가?(대소비교)							// num > 0
		//  (2) 짝수(= 2로 나눈 나머지가 0과 일치)인가?(동등비교)	// num % 2 == 0
		//
		// AND 연산자
		// &&의 의미 : 그리고, ~~이면서, ~~이고
		
		boolean result = (num > 0) && (num % 2 == 0);
				// 사용자가 입력한 정수가 0보다 크다. 그리고 사용자가 입력한 정수를 2로 나눴을 때 나머지가 0. 인가요?
		System.out.println("입력한 정수는 0보다 크고 짝수입니까? : " + result);
		
	}
	
	public void method2() {
		
		// 실습.
		
		Scanner sc = new Scanner(System.in);
		// 사용자에게 정수 값을 입력받아서
		System.out.println("1 ~ 100 사이 정수 입력: ");
		// 변수에 대입한 뒤
		int num = sc.nextInt();
		// 출력하시오.
		System.out.println("입력받은 값: " + num);
		// 사용자가 입력한 정수가 1 ~ 100 사이의 값인지 확인하기
		// 1-1. 사용자가 입력한 정수 == num
		// 1-2. 1
		// 1-3. 100
		
		// 	1 <= 입력값 <= 100
		
		// 2. (1 <= num) && (num <= 100);
		
		
		// 사용자가 입력한 값이 1 ~ 100 사이의 값인지를 판별하여 출력해줄 것
		boolean result = (1 <= num) && (num <= 100);
		System.out.println("1 ~ 100 사이 정수로 알맞게 입력했나요? : " + result);
	}
	
	// OR
	public void method3() {
		
		// 사용자에게 한 글자를 입력 받아서
		// 입력받은 값이 'A' 또는 'a'인지 확인해서 출력하기
		Scanner sc = new Scanner(System.in);
		
		System.out.println("한 글자만 입력해주세요: ");
		char letter = sc.nextLine().charAt(0);
		//System.out.println(letter);
		
		// charAt(index)
		/*
		String str = "KH정보교육원";
		char ch = str.charAt(2);
		System.out.println(ch); //정
		index : 0부터 시작
		*/
		
		// 무슨 값?
		// 사용자가 입력한 한 글자 == letter
		// 'A'
		// 'a'
		// 무슨 연산?
		// == 동등비교
		// 단일 문자의 경우 동등비교 연산은 가능하다 
		// => char형이 int형으로 자동형변환이 일어난 뒤 연산을 함
		
		// letter == 'A' or letter == 'a'
		boolean result = (letter == 'A') || (letter == 'a');
		// || : ~~이거나, 또는
		System.out.println("'A' 또는 'a'인가요? : " + result);
	}
	/*
	 * AND(&&) : 두 개의 조건이 모두 true일 경우 true
	 * 
	 * 1 && 1 : 1
	 * 1 && 0 : 0
	 * 0 && 1 : 0
	 * 0 && 0 : 1
	 * 
	 * 
	 * OR(||) : 두 개의 조건 중 하나라도 true일 경우 true
	 * 
	 * 1 || 1 : 1
	 * 1 || 0 : 1
	 * 0 || 1 : 1
	 * 0 || 0 : 0
	 */
	
	public void tip() {
		
		int num = 10;
		
		boolean result1 = false && (num > 0);
		
		boolean result2 = (num < 0) && (num == 10);
						// short circuit 연산
						// &&연산: 앞 조건식이 false면 뒤 조건식 연산 X
		
		
	}
	
	
	
	
	
	
	
	
}
