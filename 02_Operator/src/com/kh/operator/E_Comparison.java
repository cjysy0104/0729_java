package com.kh.operator;

public class E_Comparison {

	/*
	 * 비교 연산자(관계 연산자)
	 * 
	 * 두 개의 값을 가지고 비교, 이항 연산자
	 * 비교연산을 한 결과 -> 참인 경우 true, 거짓인 경우 false
	 * 특정 조건을 제시할 수 있는 조건문에서 조건식으로 사용할 예정
	 */
	/*
	 * 종류
	 * 
	 * 동등비교, 대소비교
	 * 
	 * 1. 동등비교 : 일치함을 비교
	 * 
	 * a == b : a와 b가 일치합니까?
	 * a != b : a와 b가 일치하지 않습니까?
	 * 
	 * 
	 * 2. 대소비교 : 크고 작음을 비교
	 * 
	 * a < b : a가 b보다 작습니까?
	 * a > b : a가 b보다 큽니까?
	 * a <= b : a가 b보다 작거나 같습니까?
	 * a >= b : a가 b보다 크거나 같습니까?
	 * 
	 * 결과값은 ture / false
	 */
	public void method1() {
		
		int firstNum = 10;
		int secondNum = 25;
		
		System.out.println("firstNum < secondNum : " + (firstNum < secondNum));
		System.out.println("firstNum = secondNum : " + (firstNum == secondNum));
		
													// 무슨 값이 필요한가?
													// firstNum
													// 무슨 연산을 해야하는가? 
													// 비교연산
													// 짝수? (=2로 나눴을 때 나머지가 0임?)
		System.out.println("firstNum은 짝수인가? : " + (firstNum % 2 == 0));
		System.out.println("secondNum은 홀수가 아닌가? : " + (secondNum % 2 != 1));
		
	}
	
	
}
