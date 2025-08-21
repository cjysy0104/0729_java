package com.kh.chap07.remote.view;

import java.util.Scanner;

import com.kh.chap07.remote.controller.RemoteController;

// 사용자에게 값을 입력받고 내용을 출력해주는 메서드를 넣어둘 클래스
public class RemoteView {

	private Scanner sc = new Scanner(System.in);
	private RemoteController rc = new RemoteController();

	// 프로그램 시작 시 보여질 메인메뉴를 출력해주는 메서드
	public void mainMenu() {

		while (true) {
			System.out.println("================================");
			System.out.println("리모컨 조작 프로그램입니다.");
			System.out.println("이용하실 메뉴를 선택해주세요.");
			System.out.println("1. 전원켜기");
			System.out.println("2. 채널 바꾸기 ↑");
			System.out.println("3. 채널 바꾸기 ↓");
			System.out.println("4. 전원끄기");
			System.out.println("5. 프로그램 종료");
			System.out.println("================================");
			System.out.println("메뉴를 선택하세요 >> ");

			int menuNo = sc.nextInt();
			sc.nextLine();

			switch (menuNo) {
			case 1:
				powerOn();
				break;
			case 2:
				channelUp();
				break;
			case 3:
				break;
			case 4:
				powerOff();
				break;
			case 5:
				System.out.println("리모컨 조작하기는 즐거우셨나요? 안녕히 가세요.");
				return;
			default:
				System.out.println("잘못된 메뉴를 선택하셨습니다. 다시 입력해 주세요.");

			}
		}
	}

	private void powerOn() {

		// method 안에서 controller 호출: heap에 참조하던 객체들 다 죽음
		// RemoteController rc = new RemoteController();
		System.out.println("================================");
		System.out.println("전원 켜기 메뉴입니다.");
		System.out.println("---------------------------------");

		int result = rc.powerOn();
		if (result > 0) {
			System.out.println("전원이 켜졌습니다!");
			System.out.println("ㅊㅊㅊ");
		} else {
			System.out.println("이미 켜져있는디");
			System.out.println("노라라");
		}
		System.out.println("");
		System.out.println("");

	}

	private void powerOff() {

		System.out.println("================================");
		System.out.println("전원 켜기 메뉴입니다.");
		System.out.println("---------------------------------");

		int result = rc.powerOff();
		if (result > 0) {
			System.out.println("전원이 꺼졌습니다!");
			System.out.println("ㅊㅊㅊ");
		} else {
			System.out.println("이미 꺼져있는디");
			System.out.println("노라라");
		}
		System.out.println("");
		System.out.println("");
	}

	// 0번채널 : 메뉴 선택시 > 1번채널
	// Controller에게 채널 올리고 뭐하는지 알려달라고 시키기 : 객체간의 상호작용
	private void channelUp() {
		String channel = rc.channelUp();
		if(channel != null) {
			System.out.println("================================");
			System.out.println("채널 바꾸기 ↑ 메뉴 선택");
			System.out.println("---------------------------------");
			
			int channelNo = rc.getChannelNo();
			
			System.out.println("현재 " + channelNo + "번 채널입니다.");
			System.out.println("방영중인 방송: " + channel);
		
		} else {
			System.out.println("먼저 전원을 켜주세요.");
		}

	}

	private void channelDown() {
		System.out.println("================================");
		System.out.println("채널 바꾸기 ↓ 메뉴 선택");
		System.out.println("---------------------------------");
	}
}
