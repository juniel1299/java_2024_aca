package com.test.question;

import java.util.Scanner;

public class Q014 {
public static void main(String[] args) {

	//진행순서
	//메서드 선언
	//변수선언
	//변수 가공 값 -> 총 소요시간
	//결과 반환
	
	//스캐너 생성
	//라벨 출력
	//입력 
	// 메서드 호출
	//출력
	Scanner Scan = new Scanner(System.in);
	int station = 0; //역의 수
	int change = 0; // 환승
	int time = 0; // 시간대
	int total = 0;
	
	
	System.out.print("역의 개수: ");
	station =Scan.nextInt();
	
	System.out.print("환승역의 횟수: ");
	change =Scan.nextInt();
	
	System.out.print("시간대(1.평상시, 2.출근시, 3.퇴근시");
	time =Scan.nextInt();
	
	Scan.close();
	
	
	
	total = getTime(station,change,time);
	
	System.out.printf("총 소요시간은 %d입니다.\n",total);
	
}//main

private static int getTime( int station, int change, int time) {
	// TODO Auto-generated method stub
	
	int stationTime = (station * 2); // 총 환승시간 
	
	int total = 0;
	
	
	total = stationTime + change * ((time == 1) ? 3 : (time == 2) ? 4 : 5);
	
	return total;
	
	
}




}
