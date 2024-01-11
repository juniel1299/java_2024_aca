package com.test.question;

import java.util.Scanner;

public class Q068 {
	public static void main(String[] args) {

		int[] num = { 5, 6, 1, 3, 2, 0, 0, 0, 0, 0 };
		int index = -1;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("삭제 위치: ");
		index = scan.nextInt();
		
		System.out.println("원본: ");
		printAns(num);
		
		for(int i=index; i<num.length-1; i++) {
			num[i] = num[i+1];
		}
		
		
		num[num.length-1] = 0;
		System.out.print("결과: ");
		
		printAns(num);
	}// main

	private static void printAns(int[] num) {
		String temp = "[ ";
		for(int i=0;  i<num.length; i++) {
			temp +=num[i];
			if(i<num.length - 1) {
				temp+= ", ";
			}
		}
	temp += " ]";
	
	System.out.println(temp);
	
	}
	
}
