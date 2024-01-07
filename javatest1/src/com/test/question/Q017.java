package com.test.question;

public class Q017 {
public static void main(String[] args) {
	//진행순서
	//메서드 선언
	// 변수 선언
	// 출력 
	// 매개변수 추가하여 메서드 선언 출력
	String name1 = "";
	String name2 = "";
	String name3 = "";
	String name4 = "";
	
	position(name1);
	position(name1, name2);
	position(name1,name2,name3);
	position(name1,name2,name3,name4);
}//main

private static void position(String name1, String name2, String name3, String name4) {
	// TODO Auto-generated method stub
	name1 = "홍길동";
	name2 = "유재석";
	name3 = "박명수";
	name4 = "정형돈";
	System.out.printf(" 사원: %s\n 대리: %s\n 과장: %s\n 부장: %s\n",name1,name2,name3,name4);
	System.out.println();
}

private static void position(String name1, String name2, String name3) {
	// TODO Auto-generated method stub
	name1 = "홍길동";
	name2 = "유재석";
	name3 = "박명수";
	System.out.printf(" 사원: %s\n 대리: %s\n 과장: %s\n",name1,name2,name3);	
	System.out.println();
}

private static void position(String name1, String name2) {
	// TODO Auto-generated method stub
	name1 = "홍길동";
	name2 = "유재석";
	System.out.printf(" 사원: %s\n 대리: %s\n",name1,name2);	
	System.out.println();
}

private static void position(String name1) {
	// TODO Auto-generated method stub
	name1 = "홍길동";
	System.out.printf(" 사원: %s\n",name1);
	System.out.println();
}
}
