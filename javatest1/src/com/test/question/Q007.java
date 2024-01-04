package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q007 {
public static void main(String[] args) throws IOException {
	System.out.print("문자입력 : \n");
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	String lowAlphabet = reader.readLine();
	
	
	String upper =  lowAlphabet;
	
char up = ((Integer.)lowAlphabet + 32);
	 
	System.out.printf("소문자 '%s'의 대문자는 '%s' 입니다.\n", lowAlphabet, upper);

	
}

}