package com.test.java.collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ex62_LinkedList {
public static void main(String[] args) {
	
	//Collection(I) < List(I) < ArrayList(C) , LinkedList(C)
	
	//ArrayList vs LinkedList
	
	//- 메서드 구성 유사 > 사용법 유사 
	//- 내부 구조가 다름 > 사용 용도가 다름 
	
	//LinkedList 종류
	//1. LinkedList , 주소 넣는 칸이 임의로 존재 
	//2. Double LinkedList 주소 넣는 칸이 양쪽에 존재 -> 주고 받기가 가능
	//3. Double Circular LinkedList -> 맨 끝의 주소칸에 맨 앞 주소를 넣음 -> 순환구조 -> LinkedList 
	
	
	//m1();
	m2();
	
}//main

private static void m2() {
	
	//ArrayList vs LinkedList 속도 비교 
	
	ArrayList<Integer> list1 = new ArrayList<Integer>();

	LinkedList<Integer> list2 = new LinkedList<Integer>();
	
	long begin =0, end=0;
	
	//1. 순차적 데이터 추가하기 , append 
	
	System.out.println("[1. 순차적으로 데이터 추가하기, Append]");
	
	begin = System.currentTimeMillis();
	
	//업무
	
	for(int i=0; i<10000000; i++) {
		
		list1.add(i);
	}
	
	
	end = System.currentTimeMillis();
	
	System.out.printf("ArrayList 작업 시간: %,dms\n", end - begin);
	
	
	
	
	
	
	begin = System.currentTimeMillis();
	
	//업무
	
	for(int i=0; i<10000000; i++) {
		
		list2.add(i);
	}
	
	
	end = System.currentTimeMillis();
	
	System.out.printf("LinkedList 작업 시간: %,dms\n", end - begin);
	
	
	
	//2. 중간에 데이터 추가하기 , Insert
	System.out.println("[2. 중간에 데이터 추가하기, Insert]");
	
	
	begin = System.currentTimeMillis();
	
	//업무
	
	for(int i=0; i<100; i++) {
		
		list1.add(0,i);
	}
	
	
	end = System.currentTimeMillis();
	
	System.out.printf("ArrayList 작업 시간: %,dms\n", end - begin);
	
	begin = System.currentTimeMillis();
	
	//업무
	
	for(int i=0; i<100; i++) {
		
		list2.add(0,i);
	}
	
	
	end = System.currentTimeMillis();
	
	System.out.printf("LinkedList 작업 시간: %,dms\n", end - begin);
	
	
	
	
	//3. 중간에 데이터 삭제하기 , delete
	
	System.out.println("[3. 중간에 데이터 삭제하기, delete]");
	
	//업무
	
	for(int i=0; i<10000; i++) {
		
		list1.remove(0);
	}
	
	
	end = System.currentTimeMillis();
	
	System.out.printf("ArrayList 작업 시간: %,dms\n", end - begin);
	
	begin = System.currentTimeMillis();
	
	//업무
	
	for(int i=0; i<10000; i++) {
		
		list2.remove(0);
	}
	
	
	end = System.currentTimeMillis();
	
	System.out.printf("LinkedList 작업 시간: %,dms\n", end - begin);
	
	
	
	//4. 순차적으로 삭제하기 
	//업무
	System.out.println("[4. 끝에 데이터 삭제하기, delete]");
	for(int i=list1.size()-1; i>=0; i--) {
		
		list1.remove(i);
	}
	
	
	end = System.currentTimeMillis();
	
	System.out.printf("ArrayList 작업 시간: %,dms\n", end - begin);
	
	begin = System.currentTimeMillis();
	
	//업무
	
	for(int i=list2.size()-1; i>=0; i--) {
		
		list2.remove(i);
	}
	
	
	end = System.currentTimeMillis();
	
	System.out.printf("LinkedList 작업 시간: %,dms\n", end - begin);
}

private static void m1() {
	//list = 순서가 있는 목록 
	ArrayList<Integer> list1 = new ArrayList<Integer>();

	LinkedList<Integer> list2 = new LinkedList<Integer>();
	
	list1.add(100);
	list1.add(200);
	list1.add(300);
	

	list2.add(100);
	list2.add(200);
	list2.add(300);
	
	System.out.println(list1.size());
	System.out.println(list2.size());
	System.out.println();
	System.out.println(list1.get(0));
	System.out.println(list2.get(0));
	System.out.println();
	
	for(int n : list1) {
		System.out.println(n);
	
	}
	System.out.println();
	for(int n : list2) {
		System.out.println(n);
	}
	System.out.println();
	
}



}

