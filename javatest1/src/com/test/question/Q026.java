package com.test.question;

import java.util.Scanner;

public class Q026 {
	//진행 순서
	//스캐너생성
	//변수선언
	//라벨 + 입력
	//계산
	//조건문 , 유효성검사 (0~100까지만 입력가능)
	//출력
	public static void main(String[] args) {
		
	
	//스캐너 생성
	Scanner Scan = new Scanner(System.in);
	
	//변수선언
	int score; 
	System.out.print("점수: ");
	
	score = Scan.nextInt();
	
	if(score > 100 || score < 0) {
		System.out.println("점수가 올바르지 않습니다. 0~100사이의 값을 입력하시오");
	} else if(score >=90) {
		System.out.printf("입력한 %d점은 성적은 A입니다.",score);
	} else if(score >=80) {
		System.out.printf("입력한 %d점은 성적은 B입니다.",score);
	} else if (score >=70) {
		System.out.printf("입력한 %d점은 성적은 C입니다.",score);
	} else if (score >=60) {
		System.out.printf("입력한 %d점은 성적은 D입니다.",score);
	} else if (score <60) {
		System.out.printf("입력한 %d점은 성적은 F입니다.",score);
	} 
	
	
}
}