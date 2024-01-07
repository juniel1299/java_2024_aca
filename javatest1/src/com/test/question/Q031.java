package com.test.question;

import java.util.Scanner;

public class Q031 {
public static void main(String[] args) {
	//진행순서
	//스캐너생성
	//변수선언
	//라벨출력 + 입력 (5개)
	//조건문 
	
	
	//스캐너생성
	
	Scanner Scan = new Scanner(System.in);
	
	//변수선언
	int n1;
	int n2;
	int n3;
	int n4;
	int n5;
	int odd = 0; //홀
	int even = 0; // 짝
	//라벨 + 입력
	System.out.print("숫자 입력:");
	n1 = Scan.nextInt();
	System.out.print("숫자 입력:");
	n2 = Scan.nextInt();
	System.out.print("숫자 입력:");
	n3 = Scan.nextInt();
	System.out.print("숫자 입력:");
	n4 = Scan.nextInt();
	System.out.print("숫자 입력:");
	n5 = Scan.nextInt();
	
	
	//조건문
	if(n1 % 2 == 0) {
		even +=1; 
	} else {
		odd +=1;
	}
	
	if(n2 % 2 == 0) {
		even +=1; 
	} else {
		odd +=1;
	}
	if(n3 % 2 == 0) {
		even +=1; 
	} else {
		odd +=1;
	}
	if(n4 % 2 == 0) {
		even +=1; 
	} else {
		odd +=1;
	}
	if(n5 % 2 == 0) {
		even +=1; 
	} else {
		odd +=1;
	}
	if(even > odd) {
	System.out.printf("짝수는 %d개 홀수는 %d개 입력했습니다\n",even,odd);
	System.out.printf("짝수가 홀수보다 %d개 더 많습니다.", even - odd);
	} else if (odd > even) {
		System.out.printf("짝수는 %d개 홀수는 %d개 입력했습니다\n",even,odd);
		System.out.printf("홀수가 짝수보다 %d개 더 많습니다.", odd - even);
	}
	Scan.close();
	
}//main
}
