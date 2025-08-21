package com.kh.chap05.model.vo;

public class Jazz implements MusicI, MultipleTestI {

	@Override
	public void play() {
		System.out.println("Jazz PLAY");
	}

}
