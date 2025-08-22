package com.kh.practice.list.music.view;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.kh.practice.list.music.controller.MusicController;
import com.kh.practice.list.music.model.vo.Music;

public class MusicView {

	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();

	public void mainMenu() {

		while (true) {
			System.out.println("******* 메인 메뉴 ******* ");
			System.out.println("1. 마지막 위치에 곡 추가");
			System.out.println("2. 첫 위치에 곡 추가");
			System.out.println("3. 전체 곡 목록 출력");
			System.out.println("4. 특정 곡 검색");
			System.out.println("5. 특정 곡 삭제");
			System.out.println("6. 특정 곡 정보 수정");
			System.out.println("7. 곡명 오름차순 정렬");
			System.out.println("8. 가수명 내림차순 정렬");
			System.out.println("9. 종료 ");
			System.out.println("메뉴번호 선택 : >> ");

			int menuNo = 0;

			try {
				menuNo = sc.nextInt();
			} catch (Exception e) {
				System.out.println("숫자만 입력하세요.");
			}

			sc.nextLine();

			switch (menuNo) {
			case 1:
				addList();
				break;
			case 2:
				addAtZero();
				break;
			case 3:
				printAll();
				break;
			case 4:
				searchMusic();
				break;
			case 5:
				removeMusic();
				break;
			case 6:
				setMusic();
				break;
			case 7:
				ascTitle();
				break;
			case 8:
				descSinger();
				break;
			case 9:
				System.out.println("종료");
				return;
			default:
				System.out.println("잘못된 메뉴번호");
				break;

			}

		}

	}

	public void addList() {

		try {
			System.out.println("****** 마지막 위치에 곡 추가 ******");
			System.out.println("곡 명 : ");
			String title = sc.nextLine();
			System.out.println("가수 명 : ");
			String singer = sc.nextLine();

			Music music = new Music(title, singer);
			int result = mc.addList(music);

			if (result != 1) {
				System.out.println("추가 실패");
			} else {
				System.out.println("추가 성공");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void addAtZero() {

		System.out.println("****** 첫 위치에 곡 추가 ******");
		System.out.println("곡 명 : ");
		String title = sc.nextLine();
		System.out.println("가수 명 : ");
		String singer = sc.nextLine();

		Music music = new Music(title, singer);
		int result = mc.addAtZero(music);

		if (result != 1) {
			System.out.println("추가 실패");
		} else {
			System.out.println("추가 성공");
		}
	}

	public void printAll() {

		System.out.println("****** 전체 곡 목록 출력 ******");
		List list = mc.printAll();
		System.out.println(list);
	}

	public void searchMusic() {

		System.out.println("****** 특정 곡 검색 ****** ");
		System.out.println("검색할 곡 명 : ");
		String title = sc.nextLine();
		Music searchedMusic = mc.searchMusic(title);
		if (searchedMusic == null) {
			System.out.println("검색한 곡이 없습니다.");
		} else {
			System.out.println("검색한 곡은 " + searchedMusic.toString() + "입니다.");
		}

	}

	public void removeMusic() {

		System.out.println("****** 특정 곡 삭제 ******");
		System.out.println("삭제할 곡 명 : ");
		String title = sc.nextLine();
		Music removedMusic = mc.removeMusic(title);
		if (removedMusic == null) {
			System.out.println("삭제할 곡이 없습니다.");
		} else {
			System.out.println(removedMusic.toString() + "을 삭제했습니다.");
		}

	}

	public void setMusic() {

		System.out.println("****** 특정 곡 정보 수정 ******");
		System.out.println("검색할 곡 명 : ");
		String title = sc.nextLine();
		System.out.println("수정할 곡 명 : ");
		String updateTitle = sc.nextLine();
		System.out.println("수정할 가수 명 : ");
		String updateSinger = sc.nextLine();
		Music music = new Music(updateTitle, updateSinger);

		Music result = mc.setMusic(title, music);
		System.out.println(result);
		if (result == null) {
			System.out.println("수정할 곡이 없습니다.");
		} else {
			System.out.println(title + "가 값이 변경되었습니다.");
		}

	}

	public void ascTitle() {

		System.out.println("****** 곡 명 오름차순 정렬 ******");
		int result = mc.ascTitle();
		if (result != 1) {
			System.out.println("정렬 실패");
		} else {
			System.out.println("정렬 성공");
		}
	}

	public void descSinger() {

		System.out.println("****** 가수 명 내림차순 정렬 ******");
		int result = mc.descSinger();
		if (result != 1) {
			System.out.println("정렬 실패");
		} else {
			System.out.println("정렬 성공");
		}
	}

}
