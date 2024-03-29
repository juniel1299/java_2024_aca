package com.test.java.obj;

public class Ex47_Interface {
public static void main(String[] args) {
	
	//Ex47_Interface

	/*
	 
	 인터페이스, Interface
	 - 클래스의 일종 
	 - 자료형 
	 일반 클래스는 구현된 멤버만 가짐 
	 추상 클래스는 구현된 멤버, 추상 멤버도 가질 수 있음 
	 인터페이스는 추상 멤버만 가질 수 있음 
	 
	 
	 
	 */
	
	Iphone14 p1 = new Iphone14();
	
	p1.powerOn();
	p1.call();
	p1.powerOff();
	
	System.out.println();
	
	S23 p2 = new S23();
	
	p2.powerOn();
	p2.call();
	p2.powerOff();
	
	
	
}//main
}

//인터페이스 선언
// 전화기 인터페이스  > 모든 실제 전화기가 가지는 행동에 대한 표준안을 만들기 위한 역할 
// 다른 클래스의 부모 클래스 역할을 한다.
// 인스턴스를 생성 할 수 없다. 

interface Phone{
	
	//인터페이스 멤버 선언 
	
	//인터페이스는 구현된 멤버를 가질 수 없음 
	//추상 멤버만 가질 수 있음. 
//	public int a;
//	public int b;
	
//	public abstract void aaa();
//	public void bbb(); //추상만 올 수 있기 때문에 abstract 생략 가능 . (기본값이 추상)
//	void ccc(); // public만 올 수 있기 때문에 기본 값 public 이므로 생략 가능 
	
	void powerOn();
	void powerOff();
	void call();
	
}
class Iphone14 implements Phone{ //interface 에서는 implements 를 통해 상속해야 함  
	
	public void powerOn() {
		System.out.println("전원 on");
		
	}

	@Override
	public void powerOff() {
		System.out.println("전원 off");
		
	}

	@Override
	public void call() {

		System.out.println("전화 걸기");
	}
	
	
}

class S23 implements Phone{

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("전화를 켭니다.");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("전화를 끕니다.");
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("통화를 겁니다.");
	}
	
}