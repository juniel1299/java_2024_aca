package com.test.java;

import java.util.Arrays;
import java.util.Scanner;

public class Q065 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int max = 0;
	int min = 0;
	System.out.print("최대 범위: ");
	max = scan.nextInt();
	System.out.print("최소 범위: ");
	min = scan.nextInt();
	int num[] = new int[21];
	for(int i=0; i<20; i++) {
	
		num[i] = (int)((Math.random()*10)+10);
	}
	System.out.println(Arrays.toString(num));
	
	
}//main
}
