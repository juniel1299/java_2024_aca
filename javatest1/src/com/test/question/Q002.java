package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Q002 {
public static void main(String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("숫자 2개를 입력하시오. 두 수의 사칙연산과 나머지 값 연산을 진행합니다. ");

	int n1 = 0;
	int n2 = 0;

	 System.out.print("첫번째 숫자: ");
	n1 =scan.nextInt();
	System.out.print("두번째 숫자: ");
	n2 = scan.nextInt();

		
	
	double result;
	result = (double)n1 / n2;
	
	System.out.printf("%s + %s = %d\n", n1,n2,n1+n2);
	System.out.printf("%s - %s = %d\n", n1,n2,n1-n2);
	System.out.printf("%s * %s = %d\n", n1,n2,n1*n2);
	System.out.printf("%s / %s = %s\n", n1,n2,result);
	System.out.printf("%s %% %s = %d\n", n1,n2,n1%n2);


}
}
