package com.test.question;

import java.util.Arrays;

public class Q064 {
public static void main(String[] args) {
	int[] num = new int[20];


	int max = 20;
	int min = 1;
	
	for(int i=0; i<num.length; i++) {
		num[i] = (int)(Math.random()*18+1);	 //0~1 이므로 *19를 하면 0~19가 나오므로 *18 + 1 을 하여 1~19까지 나오게 함 
	}
	for(int i=0; i<num.length; i++) { // 배열 전체를 비교  
		
		if(num[i] < max) {
			max = num[i];
		}
		if(num[i] > min) {
			min = num[i];
		}
	}
	
	System.out.print("원본 : ");
	for(int i =0; i<num.length; i++) {
		System.out.print(num[i] + ", ");
	}
	
	
	System.out.println();
	System.out.printf("최댓값: %d\n",min);
	System.out.printf("최소값: %d\n",max);
}//main



}
      