package com.test.question;

public class Q071 {
public static void main(String[] args) {
	
	int[][] num = new int[5][5];
	int n = 1;
	
	for(int i=num.length-1; i>=0; i--) {
		for(int j=num.length-1; j>=0; j--) {
			num[i][j] = n;
			n++;
		}
	}
	
	printAns(num);
}//main

public static void printAns(int[][] num) {
	for(int i=0; i<num.length; i++) {
		for(int j=0; j<num[0].length; j++) {
			System.out.printf("%2d\t", num[i][j]);
		}
		System.out.println();
	}
}
}
