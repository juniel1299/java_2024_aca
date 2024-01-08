package com.test.question;

import java.util.Scanner;

public class Q036 {
public static void main(String[] args) {
	//진행순서
	//스캐너생성
	//변수선언
	//라벨출력
	//입력
	//반복문
	//계산 
	Scanner Scan = new Scanner(System.in);
	int start = 0;
	int end = 0;
	int time = 0;
	int sum = 0;
	System.out.print("시작 숫자: ");
	start = Scan.nextInt();
	System.out.print("종료 숫자: ");
	end = Scan.nextInt();
	System.out.println("증감치: ");
	time = Scan.nextInt();
	
	for(int i=start; i<=end; i+=time) {

	
		System.out.println(i);

	}
	Scan.close();
}//main




}
