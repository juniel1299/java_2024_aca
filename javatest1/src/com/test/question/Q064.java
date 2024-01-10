package com.test.question;

import java.util.Arrays;

public class Q064 {
public static void main(String[] args) {
	int randomNum= (int)(Math.random()*100+1);	
	int[] num = new int[20];
	
	for(int i=0; i<20; i++) {
		
		num[i] = (int)(Math.random()*100+1);
	}
	System.out.println(Arrays.toString(num));
	Arrays.sort(num);
	//System.out.println(Arrays.toString(num));
	System.out.println("최소값" + (num[0]));
	System.out.println("최대값" + num[19]);
	
}//main



}
      