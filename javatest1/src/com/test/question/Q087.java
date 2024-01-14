package com.test.question;

import java.util.Scanner;

public class Q087 {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	String pluseng = ""; //합성어 받을 변수
	
	System.out.print("단어: ");
	pluseng = scan.nextLine();
	int index = 0;
	for(int i=0; i<pluseng.length(); i++) {
		
		char c = pluseng.charAt(i);
		
		if(c>= 'A' && c <= 'Z' && i !=0) {
			
			System.out.print(" ");
		}
		System.out.print(c);
		
	}
	scan.close();
	


}//main


}
