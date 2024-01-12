package com.test.question;

import java.util.Scanner;

public class Q090 {
public static void main(String[] args) {

	String txt = ""; //문자열 입력 
	int sum = 0 ; // 아스키 코드 를 숫자로 받기 위한 int 
	char c = '\0'; //문자열에서 글자 추출하기 위한 변수
	
	Scanner scan = new Scanner(System.in);
	
	System.out.print("입력: "); //입력 라벨
	txt = scan.nextLine(); // 입력 받은 문자열을 txt에 저장
	
	for(int i=0; i<txt.length(); i++) { //txt의 길이만큼 반복하는 for문 .
		c = txt.charAt(i); // i=0 -> 문자열 0번부터 length-1까지 검사하여 c에 저장
		
		if(c>= '0' && c <='9') { //c에 0~9가 들어 올 시 sum에 해당 숫자들의 합을 더함 . 
			sum += c-48; // 숫자 1이 유니코드에서 49이므로 c가 0을 인식하면 48-48 = 0 , 9를 인식하면 57-48 = 9 
		}
	}
	
	System.out.printf("문장에 존재하는 모든 숫자들의 합은 %d입니다.\n",sum); //합을 출력
	
	
	
}//main



}
