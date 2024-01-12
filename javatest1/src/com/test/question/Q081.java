package com.test.question;

import java.util.Scanner;

public class Q081 {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	String email = ""; //이메일 입력받을 변수
	
	System.out.print("이메일 : "); //라벨 출력
	email = scan.nextLine(); //입력 받음
	
	int index = email.lastIndexOf("@"); // 입력 받은 문자에서 @가 어디있는지 뒤에서부터 찾음
	String domain = email.substring(index + 1); //도메인 문자는 index가 읽은 문자열 자리 오른쪽 한칸부터 시작
	System.out.println("도메인" +  domain); //도메인 출력
	String ID = email.substring(0, index); //아이디 문자는 맨 처음부터 index가 인지한 @ 전까지(뒤에는 미포함이므로)
	System.out.println("아이디 : "+ ID); //아이디 출력
	
	
}//main
}
