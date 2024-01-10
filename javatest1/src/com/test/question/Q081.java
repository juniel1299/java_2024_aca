package com.test.question;

import java.util.Scanner;

public class Q081 {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	String email = "";
	
	System.out.print("이메일 : ");
	email = scan.nextLine();
	
	int index = email.lastIndexOf("@");
	String domain = email.substring(index + 1);
	System.out.println("도메인" +  domain);
	String ID = email.substring(0, index);
	System.out.println("아이디 : "+ ID);
	
	
}//main
}
