package com.test.java.obj;

public class Book {

	
	
	//접근 지정자 가이드
	//1. 멤버 변수는 무조건 private 사용한다.
	// > 멤버 변수를 접근 가능한 입출력 메서드를 생성한다.
	//2. 멤버 메서드는 경우에 따라 private 또는 public 사용한다.
	
//	public int a = 10;
//	private int b = 20;
//	
//	
//	public void check() {
//		System.out.println("a: " + a);
//		System.out.println("b: " + b);
//	}

	public String title;
	private int price;
	private String publisher;
	private String author;
	
	
	//외부 > (값) > 내부
	//쓰기 작업
	//Setter ,Set Method
	public void aaa(int a) {
		if(a>0 && a<1000000) {
		price = a;
	}
	}
	//내부 > (값) > 외부
	//읽기 작업
	//Getter , Get Method
	public int bbb() {
		return price;
	}

	public void setPublisher(String publisher) {
		//this > 객체 접근 연산자
		this.publisher = publisher; //지역 변수 앞에는 this 못 씀 
	}
	
	public String getPublisher() {
		return publisher;
	}
	
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}




}
