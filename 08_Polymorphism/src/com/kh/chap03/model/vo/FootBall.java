package com.kh.chap03.model.vo;

public class FootBall extends Sports{

	@Override
	public void rule() {
		System.out.println("골키퍼를 제외한 인원은 손으로 공을 만지면 안됩니다.");
	}
}
