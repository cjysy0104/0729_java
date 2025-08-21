package com.kh.chap07.remote.model.vo;

// 필요한 값들을 저장하는 역할
public class Television {
	// 필드부
	private boolean on;
	/*
	 * 채널 어떻게 할까? 
	 * 1. 정수형 2. String[] V
	 */
	private String[] channel;

	// 생성자부
	public Television() {
		channel = new String[5];
		channel[0] = "YTN 뉴스채널";
		channel[1] = "시니어 토크쇼";
		channel[2] = "스튜디오K";
		channel[3] = "EBS 평생학교 2교시";
		channel[4] = "꾸러기TV";

	}

	// 메서드부
	// getter setter
	public String[] getChannel() {
		return channel;
	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}
}
