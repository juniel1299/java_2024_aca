package com.test.question;
//보류
public class Q055 {
public static void main(String[] args) {
	//1~100까지 반복 
	// 
	
	for(int i=1; i<100; i++) {
		for(int j=i; j<100; j++) {
			int num =0;
			num += j/i;
			if(num==j) {
				System.out.printf("%d =",num);
				System.out.printf("[%d,]",i);
			}
		}
	}
}//main
}
