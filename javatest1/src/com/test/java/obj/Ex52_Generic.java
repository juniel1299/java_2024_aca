package com.test.java.obj;

public class Ex52_Generic {
	public static void main(String[] args) {

		
		Item<String> s1 = new Item<String>();
		s1.c = "홍길동";
		
		Item<Integer> s2 = new Item<Integer>(); 
		s2.c = 10;
		
		
		Pen<Boolean> p1 = new Pen<>(); // 생성자에 작성하지 않아도 자동으로 적용 됨 
		
		p1.a = true;
		p1.b = false;
		p1.c = true;
		
		Desk<String> d1 = new Desk<>();
		d1.setType("사무용");
		System.out.println(d1.getType());
		
		
		LapTop<String,Integer> macbook = new LapTop<>("맥북",3000000);
		System.out.println(macbook.getA());
		System.out.println(macbook.getB());
		
		LapTop<String,String> galaxy = new LapTop<>("갤럭시북","최고사양");
		System.out.println(galaxy.getA());
		System.out.println(galaxy.getB());
	}// main

}
//제네릭 클래스
// T : 타입 변수(매개변수 역할) (자료형을 담는 변수)
// <> : 인자 리스트
class Item<T> {
	public int a;
	public int b;
	public T c; //클래스 선언시에는 c의 자료형이 결정되지 않음. (객체를 생성할 때 결정), 참조형만 가능함 
	
	
}

class Pen<T> {
	public T a;
	public T b;
	public T c;
}


class Desk<T> {
	private T type;

	public T getType() {
		return this.type;
	}

	public void setType(T type) {
		this.type = type;
	}
	
}

class LapTop<T,U>{
	private T a;
	private U b;
	
	public LapTop(T a, U b) {
		this.a = a;
		this.b = b;
	}
	
	
	public T getA() {
		return a;
	}
	public U getB() {
		return b;
	}





}