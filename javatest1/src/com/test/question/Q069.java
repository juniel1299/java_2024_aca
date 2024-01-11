package com.test.question;

import java.util.Scanner;

public class Q069 {
public static void main(String[] args) {
	
	
	int[] num = null;
	int[] copy = null;
	int length = 0;
	int ran = (int)(Math.random()*8+1);
	
	Scanner scan = new Scanner(System.in);
	
	System.out.print("배열 길이: ");
	length  = scan.nextInt();
	
	num = new int[length];
	copy = new int[(int)Math.ceil(length/2.0)];
	
	for(int i=0; i<num.length; i++) {
		num[i] = (int)(Math.random()*8+1);
	}
	System.out.print("원본: ");
	
	printAns(num);
	
	for(int i =0; i<num.length-1; i+=2) {
		copy[i/2] = num[i] + num[i+1];
	}
	
	if(num.length%2 ==1) {
		copy[copy.length-1] = num[num.length-1];
		
	}
	System.out.print("결과: ");
	
	printAns(copy);
	
	scan.close();
}//main

private static void printAns(int[] num) {
	
	String temp = "[ ";
	for(int i=0; i<num.length; i++) {
		temp+= num[i];
		if(i < num.length - 1) {
			temp +=" , ";
		}
	}

temp+= " ]";

System.out.println(temp);
}
}
