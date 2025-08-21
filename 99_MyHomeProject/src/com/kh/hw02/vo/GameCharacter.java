package com.kh.hw02.vo;

public class GameCharacter {

	private String name;
	private String characterClass;
	private int level;
	private int hp;
	private int mp;
	
	public GameCharacter() {}
	public GameCharacter(String name,
						 String characterClass,
						 int level,
						 int hp,
						 int mp) {
		
		this.name = name;
		this.characterClass = characterClass;
		this.level = level;
		this.hp = hp;
		this.mp = mp;
	}
	
	public String getName() {
		return name;
	}
	public String getCharacterClass() {
		return characterClass;
	}
	public int getLevel() {
		return level;
	}
	public int getHp() {
		return hp;
	}
	public int getMp() {
		return mp;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCharacterClass(String characterClass) {
		this.characterClass = characterClass;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	
	public String info() {
		String info = "이름: " + name
				+ ", 클래스: " + characterClass
				+ ", 레벨: " + level
				+ ", hp: " + hp
				+ ", mp: " + mp;
		return info;
	}
	
	public void activeSkill() {

		if (mp >= 10) {
			System.out.println("캐릭터가 스킬을 사용합니다.");
			mp -= 10;
		} else {
			System.out.println("mp가 부족합니다.");
		}

	}
	
}
