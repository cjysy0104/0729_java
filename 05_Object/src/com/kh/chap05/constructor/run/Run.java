package com.kh.chap05.constructor.run;

import java.util.Scanner;

import com.kh.chap05.constructor.model.vo.Member;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Member member = new Member(); 
		// new : 객체를 생성
		// Member() : 객체의 초기 상태 설정
		
//		System.out.println("ID: ");
//		member.setUserId(sc.nextLine());
//		System.out.println("PW: ");
//		member.setUserPwd(sc.nextLine());
//		System.out.println("닉네임: ");
//		member.setNickName(sc.nextLine());
		
		
		System.out.println(member.info());
		
		Member member2 = new Member("asdf");
		
		Member member3 = new Member("user01", "1q2w3e4r1!");
		System.out.println(member3.info());
		
		Member member4 = new Member("user01", "1q2w3e4r1!", "asdf");
		System.out.println(member4.info());
		
	}
}
