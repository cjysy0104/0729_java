package com.kh.chap06.run;

import com.kh.chap06.controller.MethodController;
import com.kh.chap06.controller.OverloadingController;

public class Run {

	public static void main(String[] args) {
		
		/*
		Human human = new Human();
		human.hi();
		
		Human choi = new Human();
		choi.hi();
		*/
		/*
		int a = mc.add(1, 2);
		int b = mc.add(4, 5);
		int c = mc.add(3, 7);
		int d = mc.add(a, b);
		int e = mc.add(c, d);
		System.out.println("총합: " + e);
		*/
		MethodController mc = new MethodController();
		/* int[] ar = new int[3];
		 * 자료형  식별자 객체생성 기본생성자*/
		//mc.method1();
		//mc.method2();
		//String s = mc.method2();
		//System.out.println(mc.method2());
		//System.out.println("호출결과: " + mc.method3());
		//mc.println("method3 호출: " + mc.method3());
		//mc.method4(100);
		//mc.method5(50);
		//System.out.println(mc.method5(50));
		//mc.a(); // StackOverflow
		
		//MethodController mc = mc;
		//★★★★★★★★★★★★★★★★★★★★★
		//mc.test(mc);
		//MethodController.staticMethod();
		
		/*
		System.out.println(1);
		System.out.println(1.1);
		System.out.println("asdf");
		*/
		OverloadingController oc = new OverloadingController();

		// 정적 바인딩(Static Binding)
		// 컴파일이 끝난 시점 어떤 메서드가 호출될지 결정
		// 컴파일러가 알아서 코드를 분석하여 메서드 호출 연결 
		oc.test();
		oc.test(2);
		oc.test("3");
		oc.test(4, 4);
//		oc.test(false);
//		oc.test(1.5);
	}
}
