package com.kh.hw02.run;

import java.util.Scanner;

import com.kh.hw02.vo.LibraryBook;

public class LibraryRun {
	
	public static void main(String[] args) {

		LibraryBook book = new LibraryBook("어린왕자", "생텍쥐페리", "인디고", 11000);
		
		Scanner sc = new Scanner(System.in);
		
		boolean exit = false;
		
		while (!exit) {
			System.out.println("메뉴를 선택해주세요 > ");
			System.out.println("1. 책 정보 출력 /"
							+ " 2. 책 대출/반납하기 /"
							+ " 3. 책 정보 수정 /"
							+ " 4. 프로그램 종료");
			int menuNo = sc.nextInt();
			sc.nextLine();
			
			switch (menuNo) {
			case 1:
				System.out.println(book.info());
				break;
			case 2:
				book.lend();
				break;
			case 3:
				System.out.println("책 제목: ");
				book.setTitle(sc.nextLine());
				
				System.out.println("작가 이름: ");
				book.setAuthorName(sc.nextLine());
				
				System.out.println("출판사: ");
				book.setPublisher(sc.nextLine());
				
				System.out.println("총 페이지 수: ");
				book.setTotalPage(sc.nextInt());
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
