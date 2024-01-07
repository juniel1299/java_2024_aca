package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q034 {
public static void main(String[] args) {

	//진행순서
	//스캐너생성
	//변수선언
	//라벨출력
	//입력
	//조건문
	//계산
	//출력
	
	//스캐너 생성
	Scanner Scan = new Scanner(System.in);
	
	//변수선언
	int year = 0;
	int month = 0;
	int date = 0;
	String result ="";
	
	//라벨 + 입력
	System.out.print("년: ");
	year = Scan.nextInt();
	month = Scan.nextInt();
	date = Scan.nextInt();
	
	
	Calendar cal = Calendar.getInstance();
	
	cal.set(year, month - 1, date);
	
	//Calendar
	
}//main



}
