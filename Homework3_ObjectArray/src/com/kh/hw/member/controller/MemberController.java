package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;

public class MemberController {

	private Member[] m = new Member[SIZE];
	
	public static int SIZE = 10;
	
	// static 블럭 (정적 초기화): 클래스가 올라갈 때 딱 한번 수행
	static{
		//System.out.println("호잇 진짜 빠름");
	}
	
	// 초기화 블럭 : 오버로딩에 의해 생성자마다 필드값 초기화할 필요 없이 한 번만 초기화시키면 됨
	{
		//System.out.println("나 3등");
		m[0] = new Member("admin", "관리자", "ad123", "admin@kh.com", 'M', 100);
	}

	public MemberController() {
		//System.out.println("나 4등");
	}	
	// => 순서: static(클래스 로딩할 때 올라감) > 초기화블럭 > 생성자
	
	// test OK
	// 존재하는 멤버 수 == null이 아닌 주소값을 가진 인덱스 개수
	public int existMemberNum() {

		// null이 아닌 주소값을 가진 인덱스 개수를 저장할 변수 선언 및 초기화
		int existMemberNum = 0;
		// 반복문 통해 0 ~ SIZE(10)까지 
		for (int i = 0; i < SIZE; i++) {
			if (m[i] != null) {
				existMemberNum++;
			}
		}
		// 변수에 저장한 개수 값 반환
		return existMemberNum;
	}
	
	// test OK
	// ID가 중복이면 false, 중복이 아니면 true 반환
	public Boolean checkId(String inputId) {
		
		for (int i = 0; i < SIZE; i++) {
			// m[i]의 값
			// 1. 은 null 아님
			// 2. 을 참조하여 getter() 메서드 호출로 가져온 id 값이 inputId값과 같다
			// 둘 다 만족하면 ID 중복임 => false 반환
			// 1.에서 false 라면 2. 연산은 건너뛰므로 nullPointerException 해결
			if (m[i] != null && (m[i].getId().equals(inputId))) {
				return false;
			}
		}
		// 반복문 끝날동안 조건을 한번도 만족 못함 == 중복없음 => true 반환
		return true;
	}
	
	// test OK
	// Member 객체 생성해 배열에 대입
	public void insertMember(String id,
							 String name,
							 String password,
							 String email,
							 char gender,
							 int age) {
		
		// Member 클래스에서 구현한 생성자를 통해 객체 생성 및 필드 값 대입
		Member member = new Member(id, name, password,
								   email, gender, age);
		
		// 반복문 통해 인덱스 0 ~ SIZE(10)까지 돌면서 객체배열 빈 곳 있으면 대입
		for(int i = 0; i < SIZE; i++) {
			if(m[i] == null) {
				m[i] = member;
				break; // 추가했다면 break 통해 반복문 빠져나가기
			}
		}
	}
	
	//OK
	// id는 중복이 없어서 오직 객체 하나만 반환된다는것을 다만들고 깨달음;;;;
	/*
	public Member[] searchId(String id) {
		Member[] temp = new Member[SIZE];
		int count = 0;
		for (int i = 0; i < SIZE; i++) {
			if (m[i] != null && m[i].getId().equals(id)) {
				temp[count++] = m[i];
			}
		}
		Member[] searchedMember = new Member[count];
		System.arraycopy(temp, 0, searchedMember, 0, count);
		return searchedMember;
	}
	*/
	
	// test OK
	// 반복문 통해 입력받은 id와 중복되는 id가 있다면(1. null값 아니고 2. equals비교한 id값 동일)
	// 해당 객체의 인덱스 참조하여 inform() 메서드 호출(Member 클래스의 모든 필드값들을 합쳐 반환)하여 값 반환
	public String searchId(String id) {
		for(int i = 0; i < SIZE; i ++) {
			if(m[i] != null && m[i].getId().equals(id)) {
				return m[i].inform();
			}
		}
		return null;
	}
	
