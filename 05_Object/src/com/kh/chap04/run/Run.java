package com.kh.chap04.run;

import java.util.Scanner;

import com.kh.chap04.controller.FieldController;
import com.kh.chap04.controller.StaticController;

public class Run {

	public static void main(String[] args) {


		FieldController fc = new FieldController();
		// 1. FieldController 자료형으로 fc라는 이름의 지역변수를 선언
		// 2. 객체 생성 (new 키워드를 만났을 때)
		// 3. 주소값을 대입
		
		System.out.println(fc.global); // >> 2.시점에서 heap에 올라와있기때문에 global사용 가능
		
		fc.checkVariable(50);
		// checkVariable 호출 == parameter(매개변수) 할당 및 초기화
		
		// checkVariable 호출 종료 시
		// parameter, local 지역변수 소멸 / global은 heap에 남아있음
		System.out.println(fc.global);
		
		fc = null; // global 사용 불가능
		//System.out.println(fc.global);
		
		// 목표 : StaticController str 출력하기
		/*
		StaticController stc = new StaticController();
		System.out.println(stc.str);	
		*/
		System.out.println(StaticController.str); // static은 바로 접근해서 출력
		System.out.println(StaticController.JAVA_VERSION); 
		// 프로그램 시작할 때 static 영역에 올라가서 프로그램이 끝날 때까지 소멸X 
		
//		System.out.println(Arrays.toString(new int[2])); // toString(): 기울임꼴 > static
//		System.out.println(Math.random()); // random() : 기울임꼴 > static
//		System.out.println(Math.PI); // PI : 굵은꼴+기울임꼴 : static final
		
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		String str = sc.nextLine();
		
		/*
		 * AccessModifier(접근제어자 / 접근제한자)
		 * 
		 * (+)public => 어디서든(같은 패키지, 다른 패키지, 클래스 내/외부 포함) 접근 가능
		 * 
		 * (#)protected => 같은 패키지라면 무조건 접근 가능
		 * 			 => 다른 패키지라면 상속구조인 클래스에서만 접근 가능
		 * 			 => 상속이라는 개념 : 05_Object / 06_ObjectArray 이후 07에서
		 * 
		 * (~)default(package friendly) => 오로지 같은 패키지에서만 접근 가능
		 * 
		 * (-)private => 오직 클래스 내부에서만 접근 가능
		 */
		
		
		
		
		
		
		
	}
}
