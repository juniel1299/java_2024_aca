package com.test.question;

import java.util.Scanner;

public class Q049 {
public static void main(String[] args) {
	
int line = 0; //입력 받는 변수

Scanner Scan = new Scanner(System.in);

System.out.print("행: ");
line = Scan.nextInt();


for(int i=0; i<line; i++ ) { //안에 for문이 다 진행되면 line 한칸 아래로 내려감 
	for(int j=0; j<i; j++) { 
		System.out.print(" "); //빈칸 점점 증가 시켜야함 j=0부터 입력값 바로 전 까지 띄어쓰기 진행(5가 들어가면 4까지)
	}
	for(int k=line; k>i; k--) { // ex) 입력 5를 받으면 k에 5 들어감 -> i는 0부터 시작 이므로 (별,띄어쓰기)일때 (5,0)(4,1)(3,2)(2,3)(1,4)  
		System.out.print("*");
	}
	System.out.println(); //완료하고 엔터로 한칸 내리기
}

Scan.close(); // 메인에 스캔은 한번밖에 없으므로 메인에 close 작성 
}//main


}


