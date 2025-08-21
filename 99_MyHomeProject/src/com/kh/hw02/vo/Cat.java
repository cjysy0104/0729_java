package com.kh.hw02.vo;

public class Cat {

	private String species;
	private String name;
	private String gender;
	private int age;
	private int weight;
	
	public Cat() {}
	public Cat(String species,
			   String name,
			   String gender,
			   int age,
			   int weight) {
		
		this.species = species;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.weight = weight;
	}
	
	public String getSpecies() {
		return species;
	}
	public String getName() {
		return name;
	}
	public String getgender() {
		return gender;
	}
	public int getAge() {
		return age;
	}
	public int getweight() {
		return weight;
	}
	
	// setter()
	public void setSpecies(String species) {
		this.species = species;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	// info()
	public String info() {
		String info = "종: " + species
				+ ", 이름: " + name
				+ ", 성별: " + gender
				+ ", 나이: " + age
				+ ", 몸무게: " + weight;
		return info;
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
