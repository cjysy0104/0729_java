package com.kh.practice.list.library.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.kh.practice.list.library.controller.BookController;

public class BookMenu {

	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();

	public void mainMenu() {
		System.out.println("== Welcome KH Library ==");
		

		while (true) {
			System.out.println();
			System.out.println();
			System.out.println("=====***** 메인 메뉴 *****=====");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색 조회");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 도서 명 오름차순 정렬");
			System.out.println("9. 종료 ");
			System.out.println("메뉴번호 선택 : >> ");

			try {
				int menuNo = sc.nextInt();
				sc.nextLine();

				switch (menuNo) {
				case 1:  break;
				case 2:  break;
				case 3:  break;
				case 4:  break;
				case 5:  break;
				case 9: 
					System.out.println("프로그램을 종료합니다.");
					return;
				default:
					System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
					break;

				}
			} catch (InputMismatchException e) {
				e.printStackTrace();
			}

		}
	}

	public void insertBook() {
	}

	public void selectList() {
	}

	public void searchBook() {
	}

	public void deleteBook() {
	}

	public void ascBook() {
	}
}
