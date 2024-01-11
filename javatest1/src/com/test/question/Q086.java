package com.test.question;

import java.util.Scanner;
//1,000,000 -> 0,123,456
public class Q086 {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	String num = "";
	
	System.out.print("숫자: ");
	num = scan.nextLine(); //문자열로 바꿔서 받음
	
	for(int i=0; i>=num.length(); i++) {
		if(num.length() %3 ==0) {
		System.out.print(",");
		
		}
	}
	System.out.printf("%s\n",num);
}//main



}
