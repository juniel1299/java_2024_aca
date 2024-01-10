package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q061 {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	int[] number = new int[5];
	int num = 0;
	for(int i=0; i<number.length; i++) {
	
	System.out.print("숫자: ");
	num = scan.nextInt();
	
	number[i] = num;
}
	for(int i=number.length-1; i>=0; i--) {
		
		System.out.printf("number[%d] = %d\n",i,number[i]);
	}
	
	
}//main
}
