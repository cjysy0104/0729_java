package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;
import com.kh.hw.person.model.vo.Student;

public class PersonMenu {

	private Scanner sc = new Scanner(System.in);
	private PersonController pc = new PersonController();

	public void mainMenu() {
		while (true) {
			int[] count = pc.personCount();
			int M = count[0];
			int N = count[1];
			System.out.println("학생은 최대 3명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 학생은 " + M + "명입니다.");
			System.out.println("사원은 최대 10명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 사원은 " + N + "명입니다.");

			System.out.println();
			System.out.println();

			System.out.println("1. 학생 메뉴");
			System.out.println("2. 사원 메뉴");
			System.out.println("9. 끝내기");
			System.out.println("메뉴 번호 : ");

			int menuNo = 0;
			menuNo = sc.nextInt();
			sc.nextLine();

//			try {
//				menuNo = sc.nextInt();
//				sc.nextLine();
//			} catch (Exception e) {
//				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
//				System.out.println();
//			}

			switch (menuNo) {
			case 1:
				studentMenu();
				break;
			case 2:
				employeeMenu();
				break;
			case 9:
				System.out.println("종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				System.out.println();
				break;
			}

		}

	}

	public void studentMenu() {
		int[] count = pc.personCount();
		int M = count[0];

		if (M != 3) {
			System.out.println("1. 학생 추가");
		} else {
			System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 " + "학생 추가 메뉴는 더 이상 활성화 되지 않습니다.");
		}

		System.out.println("2. 학생 보기");
		System.out.println("9. 메인으로");

		int menuNo = 0;
		menuNo = sc.nextInt();
		sc.nextLine();

		switch (menuNo) {
		case 1:
			if (M != 3) {
				insertStudent();
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				System.out.println();
			}
			break;
		case 2:
			printStudent();
			break;
		case 9:
			System.out.println("메인으로 돌아갑니다.");
			return;
		default:
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			System.out.println();
			break;
		}
	}

	public void employeeMenu() {
		int[] count = pc.personCount();
		int N = count[1];

		if (N != 10) {
			System.out.println("1. 사원 추가");
		} else {
			System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 " + "사원 추가 메뉴는 더 이상 활성화 되지 않습니다.");
		}

		System.out.println("2. 사원 보기");
		System.out.println("9. 메인으로");

		int menuNo = 0;
		menuNo = sc.nextInt();
		sc.nextLine();

		switch (menuNo) {
		case 1:
			if (N != 3) {
				insertEmployee();
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				System.out.println();
			}
			break;
		case 2:
			printEmployee();
			break;
		case 9:
			System.out.println("메인으로 돌아갑니다.");
			return;
		default:
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			System.out.println();
			break;
		}
	}

	public void insertStudent() {
		boolean result = true;
		int[] count = pc.personCount();
		
		while(result) {
			System.out.println("학생 이름: ");
			String name = sc.nextLine();
			
			System.out.println("학생 나이: ");
			int age = sc.nextInt();
			sc.nextLine();
			
			System.out.println("학생 키: ");
			double height = sc.nextDouble();
			sc.nextLine();
			
			System.out.println("학생 몸무게: ");
			double weight = sc.nextDouble();
			sc.nextLine();
			
			System.out.println("학생 학년: ");
			int grade = sc.nextInt();
			sc.nextLine();
			
			System.out.println("학생 전공: ");
			String major = sc.nextLine();

			
			pc.insertStudent(name, age, height, weight, grade, major);
			
			count = pc.personCount();
			
			if (count[0] == 3) {
				result = false;
				System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가를 종료하고 " + "학생 메뉴로 돌아갑니다.");
				return;
			}
			System.out.println("그만하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 : ");
			char c = sc.nextLine().charAt(0);
			if (c == 'N' || c == 'n') {
				result = false;
			} else {
				result = true;
			}
		}
		

	}

	public void printStudent() {
		Student[] s = pc.printStudent();
		for(int i = 0; i < s.length; i++) {
			System.out.println(s[i].toString());
		}
	}

	public void insertEmployee() {
	}

	public void printEmployee() {
	}
}
