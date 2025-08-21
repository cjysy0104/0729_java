package com.kh.hw02.vo;

public class LibraryBook {

	
	// 필드부: 책 제목, 작가, 출판사, 페이지수, 대출여부
	private String title;

	private String authorName;

	private String publisher;

	private int totalPage;

	private boolean isLending;
	
	// 생성자부
	// 1. 기본생성자
	public LibraryBook() {}
	// 2. 매개변수가진 생성자
	public LibraryBook(String title, 
					   String authorName,
					   String publisher,
					   int totalPage) {
		
		this.title = title;
		this.authorName = authorName;
		this.publisher = publisher;
		this.totalPage = totalPage;
	}
	
	// 메서드부
	
	// getter()
	public String getTitle() {
		return title;
	}
	public String getAuthorName() {
		return authorName;
	}
	public String getPublisher() {
		return publisher;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public boolean getIsLending() {
		return isLending;
	}
	
	// setter()
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthorName(String authorName) {
		this.authorName= authorName;
	}
	public void setPublisher(String publisher) {
		this.publisher= publisher;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public void setIsLending(boolean isLending) {
		this.isLending= isLending;
	}
	
	// info()
	public String info() {
		String info = "제목: " + title
				+ ", 작가: " + authorName
				+ ", 출판사: " + publisher
				+ ", 페이지수: " + totalPage
				+ ", 대출여부: " + isLending;
		return info;
	}
	
	// 메서드
	public void lend() {

		if (isLending == true)
			System.out.println("책을 반납했습니다.");
		else
			System.out.println("책을 대출했습니다.");
		isLending = !isLending;

	}
	
}
