package com.test.java.obj;

public class Ex48 {
public static void main(String[] args) {
	
	
	//1. 추상 클래스 또는 인터페이스 사용하는 이유 
	//2. 업캐스팅 or 다운캐스팅 사용하는 이유 
	
	//상황) 프린터 대리점 운영 
	//1. LG100 모델 * 5대 , HP200 모델 * 3대
	//2. 하루 1번씩 > 제품 점검 > 모델과 상관없이 출력 기능 
	
	
	//추가 상황)
	//1. 프린터 재고 증가
	// LG100 > 500대
	// HP200 > 300대 
	
	m1();
	
	
	
	
	
	//Case 2.
	//배열 사용
	
	

	
	
	
	
}

public static void m1() {
	//Case 1.
	//가장 비효율적인 방식 
	//대당 비용 동일 
	LG100 lg1 = new LG100("lg100",300000, "black", 100);
	LG100 lg2 = new LG100("lg100",300000, "black", 100);
	LG100 lg3 = new LG100("lg100",300000, "black", 100);
	LG100 lg4 = new LG100("lg100",300000, "black", 100);
	LG100 lg5 = new LG100("lg100",300000, "black", 100);
	
	HP200 hp1 = new HP200("hp200", 350000, "white");
	HP200 hp2 = new HP200("hp200", 350000, "white");
	HP200 hp3 = new HP200("hp200", 350000, "white");
	
	
	lg1.print();
	lg2.print();
	lg3.print();
	lg4.print();
	lg5.print();
	
	hp1.print();
	hp2.print();
	hp3.print();
}//main
}

//클래스의 부모 역할

//1. 일반클래스 - 
//2. 추상클래스 -
//3. 인터페이스 - 


abstract class Printer {
	private String model;
	private int price;



	public Printer(String model, int price) {
		super();
		this.model = model;
		this.price = price;
	}

	

	//제품의 종류와 상관없이 공통된 기능을 선언 > 출력 기능 > void print(); 
	
	public abstract void print();


}

class LG100 extends Printer{



	private String color;
	private int size;
	public LG100(String model, int price, String color, int size) {
		super(model, price);
		this.color = color;
		this.size = size;
		// TODO Auto-generated constructor stub
	}
	
	public void print() {
		System.out.printf("%d 사이즈로 출력합니다.\n",this.size);
	}


	public void selfTest() {
		
		System.out.println("자가 진단을 합니다.");
		
		
		
	}
}

class HP200 extends Printer{
	private String type;
	
	public HP200( String model,int price,String type) {
		super(model,price);
		this.type = type;
	}


	public void call() {
		
		System.out.println("상담원과 연결 ");
		
		
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.printf("%s 방식으로 출력합니다.\n",this.type);
	}

}








