package com.kh.hw02.run;

import java.util.Scanner;

import com.kh.hw02.vo.GameCharacter;

public class CharacterRun {

	public static void main(String[] args) {

		GameCharacter ch = new GameCharacter("zelda","궁수",10,100,50);
		
		Scanner sc = new Scanner(System.in);
		
		boolean exit = false;

		while (!exit) {
			System.out.println("1. 캐릭터 정보 /" + " 2. 정보 수정 /" + " 3. 스킬사용 /" + "4. exit");
			int menuNo = sc.nextInt();
			sc.nextLine();

			switch (menuNo) {
			case 1:
				System.out.println(ch.info());
				break;
			case 2:
				System.out.println("이름: ");
				ch.setName(sc.nextLine());

				System.out.println("클래스: ");
				ch.setCharacterClass(sc.nextLine());

				System.out.println("LV: ");
				ch.setLevel(sc.nextInt());

				System.out.println("HP: ");
				ch.setHp(sc.nextInt());

				System.out.println("MP: ");
				ch.setMp(sc.nextInt());
				
				System.out.println("변경이 완료되었습니다.");
				sc.nextLine();
				break;
			case 3:
				ch.activeSkill();
			case 4:
				System.out.println("프로그램 종료");
				exit = true;
				break;
			default:
				System.out.println("메뉴를 다시 선택해 주세요.");
			}
		}
	}

}
