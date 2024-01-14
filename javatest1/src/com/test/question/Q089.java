package com.test.question;

//보류
import java.util.Scanner;

public class Q089 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String money = ""; // 입력 숫자
		String result = "";

		System.out.print("금액(원): ");
		money = scan.nextLine();

		for (int i = 0; i < money.length(); i++) {
			char c = money.charAt(i);

			result += getNum(c);
			result += getUnit(i, money.length(), getNum(c));

		}

		System.out.println("일금 " + result);

		scan.close();

	}// main

	private static String getNum(char c) {
		if (c == 1) {
			return "일";
		} else if (c == 2) {
			return "이";
		} else if (c == 3) {
			return "삼";
		} else if (c == 4) {
			return "사";
		} else if (c == 5) {
			return "오";
		} else if (c == 6) {
			return "육";
		} else if (c == 7) {
			return "칠";
		} else if (c == 8) {
			return "팔";
		} else if (c == 9) {
			return "구";
		}

		return "";
	}
	
	private static String getUnit (int i, int length, String n) {
		
		String[] unit = {"원","만"};
		String[] unit2 = {"천","","십","백"};
		String temp ="";
		
		if(!n.equals("")) {
			temp += unit2[(length - i) %4];
		}
		
		if((length - i) % 4 ==1) {
			temp += unit[(length - i) / 5 ];
			
		}
		return temp;
	}

}
