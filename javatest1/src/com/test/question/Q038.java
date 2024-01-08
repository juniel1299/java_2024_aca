package com.test.question;

import java.util.Scanner;

public class Q038 {
public static void main(String[] args) {
	
	//진행순서
	//스캐너생성
	//변수선언
	//라벨출력
	//입력
	//반복문
	//출력
	
	Scanner scan = new Scanner(System.in);
	
	int input = 0; //입력 횟수
	int num = 0; //입력 숫자 
	int odd = 0; //홀수 개수
	int even = 0; //짝수 개수 
	int oddSum = 0; //홀수합
	int evenSum = 0;//짝수합
	
	//라벨 + 입력
	System.out.print("입력횟수: ");
	input = scan.nextInt();
	
	//반복문 + if 
	for(int i=0; i<input; i++) {
		System.out.print("숫자: ");
		num = scan.nextInt();
		
		if(num % 2 ==0) {
			 even++;
			 evenSum += num;
			
		}else {
			odd++;
			oddSum +=num;
			
		}
		
	}
	System.out.println();
	System.out.printf("짝수 %d개의 합: %d ",even,evenSum);
	System.out.printf("홀수 %d개의 합: %d ",odd,oddSum);
	
	
	scan.close();
}//main 
}
