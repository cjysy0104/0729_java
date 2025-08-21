package com.kh.exception.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CheckedException {

	/*
	 * CheckedException
	 * 
	 * 문법적으로 반드시 예외처리를 해야하는 예외들
	 * => 주로 외부 매체 입/출력 시
	 */
	public void method1() throws IOException{
		
		// 사용자에게 문자열을 하나 입력받아서
		// 입력받은 문자열의 길이를 출력
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//String str = br.readLine(); // Unhandled exception type IOException
		String str = null;
		/*
		// 방법 1. try ~ catch
		try {
			str = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(str);
		System.out.println(str.length());
		*/
		
		// 방법 2. throws : 코드 작성부 말고 메서드를 호출하는 부분으로 예외처리를 위임
		str = br.readLine();
		
	}
	// Scanner는 클래스 내부에 이미 try catch문 사용해 예외처리가 됨
	
}
