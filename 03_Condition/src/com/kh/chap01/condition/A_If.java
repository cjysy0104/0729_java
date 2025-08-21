package com.kh.chap01.condition;

import java.util.Scanner;

public class A_If {

	/*
	 * (단일) if문
	 * 
	 * [ 표현법 ]
	 * 
	 * if(조건식){ 
	 * 
	 * 		조건식이 true일 경우 실행하고자 하는 코드;
	 *  
	 * }
	 * 
	 * => 조건식의 결과가 true일 경우 : if문 Scope({})안의 코드가 수행
	 * => 조건식의 결과가 false일 경우 : if문 Scope({})를 건너뜀 
	 */
	
	public void method1() {
		
		if(0 < 1) {
			System.out.println("0은 1보다 작아요");
		}
		
		// if문의 조건식 자리에는 결론적으로 true 아니면 false값이 들어가도록 만들어야함
		if(true) {
			
			System.out.println("조건식 자리에는 최종적으로 true가 와야함");
		}
		
//		if(false) {
//			
//			System.out.println("DEAD");
//		}
		
		
		
	}
	
	public void method2() {
		
		boolean loginCheck = true; // login 상태를 저장하는 변수
		
		if(!loginCheck) {
			System.out.println("네이버를 더 안전하고 편리하게 이용해보세요.");
			System.out.println("NAVER 로그인");
			System.out.println("아이디 찾기 | 비밀번호 찾기 | 회원가입");
		}

		if(loginCheck) {
			System.out.println("홍길동님 환영합니다 (●'◡'●)");
			System.out.println("메일 | 카페 | 블로그 | 쇼핑 | 예약");
		}
	}
	
	public void practice() {
		
		// 오늘의 날씨를 입력받아서
		Scanner sc = new Scanner(System.in);
		
		// 더움 / 맑음 / 비옴
		System.out.println("오늘의 날씨는 어떤가요?");
		System.out.println("더움 | 맑음 | 비옴");
		System.out.print("입력: ");
		String weather = sc.nextLine();
		//System.out.println("입력받음>>" + weather);
		
		// 비옴을 입력했다면, 김밥천국을 가라고 하자
		// -> 사용자가 입력한 값과 "비옴"이라는 문자열값을 동등비교해서 일치하는지 비교
		// weather 동등비교 "비옴"
		// System.out.println(weather == "비옴"); // false
		// 문자열값 비교 : 동등비교연산자(==) 사용할 수 없음
		// .equals()를 호출해야함
		
		// 점심 메뉴를 추천해주는 프로그램
		// 조건
		// 만약에 사용자가 입력한 문자열이 "비옴"과 일치하다면
		// if 		weather 	  "비옴"	 .equals()
		// 김천
		if(weather.equals("비옴")) {
			
			System.out.println("김천 스페셜정식 무라");
		}

		// 만약에 사용자가 입력한 문자열이 "더움"과 일치하다면
		if(weather.equals("더움")) {
			
			System.out.println("절대 김밥일번가에서 냉모밀을 먹지마");
		}
		
		// 만약에 사용자가 입력한 문자열이 "맑음"과 일치하다면
		if(weather.equals("맑음")) {
			
			System.out.println("지하철");
		}
		
		
		
	}

	public void method3() {
		
		// 사용자에게 정수값을 입력받아서 홀짝을 판별 => 출력
		// if문을 이용해서 출력!
		// 단, 입력받은 정수가 0보다 클 경우에만 조건문을 실행
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자. 입력해. ");
		int num = sc.nextInt();
		//System.out.println(num);
		
		// if
		
		// 조건식
		//
		// 비교연산
		// 1. 입력받은 정수가 0보다 클 경우에만
		//			num > 0
		
		// 2. 홀 / 짝
		// 	  입력받은 정수를 2로 나눈 나머지를 0과 동등비교
		//			num % 2		== 		0 짝수
		//			num % 2		== 		1 홀수		
//		if(num % 2 == 0 && num > 0) 
//			System.out.println("짝수");
//		if(num % 2 != 0 && num > 0) 
//			System.out.println("홀수");
		// num % 2 == 0, num % 2 != 0 << 연산 또 할 필요 있음?
		
		// 1안
		boolean flag = num > 0;
		
		if(flag && num > 0) 
			System.out.println("짝수");
		if(flag && num > 0) 
			System.out.println("홀수");
		
		// 2안 if문 중첩
		if(num > 0) {
			if(num % 2 == 0) System.out.println("짝수");
			if(num % 2 != 0) System.out.println("홀수");
		}
		
	}

	public void method4() {
		
		// 1. 메뉴판 보여주기
		// 출력문
		
		// 2. 메뉴번호로 메뉴 입력받기
		// Scanner nextInt()
		
		// 3. 수량 입력받기
		// Scanner nextInt()
		
		// 4. 조건문
		// if문을 이용해서 입력한 메뉴번호에 따라 메뉴명 대입하기
		// 혹시 없는 메뉴 번호를 입력했다면 없는 메뉴라고 대입하기
		
		// 5. 출력: XX메뉴를 XX잔 주문하셨습니다.
		// print()
		
		// 6. 진짜 주문할건지 물어보기
		// Y / N 입력받아서 확인하기
		
		// 7. 6번에서 입력받은 단일 문자가 'Y' 또는 'y'와 일치하다면
		// 메뉴명과 수량과 가격 출력하기
		// if문 + 중첩if문 + 출력문
		
		
		
		// 1.
		System.out.println("==시즌 메뉴판==");
		System.out.println("1.더 멜론 오브 멜론 프라푸치노(5500)");
		System.out.println("2.자몽 망고 코코 프라푸치노(6500)");
		System.out.println("3.카페 브륄레 프라푸치노(3800)");
		System.out.println("============");
		
		// 2.
		Scanner sc = new Scanner(System.in);
		System.out.println("뭐시킬거(번호): ");
		int menuNum = sc.nextInt();
		
		// 4.
		String selectedMenu = "그런거 없다 ㄱ-";
		int menuPrice = 0;
		if(menuNum == 1) {
			selectedMenu = "더 멜론 오브 멜론 프라푸치노";
			menuPrice = 5500;
		}
		if(menuNum == 2) {
			selectedMenu = "자몽 망고 코코 프라푸치노";
			menuPrice = 6500;
		}
		if(menuNum == 3) {
			selectedMenu = "카페 브륄레 프라푸치노";
			menuPrice = 3800;
		}
		
		if(menuNum > 3) {
			System.out.println(selectedMenu);
			return;
		}
		
		// 3.
		System.out.println("몇잔: ");
		int eaNum = sc.nextInt();
		
		
		
		// 5.
		System.out.printf(selectedMenu + "메뉴를 %d잔 주문하셨습니다.\n", eaNum);
		
		// 6~7.
		System.out.println("진심이야? (Y / N) : ");
		sc.nextLine();
		char flag = sc.nextLine().charAt(0);
		
		if(flag == 'Y' || flag == 'y') {
			
			int totalPrice = menuPrice * eaNum;
			System.out.printf(selectedMenu + "메뉴를 %d잔 주문하셨습니다. 총 %d원입니다.\n", eaNum, totalPrice);
			
		}
		
		if(flag == 'N' || flag == 'n')
			System.out.println("내 그럴줄 알았다 ㅂㅇ");
		
		
	}
	
	
	
	
	
	
	
	
}
