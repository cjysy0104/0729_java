package com.kh.example.practice1.run;

import com.kh.example.practice1.model.vo.Member;

// 클래스 다이어그램
// __(밑줄)은 static을 뜻함
public class Run {

	public static void main(String[] args) {
		
		Member member = new Member();
		
		member.changeName("최준영");
		
		member.printName();
	}
}
