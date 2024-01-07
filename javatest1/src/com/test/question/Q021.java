package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q021 {
public static void main(String[] args) {
	//진행순서
	//현재 시각 구한다
	// 스캐너 생성
	// 년도 입력
	// 나이 계산
	// 출력
	
	Scanner Scan =  new Scanner(System.in); //스캐너생성
	Calendar now = Calendar.getInstance(); // 현재 시각 
	int year; //변수선언
	int age;
	System.out.print("태어난 년도:"); // 라벨 
	year = Scan.nextInt(); //라벨입력
	
	
	age = now.get(Calendar.YEAR) - year + 1; //한국 나이 이므로 +1 필요함 (나이 계산)
	
	System.out.printf("나이: %d세",age); // 출력
			
	
	
}//main
}
