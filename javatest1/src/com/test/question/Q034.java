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
	System.out.print("월: ");
	month = Scan.nextInt();
	System.out.println("일: ");
	date = Scan.nextInt();
	

	Calendar cal = Calendar.getInstance();
	
	cal.set(year, month - 1, date);
	
	if(cal.get(Calendar.DAY_OF_WEEK) != 1 && cal.get(Calendar.DAY_OF_WEEK) != 0) {
		System.out.println("입력하신 날짜는 '평일'입니다.");
		System.out.println("해당 주의 토요일로 이동합니다.");
		cal.add(Calendar.DATE, 7-cal.get(Calendar.DAY_OF_WEEK));
		
		System.out.printf("이동한 날짜는 %tF입니다.",cal);
	}else {
		System.out.printf("입력하신 날짜는 '%s'입니다.\n",result);
		System.out.println("결과가 없습니다.");
	}
	
	
	//Calendar
	
}//main



}
