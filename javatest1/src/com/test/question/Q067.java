package com.test.question;

import java.util.Scanner;

//보류
public class Q067 {
public static void main(String[] args) {

	int[] num = {5,6,1,3,2,0,0,0,0,0};
	int index =-1;
	int value = 0;
	Scanner scan = new Scanner(System.in);
	
	System.out.print("삽입위치: ");
	index = scan.nextInt();
	
	System.out.print("값: ");
	value = scan.nextInt();
	
	System.out.print("원본: ");
	printAns(num);
	
	
	for(int i=num.length-2; i>=index; i--) {
		num[i+1] = num[i];
	}
	num[index] = value;
	System.out.print("결과: ");
	
	printAns(num);
	
	
}//main 

private static void printAns(int[] num) {
	String temp = "[ ";
	
	for(int i=0; i<num.length; i++) {
		temp += num[i];
		
		if(i < num.length - 1) {
			temp += ", ";
		}
	}
		temp += " ]";
		
		System.out.println(temp);

}


}
