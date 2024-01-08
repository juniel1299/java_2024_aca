package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q023 {
public static void main(String[] args) {
	//진행순서
	//스캐너생성
	//캘린더생성
	//변수선언
	//라벨
	//입력
	//계산
	//출력
	int dadYear;
	int dadMonth;
	int dadDate;
	int daughterYear;
	int daughterMonth;
	int daughterDate;
	long dadTotal;
	long daughterTotal;
	Scanner scan = new Scanner(System.in);
	

	
	System.out.print("아빠 생일(년): ");
	dadYear = scan.nextInt();
	
	System.out.print("아빠 생일(월): ");
	dadMonth = scan.nextInt();
	
	System.out.print("아빠생일(일): ");
	dadDate = scan.nextInt();
	
	System.out.print("딸 생일(년): ");
	daughterYear = scan.nextInt();
	
	System.out.print("딸 생일(월): ");
	daughterMonth = scan.nextInt();
	
	System.out.print("딸 생일(일): ");
	daughterDate = scan.nextInt();
	
	System.out.println();
	
	
	Calendar dadBirthday = Calendar.getInstance();
	dadBirthday.set(dadYear, dadMonth - 1, dadDate);
	
	Calendar daughterBirthday = Calendar.getInstance();
	daughterBirthday.set(daughterYear, daughterMonth - 1, daughterDate);
	
	dadTotal = dadBirthday.getTimeInMillis();
	
	daughterTotal = daughterBirthday.getTimeInMillis();
	
	System.out.printf("아빠는 딸보다 총 %,d일을 더 살았습니다.",(daughterTotal - dadTotal)/1000/60/60/24);
}//main
}
