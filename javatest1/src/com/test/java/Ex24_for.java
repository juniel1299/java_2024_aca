package com.test.java;

public class Ex24_for {
public static void main(String[] args) {
	//Ex24_for
	
	/*
	 중첩 for문 
	 - 단일 for문
	 - 2중 for문
	 - 3중 for문
	 
	  for(){
	   for(){
	  }
	 }
	 */
	m1();
	
}//main

private static void m1() {
	// TODO Auto-generated method stub
	
	//단일 for문 
	for(int i=0; i<10; i++) {
		System.out.println("i: " + i);
	}
	System.out.println();
	
	//2중 for문 
	for(int i=0; i<10; i++) {
		for(int j=0; j<10; j++) {
			//System.out.println("안녕하세요"); // 10*10 = 100 실행 
				System.out.printf("i: %d,j: %d\n",i,j);
		}
		System.out.println("i: " + i);
	}
	System.out.println();
	
	for(int i=0; i<10; i++) {
		System.out.println("i: " + i);
	}
	System.out.println();
	
	
	//3중 for문 
	for(int i=0; i<24; i++) { //대회전 > 시침
		for(int j=0; j<60; j++) { //중회전 > 분침
			for(int k=0; k<60; k++) { //소회전 > 초침
				System.out.printf("i: %d,j: %d, k: %d\n",i,j,k); //10^3
			}
			
				System.out.printf("i: %d,j: %d\n",i,j); //10^2
		}
		 System.out.println("i: " + i); //10^1
	}
	System.out.println();
	
	
	//학교
	/*
	for(학년) { 
		for(반) {
			for(번호) {
				
			}
		}
	}
	*/
	
	//아파트
	/*
	for(단지) {
		for(동) {
			for(층) {
				for(호) {
					
				}
			}
		}
	}
	*/
	
	
	}
}
