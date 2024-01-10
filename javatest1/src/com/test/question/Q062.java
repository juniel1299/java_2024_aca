package com.test.question;

import java.util.Scanner;

public class Q062 {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	String name = "";
	
	
	
	System.out.print("학생 수: "); // 
	String[] num = new String[scan.nextInt()]; //배열에 몇개 받을지 입력 
	scan.nextLine();
	
	for(int i=0; i<num.length; i++) { // 이름 받아서 배열에 입력 
		
	
	System.out.print("학생명: ");
	name = scan.nextLine();
	num[i] = name;
	 
		
	}
	System.out.println();
	
	String time =""; //Arrays.sort(num); 써서 해도 됨 29 부터 39
	for(int i=0; i<num.length-1; i++) {
		for(int j=0; j<num.length-i-1; j++) {
			
			if(num[j].compareTo(num[j+1]) > 0) { 
				time = num[j];
				num[j] = num[j+1];
				num[j+1] = time;
			}
		}
	}

	System.out.printf("입력한 학생은 총 %d명입니다.\n",num.length);
	
	for(int i=0; i<num.length; i++) {
		System.out.printf("%d %s\n",i+1,num[i]);
	}
	scan.close();
	
}//main
}
