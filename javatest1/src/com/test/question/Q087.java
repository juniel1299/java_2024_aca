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
		index = pluseng.indexOf(index >= (char) 95 || index <= (char) 122);
		
		
	}
	System.out.print(index);
	


}//main


}
