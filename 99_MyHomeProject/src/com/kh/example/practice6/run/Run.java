package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.Book;

public class Run {

	public static void main(String[] args) {

		Book book1 = new Book();
		Book book2 = new Book("어린왕자", "대원", "생텍쥐페리");
		Book book3 = new Book("수학귀신", "교보문고", "한스", 14000, 30.0);
		
		book1.inform();
		book2.inform();
		book3.inform();
	}

}
