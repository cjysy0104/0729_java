package com.kh.hw01.vo;

// 도서관에 있는 책
public class LibraryBook {

	// 필드: 책 제목, 작가, 출판사, 페이지수, 대출여부
	public String title;

	public String authorName;

	public String publisher;

	public int totalPage;

	public boolean isLending;

	// 메서드
	public void readInfo() {

		System.out.println("==책 정보==");
		System.out.println("제목: " + title);
		System.out.println("작가: " + authorName);
		System.out.println("출판사: " + publisher);
		System.out.println("페이지 수: " + totalPage);
		System.out.println("대출여부: " + isLending);
		System.out.println("=============");
	}

	public void lend() {
		
		if(isLending == true)
			System.out.println("책을 반납했습니다.");
		else
			System.out.println("책을 대출했습니다.");
		isLending = !isLending;
		
	}

}
