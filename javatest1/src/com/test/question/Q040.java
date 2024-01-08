package com.test.question;

import java.util.Scanner;

public class Q040 {
public static void main(String[] args) {
	//스캐너생성
	//변수선언
	//라벨출력
	//입력
	//반복문
	//if문
	//계산 + 출력
	
	//스캐너생성
	Scanner scan = new Scanner(System.in);
	//변수선언
	int startNumber = 0; //시작 숫자
	int endNumber = 0; //종료숫자
	int sum = 0; //합계
	int evenSum = 0;
	int oddSum = 0;
	System.out.print("시작 숫자: ");
	startNumber = scan.nextInt();
	System.out.print("종료 숫자: ");
	endNumber = scan.nextInt();
	for(int i =startNumber; i<=endNumber; i++) {
		if(i%2 ==0) {
			System.out.printf(" %d",-i);
			evenSum-= i;
		}else if(i%2==1) {
			System.out.printf(" + %d",+i);
			oddSum+=i;
		}
		
		
	}		sum = evenSum + oddSum;

	System.out.printf("=%d",sum);
	}
	
}//main 


