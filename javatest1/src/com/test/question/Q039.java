package com.test.question;

import java.util.Scanner;

public class Q039 {
public static void main(String[] args) {
	//진행순서
	//스캐너생성
	//변수선언
	//반복문
	//계산
	//출력
	
	Scanner scan = new Scanner(System.in);
	
	int startNumber = 0; //시작 숫자 변수
	int endNumber =0; //종료 숫자 변수
	int sum =0; //계산 값 
	System.out.print("시작 숫자: ");
	startNumber = scan.nextInt();
	System.out.print("종료 숫자: ");
	endNumber = scan.nextInt();
	
	
	for(int i= startNumber; i<=endNumber; i++ ) {
		sum +=i;
		System.out.printf("%d + ",i);
		
		
	}System.out.printf("\b\b = %d",sum);
	
	
	
	
	
	
	
}//main
}
