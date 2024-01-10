package com.test.question;
//보류
public class Q055 {
public static void main(String[] args) {
	//1~100까지 반복 
	// 
	int sum = 0;
	String number ="";
	
	
	for(int i=1; i<=100; i++) {
		
		sum = 0;
		number="";
		
		for(int j=1; j<i; j++) {
			if(i%j==0) {
				sum+= j;
				number+=j+",";
			}
		}
	if(sum==i) {
		System.out.printf("%d = [%s]\n",i,number);
	}
	
	}
}//main
}
