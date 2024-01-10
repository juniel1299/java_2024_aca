package com.test.question;

import java.util.Scanner;

public class Q082 {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	String num = "";
	
	System.out.print("숫자: ");
	num = scan.nextLine();
	
	int sum = 0; 
	for(int i=0; i>=num.length()-1; i++) {
		sum += num.indexOf(i);
	
	}	System.out.println(sum);
	
	
}//main


}
