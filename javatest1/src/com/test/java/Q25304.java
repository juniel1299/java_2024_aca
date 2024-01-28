package com.test.java;

import java.util.Scanner;

//https://www.acmicpc.net/problem/25304 백준
public class Q25304 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int total = 0; // 총합
	int buy = 0; // 가격
	int num = 0; //산 개수
	int itemNum = 0; //물건 섹션 개수
	
	total = scan.nextInt();
	itemNum = scan.nextInt();
	
	for(int i=0; i==itemNum; i++) {
		
		buy = scan.nextInt();
		num = scan.nextInt();
		
		int subTotal =+ buy * num;
		
		if(total < subTotal) {
			break;
		}
	}
	
	
}//main
}
