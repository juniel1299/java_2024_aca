package com.test.java;

import java.io.IOException;

public class Ex07_Input {
	public static void main(String[] args) throws IOException {

		// Ex07_Input.java

		// 콘솔 입력
		// 1. System.in.read();
		// - System.out.println(); 의 반대
		// 1문자 입력 가능 (1byte만 읽음) -> 3개 반복하여 작성하면 3글자가 가능.
		// 문자 코드값을 반환
		// 한글 입력 불가능(2byte 문자 미지원, ASCII 문자만 지원)
		// 2. BufferedReader 클래스

		// 3. Scanner 클래스

		// 요구사항) 사용자에게 문자 1개를 입력 > 화면에 출력하시오.

		// 1. 라벨 출력
		// 2. 문자 입력
		// 3. 문자를 화면에 출력

		System.out.print("문자 입력: ");

		// 사용자로부터 키보드 입력을 받아서 입력한 문자를 돌려준다.
		// 현재 상태 > 사용자가 키를 입력하기를 대기하고 상태
		// 사용자가 입력 해야 대기 상태가 해제된다.

		
		
		// 컴퓨터 입력 받는 형식 
		// 키보드로 A 입력 > 버퍼에 A가 입력 > 프로그램에서 65를 받고 데이터 작성 버퍼에 쓰인 값을 지움
		// A를 입력했을 때 65 65 A 13 10 출력된 이유 > 출력에 작성되어있는 \  % 와 입력할 때 쓰인 엔터키(\n)에 대한 숫자들까지 다 출력한 것
		
		
		int code = System.in.read();

		System.out.println("출력: " + code);
		System.out.printf("출력: %c\n", code);

		code = System.in.read();
		System.out.printf("출력 : %d\n", code);
		System.out.printf("출력 : %c\n", code);

		code = System.in.read();
		System.out.printf("출력 : %d\n", code);
		System.out.printf("출력 : %c\n", code);

		code = System.in.read();
		System.out.printf("출력 : %d\n", code);
		System.out.printf("출력 : %c\n", code);
		
		code = System.in.read();
		System.out.printf("출력 : %d\n", code);
		System.out.printf("출력 : %c\n", code);
		
		code = System.in.read();
		System.out.printf("출력 : %d\n", code);
		System.out.printf("출력 : %c\n", code);
		
		code = System.in.read();
		System.out.printf("출력 : %d\n", code);
		System.out.printf("출력 : %c\n", code);
		
		code = System.in.read();
		System.out.printf("출력 : %d\n", code);
		System.out.printf("출력 : %c\n", code);

		
		
		
		
	}
}
