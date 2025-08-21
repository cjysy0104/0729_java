package com.kh.chap01.abstraction.run;

import java.util.Scanner;

import com.kh.chap01.abstraction.vo.Puppy;

public class PuppyCareRun {

	public static void main(String[] args) {

		// 사용자에게 강아지의 정보를 입력받아서
		// 입력받은 강아지의 정보를 출력해주고
		// 강아지와 함께 놀아줄 수 있는 프로그램
		System.out.println("🐶강아지 키우기🐶");
		/* Scanner 타입의 변수 선언 */Scanner sc = /* Scanner 객체 생성 */new Scanner(System.in); // 변수에 객체 주소값 대입

		Puppy puppy = new Puppy();

		System.out.println("이름은?");
		puppy.name = sc.nextLine();

		System.out.println("종은?");
		puppy.species = sc.nextLine();

		System.out.println("나이는?");
		puppy.age = sc.nextInt();
		sc.nextLine();

		System.out.println("성별은?");
		puppy.gender = sc.nextLine();

		System.out.println("몸무게는?");
		puppy.weight = sc.nextInt();
		sc.nextLine();

		System.out.println("색깔은?");
		puppy.color = sc.nextLine();

		boolean exit = false;

		while (!exit) {
			System.out.println("🦮🦮🦮🦮🦮🦮🦮🦮🦮🦮🦮🦮");
			System.out.println(puppy.name + "의 정보!");
			System.out.println("나이: " + puppy.age);
			System.out.println("성별: " + puppy.gender);
			System.out.println("종: " + puppy.species);
			System.out.println("색: " + puppy.color);
			System.out.println("무게: " + puppy.weight);
			System.out.println("🦮🦮🦮🦮🦮🦮🦮🦮🦮🦮🦮🦮");
			System.out.println();

			System.out.println("메뉴를 선택해주세요 > ");
			if (puppy.weight > 40) {
				System.out.println("※다이어트를 위해 짖기를 추천해드려요.");
			}
			System.out.println("1. 냄새맡기 / 2. 짖기 / 3. 프로그램 종료 >");
			int menuNo = sc.nextInt();
			sc.nextLine();

			switch (menuNo) {
			case 1:
				puppy.sniff();
				break;
			case 2:
				puppy.bark();
				break;
			case 3:
				System.out.println("프로그램 종료");
				exit = true;
				break;
			default:
				System.out.println("메뉴를 다시 선택해 주세요.");
			}
		}
	}
}
