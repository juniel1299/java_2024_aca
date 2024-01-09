package com.test.question;

import java.util.Scanner;

public class Q048 {
public static void main(String[] args) {
	//스캐너 생성
	//변수선언
	//라벨출력
	//입력
	//반복문으로 검산 
	//조건문으로 분류 
	//합
	
	Scanner Scan = new Scanner(System.in);
	int num = 0;
	int oddSum = 0;
	int evenSum = 0;
	System.out.print("숫자 입력:");
	num = Scan.nextInt();
	
	while(num>0) {
		if(num%10 %2 ==0) {
			evenSum = evenSum + (num %10) ;
		}else if(num %10 %2==1){
			oddSum = oddSum + (num %10);
		}
		
			num=num/10;
		
			}
		System.out.printf("짝수의 합:%d \n 홀수의 합:%d",evenSum,oddSum);
}//main


}
