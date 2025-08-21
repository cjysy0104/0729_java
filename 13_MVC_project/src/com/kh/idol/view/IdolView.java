package com.kh.idol.view;

import java.util.List;
import java.util.Scanner;

import com.kh.idol.controller.IdolController;
import com.kh.idol.model.vo.Idol;

public class IdolView {
	// 필드뷰
	private Scanner sc = new Scanner(System.in);
	private IdolController ic = new IdolController();

	// 생성자

	// 메서드부
	// 프로그램을 실행했을 때 가장 먼저 보여질 화면을 출력해주는 기능
	public void mainMenu() {
		System.out.println("============================================");
		System.out.println("""
				  ###                    ##            ##
				  #                                   # ##
				####  ## #  ##  #### #  ###  ###      # ##
				 ##    ### ## #  ######  ## ###        ###
				 ##   ##   #  # ## # #  ##    ##        #
				 ##   ##    ##  ## # ## ##  ###       ##
				 #                               ####
				#
								""");
		System.out.println("============================================");
		System.out.println("\n🎈fromis_9 커뮤니티입니다");

		while (true) {
			System.out.println("이용하실 서비스를 선택해주세요.");
			System.out.println("1. 프로미스나인 정보보기");
			System.out.println("2. 회원 가입");
			System.out.println("3. 로그인");
			System.out.println("4. 게시판 서비스");
			System.out.println("5. 프로그램 종료");
			int menuNo = sc.nextInt();
			sc.nextLine();

			switch (menuNo) {
			case 1:
				info();
				break;
			case 2:
				signUp();
				break;
			case 3:
				login();
				break;
			case 4:
				break;
			case 5:
				return;
			default:
				System.out.println("잘못된 메뉴를 선택하셨습니다.");
				break;
				
			}

		}
	}



	private void info() {

		System.out.println();
		System.out.println("정보보기 서비스입니다.");
		System.out.println("이용하실 메뉴를 선택해주세요!");
		System.out.println("1. 백지헌 정보보기");
		System.out.println("2. 이나경 정보보기");
		System.out.println("3. 송하영 정보보기");
		System.out.println("4. 이채영 정보보기");
		System.out.println("5. 박지원 정보보기");
		System.out.println("6. 모든 멤버 정보보기");
		System.out.println("7. 메인메뉴로 돌아가기");
		System.out.println("이용하실 메뉴를 입력해 주세요 > ");
		int menuNo = sc.nextInt();
		sc.nextLine();

		switch (menuNo) {
		case 1, 2, 3, 4, 5:
			findMember(menuNo);
			break;
		case 6:
			findAll();
			break;
		case 7:
			break;
		default:
			System.out.println("잘못된 메뉴를 선택하셨습니다.");
		}

	}

	// 모든 멤버의 정보를 접근할 수 있는 값을 요청
	private void findAll() {
		List<Idol> fromis = ic.findAll();

		if (fromis.isEmpty()) {

			System.out.println("멤버정보가 남아있지 않습니다.");

		} else {

			for (Idol i : fromis) {

				System.out.println();
				System.out.println("✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨");
				System.out.println("프로필 이미지" + i.getImage());
				System.out.println("이름 : " + i.getName());
				System.out.println("포지션 : " + i.getPosition());
				System.out.println("퍼스널 컬러 : " + i.getColor());
				System.out.println();
				System.out.println("✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨");
			}

		}

	}

	private void findMember(int menuNo) {
		// 특정 멤버의 주소값을 반환 해줄래?
		Idol idol = ic.findMember(menuNo);
		System.out.println("\t\t✨      " + idol.getName() + "      ✨");
		System.out.println("✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨");
		System.out.println(idol.getImage());
		System.out.println("✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨");
		System.out.println("포지션: " + idol.getPosition());
		System.out.println("퍼스널 컬러: " + idol.getColor());
		System.out.println("✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨");
		
		
	}
	
	// 1메서드 1기능인데 하는일 1.유효성검증 2.회원가입 너무많음 이후에 수정할 것
	private void signUp() {

		// Fan이라는 자료형에 맞춰 필드에 set할 값 3개를 사용자에게 입력받음
		System.out.println("\n 프로미스나인 커뮤니티에 오신것을 환영합니다.");
		System.out.println("회원가입 서비스입니다.");
		
		
		// 입력 => userId, userPwd, nickName
		// 제약조건 => 아이디는 4글자에서 10글자 사이일 것
		//		 => 아이디는 다른 Fan의 아이디와 중복되면 안될 것
		String userId;
		while(true) {
			
			System.out.println("가입하실 아이디를 입력해주세요 > ");
			userId = sc.nextLine();
			
			// 1. 아이디는 4글자~10글자 사이만 가능
			if(!(3 < userId.length() && userId.length() < 11)) {
				System.out.println("아이디는 4글자에서 10글자 사이만 사용 가능합니다.");
				continue;
			}
			
			// 2. 중복체크
			boolean duplicateId = ic.checkId(userId);
			
			if(duplicateId) {
				System.out.println("이미 존재하는 아이디입니다. 다시 입력해주세요");
			} else {
				System.out.println("사용 가능한 아이디입니다.");
				break;
			}
			
		}
		
		System.out.println("비밀번호를 입력해주세요 > ");
		String userPwd = sc.nextLine();

		System.out.println("닉네임을 입력해주세요 > ");
		String nickName = sc.nextLine();
		
		// View는 1절 할 일 끗
		// 사용자가 입력한 아이디/비번/닉네임을 Fan객체 생성해 필드에 담아서
		// Controller에 있는 fans 라는 List의 요소로 추가
		boolean result = ic.signUp(userId, userPwd, nickName);
		
		if(result) {
			System.out.println("회원가입에 실패했습니다. 다시 시도해주세요");
		} else {
			System.out.println("회원가입을 환영합니다.");
		}
	}
	
	private void login() {

		System.out.println("\n로그인 서비스입니다.");
		
		System.out.println("아이디를 입력하세요 > ");
		String userId = sc.nextLine();
		System.out.println("비밀번호를 입력하세요 > ");
		String userPwd = sc.nextLine();
		
		ic.login(userId, userPwd);
	}

}



















