package com.test.question;

//보류
import java.util.Arrays;
import java.util.Scanner;

public class Q088 {
	public static void main(String[] args) {

		String[] ban = { "바보", "멍청이" }; // 금지어
		String txt = ""; // 입력 받을 변수
		int count = 0;
		int index = -1;

		Scanner scan = new Scanner(System.in);
		System.out.print("입력: ");
		txt = scan.nextLine();

		for (int i = 0; i < ban.length; i++) {
			while ((index = txt.indexOf(ban[i], index)) > -1) {
				count++;
				index = index + ban[i].length();
			}
		}

		for (int i = 0; i < ban.length; i++) {
			txt = txt.replace(ban[i], getMaskedText(ban[i]));

		}

		System.out.printf("금지어를 %d회 마스킹 했습니다.\n", count);

		scan.close();
	}

	
	private static String getMaskedText(String ban) {
		String temp = "";
		
		for(int i =0; i<ban.length(); i++) {
			temp += "*";
		}
	return temp;
	
	}
	
}// main
