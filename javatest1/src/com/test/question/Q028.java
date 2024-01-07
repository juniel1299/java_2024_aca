package com.test.question;

import java.util.Scanner;

public class Q028 {
public static void main(String[] args) {
	//진행순서
	//스캐너생성
	//변수선언
	//라벨출력
	//입력
	//출력
	
	Scanner Scan = new Scanner(System.in);
	
	int year;
	int past;
	System.out.print("근무 년수: ");
	year = Scan.nextInt();
	
	if(year >= 10) {
		System.out.printf("%d년차 고급 개발자입니다. \n",year);
		System.out.printf("당신은 %d년전까지 중급개발자였습니다.\n",year- 9);
	} else if (year>=5) {
		System.out.printf("%d년차 중급 개발자입니다.\n",year);
		System.out.printf("당신은 %d년전까지 초급 개발자였습니다.\n", year - 4 );
		System.out.printf("앞으로 %d년 더 근무를 하면 고급 개발자가 됩니다.\n",10-year);
	} else if (year >=1) {
		System.out.printf("%d년차 초급 개발자입니다.\n",year);
		System.out.printf("앞으로 %d년 더 근무를 하면 중급 개발자가 됩니다.\n",5 - year);
	} else {
		System.out.println("입력한 값이 올바르지 않습니다. 1이상의 값을 입력하시오");
		
	}
}//main
}
