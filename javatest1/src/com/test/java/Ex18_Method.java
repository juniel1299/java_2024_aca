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
		// 메소드 호출하기
		// test(); //1번
		// test(10); //3번
		// 이름이 같아도 안에 변수를 넣으면 이름이 같아도 됨 .

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

}