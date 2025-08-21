package com.kh.plant.view;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.kh.plant.controller.PlantController;
import com.kh.plant.model.vo.Plant;

// View : 시각적인 부분 담당, 화면 입/출력
public class PlantView {
	// Composition: 합성, 결합도를 ↓
	private Scanner sc = new Scanner(System.in);
	private PlantController pc = new PlantController();

	// 프로그램 실행 시 보여줄 화면을 출력해주는 기능
	public void mainMenu() {
		// 저장소 : ArrayList
		while (true) {
			System.out.println();
			System.out.println("식물 관리 프로그램입니다.");
			// 식물 CRUD 하기
			// Create : 사용자에게 입력받은 값을 가지고 새로운 식물을 추가하는 작업
			// Read : 만들어진 식물을 조회하는 작업
			// Update : 기존의 식물을 수정하는 작업
			// Delete : 식물을 삭제하는 작업

			System.out.println("1. 식물 추가하기");
			System.out.println("2. 식물 전체조회");
			System.out.println("3. 특정 식물 검색");
			System.out.println("4. 특정 식물 삭제");
			System.out.println("5. 특정 식물 수정");
			System.out.println("6. 식물 목록을 파일로 저장");
			System.out.println("0. 프로그램 종료");
			System.out.println();
			System.out.println("어떤 기능을 이용하시겠어요 > ");

			try {
				int menuNo = sc.nextInt();
				sc.nextLine();

				switch (menuNo) {
				case 1:
					createPlant();
					break;
				case 2:
					readAll();
					break;
				case 3:
					findByKeyword();
					break;
				case 4:
					deletePlant();
					break;
				case 5:
					updatePlant();
					break;
				case 6:
					outputFile();
					break;
				case 0:
					System.out.println("프로그램을 종료합니다.");
					return;
				default:
					System.out.println("없는 메뉴입니다. 다시 선택해주세요.");
				}
			} catch (InputMismatchException e) {
				System.out.println("숫자만 입력해주세요.");
				sc.nextLine();
			}

		}

	}








	// 1. 새롭게 식물을 추가할 수 있는 화면을 보여주는 메서드
	private void createPlant() {

		System.out.println();
		System.out.println(" 🍀식물추가서비스입니다.🍁 ");
		System.out.println("식물 명을 입력해주세요 > ");
		String name = sc.nextLine();
		System.out.println("종류를 입력해주세요 > ");
		String type = sc.nextLine();

		// 식물 VO클래스에 대입할 값 두 개를 입력받았음
		// View는 할 일 끝남

		// 사용자가 입력한 식물명이랑 종류를 가지고 식물목록에 추가해줘 => 요청
		pc.createPlant(name, type);

		System.out.println("축하합니다.");
		System.out.println("새로운 식물이 추가되었습니다.");
	}

