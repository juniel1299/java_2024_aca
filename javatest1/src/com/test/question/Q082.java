package com.test.question;

import java.util.Scanner;

public class Q082 {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	String num = ""; //숫자 입력 받을 문자열 변수
	String result = ""; // 숫자 문자열을 더하기 식(문자열)으로 바꿔서 출력
	int sum = 0; //모든 숫자를 더한 값 저장
	
	System.out.print("숫자: "); //라벨 출력
	num = scan.nextLine(); //스캔을 통해 저장 
	
	
	for(int i=0; i<num.length(); i++) { //입력 받은 문자열의 길이 -1 만큼 반복 
		sum += Integer.parseInt(num.substring(i, i+1)); // num에 들어온 숫자를 int형으로 바꿔 sum에 중첩하여 더함
		result += num.substring(i, i+1); //num에 들어온 문자열의 문자들을 하나씩 출력
	
		if(i<num.length()-1) { // 길이 - 1 보다 작으면 + 기호를 추가함
			result += " + ";
	}	
}	
	
	
	System.out.printf("%s = %d\n ",result,sum); //결과 출력
	scan.close();
}//main


}
