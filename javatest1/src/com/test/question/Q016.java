package com.test.question;

public class Q016 {
public static void main(String[] args) {

	//진행순서
	//메서드 선언
	//변수 선언
	//누적 변수 선언
	// 변수 누적 + 계산
	// 누적 값 출력
	//메서드 선언 반복
	//호출 
	
	sum(10);
	sum(10, 20);
	sum(10, 20, 30);
	sum(10, 20, 30, 40);
	sum(10, 20, 30, 40, 50);
	
}//main

private static void sum(int n1, int n2, int n3, int n4, int n5) {
	// TODO Auto-generated method stub
	int sum = 0;
	sum = n1 + n2 + n3 + n4 + n5;
	System.out.printf("%d + %d + %d + %d + %d = %d\n", n1, n2, n3, n4, n5, sum);
}

private static void sum(int n1, int n2, int n3, int n4) {
	// TODO Auto-generated method stub
	int sum = 0;
	sum = n1 + n2+ n3 + n4;
	System.out.printf("%d + %d +%d +%d = %d\n", n1, n2,n3,n4, sum);
}

private static void sum(int n1, int n2, int n3) {
	// TODO Auto-generated method stub
	int sum = 0;
	sum = n1 + n2 + n3;
	System.out.printf("%d + %d + %d = %d\n", n1, n2, n3, sum);
}

private static void sum(int n1, int n2) {
	// TODO Auto-generated method stub
	int sum = 0;
	sum = n1 + n2;
	System.out.printf("%d + %d = %d\n", n1, n2, sum);
}

private static void sum(int n1) {
	// TODO Auto-generated method stub
	int sum = 0;
	sum = n1;
	System.out.printf("%d = %d\n", n1, sum);
}



}
