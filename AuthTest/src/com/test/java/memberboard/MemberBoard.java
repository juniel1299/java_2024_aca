package com.test.java.memberboard;

import com.test.java.member.Member;
import com.test.java.view.View;

public class MemberBoard {
	public void list() {
		
		//이 게시판을 접근할 권한이 있는지?
		if(Member.auth == null ) {
			System.out.println("회원만 접근이 가능합니다.");
			View.pause();
			return;
		}
		
		System.out.println("회원 게시판 목록");
		View.pause();
	}
}
