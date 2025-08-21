package com.kh.chap02.run;

import java.util.ArrayList;
import java.util.List;

import com.kh.chap02.model.vo.Plant;

public class GenericRun {

	public static void main(String[] args) {
		/*
		 * 제네릭 <Generic>
		 * 
		 * 컬렉션을 사용하면서 다룰 타입들을 미리 지정할 수 있는 기능
		 * => 명시적으로 <Integer>, <Plant>
		 * => 특정 타입의 요소들만 컬렉션에 담을 수 있도록 지정할 수 있음
		 * 
		 * 별도의 제네릭 없이 컬렉션 객체 생성(E == Object)
		 * 
		 * 1. 다룰 요소의 타입을 제한할 수 있음 => 실수를 줄일 수 있음
		 * 2. 매 번 형변환하는 절차를 없앨 수 있음 => 코드 짤 떄 편함
		 */
		// 1.
		List<Plant> plants = new ArrayList();
		plants.add(new Plant("관엽","산세베리아"));
		//plants.add("식물시작");
		plants.add(new Plant("관엽","폴리샤스"));
		
		// 2.
		//String name = ((Plant)plants.get(0)).getName();
		Plant p = plants.get(0);
		for(Plant plant : plants) {
			System.out.println(plant);
		}
		
		/*
		ArrayList plants = new ArrayList();
		plants.add("asdf");
		plants.add(new Plant());
		plants.add(1);	// 기본자료형은 X => Wrapper class로 참조자료형으로 (Integer)
		plants.add(1.1); // Double
		int i = 1;
		System.out.println((Object)i);
		*/
		
	}

}
