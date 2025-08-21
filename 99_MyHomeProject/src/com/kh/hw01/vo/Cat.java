package com.kh.hw01.vo;

public class Cat {

	public String species;

	public String name;

	public int age;

	public String gender;

	public String color;

	public int weight;
	
	public void printCat() {
		System.out.println("==============================================");
		System.out.println(name + "는(은) "
						  + age + "살이며, "
						  + species + "종이고 "
						  + gender + "이며 "
						  + color + "이고 "
						  + weight + "kg 입니다.");
		System.out.println("==============================================");
		
	}
	
	public void degul() {
		System.out.println(name + "가 굴러옵니다.");
		System.out.println("데굴.");
	}
	
	public void growOlder() {
		System.out.println("1년이 지나 나이를 먹습니다.");
		age += 1;
		System.out.println(name + "은 " + age + "살이 되었습니다.");
	}
}
