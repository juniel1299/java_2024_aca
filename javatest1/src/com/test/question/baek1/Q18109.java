package com.test.question.baek1;

import java.util.Scanner;

public class Q18109 {
public static void main(String[] args) {
	//서강대학교 2019 프로그래밍 대회 - 백준 18109번 도깨비불 
	//주소 : https://www.acmicpc.net/problem/18109
	
	
	String lang = ""; //문자 입력
	String end = "";
	
	Scanner scan = new Scanner(System.in);
	
	System.out.print("입력: ");
	lang = scan.nextLine(); //입력 받음
	
	int count = 0; //도깨비불 발생 횟수
	
	//자음 
	String[] first ={"R","T","q","w","e","r","t","a","s","d","f","g","z","x","c","v"};
	//모음
	String[] last = {"y","u","i","o","p","h","j","k","l","m","n","b","P","O"};
	//자음(겹받침)
	String[] twin = {"fr","fx","fg","ft","qt","fv","rt","sw","fq"};
	
	
	
	
	for (int i=0; i<lang.length(); i++) {
		if(lang.indent(i).equals(first)) {
			
		}
		
	
	
	}
	
	
	
	
}//main
}
