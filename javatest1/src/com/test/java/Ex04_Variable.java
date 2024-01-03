package com.test.java;

public class Ex04_Variable {
	public static void main(String[] args) {
		// Ex04_Variable.java

		// 연산자

		int a = 10;
		int b = 20;
		// 10 + 20 = 30 만들기 
		// A + B > 이항 연산자 (피연산자를 2개)
		// 연산자 우선순위 > 1+2*3 > 그러므로 괄호를 채워야함
		// 연산자 방향 
		System.out.println( a + "+" + b + "=" + (a + b) );
		
		//주민등록번호 입력 > 출력
		// ex) 950105
		
		int jumin1 = 950105;
		System.out.println("주민등록번호 " + jumin1);
		
		jumin1 = 030711;
		System.out.println("주민등록번호 " + jumin1);
		
		//자바의 기수법
		// 자바는 10진수 , 2진수 , 8진수 16진수 표현이 가능함
		System.out.println(10); //10진수
		
		System.out.println(0xFFF); //16진수 표현시 앞에 0x 붙여야함 > 색상값 표현
		
		System.out.println(010); //8진수 표현시 앞에 0을 붙임 -> 030711 할 때 8진수가 동작하는 이유
		
		System.out.println(0b101); // 2진수 표현시 앞에 0b 붙임 
		
		//실수 리터럴
		double d1 = 1200;
		double d2 = 1.2e+3;
		
		System.out.println(d1);
		System.out.println(d2);
		

		
		
		d1 = 0.012;
		d2 = 12e-3;
		System.out.println(d1);
		System.out.println(d2);
		
	
	}
}
