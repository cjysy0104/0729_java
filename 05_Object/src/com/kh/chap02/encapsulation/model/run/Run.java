package com.kh.chap02.encapsulation.model.run;

import com.kh.chap02.encapsulation.model.vo.Cafe;

public class Run {

	// 캡슐화 (encapsulation)
	// 속성(데이터)과 해당 데이터를 조작하는 행동(메서드)를 하나의 단위로 묶는 것
	// 정보은닉(information hiding)
	
	// 접근제한자 (예약어) 반환형 메서드식별자(매개변수){	}
	public static void main(String[] args) {
		
		// 변수선언 대입연산자 객체생성(=메모리에적재)
		Cafe cafe = new Cafe();
		
		/*
		cafe.name = "KH카페";
		System.out.println(cafe.name);
		cafe.signatureMenu = "KH커피";
		cafe.signatureMenuPrice = -500;
		System.out.println(cafe.signatureMenu);
		System.out.println(cafe.signatureMenuPrice);
		*/
		
		// 필드가 보이지 않아서(외부에서 접근이 불가능해서) 오류 발생!
		// 접근제한자를 public에서 private로 변경했기 때문에 직접 접근이 불가능
		// 직접 접근이 불가능하기 때문에 간접적으로 접근할 수 있는 방법을 만들어 주어야함
		// Cafe라는 클래스에 getter / setter라는 메서드 만들기
		//cafe.signatureMenuPrice = -500;
		
		// *** 객체의 내부적 관점 / 외부적 관점
//		cafe.dishWash();
//		cafe.cleaning();
//		cafe.windowWash();
		//cafe.open();
		
		// main에서 찍어본 주소
		//System.out.println("main에서 찍어본 주소" + cafe);
		// 메소드 호출 부에서는 오로지 값만 넘길 수 있음
		cafe.setSignatureMenuPrice(5000); // 50000 => 넘겨주는 값: 인자값, arguments
		cafe.setName("KH카페");
		cafe.setAdress("서울시 중구 남대문로 120 2F");
		System.out.println(cafe.getName());
		System.out.println(cafe.getAddress());
		System.out.println(cafe.getSignatureMenuPrice());
		
//		String cafeName = cafe.getName();
//		System.out.println(cafeName);
		System.out.println(cafe.info());
		
	}

}
