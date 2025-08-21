package com.kh.hw01.run;

import java.util.Scanner;

import com.kh.hw01.vo.MemberVO;

public class MemberRun {

	public static void main(String[] args) {

		MemberVO m = new MemberVO();

		Scanner sc = new Scanner(System.in);

		boolean exit = false;

		while (!exit) {
			System.out.println("메뉴를 선택해주세요 > ");
			System.out.println("1. 신규 등록 / 2. 정보 출력 / 3. 프로그램 종료");
			int menuNo = sc.nextInt();
			sc.nextLine();
			
			switch (menuNo) {
			case 1:
				m.registerMember();
				break;
			case 2:
				m.printMember();
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
