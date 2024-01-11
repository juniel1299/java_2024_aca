package com.test.question;

public class Q072 {
public static void main(String[] args) {
	
	int[][] num= new int[5][5];
	int n = 1;
	
	for(int i = 0; i<num.length; i++) {
		for(int j=0; j<num[0].length; j++) {
			num[j][i] = n;
			n++;
		}
	}
		printAns(num);
}//main

private static void printAns(int[][] num) {
	
	for(int i=0; i<num.length; i++) {
		for(int j=0; j<num[0].length; j++) {
			System.out.printf("%2d\t",num[i][j]);
		}
	System.out.println();
	}
}


}
