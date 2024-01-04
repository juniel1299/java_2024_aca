package com.test.question;

import java.util.Scanner;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q007 {
public static void main(String[] args) throws IOException {
	System.out.print("문자입력 : \n");

	Scanner scan = new Scanner(System.in);
	
	char code = 0;
	char result = 0;
	
	code = scan.nextLine().charAt(0);
	
	result = (char)((int)code - 32);
	
	System.out.printf("소문자 '%c'의 대문자는 '%c'입니다.\n ",code, result);
	scan.close();
}

}