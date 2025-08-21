package com.kh.example.practice7.run;

import com.kh.example.practice7.model.vo.Employee;

public class Run {

	public static void main(String[] args) {

		Employee emp = new Employee();

		emp.setEmpNo(100);
		emp.setEmpName("홍길동");
		emp.setDept("영업부");
		emp.setJob("과장");
		emp.setAge(25);
		emp.setGender('남');
		emp.setSalary(2500000);
		emp.setBonusPoint(0.05);
		emp.setPhone("010-1234-5678");
		emp.setAddress("서울시 강남구");

		System.out.println("근로자번호: " + emp.getEmpNo());
		System.out.println("근로자이름: " + emp.getEmpName());
		System.out.println("부서: " + emp.getDept());
		System.out.println("직급: " + emp.getJob());
		System.out.println("나이: " + emp.getAge());
		System.out.println("성별: " + emp.getGender());
		System.out.println("봉급: " + emp.getSalary());
		System.out.println("보너스점수: " + emp.getBonusPoint());
		System.out.println("전화번호: " + emp.getPhone());
		System.out.println("주소: " + emp.getAddress());

	}

}
