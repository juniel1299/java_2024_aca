package com.test.question;

import java.util.Scanner;

public class Q029 {
public static void main(String[] args) {
	//진행 순서
	//스캐너 생성
	// 변수 선언
	//조건문
	// 계산
	//출력
	
	Scanner Scan = new Scanner(System.in);
	
	int num1; // 첫번째 정수
	int num2; //두번째 정수
	String operator = ""; // 연산자 
	double result; // 결과값 (소수이하 첫째자리출력)
	
	//라벨 + 입력
	System.out.print("첫번째 숫자: ");
	num1 = Scan.nextInt();

	System.out.print("두번째 숫자: ");
	num2 = Scan.nextInt();
	Scan.nextLine();
	
	System.out.print("연산자: ");
	operator = Scan.nextLine();
	//조건문 + 계산 + 출력
	if (operator.equals("*")) {
		System.out.printf("%d * %d = %.1f",num1,num2,(double)(num1 * num2));
	} else if (operator.equals("/")) {
		System.out.printf("%d / %d = %.1f",num1,num2,(double)(num1 / num2));
	} else if (operator.equals("+")) {
		System.out.printf("%d + %d = %.1f",num1,num2,(double)(num1 + num2));
	} else if (operator.equals("-")) {
		System.out.printf("%d - %d = %.1f",num1,num2,(double)(num1 - num2));
	} else if (operator.equals("%")){
		System.out.printf("%d %% %d = %.1f",num1,num2,(double)(num1 % num2));
	} else {
		System.out.println("연산이 불가능합니다.");
	}
	Scan.close();
	
}//main
}
