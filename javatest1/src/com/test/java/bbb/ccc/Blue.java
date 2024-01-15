package com.test.java.bbb.ccc;

import com.test.java.aaa.Red;
//다른 패키지 + 자식 클래스
public class Blue extends Red{
	
	public void test() {
		
		
		this.a = 10; //public 
//		this.b = 20; //private -> 외부이므로 차단
//		this.c = 30; //default -> 다른 패키지이므로 차단
		this.d = 40; //protected  -> 패키지가 달라도 상속 선언 시 동작가능 
		
	}
}
