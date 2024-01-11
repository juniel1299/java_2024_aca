package com.test.question;

import java.util.Scanner;

public class Q089 {
public static void main(String[] args) {
	
	
	Scanner scan = new Scanner(System.in);
	
	String money = ""; //입력 숫자 
	
	System.out.print("금액(원): ");
	money = scan.nextLine();
	
	 String num= "";
	System.out.print("일금: ");
	
	for(int i=0; i<money.length(); i++) {
		money.indexOf(i);
		
		if(money.indexOf(i)==0) {
			System.out.print("영");
		}else if(money.indexOf(i) == 1) {
			System.out.print("일");
		}else if(money.indexOf(i) == 2) {
			System.out.print("이");
		}else if(money.indexOf(i) == 3) {
			System.out.print("삼");
		}else if(money.indexOf(i) == 4) {
			System.out.print("사");
		}else if(money.indexOf(i) == 5) {
			System.out.print("오");
		}else if(money.indexOf(i) == 6) {
			System.out.print("육");
		}else if(money.indexOf(i) == 7) {
			System.out.print("칠");
		}else if(money.indexOf(i) == 8) {
			System.out.print("팔");
		}else if(money.indexOf(i) == 9) {
			System.out.print("구");
		}
	}

	

}//main
}
