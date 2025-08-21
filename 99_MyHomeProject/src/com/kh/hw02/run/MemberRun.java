package com.kh.hw02.run;

import java.util.Scanner;

import com.kh.hw02.vo.Member;

public class MemberRun {

	public static void main(String[] args) {

		Member member = new Member("123AC","Choi","male","cjy@naver.com",25);
		
		Scanner sc = new Scanner(System.in);
		
		boolean exit = false;

		while (!exit) {
			System.out.println("1. 회원정보 출력 /" + " 2. 정보 수정 /" + " 3. 프로그램 종료");
			int menuNo = sc.nextInt();
			sc.nextLine();

			switch (menuNo) {
			case 1:
				System.out.println(member.info());
				break;
			case 2:
				System.out.println("회원번호: ");
				member.setId(sc.nextLine());

				System.out.println("이름: ");
				member.setName(sc.nextLine());

				System.out.println("성별: ");
				member.setGender(sc.nextLine());

				System.out.println("몸무게: ");
				member.setEmail(sc.nextLine());

				System.out.println("나이: ");
				member.setAge(sc.nextInt());
				
				System.out.println("변경이 완료되었습니다.");
				sc.nextLine();
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
