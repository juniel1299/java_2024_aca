package com.test.question;

import java.util.Scanner;

public class Q082 {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	String num = "";
	String result = "";
	int sum = 0;
	
	System.out.print("숫자: ");
	num = scan.nextLine();
	
	
	for(int i=0; i<num.length(); i++) {
		sum += Integer.parseInt(num.substring(i, i+1));
		result += num.substring(i, i+1);
	
		if(i<num.length()-1) {
			result += " + ";
	}	
}	
	
	
	System.out.printf("%s = %d\n ",result,sum);
	scan.close();
}//main


}
