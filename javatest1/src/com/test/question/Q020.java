package com.test.question;

import java.util.Calendar;

public class Q020 {
public static void main(String[] args) {
	//진행순서
	//현재 시각
	// 100일 추가하여 출력
	// 현재 시각 
	// 1년 추가 
	// 출력
	
	Calendar birth = Calendar.getInstance(); 
	birth.add(Calendar.DATE, 100);
	
	System.out.printf("백일 : %tF \n",birth);
	
	birth = Calendar.getInstance();
	birth.add(Calendar.YEAR, 1);
	
	System.out.printf("첫돌 : %tF \n",birth);
	
	
}//main
}
