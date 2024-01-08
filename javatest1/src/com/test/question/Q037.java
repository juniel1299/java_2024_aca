package com.test.question;

import java.util.Scanner;

public class Q037 {
public static void main(String[] args) {
	//진행순서
	//스캐너생성
	//변수선언
	//라벨출력
	//입력
	//반복문
	//계산
	Scanner Scan = new Scanner(System.in); //스캐너생성
	
	int number = 0; // 입력 받는 변수
	int sum = 0; // 합 
	System.out.print("숫자: "); //라벨
	number = Scan.nextInt(); //스캔 
	
	for(int i=1; i<=number; i++) { //반복문 
		
		sum += i; //중첩
				
	}System.out.printf("1 ~ %d = %d",number,sum);	
}//main
}
