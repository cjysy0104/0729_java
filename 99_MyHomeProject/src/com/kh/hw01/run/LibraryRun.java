package com.kh.hw01.run;

import java.util.Scanner;

import com.kh.hw01.vo.LibraryBook;

public class LibraryRun {

	// 도서관에 책을 추가하여 관리하는 프로그램
	public static void main(String[] args) {

		LibraryBook book = new LibraryBook();

		Scanner sc = new Scanner(System.in);

		System.out.println("제목?");
		book.title = sc.nextLine();

		System.out.println("작가?");
		book.authorName = sc.nextLine();

		System.out.println("출판사?");
		book.publisher = sc.nextLine();

		System.out.println("페이지 수?");
		book.totalPage = sc.nextInt();

		System.out.println("=============");
		System.out.println("책 등록 완료.");
		System.out.println("=============");

		boolean exit = false;

		while (!exit) {
			System.out.println("메뉴를 선택해주세요 > ");
			System.out.println("1. 책 정보 출력 / 2. 책 대출/반납하기 / 3. 프로그램 종료");
			int menuNo = sc.nextInt();
			sc.nextLine();

			switch (menuNo) {
			case 1:
				book.readInfo();
				break;
			case 2:
				book.lend();
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
