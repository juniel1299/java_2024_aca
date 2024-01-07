package com.test.question;

import java.util.Scanner;

public class Q025 {
public static void main(String[] args) {
	//진행순서
	//스캐너생성
	//라벨 + 입력
	//if문
	//출력
	
	
	Scanner Scan = new Scanner(System.in); //스캐너생성
	
	int num1; //변수 1
	int num2; // 변수 2 
	
	//라벨 + 입력
	System.out.print("첫번째 숫자: ");
	num1 = Scan.nextInt();
	System.out.print("두번째 숫자: ");
	num2 = Scan.nextInt();
	
	//if문
	
	if(num1 > num2) {
		System.out.printf("큰수는 %d이고 작은수는 %d입니다. 두 숫자는 %d(가) 차이납니다.",num1,num2,(num1-num2));
	} else if (num1 < num2) {
		System.out.printf("큰수는 %d이고 작은수는 %d입니다. 두 숫자는 %d(가) 차이납니다.",num2,num1,(num2-num1));
	} else if (num1 == num2) {
		System.out.println("두 숫자는 동일합니다.");
	}
	
	
	
}//main
}
