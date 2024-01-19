package com.test.java.collection;

public class Ex60_Anonymous {
public static void main(String[] args) {
	//1.본인 타입의 참조 변수 만들기
	BBB b1 = new BBB();
	b1.test();

	//2. 부모 타입의 참조 변수를 만들기
	AAA b2 = new BBB();
	b2.test();
	
	//3. Anonymous class
	//밑에 있는 상속 받은 BBB와 같은 방식
	//단 익명 클래스는 일회용 -> 선언과 동시에 객체를 한번만 만들 때 사용
	//(클래스는 계속 부를 수 있으나 익명 클래스는 한번 쓰면 끝남) 
	AAA b3 = new AAA() { //인터페이스를 통해 anonymous class를 만들 수 있기에 추가 
//객체를 만드는 형태인데 AAA를 참조한게 아닌 { 안에 내용을 참조해버림 } 
		
		public void test() { //anonymous class , 이름이 없음 
			System.out.println("익명 객체 메서드");
			
		}
		
	};
	b3.test();
	//Ex60_Anonymous
	
	/*
	 
	 익명 클래스 Anonymous Class
	 익명 객체,  Anonymous Object
	 -이름없는 클래스
	 
	 실명 클래스
	 - 객체를 여러개 만들 수 있다. (장점)
	 - 이름이 있는 클래스를 만들어야 한다(단점) , 하나 고치면 다 적용 되어버림
	 - 한번 생성하면 계속 써야함
	 
	 프로젝트
	 - 수많은 클래스 > 150~500개 내외
	 
	 
	 익명 클래스
	 - 객체를 딱 1개만 만들 수 있다(단점)
	 - 이름이 없는 클래스를 만들어야 한다 (장점) 
	 - 한번만 써야할 때 사용가능 , 클래스 양을 줄일 수 있음 
	  
	 
	 
	 
	 */
	
	//요구사항) 인터페이스를 구현한 클래스 선언하기 > 객체를 생성하기 
	
	
	
}//main
}
interface AAA{
	void test();
}

class BBB implements AAA{
	
	
	public void test() {
	System.out.println("추상 메서드를 구현");
		
	}
}











