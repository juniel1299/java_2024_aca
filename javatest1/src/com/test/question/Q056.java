package com.test.question;

import java.util.Scanner;

public class Q056 {
public static void main(String[] args) {
	
	Scanner Scan = new Scanner(System.in);
	
	int num1 = 0; //받을 숫자 1 
	int num2 = 0; //받을 숫자 2
	String numTxt1 = ""; // 숫자 1에 붙을 글자
	String numTxt2 =""; //숫자 2에 붙을 글자
	String numTxt3 = ""; //공약수
	
	System.out.print("첫번째 숫자: ");
	num1 = Scan.nextInt();
	System.out.print("두번째 숫자: ");
	num2 = Scan.nextInt();
	
	for(int i=1; i<=num1; i++) { //num1의  약수 구하는 for문
		if(num1 % i==0) { // ex) 12 들어가면 1%1 -> 0 이므로 numTxt에 입력 다시 for문 ->반복
			numTxt1 += i + ",";
		}
	}
	
	for(int i=1; i<=num2; i++) { //num2의 약수 구하는 for문
		if(num2 %i ==0) { 
			numTxt2 += i + ",";
		}
	}
	for(int i=1; i<=((num1 < num2) ? num1 : num2); i++){ //num1과 num2 비교 -> num2가 크면 num1 까지 범위 , num1이 크면 num2까지 범위
		if(num1 % i ==0 && num2 % i ==0) { //num1으로도 나머지0 num2으로도 나머지가 0이면 numTxt3에 저장 -> 반복
			numTxt3 += i + ",";
		}
	}
	
	System.out.printf("%d의 약수: %s\n",num1,numTxt1);
	System.out.printf("%d의 약수: %s\n",num2,numTxt2);
	System.out.printf("%d와 %d의 공약수: %s\n",num1,num2,numTxt3);
}//main
}
