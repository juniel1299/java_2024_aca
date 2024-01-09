package com.test.question;

import java.util.Scanner;

public class Q049 {
public static void main(String[] args) {
	
	int line = 0; 
	String star = "*";
	String back = "";
	Scanner Scan = new Scanner(System.in);
	System.out.print("행: ");
	line = Scan.nextInt();
	
	
	
	for(int i=line; i<=1; i--) {
		for(int j=i; j<5; j++) {
			for(int k=0; k<line; k++) {
		System.out.printf("%s",star);
		System.out.println();
		}
			System.out.printf("%s",back);
		
			

			
		}
	
	}	

}//main


}


