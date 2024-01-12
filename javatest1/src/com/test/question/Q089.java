package com.test.question;
//보류
import java.util.Scanner;

public class Q089 {
public static void main(String[] args) {
	
	
	Scanner scan = new Scanner(System.in);
	
	String money = ""; //입력 숫자 
	String result = "";
	
	
	System.out.print("금액(원): ");
	money = scan.nextLine();
	
	 
	System.out.print("일금: ");
	
	for(int i=0; i<money.length(); i++) {
		char c= money.charAt(i);
		
		
		if(money.indexOf(c)==0) {
			System.out.print("영");
		}else if(money.indexOf(c) == '1') {
			System.out.print("일");
		}else if(money.indexOf(c) == '2') {
			System.out.print("이");
		}else if(money.indexOf(c) == '3') {
			System.out.print("삼");
		}else if(money.indexOf(c) == '4') {
			System.out.print("사");
		}else if(money.indexOf(c) == '5') {
			System.out.print("오");
		}else if(money.indexOf(c) == '6') {
			System.out.print("육");
		}else if(money.indexOf(c) == '7') {
			System.out.print("칠");
		}else if(money.indexOf(c) == '8') {
			System.out.print("팔");
		}else if(money.indexOf(c) == '9') {
			System.out.print("구");
		}
		result +=c;
		
	}

	

}//main
}
