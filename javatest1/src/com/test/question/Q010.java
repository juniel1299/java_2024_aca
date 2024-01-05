package com.test.question;

public class Q010 {
public static void main(String[] args) {
	
	System.out.print("숫자를 입력하시오. 4자리 이상일 경우 그대로 출력, 미만은 4자리를 채워 출력");
	
	 
	digit(1);
	digit(12);
	digit(321);
	digit(5678);
	digit(98765);
	
}//main

private static void digit(int num) {
	// TODO Auto-generated method stub
	
	String result = "";
	
	result = (num < 10 ) ? "000" + num : (num < 100) ? "00" + num : (num<1000) ? "0" + num : ""  + num;
	
	System.out.printf( " %d -> %s\n", num , result);
	
	
	
	
	
}



}
