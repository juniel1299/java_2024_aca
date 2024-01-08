package com.test.question;

import java.util.Scanner;

public class Q045 {
public static void main(String[] args) {
	//진행순서
	//스캐너생성
	//변수선언
	//반복문
	//조건문
	//계산
	//출력 
	
	
	Scanner Scan = new Scanner(System.in);
	String num3 ="3";
	String num6 = "6";
	String num9 = "9";
	int num = 0;
	System.out.print("최대 숫자: ");
	num = Scan.nextInt();
	for(int i=1; i<1000; i++) {
		if(Integer.parseInt(num3) == i) {
			System.out.print(" 짝 ");
		}else if (Integer.parseInt(num6) == i ) {
			System.out.print(" 짝 ");
		}else if (Integer.parseInt(num9) == i ) {
			System.out.print(" 짝 ");
		}else {
			System.out.printf(" %d ",i);
		}
		
	
	}
}//main
}
