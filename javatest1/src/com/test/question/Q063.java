package com.test.question;

public class Q063 {
public static void main(String[] args) {
	
	int[] list =new int[4];
	list[0] = 10;
	list[1] = 20;
	list[2] = 30;
	list[3] = 40;

	String result = dump(list);
	System.out.printf("nums = %s\n", result);
}//main

public static String dump(int[] list) {
	String time ="[";
	
	for(int i =0; i<list.length; i++) { //리스트 4개 -> 3번 반복 예정 -> 3번 반복 [ 숫자와 ,이 3번 나옴 ]
		time += list[i]; //리스트에 있는 숫자를 중첩하여 더함 
		
		if(i<list.length -1) { // i가 길이-1 일때 , 생성
			time +=", ";
		}
	}
	time += " ]";
	
	
	return time;
	
	
}
}
