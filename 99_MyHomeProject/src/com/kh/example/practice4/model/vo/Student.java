package com.kh.example.practice4.model.vo;

public class Student {

	private static int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	
	public Student() {
		grade = 4;
		classroom = 6;
		name = "최준영";
		height = 174.4;
		gender = 'M';
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		Student.grade = grade;
	}

	public int getClassroom() {
		return classroom;
	}

	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void information() {
		System.out.println("학년 " + grade);
		System.out.println("반 " + classroom);
		System.out.println("이름 " + name);
		System.out.println("키 " + height);
		System.out.println("성별 " + gender);
	}
	
}
