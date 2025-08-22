package com.kh.practice.list.library.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.practice.list.library.model.vo.Book;

public class BookController {

	private List<Book> list = new ArrayList();

	public BookController() {
		super();
	}

	public void insertBook(Book bk) {
		list.add(bk);
	}

	public ArrayList selectList() {
		if (list.size() != 0) {
			return (ArrayList) list;
		}
		return null;
	}

	public ArrayList searchBook(String keyword) {
		ArrayList searchList = new ArrayList<Book>();

		for (int i = 0; i < list.size(); i++) {
			Book book = list.get(i);
			if (book.getTitle().contains(keyword)) {
				searchList.add(book);
			}
		}

		if (searchList.size() != 0) {
			return searchList;
		} else {
			return null;
		}
	}

	public Book deleteBook(String title, String author) {
		return null;
	}

	public int ascBook() {
		return 0;
	}
}
