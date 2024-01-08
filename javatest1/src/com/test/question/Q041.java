package com.test.question;

public class Q041 {
public static void main(String[] args) {
	int sum = 0;
	for(int i =1; i<1000; i++) {
		if(sum<1000) {
			System.out.printf("%d + " ,i);
			
		sum+=i;
	}
}//main
	System.out.printf("= %d",sum);
}
}