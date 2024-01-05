package com.test.java;

public class Ex18_Method {
	public static void main(String[] args) {
		// Ex18_Method

		// **메서드 오버로딩 , Method Overloading
		// 같은 이름의 메서드를 여러개 만드는 기술
		// 메서드의 인자 리스트를 다양한 형태로 구성해서, 같은 이름의 메서드를 여러개 만드는 기술

		// 메서드 오버로딩을 하는 이유
		// 성능 향상 > x
		// 개발자에게 도움 > o

		// **메서드 오버로딩 구현 조건 가능
		// 1. 매개변수의 개수
		// 2. 매개변수의 자료형

		// 메서드 오버로딩 구현 조건 불가능
		// 1. 매개변수의 이름
		// 2. 반환값의 자료형
		// 메서드 만들 때
		// 1번 . public static void test(){} //가능
		// 2번 . public static void test(){} //x 1번만
		// 3번 . public static void test(int n){} //가능
		// 4번 . public static void test(int m){} // x 불가능,
		// 5번 . public static void test(int n, int m){} //가능
		// 6번 . public static void test(String m){} //불가능
		// 7번 . public static int test(){} // 불가능
		// 메소드 호출하기
		// test(); //1번
		// test(10); //3번 [4번을 쓰게 되면 3,4번 모두 10을 받을 수 있기 때문에 안 됨]
		// test(10, 20); 5번은 매개변수 개수가 다르기 때문에 가능함 [ 2개가 들어가야하기 때문에 안 겹침]
		// 이름이 같아도 안에 변수를 넣으면 이름이 같아도 됨 .
		// test("문자열"); 6번의 경우 String 값형과 겹치지 않는 참조형이기 때문에 가능함.
		// 7번의 경우 1번과 구분이 안 감 int result = test(); 이므로 test(); 부터 실행 -> 겹침 (반환값의 자료형)

		// 요구사항) 선을 그리는 메서드를 선언하시오.
		// 요구사항) -----
		// 요구사항) *****
		// 기본선
		drawLine();
		System.out.println("  성적표");
		drawLine();
		drawLine("+");
		System.out.println("");
		drawLine("-");
		System.out.println("");
		drawLine("*");
		System.out.println("");
		drawLine("^");
		System.out.println("");

		System.out.println(10);
		System.out.println("문자열");

	}// main

	/*
	 * public static void drawLine() { System.out.println("=========="); }
	 * 
	 * public static void drawLine() { System.out.println("----------"); }
	 * 
	 * public static void drawLine() { System.out.println("**********"); }
	 */
	public static void drawLine() {
		System.out.println("==========");
		System.out.println("");
	}

	public static void drawLine(String c) {

		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);

	}
	
	//코드 컨벤션
	//네이밍 규칙 > 변수명, 클래스명, 메서드명 등 ..
	
	
	
	//K&R 스타일 (중괄호 위치)
	public static void m1() {


	}
	//Allman 스타일 (중괄호 위치)
	public static void m2() 
	{



	}
}

