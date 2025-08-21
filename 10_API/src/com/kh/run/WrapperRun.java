package com.kh.run;

public class WrapperRun {

	public static void main(String[] args) {
		/*
		 * Wrapper Class
		 * => 기본자료형을 참조자료형으로 포장해주는 클래스들을 래퍼클래스라고 함
		 * 
		 * 
		 * 기본 자료형					Wrapper Class
		 *             <----->
		 * boolean					Boolean
		 * char						Character
		 * byte						Byte
		 * short					Short
		 * int 						Integer
		 * long						Long
		 * float					Float
		 * double					Double
		 */
		
		// 기본자료형을 객체로 취급해야 하는 경우
		// 메서드 매개변수 자료형이 기본자료형이 아닌 참조자료형만 사용 가능한 경우 >> Object.equals(Object obj) 다형성으로 모든 참조자료형 가능하지만 기본자료형은 x
		// 다형성을 적용해야겠다!
		
		int num1 = 10;
		int num2 = 15;
		
		// Object.equals()
//		Integer i1 = new Integer(num1);
//		System.out.println(i1);
		
		// 기본자료형 => Wrapper로 포장
		Integer i1 = num1;
		Integer i2 = num2;
		System.out.println(i1.equals(i2));
		System.out.println(i1.compareTo(i2));
		// a.compareTo(b)
		// a가 b보다 크면 1을 반환
		// a가 b보다 작으면 -1을 반환
		// 같으면 0 반환
		
		// "123", "1.1"
		String str1 = "10";
		String str2 = "1.1";
		
		System.out.println(str1 + str2); // 101.1
		
		// 파싱(parsing) == 특정 데이터를 규칙에 따라서 분석하고 새헉하는 과정
		
		int i = Integer.parseInt(str1);
		double d = Double.parseDouble(str2);
		// 해당 Wrapper클래스이름.parseXXX(데이터);
		
		System.out.println(i);
		
		System.out.println(d);
		
		System.out.println(/*(double)*/i+d);
		
		String strInteger = String.valueOf(i);
		

	}

}
