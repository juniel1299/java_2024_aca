package com.test.question;

import java.util.Scanner;

public class Q011 {
public static void main(String[] args) {


	Scanner scan = new Scanner(System.in);
	String result = "";
	int  n1 = 0;
	int n2 = 0;
	
	System.out.print("첫번째 숫자를 입력하시오. : ");
	n1 = scan.nextInt();
	System.out.print("두번째 숫자를 입력하시오. : ");
	n2 = scan.nextInt();
	add(n1, n2);
	subtract(n1, n2);
	multiply(n1, n2);
	divide(n1,n2);
	mod(n1,n2);
}//main

private static void mod(int n1, int n2) {
	// TODO Auto-generated method stub
	System.out.printf("%d %% %d = %d\n", n1,n2,n1%n2);
}

private static void divide(int n1, int n2) {
	// TODO Auto-generated method stub
	System.out.printf("%d / %d = %d\n", n1,n2,n1/n2);
}

private static void multiply(int n1, int n2) {
	// TODO Auto-generated method stub

	System.out.printf("%d * %d = %d\n", n1,n2,n1*n2);
}

private static void subtract(int n1, int n2) {
	// TODO Auto-generated method stub
	System.out.printf("%d - %d = %d\n", n1,n2,n1-n2);
}

private static void add(int n1, int n2 ) {
	// TODO Auto-generated method stub
	System.out.printf("%d + %d = %d\n", n1,n2,n1+n2);
	
	
}




}
