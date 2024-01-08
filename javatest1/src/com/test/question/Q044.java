package com.test.question;
//출력 마지막 식만 작성 
import java.util.Scanner;

public class Q044 {
public static void main(String[] args) {
	//스캐너생성
	//변수선언
	//라벨출력
	//입력 
	//반복
	//제어
	//출력
	
	
	Scanner Scan = new Scanner(System.in);
	int odd = 0;
	int even = 0;
	int total = 0;
	String number =""; //마지막 출력때 식 만들기
	for(int num=0; num<100; num++) {
		System.out.print("숫자:");
		num = Scan.nextInt();
		
		if(num % 2 == 0) {

			even= even +num;
		}else if(num%2!=0) {

			odd = odd -num;
		}
		
		
		
		 total = odd + even;
		if(total > 100) {
			break;
		}

				}
	System.out.printf(" %d ",even);
	System.out.printf(" %d",odd);
	System.out.printf("= %d",total);
}//main


}
