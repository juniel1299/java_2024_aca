package com.test.question;

import java.util.Arrays;

public class Q066 {
public static void main(String[] args) {
	

int[] list = new int[6];
String temp = "";

for(int i=0; i<list.length; i++) {
	list[i] = (int)(Math.random()*45+1);
	
	for(int j=0; j<i; j++) {
		if(list[j] ==list[i]) {
			i--;
			break;
		}
	}
}
temp ="[ ";
for(int i=0; i<list.length; i++) {
	temp += list[i] + ", ";
	Arrays.sort(list);
}
System.out.println(Arrays.toString(list));	
temp += " ]";


//System.out.println(temp);

}//main
}
