package com.test.java.cast;

public class Ex45_Cast {
	public static void main(String[] args) {

		/*
		 * 
		 * 형변환, Type Casting
		 * 
		 * 1. 값형 형변환 - 값형끼리 형 변환 가능 (boolean 제외) - byte, short, int , long , float,
		 * double, char - 문제 발생시 오버 또는 언더 플로우 발생 (Overflow)
		 * 
		 * 2. 참조형 형변환 - 클래스끼리의 형변환
		 * 
		 * 참조형 형변환 - 상속 관련 - 상속 관계에 있는 클래스끼리만 형변환이 가능하다. 
		 * - 직계 > 가능 - 방계 > 불가능
		 * 
		 * 
		 * 1. 업캐스팅, Up Casting - 암시적인 형변환 - 자식 클래스 > (형변환) > 부모 클래스 
		 * 100% 가능
		 * 2. 다운캐스팅, Down Casting - 명시적인 형변환 - 부모 클래스 > (형변환) > 자식 클래스
		 * 100% 불가능
		 * 
		 */

		Parent p1;
		Child c1;

		c1 = new Child(); // 자식 객체 > 원본 역할

		// 복사
		// Parent = Child
		//암시적인 형변환 
		//부모클래스 = 자식클래스
		//원래는 p1 = (Parent)c1;
		//업캐스팅
		//100% 안전 
		p1 = c1;
		
		//값형 형변환 검증 
		// - 데이터 복사 후 복사본의 값을 확인 
		
		// c1은 상속 받았으므로 abcd 
		// p1은 부모 이므로 ab만 존재 , 참조형이므로 Parent로  c와 d는 찾아 갈 수 없음 
		// 자식 클래스안에서 부모 클래스 내용을 사용하는건 문제 x
		Parent p2;
		Child c2;
		
		p2 = new Parent();
		
		//복사
		//Child = Parent; 
		//명시적 형변환만 지원 , 직접 앞에 형변환 연산자 작성 
		//자식클래스 = 부모클래스
		// 100% 불가능 
		
		
		//p2 주소값을 복사하여 c2에 넣음 
		// c2는 parent 주소를 가져버림 -> c와 d 찾을 수 없음
		// 다운 캐스팅이 발생하면 모든 동작에 에러가 발생함 
		// 부모 클래스에서 자식클래스로 가는건 문제 발생 
		// 100% 불가능 
//		c2 = (Child)p2; 
//		c2.a = 10;
//		c2.b = 20;
//		c2.c = 30;
//		c2.d = 40;
		
		Parent p3;
		Child c3;
		
		
		c3 = new Child();
		
		//업캐스팅
		p3 = c3;
		
		
		Child c4;
		// 자식 클래스 = 부모 클래스
		//다운캐스팅 발생 > 100% 불가능, 가능 
		c4 = (Child)p3;
		
		c4.a = 10;
		c4.b = 20;
		c4.c = 30;
		c4.d = 40;
		
		
		//c3 -> p3 -> c4 이므로 사실상 같은 주소를 가지기 때문에 동작 가능함 
		//stack 에서의 조작 , 형변환이 되는 것 처럼 보임
		System.out.println(c4.a);
		System.out.println(c4.b);
		System.out.println(c4.c);
		System.out.println(c4.d);
		
		
		
		
		

	}// main
}

class Parent {
	public int a;
	public int b;

}

class Child extends Parent {
	public int c;
	public int d;

}