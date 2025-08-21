package com.kh.chap03.model.vo;

import java.util.Objects;

public class MBTI {

	private String introExtro;
	private String sensingIntuition;
	private String thinkFeel;
	private String judgePerceive;
	
	public MBTI() {
		super();
	}
	public MBTI(String introExtro, String sensingIntuition, String thinkFeel, String judgePerceive) {
		super();
		this.introExtro = introExtro;
		this.sensingIntuition = sensingIntuition;
		this.thinkFeel = thinkFeel;
		this.judgePerceive = judgePerceive;
	}
	
	public String getIntroExtro() {
		return introExtro;
	}
	public void setIntroExtro(String introExtro) {
		this.introExtro = introExtro;
	}
	public String getSensingIntuition() {
		return sensingIntuition;
	}
	public void setSensingIntuition(String sensingIntuition) {
		this.sensingIntuition = sensingIntuition;
	}
	public String getThinkFeel() {
		return thinkFeel;
	}
	public void setThinkFeel(String thinkFeel) {
		this.thinkFeel = thinkFeel;
	}
	public String getJudgePerceive() {
		return judgePerceive;
	}
	public void setJudgePerceive(String judgePerceive) {
		this.judgePerceive = judgePerceive;
	}
	
	@Override
	public String toString() {
		return "MBTI [introExtro=" + introExtro + ", sensingIntuition=" + sensingIntuition + ", thinkFeel=" + thinkFeel
				+ ", judgePerceive=" + judgePerceive + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(introExtro, judgePerceive, sensingIntuition, thinkFeel);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MBTI other = (MBTI) obj;
		return Objects.equals(introExtro, other.introExtro) && Objects.equals(judgePerceive, other.judgePerceive)
				&& Objects.equals(sensingIntuition, other.sensingIntuition)
				&& Objects.equals(thinkFeel, other.thinkFeel);
	}

// 결론
// 필드의 값이 동일하다면
// equals()와 hashCode()를 오버라이딩해서 동일한 결과값이 출력되도록 구현해야함
/*
	@Override
	public boolean equals(Object obj) {
		
		MBTI mbti = (MBTI)obj;
		// 필드값 비교
		// E_I, S_N, T_F, J_P 넷 중 하나라도 다르다면 false 반환
		// 나의 필드와 매개변수로 받아온 값의 필드
		if(!(this.introExtro.equals(mbti.getIntroExtro())) ||
		   !(this.sensingIntuition.equals(mbti.getSensingIntuition())) ||
		   !(this.thinkFeel.equals(mbti.getThinkFeel())) ||
		   !(this.judgePerceive.equals(mbti.getJudgePerceive()))) {
			
			return false;
			
		} 
		
		return true;
		
		@Override
		public int hashCode() {
			// 객체를 가지고 알아서 10진수 만들어서 변환
			// 필드값 똑같으면 똑같은 해시코드 나오도록 하고싶다
			
			
			return (introExtro + sensingIntuition 
					+ thinkFeel + judgePerceive).hashCode(); 
		}
		
	
	
	}*/













}