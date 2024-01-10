package com.test.question;

import java.util.Scanner;

public class Q052 {
public static void main(String[] args) {
	//공백 + 문자 + 문자 + 공백 , 공
	//백 1개씩 점점 줄어들음 + 문자가 하나씩 늘어남(앞문자->뒷문자) + 문자가 하나씩 늘어남(뒷 문자 -> 앞문자) + 공백 1개씩 점점 줄어들음
	
	
	Scanner Scan = new Scanner(System.in);
	
	int line = 0; //입력 받을 변수
	System.out.print("행: ");
	line = Scan.nextInt();
	
	for(int i=0; i<=line; i++) { //ex) 5 입력시 6줄 출력 (0,1,2,3,4,5,)
		for(int j=0; j<line-i; j++) { //공백 생성 , ex) 5 입력시 j=0부터 j<5 , j=1 j<5-1 = 4 , j=2 j<5-2 = 3  
			System.out.print(" ");
		}
		char alphabet = 'a'; //처음에 출력 할 알파벳 선언 
		
		for(int j=0; j<i*2/2; j++) { //알파벳 출력 + 유니코드 숫자 1개 증가 
			System.out.print(alphabet);
			alphabet++; // 유니코드 숫자가 하나씩 증가 
		}
		for(int j=0; j<i*2/2; j++) { 
			alphabet--; //위에서 중첩된 증가식에서 1씩 빼 cba 출력 
			System.out.print(alphabet); //
		}
		System.out.println();
	}
	
	
}//main
}