	// 2. 전체 식물 목록을 출력해주는 기능
	private void readAll() {

		System.out.println();
		System.out.println("전체 식물 목록입니다.");
		System.out.println("================================");

		List<Plant> plants = pc.readAll();

		// 경우의 수
		// case 1. 값이 없을 경우 1) =>
		// case 2. 값이 하나일 경우
		// case 3. 값이 여러 개일 경우 2+3) =>
		// 1) List의 요소가 하나도 존재하지 않을 경우
		if (plants.isEmpty()) {

			System.out.println("식물이 존재하지 않습니다.");
			System.out.println("새로운 식물을 추가해보세요.");

			// 2~3) 값이 하나 이상 존재할 경우
		} else {

			for (Plant p : plants) {
				System.out.println("식물이름: " + p.getName() + " 식물 종: " + p.getType());
				System.out.println("================================");
			}
		}

		System.out.println();
	}
	
	
	// 3. 사용자가 식물에 대한 키워드를 입력할 수 있는 화면을 출력해주는 기능
	private void findByKeyword() {
		// 1. 사용자가 입력한 키워드가 제목에 포함되어있다면 출력
		// 2. 사용자가 입력한 키워드가 타입에 포함되어있다면 출력
		// 3. 사용자가 입력한 키워드가 제목 또는 타입에 포함되어있다면 출력
		// 4. 사용자가 입력한 키워드가 제목과 타입에 둘 다 포함되어있다면 출력
		
		// 3)
		System.out.println();
		System.out.println("키워드 검색 서비스입니다.");
		String keyword = sc.nextLine();
		
		// View가 할 일 끝
		// 컨트롤러에게 요청
		List<Plant> searched = pc.findByKeyword(keyword);

		if (searched.isEmpty()) {

			System.out.println("검색 결과가 없습니다.");

		} else {

			System.out.println("조회 결과가 총 "+ searched.size() + "개 존재합니다.");
			System.out.println("================================");
			
			for (Plant p : searched) {

				System.out.println(p);
				System.out.println("================================");

			}
		}
	}

	
	// 4. 특정 식물을 삭제할 수 있는 화면을 출력해주는 기능
	private void deletePlant() {

		System.out.println();
		System.out.println("식물 삭제 서비스입니다.");
		// 삭제를 어떻게 할 수 있도록 만들어줄 것인가?
		// 1. 식물 이름을 입력받아서 삭제
		// 2. 식물 타입을 입력받아서 삭제
		// 3. 식물 이름과 타입을 입력받아서 삭제 (V)
		// 4. 그냥 아무것도 입력 안받고 전체 삭제

		// (3) 이름 및 타입을 입력받아서 삭제
		// 1) 이름만 일치하면 삭제
		// 2) 타입만 일치하면 삭제
		// 3) 이름 및 타입 둘 다 일치해야 삭제 (V)
		// 4) 이름 키워드가 포함되어 있으면 삭제
		// 5) 타입 키워드가 포함되어 있으면 삭제
		// 6) 이름 또는 타입 키워드가 포함되어 있으면 삭제

		// 3-3) 이름 및 타입을 입력받고 둘 다 일치하는 값이 있을 때만 삭제
		System.out.println("식물의 이름을 입력해주세요 > ");
		String name = sc.nextLine();
		System.out.println("식물의 종류를 입력해주세요 > ");
		String type = sc.nextLine();

		// View 할 일 끝

		// 컨트롤러에게 사용자가 입력한 값 두 개를 전달하면서 삭제요청 보내기
		int count = pc.deletePlant(name, type);

		if (count > 0) {
			System.out.println("삭제가 정상적으로 완료되었습니다.");
			System.out.println(name + "를 총 " + count + "개 삭제했습니다.");
		} else {
			System.out.println("삭제 안댐");
		}
	}
	
	// 5. 특정 식물의 정보를 수정할 수 있는 화면을 출력해주는 기능
	private void updatePlant() {

		System.out.println();
		
		// 1. 이름 -> 이름
		// 2. 타입 -> 타입
		// 3. 이름, 타입 -> 이름
		// 4. 이름, 타입 -> 타입
		// 5. 이름 -> 타입
		// 6. 타입 -> 이름
		// 7. 이름, 타입 -> 이름, 타입 (V)
		
		// 사용자에게 식물의 이름 및 타입을 입력받아서
		// 일치하는 식물을 찾아서
		// 새로운 식물의 이름 및 타입으로 갱신
		System.out.println("식물 정보 수정 서비스입니다.");
		// 4개를 입력
		System.out.println("기존 식물 이름 > ");
		String name = sc.nextLine();
		
		System.out.println("기존 식물 종류 > ");
		String type = sc.nextLine();
		
		System.out.println("새 식물 이름 > ");
		String newName = sc.nextLine();
		
		System.out.println("새 식물 이름 > ");
		String newType = sc.nextLine();
		
		// 1절 끝
		boolean isUpdate = pc.updatePlant(name, type, newName, newType);
		
		// 실패
		if (!isUpdate) {
			
			System.out.println("수정 실패");
			
		  // 성공
		} else {
			
			System.out.println("수정 완료");
			
		}
		
		System.out.println();
	}
	
	
	private void outputFile() {

		pc.outputFile();
		System.out.println("출력완료");
	}
	
}


















