package com.test.question;
//보류
import java.util.Scanner;
//1,000,000 -> 0,123,456
public class Q086 {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	String num = "";
	String result = "";
	
	
	System.out.print("숫자: ");
	num = scan.nextLine(); //문자열로 바꿔서 받음
	
	while(num.length() >= 3) {
		result = "," + num.substring(num.length()-3, num.length()) + result;
		num = num.substring(0, num.length()-3);
	}
	
	System.out.println("결과 : " + num + result);
	
	scan.close();
}//main



}
