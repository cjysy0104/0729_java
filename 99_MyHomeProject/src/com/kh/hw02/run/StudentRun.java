package com.kh.hw02.run;

import java.util.Scanner;

import com.kh.hw02.vo.Student;

public class StudentRun {

	public static void main(String[] args) {

		Student student = new Student("A2025", "최준영", "A", 25, 110.0);

		Scanner sc = new Scanner(System.in);

		boolean exit = false;

		while (!exit) {
			student.sayHello();
			System.out.println("1. 학생 정보 출력 /" + " 2. 수업 듣기 /" + " 3. 정보 수정 /" + " 4. 프로그램 종료");
			int menuNo = sc.nextInt();
			sc.nextLine();

			switch (menuNo) {
			case 1:
				System.out.println(student.info());
				break;
			case 2:
				student.takeClass(sc.nextDouble());
				break;
			case 3:
				System.out.println("학번: ");
				student.setId(sc.nextLine());

				System.out.println("이름: ");
				student.setName(sc.nextLine());

				System.out.println("반: ");
				student.setClassName(sc.nextLine());

				System.out.println("나이: ");
				student.setAge(sc.nextInt());
				
				System.out.println("취득 학점: ");
				student.setGrade(sc.nextDouble());
				
				System.out.println("변경이 완료되었습니다.");
				sc.nextLine();
				break;
			case 4:
				System.out.println("프로그램 종료");
				exit = true;
				break;
			default:
				System.out.println("메뉴를 다시 선택해 주세요.");
			}
		}
	}

}
