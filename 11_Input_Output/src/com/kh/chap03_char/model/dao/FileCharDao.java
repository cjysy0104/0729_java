package com.kh.chap03_char.model.dao;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FileCharDao {

	// 프로그램 --> 외부매체(파일)
	// 출력
	public void outputToFile() {
		// FileWriter : 파일로 데이터를 2Byte단위로 출력하는 스트림

//		// 0. 스트림 선언
//		FileWriter fw = null;
//
//		try {
//			// 1. 스트림 생성
//			fw = new FileWriter("b_char.txt");
//
//			// 2. 데이터출력 => write()
//			fw.write("와..IO..신기하다..");
//			fw.write("E");
//
//		} catch (IOException e) {
//
//			System.out.println("다시 시도해주세요.");
//
//		} finally {
//
//			try {
//				// 3. 자원반납 => 꼭 해야하는 작업 => close()
//				if (fw != null)
//					fw.close();
//
//			} catch (IOException e) {
//
//				e.printStackTrace();
//
//			}
//
//		}
		
		//반납하기 귀찬타
		/*
		 * try ~ with ~ resource 구문
		 * 
		 * -JDK 7 이상부터 사용가능
		 * 
		 * try(스트림객체생성; ...){
		 * 		예외가 발생할 수도 있는 구문;
		 * } catch(예외클래스 e) {
		 *		예외가 발생했을 때 실행할 구문; 
		 * }
		 * 블럭이 끝나는 시점에 close()를 호출해서 자동으로 자원을 반납해줌
		 * 혹여나 할 수도있는 실수를 줄일 수 있는 아주 훌륭한 문법
		 * 
		 * 전제조건: Closeable 인터페이스를 구현하고있는 클래스일 것
		 */
		try (FileWriter fw = new FileWriter("b_char.txt"); 
				Scanner sc = new Scanner(System.in);) {
			fw.write("와..IO..신기하다..");
			fw.write("E");
		} catch (IOException e) {
			e.printStackTrace();
		}
		// try(), catch()의 괄호 안에 작성하면 알아서 close() 호출해줌
		
	}

	public void writeTil() {

		// 사용자에게 오늘 학습내용을 입력받아서
		// 외부 파일에 내용을 출력

		// 내보낼 파일명: 2025년 08월 14일 오늘의 학습일지
		Date now = new Date();
		System.out.println(now);
		// 2025년 08월 14일 : 형태 바꾸기(formating)
		String titleDate = new SimpleDateFormat("yyyy년 MM월 dd일").format(now);
		System.out.println(titleDate);

		// String fileName = titleDate + " 오늘의 학습일지.txt"; 참치마요
		StringBuilder sb = new StringBuilder();
		sb.append(titleDate);
		sb.append(" 오늘의 학습일지.txt");

		FileWriter fw = null;
		Scanner sc = new Scanner(System.in);

		try {

			fw = new FileWriter(sb.toString());
			System.out.println("내용을 한 번 작성해보시오 > ");
			String content = sc.nextLine();
			fw.write("오늘 학습한 내용 : \t" + content);

		} catch (IOException e) {

			System.out.println("쵸비상");

		} finally {

			try {

				if (sc != null)
					sc.close();
				if (fw != null)
					fw.close();

			} catch (IOException e) {

				System.out.println("자원 반납하다가 쵸비상");

			}

		}

	}
}
