package com.kh.chap01.run;

import com.kh.chap01.model.vo.Child1;
import com.kh.chap01.model.vo.Child2;
import com.kh.chap01.model.vo.Parent;

public class Run {
		/*
		 * 상속구조
		 * 
		 * 필드 / 메서드 => 크게 중요한게 X
		 * 
		 * ★★★ 타입 => 중요
		 */
	public static void main(String[] args) {

		// 1. 부모 타입 자료형으로 부모 타입 객체를 다룸
		Parent p1 = new Parent();
		p1.printParent();
		// p1.printChild1(); 자식이 가지고 있는 멤버는 부모가 사용할 수 없음
		// p1변수로는 Parent에만 접근 가능
		
		// 2. 자식 타입 자료형으로 자식 타입 객체를 다룸
		Child1 c1 = new Child1();
		c1.printChild1(); // 본인 클래스에 선언한 메서드 호출 가능
		c1.printParent(); // 부모 클래스도 가능
		// c1 변수로는 Child1, Parent 둘 다 접근 가능
		
		// 3. 부모 타입 자료형으로 자식 타입 객체를 다룸 ==> 다형성 적용
		Parent p2 = /*(Parent)*/new Child1(); // 부모에게 자료형을 물려받음 > 자식은 부모형으로 캐스팅 가능
		p2.printParent();
		//p2.printChild1(); // Parent Type에는 자식 호출 못함, p2로는 Parent 타입만 접근 가능
		// >>
		// 양쪽의 자료형이 다름에도 불구하고 에러가 발생하지 않는 이유는
		// 부모클래스인 Parent가 자식클래스는 Child1에게 타입을 물려주어서
		// 클래스 형변환이 일어났기 때문
		
		/*
		 * 클래스 형 변환
		 * 
		 * "상속 구조"일 경우에만 가능
		 * 
		 * 1. Up Casting
		 * 
		 * 자식타입 => 부모타입 	(Parent p2 = new Child1();)
		 * 생략이 가능
		 * 
		 * 2. Down Casting
		 * 
		 * 부모타입 => 자식타입
		 * 생략이 불가능
		 */
		((Child1)p2).printChild1();
		
		
		// Child1타입의 객체 두 개
		// Child2타입의 객체 두 개
		// 총 네게의 객체를 다뤄볼 것
		/*
		Child1 child1 = new Child1();
		Child1 child2 = new Child1();
		Child2 child3 = new Child2();
		Child2 child4 = new Child2();
		
		child1.printChild1();
		child2.printChild1();
		child3.printChild2();
		child4.printChild2();
		*/
		
		// 100개면 변수 어캐함??
		// 배열을 사용해보자
		// 배열 == 한 종류의 자료형인 값들을 묶어서 관리할 수 있음
		/*
		Child1[] arr1 = new Child1[2];
		Child2[] arr2 = new Child2[2];
		arr1[0] = new Child1();
		arr1[1] = new Child1();
		arr2[0] = new Child2();
		arr2[1] = new Child2();
		
		arr1[0].printChild1();
		arr1[1].printChild1();
		arr2[0].printChild2();
		arr2[1].printChild2();
		*/
		
		// 다형성을 적용해보자
		System.out.println("\n\n다형성을 적용해보자");
		Parent[] arr = new Parent[4];
		arr[0] = (Parent)new Child1();
		arr[1] = (Parent)new Child2();
		arr[2] = new Child1();
		arr[3] = new Child2();
		
		// arr[0].printChild1(); // Parent 타입으로 담아서 Child는 안댐 > Down Casting 필요
		// overriding
		for(int i = 0; i < arr.length; i++) {
			arr[i].printParent();
			// 부모클래스 X4
			// 실제로 자식 객체 메서드 우선
			/*
			 * 동적 바인딩 : 프로그램 "실행 전" 컴파일 시점에 정적바인딩 수행(자료형의 메서드를 가리킴)
			 * 			 실질적으로 참조하고 있는 객체가 해당 메서드를 오버라이딩 했다면
			 * 			 프로그램 "실행 시점" 동적으로 자식클래스의 오버라이딩된 메서드를 실행
			 *					(Runtime) 
			 * 
			 * 다형성 : 부모클래스 자료형으로 여러 자식클래스를 다루는 기술
			 */
		}
		
		System.out.println("================================");
		// Child1, Child2로 
		
		/* instanceof 사용
		for(int i = 0; i < arr.length; i++) {
			/ if문 가능하지만 인덱스 많아지면 감당 X/
			if(arr[i] instanceof Child1) {
				// instanceof => true / false
				// 현재 참조변수가 실질적으로 어떤 클래스타입을 참조하고 있는지 확인할 때 사용
				((Child1)arr[i]).printChild1();
			} else {
				((Child2)arr[i]).printChild2();
			}
		}
		*/
		
	
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
}
