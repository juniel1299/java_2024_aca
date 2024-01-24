package com.test.java;

import java.util.Scanner;

import com.test.java.adminboard.AdminBoard;
import com.test.java.freeboard.FreeBoard;
import com.test.java.member.Login;
import com.test.java.member.Logout;
import com.test.java.member.Member;
import com.test.java.memberboard.MemberBoard;
import com.test.java.view.View;

public class Main {
	public static void main(String[] args) {
		
		//전체 흐름 통제
		
		boolean loop = true;
		Scanner scan = new Scanner(System.in);
		while(loop) {
			
			View.mainmenu();
			
			String sel = scan.nextLine();
			
			if(sel.equals("1")) {
				//로그인
				Login.login();
				
			}else if(sel.equals("2")) {
				//로그아웃
				Logout.logout();
			}else if(sel.equals("3")) {
				FreeBoard board = new FreeBoard();
				board.list();
				
			}else if(sel.equals("4")) {
				MemberBoard board = new MemberBoard();
				board.list();
			}else if(sel.equals("5")) {
				AdminBoard board = new AdminBoard();
				board.list();
				
			}else {
				loop = false;
				
			}
			
			System.out.println("당근 마켓 종료");
		}
		
		
		
	}//main
}
