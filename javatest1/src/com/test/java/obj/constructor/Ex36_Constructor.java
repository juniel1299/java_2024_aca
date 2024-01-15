package com.test.java.obj.constructor;

public class Ex36_Constructor {
	public static void main(String[] args) {

		// Ex36_Constructor
		
		/*
		 
		 생성자, Constructor
		 - (특수한 목적을 가지는)메서드
		 - 객체의 멤버(변수)를 초기화하는 역할(***)
		 
		 자료형 참조변수 = 객체생성연산자 생성자();
		 Box b1 = new Box():
		 
		 */
		
		
		//***
		//1. 객체의 초기화 > 생성자
		//2. 객체의 상태 수정 > Setter
		
		
		
		
//		//b1 생성 
//		Box b1 = new Box();
		//사이즈는 생성자로 해야하므로 setSize 로 못 함 . -> 애초에 setter 안 씀
		//가격은 수정해야 하므로 setter 안 지움
		Box b1 = new Box("소형",2000);
		
		
		//생성자는 단독 호출이 불가능하다.
		//ex) Box("소형",2000); 이건 안 됨
		// 반드시 new 와 함께 호출이 가능하다.
		//왜냐하면 코드 생성주기가 new는 단 한 번 이기 때문에 
		
				
		//b1 초기화 
		
		//b1.setSize("소형");
		//b1.setPrice(2000);
		
		//출력
		System.out.println(b1.getSize());
		System.out.println(b1.getPrice());

		
		
	}//main
}

class Box{
	
	private String size;
	private int price;
	
//	컴파일러가 컴파일 할 때 자동으로 생성하는 코드 
//	생성자(Constructor)
//	- 접근 지정자 public 
//	- 반환 값 존재하지 않음 > void 도 생략
//	-메서드명 ==클래스명
//	기본 생성자
//	public Box {
//	this.size = null;
//	this.price = 0;
//	}
	
	//생성자 오버로딩 
	//자동으로 생성이 되긴 하나 , 이미 생성자가 존재한다면 자동 생성이 안 됨 
	public Box() {
//		this.size = "";
//		this.price = 0;
		this(""); //생성자 간의 호출 방법 -> 밑에 box 부름 .
	
	
	}

	public Box(String size) {
//		this.size = size;
//		this.price = 0;
		this(size,0);
	}
	
	public Box(String size, int price) {
		this.size = size;
		this.price = price;

	}
	
	
	public String getSize() {
		return size;
	}
//	public void setSize(String size) {
//		this.size = size;
//	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	} 
	
}

class Cup {
	
	private String color;
	private int size;
	
	
	
	public Cup(String color, int size) {
		//super(); 아직 x 
		this.color = color;
		this.size = size;
	}


	public Cup(int size) {
		//super();
		this.size = size;
	}


	public Cup(String color) {
		//super();
		this.color = color;
	}
	
	
	
}

class Mouse {
	//클래스 멤버
	private int a;
	private int b;
	//객체 (멤버)생성자 , 가장 먼저 생성됨 (메모리 상에 실제 없음), 초기화 안 함 > 객체 내부를 초기화 하는 것이기 때문에.
	private static int c; 
	public Mouse(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	} 
	//정적 생성자 (static) > 정적 멤버만을 초기화
	//매개변수 없음
	//정적 생성자는 직접 호출이 불가능
	//자바가 호출함
	static {
		Mouse.c = 0;
	}
	
	
	
}



// new box(); 에서 new(객체생성연산자)가 먼저 실행 -> 메모리에 실제 생성 -> new가 Heap에 size와 price 변수 생성
// 생성만 하였기 때문에 null 