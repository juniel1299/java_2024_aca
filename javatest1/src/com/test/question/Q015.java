package com.test.question;

import java.util.Scanner;

public class Q015 {
public static void main(String[] args) {

	//진행순서
	//메서드 선언
	//매개변수 선언
	//매개변수 가공 값  (사과 개수)
	//결과 반환
	
	//스캐너 생성
	//라벨 출력
	//맑은 날 흐린 날
	//매개변수 메서드 호출
	//결과 출력
	Scanner Scan = new Scanner(System.in);
	
	int sunny = 0;
	int foggy = 0;
	int total = 0;
	
	System.out.print("맑은 날: ");
	sunny = Scan.nextInt();
	
	System.out.print("흐린 날: ");
	foggy = Scan.nextInt();
	
	Scan.close();
	
	total = getApple(sunny,foggy);
	System.out.printf("사과가 총 %d개 열렸습니다.\n",total);
	
	
	
}

private static int getApple(int sunny, int foggy) {
	// TODO Auto-generated method stub
	int total = 0; // 총 사과 개수
	int height = 0; //높이
	
	height = (sunny * 5 + foggy * 2);
	
	total = height >= 100 ? (height - 100) / 10 : 0 ;
	
	
	return total;
	
}//main




}
