package com.test.question;

import java.util.Calendar;

//보류
public class Q042 {
public static void main(String[] args) {
//진행순서
	//변수선언
	//반복문
	//출력

	int sum = 0;  // 합계
	int year =0; //년도
	int month = 0; //월
	int date = 0; //일
	String day = ""; //요일 
	
	Calendar now = Calendar.getInstance(); // 현재 시각 선언
	
	//현재 시각 입력
	year = now.get(Calendar.YEAR);
	month = now.get(Calendar.MONTH);
	date = now.get(Calendar.DATE);
	
	for(int i=1; i<year; i++) { // 
		if(plusYear(i)) { //윤년 계산
			sum+=366;
		}else {
			sum+=365;
		}
	}
	
	for(int i=1; i<month; i++) { //30일 31일 계산 (2월은 29 28)
		sum+=plusDate(i,year); //0에 계속 더하여 정리
		
	}
	sum +=date; //0에 일 중첩
	day = plusDay(sum); // 요일 출력
	System.out.printf("%d년 %d월 %d일은 %,d일째 되는 날이고 %s입니다.\n",year,month + 1,date,sum,day);
}//main

private static boolean plusYear (int year) { //윤년계산
	if((year % 4 ==0 && year % 100 !=0 || year %400 ==0)) {
		return true;
	}else {
		return false;
	}
}

private static int plusDate(int month, int year) { //30일 31일 29일 28일 계산
	
	switch(month) {
	case 1:
	case 3:
	case 5:
	case 7:
	case 8:
	case 10:
	case 12:
		return 31;
	case 4:
	case 6:
	case 9:
	case 11:
		return 30;
	case 2:
		return plusYear(year) ? 29: 28;
	
	}
	return 0;
}
private static String plusDay(int sum) { //비교 연산자 불가능 , 요일 알아내기
	if(sum % 7 == 0) {
		return "일요일";
	} else if(sum % 7 ==1) {
		return "월요일";
	} else if(sum % 7 ==2) {
		return "화요일";
	} else if(sum % 7 ==3) {
		return "수요일";
	} else if(sum % 7 ==4) {
		return "목요일";
	} else if(sum % 7 ==5) {
		return "금요일";
	} else if(sum % 7 ==6) {
		return "토요일";
	}
	return null;
}
}
