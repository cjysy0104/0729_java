package com.kh.chap02.encapsulation.model.vo;


// 필드부, 생성자부, 메서드부
public class Cafe {

	// 필드(Field)부
	/*
	 * 객체가 가질 수 있는 속성
	 * 
	 * 정보(Data)를 담는 부분
	 * 
	 * 필드 == 멤버변수
	 * 
	 * 접근제한자 자료형 필드식별자;
	 */
	
	private String name;
	private String address;
	private int signatureMenuPrice;
	
	// 생성자(Constructor)
	
	
	// 메서드(Method)부
	/*
	 * 기능(method)을 구현하는 부분
	 * 
	 * 접근제한자 (예약어) 반환형 메서드식별자(매개변수(parmeter)){
	 * 		메서드 호출 시 실행할 코드;
	 * }
	 * 
	 * 접근제한자 : 호출할 수 있는 범위를 제한할 수 있음
	 * 반환형 : void => return할 때 돌려줄 값이 없음
	 * 매개변수 : 메서드 호출 시 전달 값을 받아주는 변수 
	 *			메서드 범위에서만 사용 가능. 생략 가능
	 */
	
	public void open() {
//		dishWash();
		cleaning();
		windowWash();
		//a();
	}
	
//	private void dishWash() {
//		System.out.println("깨끗하게 빡빡!");
//	}
	
	private void cleaning() {
		System.out.println("청소도 빢빢!!");
	}
	
	private void windowWash() {
		System.out.println("유리도 빢빢!!!");
	}
	
	// 데이터를 기록 및 수정하는 기능의 메소드 : setter()
	
	/*
	 * DTO -> setter를 만들어줌
	 * VO  -> 일반적으로 setter메서드를 구현하지 않음
	 * 
	 * (08/06) DTO학습 전까지만 VO클래스에 setter를 구현해서 사용
	 * 
	 * setter 만들기 규칙
	 * 
	 * 1. setter 메서드는 외부에서 접근이 가능해야 하기 때문에 접근제한자 public을 이용
	 * 2. 'set필드명'으로 식별자를 작성하며 camelCase를 꼭 지키도록 한다.
	 * 
	 * 3. (예외상황)우리는 당분간 항상 모든 필드에 대해서 setter를 구현합니다
	 * 
	 * 
	 */
	
	// 고유메뉴의 가격정보를 기록 및 수정할 수 있는 메서드
	// signatureMenuPrice
	// camelCase 반드시 지킬 것!!!!, 매개변수명은 필드명과 동일하게
	public void setSignatureMenuPrice(int signatureMenuPrice) {	
//		System.out.println("setter에서 전달받은 값: " 
//							+ signatureMenuPrice);
		
		// signatureMenuPrice = signatureMenuPrice;
		// Scope안에서는 해당 영역안에 있는 지역변수에 대한 우선권이 있음
		// System.out.println("내 주소가 뭐지 > " + this);
		// this : 해당 객체의 주소값을 가리키는 역할
		// this.signatureMenuPrice = signatureMenuPrice;
		if(signatureMenuPrice <= 1000) {
			System.out.println("정상적이지 않은 값을 입력하셨습니다. 1000이상 정수를 입력하세요");
		} else {
			this.signatureMenuPrice = signatureMenuPrice;
		}
		
	}
	
	
	// name필드를 기록 및 수정할 수 있는 메서드
	public void setName(String name) {	// 항상 camelCase 지키기
		this.name = name;
	}

	public void setAdress(String address) {
		this.address = address;
	}
	/*
	 * 관례 위반: 아래와 같이 두 개 이상의 필드값을 변경하는 메서드는 set이 붙으면 안됨.
	 * >>
	 * public void setNameAndAdress(String name, String adress){
	 * 		setName(name);
	 * 		setAdress(adress);
	 * }
	 */
	
	
	// 데이터를 반환해주는 기능의 메소드 : getter()
	/*
	 * 규칙
	 * 
	 * 1. getter()는 접근제한자 public 사용
	 * 2. get필드명으로 지으며, camelCase 반드시 준수!!
	 * 3. 모든 필드에 대해서 반드시 필수로 만들어주세요!
	 */
	
	// 메서드를 호출한 곳으로 name필드값을 돌려주고 싶음
	public String getName() {
		return name;
	}
	
	// 주소지를 반환해주는 메서드
	public String getAddress() {
		return address;
		// return value;
		// value를 메서드 호출 부분으로 반환하겠다.
		// 메서드의 반환형과 반환하고자 하는 값의 자료형이 일치하는가를 꼭 확인!
	}
	
	public int getSignatureMenuPrice() {
		return signatureMenuPrice;
	}
	
	//(현 학습진도에서)
	// getter() / setter() 완성 ==> 캡슐화가 끝남(문법적인 관례)
	/*
	 * 1. 값을 숨긴다 => 필드의 접근제한자를 public 대신 private로 선언
	 * 2. 메서드를 통해 필드에 접근할 수 있도록 만들어준다 => getter() / setter() 구현
	 * 
	 * 
	 * 데이터를 숨김 -> 객체간의 결합도를 낮춤 -> 책임을 분리시킨다.
	 * 
	 */
	
	// 모든 필드 값을 확인할 수 있도록 반환해주는 메서드
	public String info() {
		
		// 현 필드: name, address, signatureMenuPrice
		// return 할 때 반환할 수 있는 값은 단 한 개
		
		// 
		
		String info = "[name 필드값: " + name + 
					  ", address 필드값: " + address + 
					  ", signatureMenuPrice 필드값: " + signatureMenuPrice +
					  "]";
		return info;
		
		
		
	}
}




