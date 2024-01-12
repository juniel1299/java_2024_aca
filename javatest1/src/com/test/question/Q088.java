package com.test.question;
//보류
import java.util.Arrays;
import java.util.Scanner;

public class Q088 {
public static void main(String[] args) {

	String[] ban = {"바보","멍청이"}; //금지어
	String txt = ""; //입력 받을 변수
	
	Scanner scan = new Scanner(System.in);
	System.out.print("입력: ");	
	txt = scan.nextLine();

	if(Arrays.asList(ban).contains(txt)) {
		
		System.out.println(txt.replace(Arrays.toString(ban), "*"));

	}else {
		System.out.println(txt);
	}
	
	
	//	
//	for(int i=0; i<ban.length; i++) {
//		if(txt.indexOf(ban[i])> -1) {
//			System.out.println(txt.replace(Arrays.toString(ban), "**"));
//			break;
//		}else {
//			System.out.println(txt);
//		}
//	}
//	System.out.println("종료");
}
}//main



