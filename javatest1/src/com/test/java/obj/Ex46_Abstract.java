package com.test.java.obj;

public class Ex46_Abstract {
public static void main(String[] args) {
	
	/*
	 
	 추상 , Abstract 
	 
	 구체적이다 <> 추상적이다.
	 
	 추상 클래스 , Abstract Class 
	 
	 추상 메서드, Abstract Method
	 
	 
	 */
	
//	//같은 패키지 
//	//Ex30_Class.java > Point 클래스
//	Point p1 = new Point();
	
//	Keyboard k1 = new Keyboard();
//	k1.a = 10;
//	k1.aaa();
//	k1.bbb();
	
	// instantiate 생성 불가 (객체 생성 불가)
	//Mouse m1 = new Mouse();
	//m1.bbb();
	
	

	
	
	
}//main
}
//추상 클래스
// 추상 메서드를 가질 수 있다. 
// 객체를 생성 할 수 없다.
//일반 클래스의 부모 클래스가 될 수 있다 -> 자식 클래스들에게 강제로 추상 메서드를 구현하게 함
// 모든 객체들이 공통된 사용법 (메서드)를 가지게 됨 
abstract class Mouse{ 

	
	//구현된 멤버를 가진다.
//	public int a;
//	public void aaa() {
//		
//	}
	//추상 멤버를 가진다.
//	public abstract void bbb();
	
	
	public String model;
	public int price;
	
	public void info() {
		System.out.println("model : " + this.model);
		System.out.println("price : " + this.price);
		
		
	}
	
	public abstract void click();


}
//일반 클래스에 추상 메서드를 상속 받았기 때문에 추상 메서드에 구현부를 생성해야함
// 하지 않으면 에러가 발생함 
// 구현부를 클래스마다 따로 생성하여 각 클래스마다 구현부를 다르게 가져갈 수 있음. 
// 객체 표준화 
class G305 extends Mouse {
	
	public void click() {
		System.out.println("저렴한 스위치를 사용해서 클릭합니다.");
	}
	
	
}

class M410 extends Mouse{

	
	public void click() {
		System.out.println("비싼 스위치를 사용해서 클릭합니다.");
	}
	
	
}
//일반 클래스는 추상 멤버를 가질 수 없다.

//class Keyboard {
//	public int a;
//	public void aaa() {
//		System.out.println("타이핑을 합니다. ");
//	}
//	public abstract void bbb(); //구현부가 없음 
//}