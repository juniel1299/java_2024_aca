package com.test.question;

import java.util.Scanner;

public class Q043 {
public static void main(String[] args) {
	//스캐너생성
	//변수선언
	//라벨
	//입력
	//반복문
	//출력
	
	Scanner Scan = new Scanner(System.in);
	
	int num = 0;
	double think =  (Math.random()*10);
	
	for(int i=1; i<=10; i++) {
		if(i==10) {
			System.out.printf("컴퓨터가 생각한 숫자는 %d입니다.\n",(int)think);
			System.out.println("모든 기회를 실패했습니다.");
			System.out.println();
			System.out.println("프로그램을 종료합니다.");
		}
	if((int)think != num) {
	System.out.println("틀렸습니다.");
	}else if ((int)think == num) {
		System.out.printf("컴퓨터가 생각한 숫자는 %d입니다.",(int)think);
		System.out.printf("정답을 맞추는데 시도한 횟수는 %d회입니다.",i);
		System.out.println();
		System.out.println("프로그램을 종료합니다.");
	}
	
	System.out.print("숫자: ");
	num = Scan.nextInt();
	
}
}//main
}