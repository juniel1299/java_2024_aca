package com.test.question;

public class Q063 {
public static void main(String[] args) {
	
	int[] list =new int[4];
	dump(list);
}//main

public static String dump(int[] list) {
	
	list[0] = 10;
	list[1] = 20;
	list[2] = 30;
	list[3] = 40;
	
	String result =dump(list);
	System.out.printf("nums = %s\n",result);
	
	
	
	
return result;
	
	
}
}
