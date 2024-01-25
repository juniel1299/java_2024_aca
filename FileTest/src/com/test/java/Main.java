package com.test.java;

import java.util.Scanner;

import com.github.lalyos.jfiglet.FigletFont;
import com.test.java.repository.Data;
import com.test.java.service.Service;

public class Main {
public static void main(String[] args) {
	
	
	//***** 파일을 직접 입출력 관리 > 파일 스트림으로 인해 불편 
	//성적 관리 > score.txt 파일 내용 관리
	
	//score.txt >> 변환 >> 컬렉션 
	
	Data.load(); //텍스트 내용 불러오기
	
	System.out.println(Data.list);
	boolean loop = true;
	

	Scanner scan = new Scanner(System.in);
	
	while(loop) { 
		
		try {
			String title = FigletFont.convertOneLine("figlet\\rectangles.flf","Score"); 
			
		
		System.out.println("======================================");
		System.out.println(title);
		System.out.println("======================================");
		System.out.println("1.성적 추가");
		System.out.println("2.성적 확인");
		System.out.println("3.성적 삭제");
		System.out.println("4.프로그램 종료");
		System.out.println("=-------------------------------------");
		System.out.print("선택(번호): ");
		} catch (Exception e) {
			System.out.println("Main.main");
			e.printStackTrace();
		}
		
		String sel = scan.nextLine();
		if(sel.equals("1")) {
			Service service = new Service();
			service.add();
			
			
		}else if(sel.equals("2")) {
			
			Service service = new Service();
			service.list();
			
		}else if(sel.equals("3")) {
			
			Service service = new Service();
			service.remove();
			
			
		}else if(sel.equals("4")) {
			loop = false;
		}
		
		
		
		
	}
	
	System.out.println("프로그램 종료");
	
	Data.save();
	
	
	
}//main
}
