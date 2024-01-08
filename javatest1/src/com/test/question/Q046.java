package com.test.question;

import java.util.Scanner;

public class Q046 {
	public static void main(String[] args) {
		// 진행순서
		// 스캐너생성
		// 변수선언
		// 반복문
		// 조건문(유효성검사)
		// 출력

		Scanner Scan = new Scanner(System.in);
		String kor = ""; // 한글 받아오기
		int num = 0; //입력한 숫자 받아서 switch 구문에 넣음
		
		for (int i = 1; i <= 10; i++) {
			System.out.print("숫자: ");
			num = Scan.nextInt();
		
		kor += Korean(num); //입력한 숫자를 저장 

		
		}		System.out.printf("%s",kor); //마지막 출력 

	} // main 
	
	
	public static String Korean(int num) { //한글로 변환 
		switch (num) {
		case 1:
			return  "일";
		case 2:
			return  "이";
		case 3:
			return  "삼";
		case 4:
			return  "사";
		case 5:
			return  "오";
		case 6:
			return  "육";
		case 7:
			return  "칠";
		case 8:
			return  "팔";
		case 9:
			return  "구";

}
		return "";
	}
}