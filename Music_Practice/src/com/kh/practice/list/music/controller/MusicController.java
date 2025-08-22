package com.kh.practice.list.music.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.practice.list.music.model.vo.Music;

public class MusicController {

	private List<Music> list = new ArrayList();

	public int addList(Music music) {
		list.addLast(music);
		return 1;
	}

	public int addAtZero(Music music) {
		list.addFirst(music);
		return 1;
	}

	public List printAll() {
		return list;
	}

	// TODO: 곡 제목이 중복이면 어떻게할지
	public Music searchMusic(String title) {
		for(int i = 0; i < list.size(); i++) {
			Music music = list.get(i);
			if(music.getTitle().equals(title)) {
				return music;
			}
		}
		return null;
	}

	public Music removeMusic(String title) {
		return null;
	}

	public Music setMusic(String title, Music music) {
		return null;
	}

	public int ascTitle() {
		return 0;
	}

	public int descSinger() {
		return 0;
	}
}
