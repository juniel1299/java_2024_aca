package com.test.question;

import java.util.Scanner;

public class Q030 {
public static void main(String[] args) {
	//스캐너 생성
	//변수선언
	//라벨출력 + 입력
	//조건문(영어 소문자,대문자만 입력 가능)
	//출력
	
	
	//변수선언 + 스캐너 생성
	char eng = '\0';
	Scanner Scan = new Scanner(System.in);
	
	//라벨출력 + 입력
	System.out.print("문자: ");
	eng = Scan.nextLine().charAt(0);
	
	//조건문 
	if(eng >= 'A' && eng <= 'Z') {
		System.out.printf("'%c'의 소문자는 '%c'입니다.\n",eng,eng+32); //유니코드 숫자 차이가 32 이용 
	} else if (eng>= 'a' && eng<='z') {
		System.out.printf("'%c'의 대문자는 '%c'입니다.\n",eng,eng-32);
	} else {
		System.out.println("영문자만 입력하시오.");
	}
Scan.close();	
	
}//main
}
