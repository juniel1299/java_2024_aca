package com.test.question;

import java.util.Scanner;

public class Q080 {
	public static void main(String[] args) {
		//문장을 받아 역순으로 출력하세요 
		
		String txt = ""; // 문장 입력받을 변수
		Scanner scan = new Scanner(System.in);

		System.out.print("문장 입력: "); //라벨 출력
		txt = scan.nextLine(); //문장 입력

		System.out.print("역순 결과: \""); 
		for (int i = txt.length() - 1; i >= 0; i--) { //i는 문장 길이 -1 (오른쪽 끝) 부터 0번째까지 내림차순, 거꾸로 출력해야하므로 
			System.out.print(txt.charAt(i)); //글자 단위로 하나씩 출력
		}
		System.out.print("\""); //출력 결과 양 끝에 " 가 있으므로 추가 

	}// main
}
