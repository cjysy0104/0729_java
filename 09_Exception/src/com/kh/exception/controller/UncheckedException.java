package com.kh.exception.controller;

import java.io.UncheckedIOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedException {
	/*
	 * 프로그램 실행 시 발생하는 예외들
	 * RuntimeException 
	 * 
	 * - NullPointerException : 주소값 객체를 참조했더니 null값이 들어있을 경우 발생하는 예외
	 * - ArrayIndexOutOfBoundsException : 배열의 부적절한 인덱스로 접근했을 때 발생하는 예외
	 * - ClassCastException : 허용할 수 없는 형변환을 진행할 경우 발생하는 예외
	 * - ArithmeticException : 나누기 연산을 0으로 나누면 발생하는 예외
	 * - NegativeArraySizeException : 배열을 할당할 때 크기를 음수로 지정하면 발생하는 예외
	 * ...
	 * 
	 *  RuntimeException과 관련된 예외들은 공통점이 있음
	 *  개발자가 예측이 가능함
	 */
	
	// ArithmeticException
	public void method1() {
		// 사용자에게 두 개의 정수값을 입력받아서 나눗셈을 한 뒤 결과를 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 정수를 입력해주세요 > ");
		int num1 = sc.nextInt();
		
		System.out.println("두 번째 정수를 입력해주세요(0 제외) > ");
		// 두 번째 정수에 0이 들어가면 안됨.
		int num2 = sc.nextInt();
		
		// 방법 1. 예외발생 자체를 원천 차단해버림
		/*
		if(num2 != 0) {
			System.out.println("결과: " + num1 / num2);
		} else {
			System.out.println("?");
		}
		*/
		
		// 방법 2. 예외처리를 진행
		
		// 예외 처리: 
		// 예외 상황을 감지하고 예외상황 발생 시
		// 프로그램이 비정상적인 종료가 되는것을 방지하고 적절한 대응 조치를 취하는 것
		
		
		/*
		 * try ~ catch문
		 * 
		 * [ 표현법 ]
		 * 
		 * try{
		 * 
		 * 		(num1 / num2) // 예외가 발생할 수도 있는 구문
		 * 
		 * } catch (발생할예외클래스명 변수명) { => 매개변수
		 * 
		 * 		해당 예외가 발생했을 때 실행할 구문
		 * }
		 */
		try {
			
			System.out.println(num1 / num2);
			// 앞에서 예외가 발생하면 예외가 발생하는 즉시 catch하기때문에 실행 X
			// 예외 발생 가능한 코드 뒤에 중요한코드 입력X할것
			System.out.println("올바른 정수 입력!"); 
			
		} catch (ArithmeticException e) {
			
			System.out.println("0입력하지마라");
			
		}
		System.out.println("프로그램 종료");
	}
	
	public void homeWork() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("menu select");
			System.out.println("1. adder");
			System.out.println("2. search");
			
			int menuNo = 0;
		
			try {
				sc.nextInt();
				
			} catch (InputMismatchException e) {
				System.out.println("숫 자 처 채 우 라 고");
				
				// 예외처리 시 catch문에 적어야하는 내용이 출력문은 아님
			}
			
			sc.nextLine();
			
			System.out.println(menuNo + " selected");
		}
	}
	
	public void method2() {

		// 예외발생가능성: 1. 다른 자료형 입력	2. 0 입력 를 한번에 처리

		Scanner sc = new Scanner(System.in);

		/*
		System.out.println("정 수 처 채 우 라 고 (단, 0은 제외) > ");

		// InputMismatchException
		int num = sc.nextInt();

		// AristhmeticException
		System.out.println("100을 입력값으로 나눈 결과 : " + (100 / num));

		System.out.println("프로그램 종료");
		*/
		
		try {
			System.out.println("정 수 처 채 우 라 고 (단, 0은 제외) > ");
			int num = sc.nextInt();
			// InputMismatchException
			System.out.println("100을 입력값으로 나눈 결과 : " + (100 / num));
			// AristhmeticException
		} catch (InputMismatchException e) { // 1. 먼저 입력받은 값이 정수인지 판단
			System.out.println("정수 수짜 아니야..");
		} catch (ArithmeticException e) {
			System.out.println("0은 안대욧");
		}
		
		System.out.println("프로그램 종료");
	}
	
	public void method3() {
		// 배열
		
		// 사용자에게 정수값을 입력받아서
		// 입력받은 만큼 크기를 가진 배열을 생성 및 할당하고
		// 100번째 인덱스 값을 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수값 입력: ");
		
		/*
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println(arr[100]);
		*/
		
		// InputMismatchException : 스캐너 메서드의 자료형과 일치하지 않으면 발생
		// NegativeArraySizeException : 배열의 크기를 음수로 지정하면 발생
		// ArrayIndexOutOfBoundsException : 배열의 크기보다 큰 인덱스에 접근하면 발생
		
		// 1.
		/*
		if(size >= 100)
			
		else
			System.out.println("100 이상 입력해야 가능");
		*/
		// 2.
		/*
		try {
			int size = sc.nextInt();
			int[] arr = new int[size];
			System.out.println(arr[100]);
		} catch (InputMismatchException e) {
			System.out.println("스캐너 메서드의 자료형과 일치하지 않으면 발생");
		} catch (NegativeArraySizeException e) {
			System.out.println("배열의 크기를 음수로 지정하면 발생");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 크기보다 큰 인덱스에 접근하면 발생");
		}
		*/
		// 3가지 모두 RuntimeException가 조상클래스
		// 다형성 적용해서 자료형 물려받을수 있음
		/*
		try {
			int size = sc.nextInt();
			int[] arr = new int[size];
			System.out.println(arr[100]);
		} catch (RuntimeException e) {
			System.out.println("아마도.. 음수입력..? 100보다 크지않아서..?");
		}
		*/
		// 다중 catch문 작성할땐 자식클래스 먼저 >> 부모클래스 순으로
		/*
		try {
			int size = sc.nextInt();
			int[] arr = new int[size];
			System.out.println(arr[100]);
		} catch (InputMismatchException e) {
			e.printStackTrace(); // 애는 꼭 개발단계에서만
		} catch (RuntimeException e) {
			
		}
		*/
	}
}



















