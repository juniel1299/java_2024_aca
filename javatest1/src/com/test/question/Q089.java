package com.test.question;

//보류
import java.util.Scanner;

public class Q089 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String money = ""; // 입력 숫자
		String result = ""; //최종 출력 값

		System.out.print("금액(원): "); //입력 라벨
		money = scan.nextLine(); //스캔

		for (int i = 0; i < money.length(); i++) { // 입력 받은 money 길이만큼 반복
			char c = money.charAt(i); //각  자리를 char로 값을 받아서

			result += getNum(c); //char로 받은 숫자가 특정 숫자와 같을 시 한글로 출력
			result += getUnit(i, money.length(), getNum(c)); // 해당 값을 단위값과 함께 추가하여 저장

		}

		System.out.println("일금 " + result); //최종 결과값

		scan.close();

	}// main

	private static String getNum(char c) { // 입력 받은 money 의 값을 문자로 환산 -> 한글로 바꿈 
		if (c == '1') {
			return "일";
		} else if (c == '2') {
			return "이";
		} else if (c == '3') {
			return "삼";
		} else if (c == '4') {
			return "사";
		} else if (c == '5') {
			return "오";
		} else if (c == '6') {
			return "육";
		} else if (c == '7') {
			return "칠";
		} else if (c == '8') {
			return "팔";
		} else if (c == '9') {
			return "구";
		}

		return "";
	}
	
	private static String getUnit (int i, int length, String n) { //자릿수 계산
		
		String[] unit = {"원","만"};
		String[] unit2 = {"천","","십","백"};
		String temp ="";
		
		if(!n.equals("")) {
			temp += unit2[(length - i) %4]; //(길이 값 - 반복 횟수) %4 한 위치에 천 십 백 작성
		}
		
		if((length - i) % 4 ==1) { //원 작성
			temp += unit[(length - i) / 5 ];
			
		}
		return temp;
	}

}
