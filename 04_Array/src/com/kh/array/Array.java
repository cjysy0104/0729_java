package com.kh.array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	// 변수(Variable)
	// 변수란
	// 메모리(RAM) 공간에 DATA(VALUE)값을 저장하는 공간

	// 변수의 특징 나열해보기
	//
	// 1. 고유한 식별자를 가진다.
	// 2. 공간에 새로운 값을 대입해서 사용할 수 있다.
	// 3. 자료형이 정해져있다.
	// 4. 지역변수의 경우 메모리의 Stack영역에 올라간다.
	// 5. **하나의 변수공간에는 하나의 값만 대입될 수 있다.**
	// 6. 초기화를 해야만 사용이 가능
	// 7. 초기화는 한 번만
	// 8. 자료형 크기가 정해져있다.
	// 9. 자료형끼리 변환
	// 10. 선언된 Scope 안에서만 사용
	// 11. 변수끼리 연산 가능

	/*
	 * ★☆중요☆★ 배열(Array) : 하나의 배열에 여러 개의 값을 담을 수 있음 단, "같은 자료형의 값들"만 담을 수 있음 동종
	 * 모음(homogeneous collection)이라고도 함
	 * 
	 * 자바라는 언어 자체에 내장된 '유일'한 자료구조
	 * 
	 * => 배열의 각 인덱스에 실제 값이 담김 index는 '0'부터 시작한다.
	 */

	public void method1() {

		// 임의의 정수 5개를 선언하고 초기화를 진행하자
		/*
		 * int num1 = 12; int num2 = 34; int num3 = 22; int num4 = 8; int num5 = 16;
		 * 
		 * System.out.println(num1 + num2 + num3 + num4 + num5);
		 */

		// 배열

		// 1. 배열 선언

		/*
		 * >변수 선언 방법
		 * 
		 * 자료형 변수식별자;
		 * 
		 * >배열 선언 방법
		 * 
		 * 1) 자료형 배열식별자[]; 2) 자료형[] 배열식별자; --> 를 사용할 것
		 */

		// 변수선언
		// int num;

		// 배열선언
		// int[] nums; // 식별자: 보통 복수형 사용

		// Type mismatch : int형배열에 int 대입 X
		// int[] nums = 0;

		// 2. 배열 할당

		/*
		 * 배열에 몇 개의 값이 들어갈지 배열의 크기를 정해주는 과정 지정한 개수만큼 값이 들어갈 공간이 할당됨
		 * 
		 * [ 표현법 ]
		 * 
		 * int[] numbers; // 배열 선언 numbers = new int[5]; // 할당
		 * 
		 * int[] arr = new int[5]; // 선언과 동시에 할당
		 * 
		 * 배열은 참조 자료형이다.
		 */
		// 크기 정해져있지 x, 동적할당(java에선 사용 x 단어)

		// nums라는 정수형 배열을 선언하고 5칸 할당받아보기
		int[] nums = new int[5];

		// 3. 배열의 각 인덱스에 값 대입
		/*
		 * [ 표현법 ]
		 * 
		 * 배열식별자[인덱스] = 값;
		 */

		nums[0] = 15;
		nums[1] = 20;
		nums[2] = 8;
		nums[3] = 37;
		nums[4] = 28;

		// System.out.println(nums); // 원하는 값 출력 x
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		System.out.println(nums[3]);
		System.out.println(nums[4]);

		int sum = 0;
		for (int i = 0; i < 5; i++) {
			sum += nums[i];
		}
		System.out.println(sum);
		// 현시점에서 우리가 배열을 사용해 얻을 수 있는 이점: 위과 같이 반복문 사용 가능
	}

	public void methodA() {

		// 배열을 공부해보자

		// 1. 배열 선언 및 할당
		int i;
		int[] integers = new int[3]; // 0, 1, 2
		double[] doubles = new double[2]; // 0, 1

		// 배열식별자.length : 배열의 크기(길이) => 정수
		// System.out.println(integers.length); // 3
		// System.out.println(doubles.length); // 2

		// 변수와 비교

		/*
		 * System.out.println(i); // 초기화를 진행하지 않으면 사용할 수 없
		 */
		/*
		 * i = 1; System.out.println(i); // 1 System.out.println(integers); //
		 * [I@7960847b System.out.println(integers[0]); // 0 >> 초기화x but (heap)기본은 0
		 * 대입되있음 // integers = 1; // 주소값을 넣는 변수, int값 대입x integers[0] = 1;
		 * System.out.println(integers[0]);
		 */
		/*
		 * 기본자료형: boolean, char, byte, short, int, long, float, double => 변수 공간에 실제 값을
		 * 바로 담을 수 있음 : (지역)변수 (stack)
		 * 
		 * 참조자료형: boolean[], char[], byte[], int[], ... , String => 주소값을 담고 있는 변수 : 참조
		 * 변수(레퍼런스) (heap)
		 * 
		 */
		/*
		 * // 인포, A강의장, B강의장, C강의장, 사무실 String[] KH정보교육원종로지원; // methodA에 올려짐
		 * KH정보교육원종로지원 = new String[5]; // new String[5] >> heap에 5개 생김 (실제론 x), 주소값을
		 * KH~에 대입 System.out.println("종로점 주소 : " + KH정보교육원종로지원); // 실제 주소는 X
		 * KH정보교육원종로지원[0] = "인포"; KH정보교육원종로지원[1] = "A강의장"; KH정보교육원종로지원[2] = "B강의장";
		 * KH정보교육원종로지원[3] = "C강의장"; KH정보교육원종로지원[4] = "사무실";
		 * 
		 * // C강의장 출력 //System.out.println(KH정보교육원종로지원[3]);
		 * 
		 * // 모든 배열값 출력 // System.out.println(KH정보교육원종로지원[0]); //
		 * System.out.println(KH정보교육원종로지원[1]); // System.out.println(KH정보교육원종로지원[2]); //
		 * System.out.println(KH정보교육원종로지원[3]); // System.out.println(KH정보교육원종로지원[4]);
		 * for(int index = 0; index < 5; index++) {
		 * System.out.println(KH정보교육원종로지원[index]); }
		 */
		int num1 = 3;
		int num2 = 3;
		System.out.println(num1 == num2); // true

		int[] nums1 = new int[3];
		int[] nums2 = new int[3];
		System.out.println(nums1 == nums2); // false : 주소값비교이기 때문

		// 참조자료형에서는 ==(동등비교 연산자) 사용 시
		// 주소값을 비교하기 때문에 원하는 결과를 얻을 수 없음
		// 문자열 == 문자열 => 역시 주소값 비교, value비교는 문자열.equals("비교할 문자열");

		// 해시코드 : 주소값을 10진수(int형태)형태로 나타낸 것
		System.out.println(nums1.hashCode());
		System.out.println(nums2.hashCode());

	}

	public void lotto() {

		// lotto ver_0.2
		int[] lottoNums = new int[6];

		System.out.println("Lotto 숫자를 생성합니다.");
		/*
		 * lottoNums[0] = (int)(Math.random() * 45)+1; lottoNums[1] =
		 * (int)(Math.random() * 45)+1; lottoNums[2] = (int)(Math.random() * 45)+1;
		 * lottoNums[3] = (int)(Math.random() * 45)+1; lottoNums[4] =
		 * (int)(Math.random() * 45)+1; lottoNums[5] = (int)(Math.random() * 45)+1;
		 */
		for (int i = 0; i < 6; i++) {

			lottoNums[i] = (int) (Math.random() * 45) + 1;
			// System.out.print(lottoNums[i] + " ");
		}

		// Arrays.toString(배열식별자)
		System.out.println(Arrays.toString(lottoNums));

		System.out.println("\n당첨되세요.");
	}

	public void methodB() {

		// 5개의 element를 담을 수 있는 String형 배열을 선언 및 할당하시오.

		// 1. 배열 선언 및 할당
		String[] animals = new String[5];

		// 2. 배열 인덱스에 동물 대입
		animals[0] = "사자";
		animals[1] = "호랑이";
		animals[2] = "코끼리";
		animals[3] = "강아지";
		animals[4] = "고양이";
		// animals[5] = "???"; <-- 문법적으로는 문제 없음

		/*
		 * ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5 배열의 인덱스가
		 * 범위를 벗어남
		 */

		// Stack Trace
		// at com.kh.array.Array.methodB(Array.java:239)
		// at com.kh.run.Run.main(Run.java:13)
	}

	public void methodC() {

		// 사용자에게 세 개의 정수를 입력받아서 입력받은 정수 중 최소값 구하기

		// 현 시점에서 배열을 선택할 때의 기준
		// 1. 두 개 이상의 같은 자료형의 값을 다룰 것
		// 2. 다룰 값의 개수가 명확하게 정해져 있을 것

		// 1) 사용자로부터 값을 입력받아서 배열의 각 인덱스에 대입
		Scanner sc = new Scanner(System.in); // 입력도구
		int[] nums = new int[4]; // 저장소

		/*
		 * System.out.println("첫 번째 정수를 입력해주세요> "); nums[0] = sc.nextInt();
		 * System.out.println("nums라는 배열의 0번째 인덱스에 대입된 값 : " + nums[0]);
		 * 
		 * System.out.println("두 번째 정수를 입력해주세요> "); nums[1] = sc.nextInt();
		 * System.out.println("nums라는 배열의 1번째 인덱스에 대입된 값 : " + nums[1]);
		 * 
		 * System.out.println("세 번째 정수를 입력해주세요> "); nums[2] = sc.nextInt();
		 * System.out.println("nums라는 배열의 2번째 인덱스에 대입된 값 : " + nums[2]);
		 */

		for (int i = 0; i < nums.length; i++) {

			System.out.println("정수를 입력해주세요 > ");
			nums[i] = sc.nextInt();
			System.out.println("nums라는 배열의 " + i + "번째 인덱스 값: " + nums[i]);
			System.out.println("=================");
		}
		System.out.println(Arrays.toString(nums));

		/*
		 * int min = nums[0];
		 * 
		 * if(min > nums[1]) { min = nums[1]; } if(min > nums[2]) { min = nums[2]; }
		 * System.out.println("배열의 최솟값: " + min);
		 */

		int min = nums[0];
		for (int i = 1; i < nums.length; i++) {

			if (min > nums[i]) {
				min = nums[i];
			}
		}
		System.out.println("배열의 최솟값: " + min);

		/*
		 * 내가한거 nums[0] = sc.nextInt(); int min = nums[0];
		 * 
		 * for(int i = 1; i < nums.length; i++) { nums[i] = sc.nextInt(); if(min >
		 * nums[i]) min = nums[i]; } System.out.println(min);
		 */
	}

	public void methodD() {

		/*
		 * 한 번 할당받은 배열의 크기를 변경할 수 없음
		 */
		String[] name = new String[3];

		name[0] = "최";
		name[1] = "준";
		name[2] = "영";
		System.out.println(Arrays.toString(name));
		name[2] = "형";
		System.out.println(Arrays.toString(name));
		System.out.println(name.hashCode());

		name = new String[5];
		name[2] = "형";
		System.out.println(Arrays.toString(name));
		System.out.println(name.hashCode());
		// 자동 메모리 관리 : GC;

		/*
		 * 연결이 끊긴 기존의 배열은 일정 시간이 지나면 G.C가 알아서 삭제해준다. : 자동 메모리 관리
		 * 
		 * 기존 배열식별자에 할당만 새롭게 한다면 => 기존 참조하고 있던 연결이 끊기고 새로운 배열을 참조함
		 */

		// null: 아무것도 존재하지 않음을 의미하는 값
		/*
		 * 기본값
		 * 
		 * 정수 = 0 실수 = 0.0 문자 = ''
		 * 
		 * 참조자료형 = null
		 * 
		 * 참조자료형에는 null이라는 값이 들어가는데 주소값이 존재하는가 그렇지 않은가
		 */
		name = null; // 현재 연결고리를 끊고싶다.
		name[0] = "홍길동";
		System.out.println(name); // : NullPointerException
		// 가리키고 있는 대상이 null인데 주소가 없다. 어디로 접근?
		// System.out.println(name.hashCode());
	}

	public void methodE() {

		// 배열 어디서 , 보통 어떻게?
		int[] arr = new int[3]; // 0, 1, 2
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		System.out.println(Arrays.toString(arr));

		// 배열 보통 선언과 동시에 요소를 대입해서 사용하곤 함
		int[] ar1 = new int[] { 1, 2, 3 };
		System.out.println(Arrays.toString(ar1));

		int[] ar2 = { 100, 200, 300 }; // 가장 일반적 방식
		System.out.println(Arrays.toString(ar2));

	}

	/*
	 * 배열 복사
	 * 
	 * 1. 얕은 복사 ☆★☆★
	 * 
	 * 2. 깊은 복사
	 */

	// 1. 얕은 복사
	public void methodF() {

		// 중요
		int[] origin = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(origin));

		// 1. 얕은 복사로 배열을 복사
		int[] copy = origin;
		System.out.println(Arrays.toString(copy));

		origin[2] = 33;
		System.out.println(Arrays.toString(origin));
		System.out.println(Arrays.toString(copy));

		// 얕은 복사 => 주소값을 대입하는 것이기 때문에 가리키고 있는 대상이 같다.
		System.out.println(origin.hashCode());
		System.out.println(copy.hashCode());

	}

	// 2. 깊은 복사
	public void methodG() {

		int[] origin = { 1, 2, 3, 4, 5 };

		int[] copy = new int[6];

		/*
		 * copy[0] = origin[0]; copy[1] = origin[1]; copy[2] = origin[2]; copy[3] =
		 * origin[3]; copy[4] = origin[4];
		 */
		for (int i = 0; i < origin.length; i++)
			copy[i] = origin[i];

		// 배열의 깊은 복사의 경우 기존 배열의 크기보다 큰 배열로 복사하는 경우가 많음
		System.out.println(Arrays.toString(origin));
		System.out.println(Arrays.toString(copy));

		System.out.println(origin.hashCode());
		System.out.println(copy.hashCode());

		System.out.println("========================");
		int[] copy2 = new int[10];
		/* 원본배열 *//* 복사할배열시작인덱스 *//* 복사배열 *//* 복사될배열시작인덱스 *//* 복사길이 */
		System.arraycopy(origin, 0, copy2, 1, 4);
		System.out.println(Arrays.toString(copy2));
		/*
		 * 네이밍컨벤션 == 첫 글자가 대문자 == 클래스 / 인터페이스 arraycopy() ==> System클래스
		 * 
		 * System.arraycopy(원본 배열 식별자, 원본배열에서 복사를 시작할 인덱스, 복사본 배열 식별자, 복사본 배열에서 복사가 시작될
		 * 인덱스, 복사할 개수)
		 */

		System.out.println("========================");

		// Arrays클래스에서 제공하는 copyOf()
		int[] copy3 = Arrays.copyOf(origin, 15);

		System.out.println(Arrays.toString(copy3));

		System.out.println("========================");
		// .clone()
		int[] copy4 = origin.clone();
		
		System.out.println(Arrays.toString(copy4));
	}
}
