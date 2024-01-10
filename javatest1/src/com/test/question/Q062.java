package com.test.question;

import java.util.Scanner;

public class Q062 {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	int num = 0; //학생 수 입력
	String name = ""; //이름
	
	System.out.print("학생 수: ");
	num = scan.nextInt();
	
	for(int i=0; i<=num; i++) {
	System.out.print("학생명: ");
	name = scan.nextLine();
	}
	
	String[] names = new String[num];
	
	
}//main
}
