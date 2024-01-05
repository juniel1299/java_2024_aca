package com.test.question;

import java.util.Scanner;

public class Q012 {
public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	
	String result = "";
	
	int n;
	
	System.out.printf("숫자를 입력하시오: ");
	n = scan.nextInt();

	scan.close();
	
			result = getNumber(n);	
			System.out.printf("입력하신 숫자 '%d'는(은) '%s' 입니다.\n",n,result);

}//main



private static String getNumber(int n) {
	// TODO Auto-generated method stub
	
String result =  "";
	  int  num2 = n % 2 ;
	 result = (num2) == 0 ? "짝수" : "홀수" ;
	
	 return result;

	
	
}





}
