package com.test.java.aaa;

public class Yellow {

	public void test() {
		
		Red r1 = new Red(); //현재 yellow 클래스와 같은 패키지에 존재 
		
		r1.a = 10; // public
//		r1.b = 20; //private
		r1.c = 30; //default ->
		r1.d = 40; //protected 
	}
	
}
