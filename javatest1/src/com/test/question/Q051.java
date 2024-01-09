package com.test.question;

import java.util.Scanner;

public class Q051 {
public static void main(String[] args) {
	//공백 + 별 + 공백 +줄바꿈 , 공백 하나씩 점점 줄음 + 별 2개씩 늘어남 + 공백 하나씩 점점 줄음 
	
	Scanner Scan = new Scanner(System.in);
	
	int line =0; //입력 받은 변수 받는 곳 
	
	
	System.out.print("행: ");
	line = Scan.nextInt();
	
	
	for(int i=1; i<=line; i++) {
		//공백
		for(int j=line-i; j>0; j--) {
			System.out.print(" ");
		}
		//별찍기
		for(int k=1; k<=i*2-1; k++) {
			System.out.print("*");
		}
	//줄바꿈
	System.out.println();
	}
	
	
}//main
}
