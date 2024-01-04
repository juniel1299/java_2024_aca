package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q003 {
public static void main(String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	 System.out.print("넓이: \n");
	String num1 = reader.readLine();
	System.out.print("높이 : \n");
	String num2 = reader.readLine();
	int n1 = Integer.parseInt(num1);
	int n2 = Integer.parseInt(num2);
	
	System.out.printf("사각형의 넓이는 %d cm 입니다.\n",(n1*n2));
	System.out.printf("사각형의 둘레는 %d cm 입니다. \n",((n1+n2)*2));
	
	
}
}
