package com.kh.chap05.model.vo;

public class HipHop extends Music implements MusicI, MultipleTestI {

	@Override
	public void play() {
		System.out.println("HipHop PLAY");
	}
	
	
}
