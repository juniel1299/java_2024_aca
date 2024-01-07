package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q024 {
public static void main(String[] args) {
	//진행순서
	//스캐너생성
	//캘린더생성
	//변수선언
	//라벨
	//입력 + 스캔
	// 계산  ? : 이용 
	// 출력 
	
	int hour = 0;
	int min = 0;
	
	Scanner scan = new Scanner(System.in);
	
	
	System.out.println("음식을 받기 원하는 시각");
	System.out.print("시: ");
	hour = scan.nextInt();
	System.out.print("분: ");
	min = scan.nextInt();
	
	Calendar now = Calendar.getInstance();
	now.set(Calendar.HOUR_OF_DAY, hour);
	now.set(Calendar.MINUTE, min);
	
	
	now.add(Calendar.MINUTE, -10);
	System.out.printf("짜장면: %d시 %d분\n",now.get(Calendar.HOUR_OF_DAY),now.get(Calendar.MINUTE));
	


	now.add(Calendar.MINUTE, -8);
	System.out.printf("치킨: %d시 %d분\n",now.get(Calendar.HOUR_OF_DAY),now.get(Calendar.MINUTE));
	


	now.add(Calendar.MINUTE, -7);
	System.out.printf("피자: %d시 %d분",now.get(Calendar.HOUR_OF_DAY),now.get(Calendar.MINUTE));
}
}
