package com.test.java;

public class Ex09_Error {
	public static void main(String[] args) {
		
		//Ex09_Error.java
		
		int a = 0; // 사용자 입력
		
		System.out.println(100 / a); // 재수 (나누는 수)는 0이 될 수 없다. 단 실수/실수에선 분모에 0 가능 . 
		//에러, Error
		// 오류, 버그(Bug) , 예외 (Exception) 등
		// 1. 컴파일 에러 : 컴파일 작업 중에 발생하는 에러
			// - 컴파일러 발견 > 번역하다가 > 문법이 틀려서 > 발생 > 컴파일 작업 중단 > 프로그램 생성 불가 > 반드시 고쳐야함
			// - 난이도 가장 낮음 > 컴파일러가 오류를 알려줌 > 에러 메세지
			// 오타, 빨간 밑줄 
		
		// 2. 런타임 에러 : 동작시에 오류가 발생 
			// - 런타임(Runtime) > 실행 중 
			// - 컴파일 작업 중에는 없었는데 실행 중에 발생하는 에러 
			// 문법은 오류가 없음 > 다른 원인으로 발생
			// 예외(Exception) , 난이도 중간 > 발견 O,X (복불복)
		
		// 3. 논리 에러
			// 컴파일 성공 + 실행 성공 > 결과가 이상함
		
		
		int n1 = 10;
		int n2 = 5;
		System.out.println(n1 - n2);
		
		//Arithmetic > 정수에서 많이 뜨는 오류 , 
		
	}
}
