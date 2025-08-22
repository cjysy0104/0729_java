package com.kh.practice.list.library.view;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.kh.practice.list.library.controller.BookController;
import com.kh.practice.list.library.model.vo.Book;

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
				case 1: insertBook(); break;
				case 2: selectList(); break;
				case 3: searchBook(); break;
				case 4: deleteBook(); break;
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
		
		System.out.println("===== 새 도서 추가 =====");
		System.out.println("책 정보를 입력해 주세요");
		System.out.println("도서 명 : ");
		String title = sc.nextLine();
		System.out.println("저자 명 : ");
		String author = sc.nextLine();
		System.out.println("장르(1. 인문 / 2. 과학 / 3. 외국어 / 4. 기타) : ");
		int category = sc.nextInt();
		sc.nextLine();
		String categoryName = null;
		switch(category) {
		case 1: categoryName = "인문"; break;
		case 2: categoryName = "과학"; break;
		case 3: categoryName = "외국어"; break;
		case 4: categoryName = "기타"; break;
		default : System.out.println("잘못된 입력"); return;
		}
		System.out.println("가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		
		Book book = new Book(title, author, categoryName, price);
		bc.insertBook(book);
	}

	public void selectList() {

		ArrayList<Book> bookList = bc.selectList();
		if (bookList == null) {
			System.out.println("존재하는 도서가 없습니다.");
		} else {
			for (Book book : bookList) {
				System.out.println(book);
			}
		}
	}

	public void searchBook() {

		System.out.println("검색 키워드: ");
		String keyword = sc.nextLine();
		ArrayList<Book> searchList = bc.searchBook(keyword);

		if (searchList == null) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			for (Book book : searchList) {
				System.out.println(book);
			}
		}
	}

	public void deleteBook() {
		
		System.out.println("삭제할 도서 명 : ");
		String title = sc.nextLine();
		System.out.println("삭제할 저자 명 : ");
		String author = sc.nextLine();
		Book remove = bc.deleteBook(title, author);
		if(remove != null) {
			System.out.println("성공적으로 삭제되었습니다.");
		} else {
			System.out.println("삭제할 도서를 찾지 못했습니다.");
		}
	}

	public void ascBook() {
	}
}
