package com.test.question;

//보류
import java.util.Arrays;
import java.util.Scanner;

public class Q088 {
	public static void main(String[] args) {

		String[] ban = { "바보", "멍청이" }; // 금지어
		String txt = ""; // 입력 받을 변수
		int count = 0; //금지어가 몇개 있는지 출력하기 위해 작성
		int index = -1; //배열에 없을 시 -1이 나오므로 

		Scanner scan = new Scanner(System.in); 
		System.out.print("입력: "); //라벨 출력
		txt = scan.nextLine(); // 입력 

		for (int i = 0; i < ban.length; i++) { //금지어 만큼 반복 
			while ((index = txt.indexOf(ban[i], index)) > -1) { //금지어가 발견 될 때마다 count
				count++;
				index = index + ban[i].length(); //
			}
		}

		for (int i = 0; i < ban.length; i++) { //금지어가 나오면 해당 위치에 ** 추가하여 txt 저장
			txt = txt.replace(ban[i], getMaskedText(ban[i]));

		}
		System.out.println(txt); // 마스킹 한 결과값 출력
		System.out.printf("금지어를 %d회 마스킹 했습니다.\n", count);

		scan.close();
	}

	
	private static String getMaskedText(String ban) { // 금지어가 걸릴때마다 * 추가함 
		String temp = "";
		
		for(int i =0; i<ban.length(); i++) {
			temp += "*";
		}
	return temp;
	
	}
	
}// main
