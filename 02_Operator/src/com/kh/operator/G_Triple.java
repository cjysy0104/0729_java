package com.kh.operator;

import java.util.Scanner;

public class G_Triple {

	/*
	 * 삼항 연산자 : 피연산자가 3개 => 값 3개와 1개의 연산자로 이루어짐 (조건문의 형식으로 쓰임) 
	 * 
	 * 조건문 : 값에 따라 연산을 처리하는 방식
	 * 		  결과 값이 true일 경우 첫 번째 문장을 처리~~
	 * 		  결과 값이 false일 경우 두 번째 문장을 처리~~
	 * 
	 * [ 표현식 ]
	 * 조건식? 조건식이 true일 경우 결과값 : 조건식이 false일 경우 결과값
	 */
	
	public void method1() {
		
		System.out.println("==시즌 메뉴판==");
		System.out.println("1.더 멜론 오브 멜론 프라푸치노");
		System.out.println("2.자몽 망고 코코 프라푸치노");
		System.out.println("3.카페 브륄레 프라푸치노");
		System.out.println("============");
		
		// 메뉴 번호 가지고 주문 받기
		// 자동 import: Ctrl + Shift + o
		Scanner sc = new Scanner(System.in);
		System.out.println("메뉴 번호 입력: ");
		int orderNum = sc.nextInt();

		String selectedMenu = (orderNum == 1) ? "더 멜론 오브 멜론 프라푸치노를 주문하셨습니다."
							 :(orderNum == 2) ? "자몽 망고 코코 프라푸치노를 주문하셨습니다."
							 :(orderNum == 3) ? "카페 브륄레 프라푸치노를 주문하셨습니다."
							 :"없는 메뉴를 주문하셨습니다.";
		// 조건식 ? 조건식이 true일 경우 결과 값 : 조건식이 false일 경우 결과 값
		
		// 선택한 번호에 따라서 메뉴명을 출력
		// 1번 입력 시 == "~~~주문하셨습니다."
		
		System.out.println(selectedMenu);
				
	}
	
	// 홀짝 구하기
	public void method2() {
		
		// 사용자에게 정수 값을 하나 입력받아서
		// 입력받은 정수가 홀 / 짝 판별해서 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("🎲🎲홀수짝수🎲🎲");
		System.out.print("숫자를 입력해주세요 : ");
		int num = sc.nextInt();
		//System.out.println(num);
		
		String str = ((num % 2) == 0) ? "짝수" : "홀수";
		
		System.out.println("입력한 " + num +  "은(는) " + str);
		
		
		
	}
	
	public void practice() {
		
		// 사용자에게 알파벳 한 글자를 입력받아서
		// 입력받은 알파벳이 소문자인지 / 대문자인지 판별 후 출력
		
		// 출력형식
		// XXX(사용자가 입력한 알파벳)은(는) 소문자 / 대문자 입니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("알파벳을 입력해주세요: ");
		
		char a = sc.next().charAt(0);
		//System.out.println(a);
		
//		String result = (65 <= a && a < 97)? 	"대문자" 
//						:(97<= a && a < 122)?	"소문자" 
//						:						"잘못된 입력";
//		
//		System.out.println(a + "은(는) " + result + "입니다.");
		
		String result = (a <97)? "대문자" : "소문자";
		System.out.println(a + "은(는) " + result + "입니다.");
		
		
	}
	
	
}
