package com.kh.hw02.run;

import java.util.Scanner;

import com.kh.hw02.vo.Cat;

public class CatRun {

	public static void main(String[] args) {

		Cat cat = new Cat("먼치킨", "돌이", "수", 4, 5);
		
		Scanner sc = new Scanner(System.in);
		
		boolean exit = false;

		while (!exit) {
			System.out.println("1. 펫 정보 출력 /" + " 2. 데굴 /" + " 3. 정보 수정 /" + " 4. 프로그램 종료");
			int menuNo = sc.nextInt();
			sc.nextLine();

			switch (menuNo) {
			case 1:
				System.out.println(cat.info());
				break;
			case 2:
				cat.degul();
				break;
			case 3:
				System.out.println("종: ");
				cat.setSpecies(sc.nextLine());

				System.out.println("이름: ");
				cat.setName(sc.nextLine());

				System.out.println("성별: ");
				cat.setGender(sc.nextLine());

				System.out.println("나이: ");
				cat.setAge(sc.nextInt());
				
				System.out.println("몸무게: ");
				cat.setWeight(sc.nextInt());
				
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
