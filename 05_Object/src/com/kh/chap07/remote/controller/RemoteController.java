package com.kh.chap07.remote.controller;

import com.kh.chap07.remote.model.vo.Television;

// 데이터(VO)와 화면(View)의 중간다리 역할
public class RemoteController {

	private Television tv = new Television();
	private int channelNo;

	public int getChannelNo() {
		return channelNo;
	}

	public int powerOn() {

		if (!tv.isOn()) {

			tv.setOn(true);
			channelNo = 1;

			return 1;
		}

		return 0;
	}

	public int powerOff() {
		if (tv.isOn()) {

			tv.setOn(false);
			channelNo = 0;

			return 1;
		}

		return 0;
	}

	public String channelUp() {
		// getter메서드 호출해서 받아오기
		String[] channel = tv.getChannel();

		if (channelNo < (channel.length - 1)) {
			return channel[++channelNo];
		} else {
			return null;
		}

	}

}
