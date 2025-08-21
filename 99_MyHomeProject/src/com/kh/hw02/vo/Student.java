package com.kh.hw02.vo;

public class Student {

	// [필드부]
	// 속성: 학번, 이름, 나이, 소속반, 취득학점
	private String id;
	private String name;
	private String className;
	private int age;
	private double grade;
	
	public Student() {}
	public Student(String id, 
			   	   String name,
			   	   String className,
			   	   int age,
			   	   double grade) {
		
		this.id = id;
		this.name = name;
		this.className = className;
		this.age = age;
		this.grade = grade;
	}
	
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getClassName() {
		return className;
	}
	public int getAge() {
		return age;
	}
	public double getGrade() {
		return grade;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	
	public String info() {
		String info = "학번: " + id
				+ ", 이름: " + name
				+ ", 반: " + className
				+ ", 나이: " + age
				+ ", 취득학점: " + grade;
		return info;
	}
	
	public void sayHello() {
		System.out.println(name + "이 인사합니다.");
		System.out.println("'안녕하세요 저는 " + name +"입니다.'");
	}
	
	public void takeClass(double takeGrade) {
		System.out.println(name + "이(가) " + takeGrade + "학점 수업을 듣습니다.");
		this.grade += takeGrade;
	}
	
}
