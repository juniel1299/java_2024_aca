package com.test.question;

public class Q053 {
	public static void main(String[] args) {


		for(int i=1; i<10; i++) { // 9번 반복해야함 
			for(int j=2; j<=5; j++) { // 2단부터 5단까지 출력 -> 5까지 돌면 밖에 for문 만나 줄바꿈 다시 2단부터 5단
				System.out.printf("%2d x %2d = %2d\t ",j,i, j*i);
			}
		System.out.println();
		}
		System.out.println();
		
		
		for(int i=1; i<10; i++) { //9를 만나면 9단 출력 후 줄바꿈
			for(int j=6; j<10; j++) { //6단부터 9단, 9까지 돌면 밖에 for문 줄바꿈 실행 후 다시 6단부터 9단
				
				System.out.printf("%2d x %2d = %2d\t ",j,i,j*i);
			}
	
			System.out.println();
		}
		
		
		
	}
}
