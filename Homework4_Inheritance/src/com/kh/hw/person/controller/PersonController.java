package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonController {

	private Student[] s = new Student[3];
	private Employee[] e = new Employee[10];

	public int[] personCount() {
		int sCount = 0;
		int eCount = 0;
		int[] countArr = new int[2];

		// students counting
		for (int i = 0; i < s.length; i++) {
			if (s[i] != null) {
				sCount++;
			}
		}

		// employees counting
		for (int i = 0; i < e.length; i++) {
			if (e[i] != null) {
				eCount++;
			}
		}

		// countArr[]
		countArr[0] = sCount;
		countArr[1] = eCount;

		return countArr;
	}

	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {

		Student student = new Student(name, age, height, weight, grade, major);
		for(int i = 0; i < s.length; i++) {
			if(s[i] == null) {
				s[i] = student;
				return;
			}
		}
	}

	public Student[] printStudent() {
		int size = personCount()[0];
		Student[] students = new Student[size];
		for(int i = 0; i < size; i++) {
			
		}
		
		return students;
	}

	public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {

	}

	public Employee[] printEmployee() {
		return null;
	}

}
