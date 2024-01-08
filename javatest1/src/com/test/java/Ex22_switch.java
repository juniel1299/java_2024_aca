package com.test.java;

public class Ex22_switch {
public static void main(String[] args) {
	
	//Ex22_switch.java
	
	
	//switch 문 , switch case 문 
	// - 조건) 값(데이터 > 정수, 문자x
	
	
	/*
	switch(조건) {
	case 값 : 
		구현부;
		break;
	case 값 : 
		구현부;
		break;
	case 값 : 
		구현부;
		break;
	case 값 : 
		구현부;
		break;
	case 값 : 
		구현부;
		break;
		[default:
		구현부;
		break;] //default는 생략 가능
		
		
		
	}
	*/
	
	m1();
	
	
	
	
	//case는 최소 1개 이상
	
}//main

private static void m1() {
	// TODO Auto-generated method stub
	//요구사항 ) 숫자를 1개 입력받아 한글로 출력하라
	// 1 > "하나"
	// 2 > "둘"
	
	int num = 1;
	
	if(num == 1) {
		System.out.println("하나");
	}else if (num == 2) {
		System.out.println("둘");
	}else if (num == 3) {
		System.out.println("셋");
	}
	
	switch(num) {
	case 1:
		System.out.println("하나");
		break;
	case 2:
		System.out.println("둘");
		break;
	case 3:
		System.out.println("셋");
		break;
	
	}
	
	
}//m1


}
