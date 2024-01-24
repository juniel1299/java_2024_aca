package com.test.java;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		//전체 흐름 통제
		
		boolean loop = true;
		Scanner scan = new Scanner(System.in);
		while(loop) {
			
			System.out.println("==========================");
			System.out.println("       당근 마켓 ");
			System.out.println("==========================");
			System.out.println("1. 로그인");
			System.out.println("2. 로그아웃");
			System.out.println("3. 자유게시판");
			System.out.println("4. 회원게시판");
			System.out.println("5. 관리자게시판");
			System.out.println("0. 종료");
			System.out.println("==========================");
			System.out.print("선택(번호) : ");
			
			String sel = scan.nextLine();
			
			if(sel.equals("1")) {
				
			}else if(sel.equals("2")) {
				
			}else if(sel.equals("3")) {
				
			}else if(sel.equals("4")) {
				
			}else if(sel.equals("5")) {
				
			}else {
				loop = false;
				
			}
			
			System.out.println("당근 마켓 종료");
		}
		
		
		
	}//main
}
