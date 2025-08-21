package com.kh.chap05.run;

import com.kh.chap05.model.vo.HipHop;
import com.kh.chap05.model.vo.Jazz;
import com.kh.chap05.model.vo.MusicI;

public interface Run {

	public static void main(String[] args) {
		
		MusicI hiphop = new HipHop();
		hiphop.play();
		MusicI jazz = new Jazz();
		jazz.play();
		
		hiphop.stop();
	}
}
