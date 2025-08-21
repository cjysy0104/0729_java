package com.kh.hw.member.view;

import java.util.Scanner;

import com.kh.hw.member.controller.MemberController;
import com.kh.hw.member.model.vo.Member;

public class MemberMenu {

	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	
	public MemberMenu() {} // 기본생성자
	
	// test OK
	public void mainMenu() {

		while (true) {
			int exNum = mc.existMemberNum();
			System.out.println("최대 등록 가능한 회원 수는 " + mc.SIZE + "명입니다.");
			System.out.println("현재 등록된 회원수는 " + exNum + "명입니다.");

			if (exNum != mc.SIZE) {
				System.out.println("1. 새 회원 등록");
			} else {
				System.out.println("회원 수가 모두 꽉 찼기 떄문에 일부 메뉴만 오픈됩니다.");
			}
			System.out.println("2. 회원 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 삭제");
			System.out.println("5. 모두 출력");
			System.out.println("9. 끝내기");
			System.out.println("");
			System.out.println("메뉴 번호 : ");
			int menuNo = sc.nextInt();
			sc.nextLine();

			switch (menuNo) {
			case 1:
				insertMember();
				break;
			case 2:
				searchMember();
				break;
			case 3:
				updateMember();
				break;
			case 4:
				deleteMember();
				break;
			case 5:
				printAll();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
			
		}

	}
	
	// test OK
	public void insertMember() {
		System.out.println("새 회원을 등록합니다.");

		// id
		System.out.println("아이디 :");
		String id = sc.nextLine();
		boolean result = mc.checkId(id);
		/*
		while (!(mc.checkId(id))) {
			System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
			System.out.println("아이디 : ");
			id = sc.nextLine();
		}
		*/
		while(!result) {
			System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
			System.out.println("아이디 : ");
			id = sc.nextLine();
		}
		
		
		// name
		System.out.println("이름 : ");
		String name = sc.nextLine();
		
		// pwd
		System.out.println("비밀번호 : ");
		String pwd = sc.nextLine();

		// email
		System.out.println("이메일 : ");
		String email = sc.nextLine();

		// gender
		/*
		System.out.println("성별 : ");
		char gender = sc.next().charAt(0);
		
		while (gender != 'M' && gender != 'm' 
				&& gender != 'F' && gender != 'f') {

			System.out.println("성별을 다시 입력하세요");
			System.out.println("성별 : ");
			gender = sc.next().charAt(0);
		}
		 */
		char gender = ' ';
		while (true) {
			System.out.println("성별 : ");
			gender = sc.next().charAt(0);

			if (gender == 'm' || gender == 'M' 
			 || gender == 'f' || gender == 'F') {
				break;
			} else {
				System.out.println("성별을 다시 입력하세요");
			}
		}
		
		// age
		System.out.println("나이 : ");
		int age = sc.nextInt();

		mc.insertMember(id, name, pwd, email, gender, age);
	}
	
	// test OK
	public void searchMember() {
		while (true) {
			System.out.println("1. 아이디로 검색하기");
			System.out.println("2. 이름으로 검색하기");
			System.out.println("3. 이메일로 검색하기");
			System.out.println("9. 메인으로 돌아가기");
			System.out.println("");
			int menuNo = sc.nextInt();
			sc.nextLine();

			switch (menuNo) {
			case 1:
				searchId();
				break;
			case 2:
				searchName();
				break;
			case 3:
				searchEmail();
				break;
			case 9:
				System.out.println("메인으로 돌아갑니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}

		}
		
	}
	
	// test OK
	public void searchId() {
		System.out.println("검색할 ID :");
		String id = sc.nextLine();
		String searchedId = mc.searchId(id);
		if(searchedId != null) {
			System.out.println("찾으신 회원 조회 결과입니다.");
			System.out.println(mc.searchId(id));
		}
		System.out.println("검색 결과가 없습니다.");
	}

	// test OK
	public void searchName() {
		System.out.println("검색할 이름 : ");
		String name = sc.nextLine();
		// members s
		Member[] s = mc.searchName(name);
		
		if (s.length != 0) {
			System.out.println("찾으신 회원 조회 결과입니다.");
			for (int i = 0; i < s.length; i++) {
				System.out.println(s[i].inform());
			}
		} else {
			System.out.println("검색 결과가 없습니다.");
			return;
		}
	}
	
	// test OK
	public void searchEmail() {
		System.out.println("검색할 이메일 : ");
		String email = sc.nextLine();
		Member[] s = mc.searchEmail(email);
		if (s.length != 0) {
			System.out.println("찾으신 회원 조회 결과입니다.");
			for (int i = 0; i < s.length; i++) {
				System.out.println(s[i].inform());
			}
		} else {
			System.out.println("검색 결과가 없습니다.");
			return;
		}
	}
	
	// test OK
	public void updateMember() {
		while (true) {
			System.out.println("1. 비밀번호 수정하기");
			System.out.println("2. 이름 수정하기");
			System.out.println("3. 이메일 수정하기");
			System.out.println("9. 메인으로 돌아가기");
			int menuNo = sc.nextInt();
			sc.nextLine();

			switch (menuNo) {
			case 1:
				updatePassword();
				return;
			case 2:
				updateName();
				return;
			case 3:
				updateEmail();
				return;
			case 9:
				System.out.println("메인으로 돌아갑니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다.");
				return;
			}

		}
	}
	
	// test OK
	/*
	public void updatePassword() {
		System.out.println("수정할 회원의 아이디 : ");
		String id = sc.nextLine();
		System.out.println("수정할 비밀번호 : ");
		String pwd = sc.nextLine();

		boolean isUpdate = mc.updatePassword(id, pwd);

		if (isUpdate) {
			System.out.println("수정이 성공적으로 되었습니다.");
		} else {
			System.out.println("존재하지 않는 아이디입니다.");
		}
	}
	*/
	public void updatePassword() {
		// 아이디랑 기존 비밀번호랑 바꿀 비밀번호
		// 3개의 값을 입력받아서
		// 아이디와 비밀번호가 일치하다면 기존 비밀번호를 바꿀 비번으로 변경
		// 일치 안하면 안바꿔줌
		System.out.println("수정할 회원의 아이디 : ");
		String userid = sc.nextLine();
		System.out.println("비밀번호 : ");
		String userPwd = sc.nextLine();
		System.out.println("수정할 비밀번호 : ");
		String newPwd = sc.nextLine();

		boolean result = mc.updatePassword(userid, userPwd, newPwd);
		if (result) {
			System.out.println("수정이 성공적으로 되었습니다.");
		} else {
			System.out.println("수정 실패! 아이디 또는 비밀번호를 확인하세요.");
		}
	}
	
	// test OK
	public void updateName() {
		System.out.println("수정할 회원의 아이디 : ");
		String id = sc.nextLine();
		System.out.println("수정할 이름 : ");
		String name = sc.nextLine();

		boolean isUpdate = mc.updateName(id, name);

		if (isUpdate) {
			System.out.println("수정이 성공적으로 되었습니다.");
		} else {
			System.out.println("존재하지 않는 아이디입니다.");
		}
	}
	
	// test OK
	public void updateEmail() {
		System.out.println("수정할 회원의 아이디 : ");
		String id = sc.nextLine();
		System.out.println("수정할 이메일 : ");
		String email = sc.nextLine();

		boolean isUpdate = mc.updateEmail(id, email);

		if (isUpdate) {
			System.out.println("수정이 성공적으로 되었습니다.");
		} else {
			System.out.println("존재하지 않는 아이디입니다.");
		}
	}
	
	// test OK
	public void deleteMember() {
		while (true) {
			System.out.println("1. 특정 회원 삭제하기");
			System.out.println("2. 모든 회원 삭제하기");
			System.out.println("9. 메인으로 돌아가기");
			int menuNo = sc.nextInt();
			sc.nextLine();

			switch (menuNo) {
			case 1:
				deleteOne();
				return;
			case 2:
				deleteAll();
				return;
			case 9:
				System.out.println("메인으로 돌아갑니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다.");
				return;
			}
		}
	}
	
	// test OK
	public void deleteOne() {
		System.out.println("삭제할 회원의 아이디 : ");
		String id = sc.nextLine();
		System.out.println("정말로 삭제하시겠습니까?(y/n) : ");
		char yesNo = sc.nextLine().charAt(0);

		if (yesNo == 'y' || yesNo == 'Y') {
			boolean isDeleted = mc.delete(id);
			if (isDeleted) {
				System.out.println("성공적으로 삭제하였습니다..");
			} else {
				System.out.println("존재하지 않는 아이디입니다.");
			}
		}

	}
	
	// test OK
	public void deleteAll() {
		System.out.println("정말로 삭제하시겠습니까?(y/n) : ");
		char yesNo = sc.nextLine().charAt(0);

		if (yesNo == 'y' || yesNo == 'Y') {
			mc.delete();
			System.out.println("성공적으로 삭제하였습니다.");
		}
	}
	
	// test OK
	public void printAll() {
		Member[] s = mc.printAll();
		if (s.length != 0) {
			for (int i = 0; i < s.length; i++) {
				System.out.println(s[i].inform());
			}
		} else {
			System.out.println("저장된 회원이 없습니다.");
		}
	}
	
	public void findAll() {
		System.out.println("회원 전체 조회");

		Member[] members = mc.getM();
		int count = mc.existMemberNum();

		if (count > 0) {
			for (int i = 0; i < members.length; i++)
				if (members[i] != null) {
					System.out.println(members[i].inform());
				}
			
		} else {
			System.out.println("회원이업서");
		}
	}
	
	private void deleteMemberP() {
		System.out.println("아이디 입력: ");
		String userId = sc.nextLine();
		System.out.println("비번 입력: ");
		String userPw = sc.nextLine();
		
		int result = mc.deleteMemberP(userId, userPw);
		
		if (result > 0)
			System.out.println("삭제 성공!");
		else
			System.out.println("삭제 실패!");
	}
	
}
