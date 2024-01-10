package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q061 {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	int n1 = 0; //숫자 입력
	int n2 = 0;
	int n3 = 0;
	int n4 = 0;
	int n5 = 0;
	System.out.print("숫자: ");
	n1 = scan.nextInt();
	System.out.print("숫자: ");
	n2 = scan.nextInt();
	System.out.print("숫자: ");
	n3 = scan.nextInt();
	System.out.print("숫자: ");
	n4 = scan.nextInt();
	System.out.print("숫자: ");
	n5 = scan.nextInt();
	
	int[] nums = new int[5];
	
	nums[0] = n1;
	nums[1] = n2;
	nums[2] = n3;
	nums[3] = n4;
	nums[4] = n5;
	
	
	System.out.println(Arrays.toString(nums));
	
	
}//main
}
