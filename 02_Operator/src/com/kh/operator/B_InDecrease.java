package com.kh.operator;

public class B_InDecrease {

	/*
	 * 증감연산자 : 단항연산자로 한 번에 1씩 증가 / 감소하는 연산을 함
	 * 
	 * [ 표현법 ]
	 * ++ : 값을 1 증가 시키는 연산자
	 * -- : 값을 1 감소 시키는 연산자
	 * 
	 * => 증감을 먼저 할 건지, 나중에 할 건지에 따라 연산자의 위치가 달라짐
	 * 
	 * 연산자의 위치
	 * 전위 연산 : ++값, --값		-> 먼저 값을 증가(혹은 감소)시키고 나서 작업을 처리
	 * 후위 연산 : 값++, 값--		-> 먼저 값을 처리하고 나서 증가(혹은 감소)
	 */
	
	// 후위연산 첫 번째 메서드
	public void method1() {
		
		//System.out.println("?");
		
		int num = 10;
		System.out.println("num : " + num);
		num++;
		
		System.out.println("num : " + num);
		num--;
		
		System.out.println("num : " + num);
		System.out.println("num : " + num++);
		System.out.println("num : " + num++);
		System.out.println("num : " + num);
		
	}
	
	// 후위연산 두 번째 메서드
	public void method2() {
		
		int a = 10;
		int b = a++;
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
		int c = 20;
		int d = c++ * 3;
		
		System.out.println("c : " + c);
		System.out.println("d : " + d);
		
	}
	
	// 전위연산
	public void method3() {
		
		int a = 10;
		int b = ++a;
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
		int c = 20;
		int d = ++c * 3;
		
		System.out.println("c : " + c);
		System.out.println("d : " + d);
		
	}
	
	
	
	
	
	
	
	
	
}
