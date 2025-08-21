package com.kh.operator;

import java.util.Scanner;

public class A_Arithmetic {

	// 산술연산자 -> 이항연산자, 우선순위
	// + : 덧셈
	// - : 뺄셈
	// * : 곱셈
	// / : 나눗셈(몫)
	// % : 모듈러(Modular) => 나눗셈에서 나머지를 구함
	
	public void method() {
		
		int num1 = 10;
		int num2 = 3;
		
		// System.out.println("num1 + num2 : " + num1 + num2);
			// 1단계 "num1 + num2 : 10"
			// 2단계 "num1 + num2 : 103"
		// 결과값이 "num1 + num2 : 103"
		// 연산 우선순위를 지정하고 싶다면 ()를 사용하여 묶어주어야함
		// 의도한 결과를 출력할 수 있음
		System.out.println("num1 + num2 = " + (num1 + num2));
		
		System.out.println("num1 - num2 = " + (num1 - num2));
			// 1단계 : "num1 - num2 : 10"
		// 뺄셈의 경우 괄호로 묶어주지 않으면
		// 문자열과 num1을 하나로 합친 뒤 정수를 빼기 때문에 연산이 불가능
		
		System.out.println("num1 × num2 = " + num1 * num2);
		System.out.println("num1 ÷ num2 = " + (num1 / num2));
		System.out.println("num1 mod num2 = " + (num1 % num2));
		// *, /, %는 우선순위가 +, -보다 높기 때문에 묶어주지 않더라도
		// 먼저 연산을 수행해서 결과를 얻을 수 있음
		// 하지만 가독성 향상을 위해 괄호 사용 권장
		
		
		// 변수 사용
		int sum = num1 + num2;
		System.out.println("num1 + num2 = " + sum + "(변수사용)");
		// printf
		System.out.printf("num1 + num2 = %d(printf)\n ", num1 + num2);
		
		//test();
		
		// 주의해야할 부분
		
		//System.out.println(10 / 0);
		
		
		
	}
	
	
	public void test() {
		
		System.out.println("메서드 호출은 main에서만 호출하는것은 X");

	}
	
	
	// 실습. 사탕 개수 구하기 프로그램을 구현하시오.
	
	// 메서드 : presentToStudent()
	
	// 사용자에게 값을 입력받기 <== Scanner 사용
	// 1. 나눠줄 학생의 수
	// 2. 사탕 개수
	
	// 1인당 받을 수 있는 사탕의 개수 : 사탕 개수 / 학생의 수
	// 남은 사탕의 개수	<== 산술연산자
	
	// 출력
	// 학생 한 명당 받을 수 있는 사탕의 개수 : X개
	// 남은 사탕 개수 : X개
	
	public void presentToStudent(){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1. 나눠줄 학생의 수: ");
		int numOfStudents = sc.nextInt();
		
		System.out.print("2. 사탕 개수: ");
		int numOfCandies = sc.nextInt();
		
		System.out.printf("학생 한 명당 받을 수 있는 사탕의 개수 : %d개", numOfCandies / numOfStudents);
		System.out.println();
		System.out.printf("남은 사탕 개수 : %d개", numOfCandies % numOfStudents);
		System.out.println();
		
	}
	
	
	
	
	
	
	
	
}
