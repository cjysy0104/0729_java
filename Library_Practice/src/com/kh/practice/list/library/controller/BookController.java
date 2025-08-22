package com.kh.practice.list.library.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.practice.list.library.model.vo.Book;

public class BookController {

	private List list = new ArrayList();

	public BookController() {
		super();
	}
	
	public void insertBook(Book bk) {
		list.add(bk);
	}
	
	public ArrayList selectList() {
		return null;
	}
	
	public ArrayList searchBook(String keyword) {
		return null;
	}
	
	public Book deleteBook(String title, String author) {
		return null;
	}
	
	public int ascBook() {
		return 0;
	}
}
