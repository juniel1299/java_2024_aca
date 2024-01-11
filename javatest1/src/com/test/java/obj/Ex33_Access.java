package com.test.java.obj;

public class Ex33_Access {
public static void main(String[] args) {
	
	/*
	 OO 지정자(OO제어자) 
	  - 클래스나 클래스 멤버 > 부가적인 기능을 제공하는 키워드
	  
	  
	 접근 지정자(제어자) Access Modifier
	 	-클래스 멤버에 붙여서 사용한다.(멤버 변수 or 멤버 메서드)
	 	-클래스 자체에 붙여서 사용한다.
	 	- 지역 변수에는 사용이 불가능하다.
	 	
	 	1. public
	 	2. private
	 	-----------------
	 	3. protected
	 	4. (default)
	 	
	 */
	// private 를 사용하면 다른 파일에서 보여지지 않음 . 
	//public을 사용해야 가능 

//	Book b1 = new Book();
//	
//	b1.check();
//	
//	b1.a = 100;
//	//b1.b = 200;
//	
//	b1.check();
//	
	
	
	
	
	Book b1 = new Book();
	
	b1.title = "자바 개발서";
	//b1.price = 25000;
	b1.aaa(25000);	
	
	System.out.println(b1.title);
	//System.out.println(b1.price);
	System.out.println(b1.bbb());
	
	Book b2 = new Book();
	
	b2.title = "코딩 테스트 문제집";
	b2.aaa(100000);
	b2.setPublisher("영진출판사");
	System.out.println(b2.title);
	System.out.println(b2.bbb());
	System.out.println(b2.getPublisher());
	
	
	
}//main 
}