	// test OK
	// 임시 객체배열 선언하고 이름 대조하여 중복되면 담고 배열 깊은복사통해 배열 잘라서 반환
	/*
	public Member[] searchName(String name) {
		// 입력받은 이름과 동일한 이름 필드 값을 가진 객체를 임시로 담기위한 배열 선언
		Member[] temp = new Member[SIZE];
		// 배열 크기 카운터
		int count = 0;
		for (int i = 0; i < SIZE; i++) {
			if (m[i] != null && m[i].getName().equals(name)) {
				temp[count++] = m[i];
			}
		}
		// 계산한 크기만큼의 객체배열을 생성하고 System.arraycopy() 이용하여 temp에 깊은복사 후 반환
		Member[] searchedMember = new Member[count];
		System.arraycopy(temp, 0, searchedMember, 0, count);
		return searchedMember;
	}
	*/
	// 현재 등록된 회원 개수: existMemberNum()로 구현했음
	public Member[] searchName(String name) {
		int count = existMemberNum();
		int index = 0; // members[i]로 반복문을 돌면 i번째마다 넣으므로 OOA 발생 가능, 제어하는 변수선언
		Member[] members = new Member[count];
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null && m[i].getName().equals(name)) {
				members[index++] = m[i];
			}
		}
		return members;
	}
	
	// test OK
	// searchName과 동일
	//OK
	public Member[] searchEmail(String email) {
		Member[] temp = new Member[SIZE];
		int count = 0;
		for (int i = 0; i < SIZE; i++) {
			if (m[i] != null && m[i].getEmail().equals(email)) {
				temp[count++] = m[i];
			}
		}
		Member[] searchedMember = new Member[count];
		System.arraycopy(temp, 0, searchedMember, 0, count);
		return searchedMember;
	}
	
	// test OK
	// 인자값으로 받은 id 와 중복이 있다면 setter() 호출하여 필드 수정하고 true 반환, 없으면 false 반환
	// test OK
	//OK
	/*
	public Boolean updatePassword(String id, String password) {
		for (int i = 0; i < SIZE; i++) {
			if (m[i] != null && m[i].getId().equals(id)) {
				m[i].setPassword(password);
				return true; // 수정 성공
			}
		}
		return false; // 수정 실패
	}
	*/
	public Boolean updatePassword(String userId, String userPwd, String newPwd) {

		// 전달받은 3개의 값을 가지고
		// 비번 바꿔주거나 바꿔주지 않거나

		// 배열의 첫번째 요소 아이디값 비교해야지
//		if(m[0] != null &&
//		   m[0].getId().equals(userId) &&
//		   m[0].getPassword().equals(userPwd)) {
//			m[0].setPassword(newPwd);
//		}

		for (int i = 0; i < m.length; i++) {
			if (m[0] != null && m[0].getId().equals(userId) && m[0].getPassword().equals(userPwd)) {
				m[0].setPassword(newPwd);
				return true;
			}
		}
		return false;
	}

	// test OK
	// updatePassword와 동일
	// test OK
	//OK
	public Boolean updateName(String id, String name) {
		for (int i = 0; i < SIZE; i++) {
			if (m[i] != null && m[i].getId().equals(id)) {
				m[i].setName(name);
				return true; // 수정 성공
			}
		}
		return false; // 수정 실패
	}
	
	// test OK
	// 동일
	// test OK
	//OK
	public Boolean updateEmail(String id, String email) {
		for (int i = 0; i < SIZE; i++) {
			if (m[i] != null && m[i].getId().equals(id)) {
				m[i].setEmail(email);
				return true; // 수정 성공
			}
		}
		return false; // 수정 실패
	}
	
	
	// test OK
	// 인자값으로 받은 id와 중복이 있다면 해당 객체의 배열에 null 대입
	// test OK
	public Boolean delete(String id) {
		// 삭제 여부를 반환할 값을 저장할 변수 선언
		boolean isDeleted = false;

		for (int i = 0; i < SIZE; i++) {
			if (m[i] != null && m[i].getId().equals(id)) {
				m[i] = null; // 기존에 들어있던 Member객체의 주소값 대신 null로 대입되면서 해당 객체를 가리키는 포인터?가 사라져 해당 객체는 heap에서 사라질 예정
				isDeleted = true; // 삭제 성공, true
			}
		}
		return isDeleted; // 성공여부 반환
	}
	
	// test OK
	// 반복문 통해 각 인덱스 돌면서 null 대입
	// test OK
	public void delete() {
		for (int i = 0; i < SIZE; i++) {
			m[i] = null;
		}
	}
	
	
	// test OK
	// 임시 객체 배열 선언하여 유효한 객체 담고 깊은복사하여 배열 반환 
	// test OK
	public Member[] printAll() {
		Member[] temp = new Member[SIZE];
		int count = 0;
		for (int i = 0; i < SIZE; i++) {
			if (m[i] != null) {
				temp[count++] = m[i];
			}
		}
		Member[] allMember = new Member[count];
		System.arraycopy(temp, 0, allMember, 0, count);
		return allMember;
	}

	public Member[] getM() {
		return m;
	}
	
	public int deleteMemberP(String userId, String userPw) {
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null &&
					m[i].getId().equals(userId) &&
					m[i].getPassword().equals(userPw)) {
				m[i] = null;
				return 1;
			}
		}
		return 0;
	}
}
