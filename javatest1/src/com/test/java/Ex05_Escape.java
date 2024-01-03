package com.test.java;

public class Ex05_Escape {
	public static void main(String[] args) {

		//Ex05_Escape.java
		
		//특수문자 > Escape Sequence
		// 컴파일러가 번역을 할 때, 소스의 문자를 그대로 출력하지 않고, 미리 약속된 표현으로 바꿔서 출력하는 요소
		
		// 1. \n 줄바꿈 (new line , line feed)
		// 개행문자(엔터)
		
		//ex ) 안녕하세요. 홍길동입니다. 출력해주세요 (단 마침표 이후 엔터)
		
		//** 문자열 리터럴내에는 엔터를 작성할 수 없음.
		String msg = "안녕하세요.\n홍길동입니다.";
		System.out.println(msg);
		
		
		// 빈 줄 입력 
		System.out.println();
		// 2. \r (carriage return)
		//캐럿의 위치를 현재 라인의 맨 앞으로 이동
		// 키보드 > home 키 역할
		
		
		msg = "안녕하세요.\r홍길동";
		System.out.println(msg);
		
		// 운영체제의 엔터
		// 1. 윈도우 > \r\n 
		// 2. 맥 > \r
		// 3. 리눅스 > \n
		
		System.out.println("하나\r\n둘"); //정석
		System.out.println("하나\n둘");
		
		//3 \t 탭문자  (tab)
		// 탭 > 
		
		msg = "하나\t둘\t셋";
		System.out.println(msg);
		
		
		
		// 4. \b (backspace)
		msg = "홍길동\b입니다."; //홍길입니다. [단 이클립스에서 지원x]
		System.out.println(msg);
		
		// 5. \",\',\\
		// 이미 역할이 있는 문자를 역할이 없게 만드는 작업
		
		//요구사항] 화면 > 홍길동: "안녕하세요."
		
		
		msg = "홍길동:\"안녕하세요.\""; // 리터럴 안에는 " 못 씀 > 쓰기 위해선 \"로 붙여야함
		
		//요구사항) 수업 폴더의 경로를 출력하시오 .
		
		msg = "C:\\class\\code\\java"; // 리터럴 안에는 \ 못 씀 > 쓰기 위해선 \\로 써야함 
		
		System.out.println(msg);
		
		
		
		
		
		
		
		
		
	}
}
