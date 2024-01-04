package com.test.question;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q007 {
public static void main(String[] args) {
	
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("문자입력 : \n");
	String lowAlphabet = reader.readLine();
	
	char upperAlphabet = lowAlphabet;
	
	System.out.printf("소문자 '%d'의 대문자는 '%d' 입니다. \n",lowAlphabet,upperAlphabet);
	
}

}