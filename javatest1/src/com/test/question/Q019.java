package com.test.question;

import java.util.Calendar;

public class Q019 {
public static void main(String[] args) {
	//메서드 선언
	//변수 선언
	//시각 
	//24H 출력
	//12H 출력

	
	nowTime();
}//main

private static void nowTime() {
	// TODO Auto-generated method stub
	
	Calendar now = Calendar.getInstance();
	
	System.out.printf("현재 시간 %d시 %d분 %d초\n",now.get(Calendar.HOUR_OF_DAY),now.get(Calendar.MINUTE),now.get(Calendar.SECOND));
	System.out.printf("현재 시간 %s %d시 %d분 %d초",now.get(Calendar.AM_PM)== 0 ? "오전":"오후",now.get(Calendar.HOUR),now.get(Calendar.MINUTE),now.get(Calendar.SECOND));
	
}
}
