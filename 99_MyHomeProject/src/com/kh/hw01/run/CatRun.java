package com.kh.hw01.run;

import com.kh.hw01.vo.Cat;

public class CatRun {
	public static void main(String[] args) {
		Cat co = new Cat();
		
		co.name = "도리";
		co.species = "먼치킨";
		co.age = 4;
		co.gender = "암컷";
		co.color = "흰색";
		co.weight = 5;
		
		co.printCat();
		co.degul();
		co.growOlder();
		co.growOlder();
		
		Cat dog = new Cat();
		
		dog.name = "코기";
		dog.species = "샴";
		dog.age = 10;
		dog.gender = "수컷";
		dog.color = "검정색";
		dog.weight = 15;
		
		dog.printCat();
		dog.degul();
		dog.degul();
		dog.growOlder();
	}
}
