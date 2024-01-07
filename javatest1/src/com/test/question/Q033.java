package com.test.question;

import java.util.Scanner;

public class Q033 {
public static void main(String[] args) {
	//진행순서
	//스캐너생성
	//변수선언
	//라벨출력
	//입력
	//조건문
	//계산
	//출력
	
	//스캐너 생성 + 변수선언
	Scanner Scan = new Scanner(System.in);
	int year = 0;
	
	//라벨출력 + 입력
	
	System.out.print("년도 입력: ");
	year = Scan.nextInt();
	
	if(year % 4 !=0) {
		System.out.println("평년");
	} else if (year % 100 != 0) {
		System.out.println("윤년");
	} else if (year % 400 != 0) {
		System.out.println("평년");
	} else {
		System.out.println("윤년");
		
	}
	Scan.close();
	
}//main
}
