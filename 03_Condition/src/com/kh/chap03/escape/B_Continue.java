package com.kh.chap03.escape;

import java.util.Scanner;

public class B_Continue {

	/*
	 * continue : 반복문 안에서 사용하는 문법
	 * 
	 * continue문을 만나면 continue 이후에 어떤 코드가 존재하던가에 실행하지않고 pass
	 * 반복문 scope 최상단으로 올라가는 것을 의미
	 */
	
	public void method1() {
		
		// 1부터 10까지 반복을 하면서 정수값을 출력
		// 홀 수 일때만 출력
		for(int i = 0; i < 10; /*1. i+=2*/i++) {
			//2. if(i % 2 == 1)
			
			//3. continue문 
			if((i+1) % 2 == 0) {
				continue; // continue되면 증감식으로 ㄱㄱ
			}
			System.out.println(i+1);
			
		}
	}
	
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("회원가입서비스입니다.");
		
		while(true) {
			
			System.out.println("아이디를 입력해주세요(10자 이하) > ");
			String userId = sc.nextLine();
			
			if(userId.length() > 10) {
				System.out.println("10자 이하!!!");
				continue;
			}
			else {
				System.out.println("사용 가능한 아이디입니다.");
				break;
			}
		}
	}
}
