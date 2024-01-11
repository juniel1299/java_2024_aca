package com.test.java.obj;

public class Ex34_Access {
	public static void main(String[] args) {

		Monitor m1 = new Monitor();
		
		//public 변수 > Field(필드)
		//private 변수의 Getter + Setter > Property (프로퍼티)
		
		
		m1.setModel("TG100"); // 쓰기
		System.out.println(m1.getModel()); // 읽기
		
		//m1.setSize(100); //없음 읽기 전용 
		System.out.println(m1.getSize());//읽기 전용 프로퍼티
		
//		//쓰기 전용 프로퍼티
		m1.setPrice(1000000);
//		System.out.println(m1.setPrice(0)); 

		//가상 프로퍼티 or 계산된 프로퍼티 
		System.out.println(m1.getLevel());
	
	}// main

	
}
