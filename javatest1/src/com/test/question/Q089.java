package com.test.question;
//보류
import java.util.Scanner;

public class Q089 {
public static void main(String[] args) {
	
	
	Scanner scan = new Scanner(System.in);
	
	String money = ""; //입력 숫자 
	String result = "";
	String kor = "";
	
	System.out.print("금액(원): ");
	money = scan.nextLine();
	
	 
	
	for(int i=0; i<money.length(); i++) {
		char c= money.charAt(i);
		
		
		if(money.indexOf(i)== (char)('0')) {
			System.out.print(kor ="영");
		}else if(money.indexOf(i)== (char)('1')) {
			System.out.print(kor ="일");
		}else if(money.indexOf(i)== (char)('2')) {
			System.out.print(kor ="이");
		}else if(money.indexOf(i)== (char)('3')) {
			System.out.print(kor ="삼");
		}else if(money.indexOf(i)== (char)('4')) {
			System.out.print(kor = "사");
		}else if(money.indexOf(i)== (char)('5')) {
			System.out.print(kor = "오");
		}else if(money.indexOf(i)== (char)('6')) {
			System.out.print(kor ="육");
		}else if(money.indexOf(i)== (char)('7')) {
			System.out.print(kor = "칠");
		}else if(money.indexOf(i)== (char)('8')) {
			System.out.print(kor = "팔");
		}else if(money.indexOf(i)== (char)('9')) {
			System.out.print(kor = "구");
		}
		result +=kor;
		
	}
	System.out.print(result);

	

}//main
}
