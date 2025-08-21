package com.kh.hw01.run;

import com.kh.hw01.vo.Student;

public class StudentRun {

	public static void main(String[] args) {

		// 1. 객체 생성
		// Memory의 heap영역에 메모리 할당
		// choi는 Stack에서 주소값을 담고있음
		Student choi = new Student();

		// 2. 대입
		// choi의 주소값을 통해 heap 접근, 각각에 값을 대입함.
		choi.name = "최준영";
		choi.age = 25;
		choi.id = "A219078";
		choi.className = "A반";
		choi.grade = 100.5;

		choi.sayHello();

		System.out.println("학점: " + choi.grade);
		choi.takeClass();
		System.out.println("학점: " + choi.grade);
	}

}
