package com.test.question;

import java.util.Scanner;

public class Q087 {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	String pluseng = ""; //합성어 받을 변수
	
	System.out.print("단어: ");
	pluseng = scan.nextLine();
	int index = 0;
	for(int i=0; i<pluseng.length(); i++) { //배열 안의 글자들을 char로 전체 검출함
		
		char c = pluseng.charAt(i);
		
		if(c>= 'A' && c <= 'Z' && i !=0) { //대문자가 검출될 때 동작
			
			System.out.print(" "); //띄어쓰기 작성
		}
		System.out.print(c); //결과 출력
		
	}
	scan.close();
	


}//main


}
