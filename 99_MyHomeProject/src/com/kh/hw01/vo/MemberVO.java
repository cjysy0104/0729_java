package com.kh.hw01.vo;

import java.util.Scanner;

public class MemberVO {

	private String id;
	private String name;
	private String gender;
	private String email;
	private int age;

	public void printMember() {
		printId();
		printName();
		printAge();
		printGender();
		printEmail();
	}

	public void registerMember() {
		Scanner sc = new Scanner(System.in);

		System.out.println("회원번호?");
		id = sc.nextLine();
		System.out.println("이름?");
		name = sc.nextLine();
		System.out.println("나이?");
		age = sc.nextInt();
		sc.nextLine();
		System.out.println("성별?");
		gender = sc.nextLine();
		System.out.println("이메일?");
		email = sc.nextLine();
	}

	private void printId() {
		System.out.println("회원번호: " + id);
	}

	private void printName() {
		System.out.println("이름: " + name);
	}

	private void printAge() {
		System.out.println("나이: " + age);
	}

	private void printGender() {
		System.out.println("성별: " + gender);
	}

	private void printEmail() {
		System.out.println("이메일: " + email);
	}

}
