package com.kh.hw02.vo;

public class Member {

	private String id;
	private String name;
	private String gender;
	private String email;
	private int age;
	
	public Member() {}
	public Member(String id,
				  String name,
				  String gender,
				  String email,
				  int age) {
		
		
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.age = age;
	}
	
	
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getgender() {
		return gender;
	}
	public String getEmail() {
		return email;
	}
	public int getAge() {
		return age;
	}
	
	// setter()
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	// info()
	public String info() {
		String info = "회원번호: " + id
				+ ", 이름: " + name
				+ ", 성별: " + gender
				+ ", 나이: " + age
				+ ", 이메일주소: " + email;
		return info;
	}
}
