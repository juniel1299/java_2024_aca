package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q002 {
public static void main(String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	
	System.out.println("숫자 2개를 입력하시오. 두 수의 사칙연산과 나머지 값 연산을 진행합니다. ");


	 System.out.print("첫번째 숫자: ");
	String num1 = reader.readLine();
	System.out.print("두번째 숫자: ");
	String num2 = reader.readLine();
	int n1 = Integer.parseInt(num1);
	int n2 = Integer.parseInt(num2);
	System.out.printf("%s + %s = %d\n", num1,num2,n1+n2);
	System.out.printf("%s - %s = %d\n", num1,num2,n1-n2);
	System.out.printf("%s * %s = %d\n", num1,num2,n1*n2);
	System.out.printf("%s / %s = %d\n", num1,num2,n1/n2);
	System.out.printf("%s %% %s = %d\n", num1,num2,n1%n2);


}
}
