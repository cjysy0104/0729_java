package com.kh.chap03.run;

import com.kh.chap03.model.vo.Book;
import com.kh.chap03.model.vo.ElectronicBook;
import com.kh.chap03.model.vo.PaperBook;

public class Run {

	public static void main(String[] args) {
		Book book = new Book();
		ElectronicBook eb = new ElectronicBook("가공범","히가시노 게이고","북다",
				19800,"교보");
		PaperBook pb = new PaperBook("위버멘시", "프리드리히 니체", "떠오름",
				14520, 0);
		
		System.out.println(eb.information());
		System.out.println(pb.information());
	
		System.out.println(book);
		System.out.println(book.toString());
		// toString(): 해당 객체의 풀클래스명 + "@" + 해당 객체의 주소값(16진수형) : String
		System.out.println(eb);
	}
}
