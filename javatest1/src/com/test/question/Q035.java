package com.test.question;

import java.util.Scanner;

public class Q035 {
public static void main(String[] args) {
	
	//진행순서
	//스캐너생성
	//라벨출력
	//입력 
	//반복문
	//if문
	//출력
	
	
	
	//스캐너생성
	Scanner scan = new Scanner(System.in);
	//변수선언
	String name;
	int time = 0;
	//라벨 + 입력
	System.out.print("이름:");
	name = scan.nextLine();
	System.out.print("횟수");
	time = scan.nextInt();
	
	for(int i=1; i<=time; i++) {
		System.out.printf("%s님 안녕하세요\n",name);
	}
	
	
	
	
}//main



}
