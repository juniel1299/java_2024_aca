package com.test.question;

public class Q073 {
public static void main(String[] args) {
	
	
	int[][] num = new int[5][5]; //2차원 배열 생성 (길이가 5인) 
	int n = 1; // 배열 숫자가 1부터 시작함
	
	for(int i=0; i<num.length; i++) { //배열 0번부터 배열 끝까지 출력해야하므로
		for(int j=0; j<=num.length-i-1; j++) { // j=0 , i-1 을 통해 0을 계속 출력함 
			num[i][j] = n;  
			n++;
		}
	}

	
	printAns(num);
}//main

public static void printAns(int[][] num) {
	
	for(int i=0; i<num.length; i++) { //
		for(int j =0; j<num[0].length; j++) { //2번째 배열의 길이가 점점 길어져야함 
			System.out.printf("%2d\t", num[i][j]);
		}
		System.out.println();
	}
}

}
