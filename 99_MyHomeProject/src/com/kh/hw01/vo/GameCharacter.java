package com.kh.hw01.vo;

public class GameCharacter {

	public String name;
	public String characterClass;
	public int level;
	public int hp;
	public int mp;

	public void activeSkill() {

		if (mp >= 10) {
			System.out.println("캐릭터가 스킬을 사용합니다.");
			mp -= 10;
		} else {
			System.out.println("mp가 부족합니다.");
		}

	}
	
	public void damage() {
		if(hp > 0) {
			System.out.println("캐릭터가 데미지를 5 입었습니다.");
			hp -= 5;
		} else {
			System.out.println("캐릭터가 이미 죽었습니다.");
		}
	}
}
