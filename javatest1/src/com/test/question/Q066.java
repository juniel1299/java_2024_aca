package com.test.question;

public class Q066 {
public static void main(String[] args) {
	

int[] list = new int[6];
String temp = "";

for(int i=0; i<list.length; i++) {
	list[i] = (int)(Math.random()*44+1);
	
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
	
}
temp += " ]";
System.out.println(temp);


}//main
}
