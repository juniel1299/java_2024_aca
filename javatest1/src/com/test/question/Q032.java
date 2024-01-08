package com.test.question;
import java.util.Calendar;
//보류
import java.util.Scanner;

public class Q032 {
public static void main(String[] args) {
	//진행순서
	//스캐너생성
	//변수선언
	//라벨출력
	//입력
	//계산
	//출력
	
	
	//스캐너생성
	Scanner Scan = new Scanner(System.in);
	//변수선언
	int inHour = 0;
	int inMin = 0;
	int outHour = 0;
	int outMin = 0;
	long gap = 0;
	long cost = 0;
	//라벨출력 + 입력
	System.out.println("[들어온 시간]");
	System.out.print("시: ");
	inHour = Scan.nextInt();
	System.out.print("분: ");
	inMin = Scan.nextInt();
	
	System.out.println("[나간 시간]");
	System.out.print("시: ");
	outHour = Scan.nextInt();
	System.out.print("분: ");
	outMin = Scan.nextInt(); 
	
	Calendar in = Calendar.getInstance();
	
	in.set(Calendar.HOUR_OF_DAY, inHour);
	in.set(Calendar.MINUTE, inMin);
	
	Calendar out = Calendar.getInstance();
	
	out.set(Calendar.HOUR_OF_DAY, outHour);
	out.set(Calendar.MINUTE, outMin);
	
	gap = out.getTimeInMillis() - in.getTimeInMillis();
	cost =  (((gap / 1000 / 60  ) - 30) /10 ) * 2000;
	
	System.out.printf("주차 요금은 총 %,d원입니다.",cost);
	
	
}//main
}
