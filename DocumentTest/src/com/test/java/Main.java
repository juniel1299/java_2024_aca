package com.test.java;

import com.test.java.member.Member;

/**
 메인 클래스입니다.
 */
public class Main {

	/**
	 *메인 메서드입니다.
	 * @param args 파라미터 
	 */
	public static void main(String[] args) {
	
	Member m = new Member();
	m.nick = "강아지";
	m.info();
	m.check();
	m.upgrade(0, "ㅇㅇ");
	
	
	
	
}//main
}
// 기술 문서 작성
// API Documentation
// JDK 내장 > javadoc.exe 사용 
// - 개발자가 미리 작성 내용 > 형식 > 문서화
// 웹페이지 형식으로 생성 (HTML 문서)
//javadoc comment 사용 > 문서 주석 /** */
		// - 이클립스의 도움말로 사용
			//- 문자의 내용으로 사용

// 주석의 대상
// -패키지
// - 클래스(인터페이스, 추상메서드 등등..)
// - 메서드
// - 필드 ( public 변수 )

