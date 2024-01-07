package com.test.question;

import java.util.Scanner;

public class Q027 {
public static void main(String[] args) {
	//진행 순서
	//스캐너생성
	//변수선언
	//라벨 + 입력
	//조건문
	//출력
	
	
	//스캐너생성
	Scanner Scan = new Scanner(System.in);
	
	//변수선언
	
	String eng = ""; //스펠링 1개
	
	String fullEng = ""; //풀네임 
	
	//라벨 + 입력
	System.out.print("문자: ");
	eng = Scan.nextLine();
	
	//조건문
	if(eng.equals("f") || eng.equals("F")) {
		fullEng = "Father";
	} else if (eng.equals("m") || eng.equals("M")) {
		fullEng = "Mother";
	} else if (eng.equals("s") || eng.equals("S")){
		fullEng = "Sister";
	} else if (eng.equals("b") || eng.equals("B")){
		fullEng = "Brother";
	} else {
		System.out.println("입력한 문자가 올바르지 않습니다.");
	}
	
	System.out.println(fullEng);
	
	
	
	Scan.close();
	
}//main
}
