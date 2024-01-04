package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q001 {
public static void main(String[] args) throws IOException {
	
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println("태어난 년도 : ");
	int year; 
	int age;
	
	int year1 = reader.read();
	
	age = (2024 - 1999);
	System.out.printf(" 나이는 %d 입니다.",age );
		
	
	
	
	
}
}
