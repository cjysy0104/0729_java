package com.kh.hw01.run;

import java.util.Scanner;

import com.kh.hw01.vo.GameCharacter;

public class CharacterRun {

	public static void main(String[] args) {
		GameCharacter ch = new GameCharacter();

		Scanner sc = new Scanner(System.in);

		System.out.println("캐릭터의 닉네임?");
		ch.name = sc.nextLine();

		System.out.println("캐릭터의 직업?");
		ch.characterClass = sc.nextLine();

		System.out.println("캐릭터의 레벨?");
		ch.level = sc.nextInt();

		System.out.println("캐릭터의 HP?");
		ch.hp = sc.nextInt();

		System.out.println("캐릭터의 MP?");
		ch.mp = sc.nextInt();

		System.out.println("게임 시작!");

		boolean exit = false;

		while (!exit) {
			System.out.println("=======================");
			System.out.println(ch.name + "의 정보!");
			System.out.println("직업: " + ch.characterClass);
			System.out.println("레벨: " + ch.level);
			System.out.println("HP: " + ch.hp);
			System.out.println("MP: " + ch.mp);
			System.out.println("=======================");

			
			System.out.println("1. 스킬 사용 / 2. 데미지 / 3. 게임 종료 >");
			int menuNo = sc.nextInt();
			sc.nextLine();
			
			switch (menuNo) {
			case 1:
				ch.activeSkill();
				break;
			case 2:
				ch.damage();
				break;
			case 3:
				System.out.println("프로그램 종료");
				exit = true;
				break;
			default:
				System.out.println("메뉴를 다시 선택해 주세요.");
			}
		}
	}
}
