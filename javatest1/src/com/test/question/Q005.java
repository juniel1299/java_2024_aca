package com.test.question;
import java.util.Scanner;
public class Q005 {
public static void main(String[] args) {
	
	
	Scanner scan = new Scanner(System.in);
	
	int turn = 0;
	double circum = 0;
	double km = 0;     
	System.out.print("사용자가 페달을 밟은 횟수 :");
	turn = scan.nextInt();
	
	circum = 26 * 3.14 * 0.0254;
	
	km = circum * turn;
	
	System.out.printf("사용자가 총 %,d회 페달을 밟아 자전거가 총 %.3fm를 달렸습니다.\n",turn,km);
	
	scan.close();
}
}
