package com.test.java;

public class Ex70_String {
public static void main(String[] args) {
	
	//문자열 성질 
	
	// - "자바의 문자열은 불변(immutable)이다."
	
	//m1();
	m2();
	
	
}//main

private static void m2() {
	
	String txt ="홍길동";
	
	txt = txt + "님";
	
	System.out.println(txt);
	
	String txt2 = "홍길동님";
	
	System.out.println(txt2);
	
	
	//문자열의 잦은 조작 > 다량의 Garbage를 생성 (메모리 낭비)
	
	//계속 새로운 문자열 제작 -> 버림 -> 제작 반복 
	
	long begin = 0, end = 0;
//	
//	begin = System.currentTimeMillis();
//	
//	
//	
//	String txt ="홍길동";
//	
//	
//	
//	for(int i=0; i<100000; i++) {
//		txt +=".";
//	}
//	
//	end = System.currentTimeMillis();
//	
//	System.out.printf("길이 : %,d자\n시간: %,dms\n"
//			,txt.length(), end-begin);
	
	
	
	
	
	begin = System.currentTimeMillis();
	
	
	
	//String txt ="홍길동";
	
	//문자열 조작이 많아지면 사용
	StringBuilder sb = new StringBuilder("홍길동");
	//StringBuffer sb;
	System.out.println(sb);
	
	
	
	for(int i=0; i<100000; i++) {
		sb.append(".");
	}
	
	end = System.currentTimeMillis();
	
	System.out.printf("길이 : %,d자\n시간: %,dms\n"
			,sb.length(), end-begin);
	
	
}

private static void m1() {
	
	//값형 (고정)
	int n1 = 10; // 크기 4byte
	int n2 = 10000; //크기 4byte
	
	
	//참조형(가변)
	int[] ns1 = {10,20,30}; //4*3 = 12byte
	int[] ns2 = {10,20,30,40,50}; // 4*5 = 20 byte
	
	String s1 = "홍길동"; //2*3 6byte
	String s2 = "홍길동입니다."; // 2*7 = 14byte
	//참조형은 같은 상수가 있는지 먼저 확인하고 같은 상수가 있으면 해당 주소값만 끌어옴(생성 안 됨)
	
	//ex 문자열 
	String s3 = "가나다";
	String s4 = "가나다";
	String s5 = "가나";
	s5 +="다";
	
	System.out.println(s3.hashCode());
	System.out.println(s4.hashCode());
	//두 값은 동일한 해시코드 가짐 
	
	//값이 바뀜 -> 같은 주소를 쓰는데 문자를 추가 -> 따로 heap에 공간 생성됨 
	s4 = s4 + ",";
	System.out.println(s3.equals(s5)); //heap 내부 값을 비교함 -> stack에 있는 주소값은 다름
	System.out.println(s3.hashCode());
	System.out.println(s4.hashCode());

	
	
	
	
	
	
	
	
}
}
class Item{
	private int num;
	private String type;
	
	
	
	@Override
	public String toString() {
		return String.format("Item [num=%s, type=%s]", num, type);
	}
	
	
	
	
//	@Override
//	public String toString() {
//		StringBuilder builder = new StringBuilder();
//		builder.append("Item [num=").append(num).append(", type=").append(type).append("]");
//		return builder.toString();
//	}

	
//	public String toString() {
//		StringBuilder builder = new StringBuilder();
//		builder.append("Item [num=");
//		builder.append(num);
//		builder.append(", type=");
//		builder.append(type);
//		builder.append("]");
//		return builder.toString();
//	}
	
//	public String toString() {
//		return "Item [num=" + num + ", type=" + type + "]";
//	}
	
}