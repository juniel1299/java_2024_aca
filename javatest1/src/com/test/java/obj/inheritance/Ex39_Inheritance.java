package com.test.java.obj.inheritance;

public class Ex39_Inheritance {
public static void main(String[] args) {
	
	/*
	 
	 상속 , Inheritance
	 - 부모(클래스)가 가지는 재산(멤버 변수, 멤버 메서드)을 자식(클래스)에게 물려주는 행동
	 - *** 부모 클래스에서 이미 선언된 코드를 자식 클래스에서 재구현 없이 코드를 재사용하기 위한 기술 
	 - 비용 절감(코드 재사용)
	 
	 상속 관계에 있는 클래스 호칭
	 - 부모 클래스 <-> 자식 클래스
	 - 슈퍼 클래스 <-> 서브 클래스
	 - 기본 클래스 <-> 확장 클래스
	 - 기본 클래스 <-> 파생 클래스
	 
	 
	 
	 */
	//부모 객체
	Parent p1 = new Parent();
	p1.a = 10;
	p1.b = 20;
	p1.ccc();
	
	//자식 객체
	//자식 객체가 부모 객체 내부의 것을 사용 가능 
	//상속은 변수 재사용 때문에 이용함(비용 절감)
	Child c1 = new Child();
	
	c1.d = 30;
	c1.e = 40;
	c1.fff();
	
	c1.a = 50;
	c1.b = 60;
	c1.ccc();
	
	
	
	
	
	
}//main 
}






//부모 클래스 역할
class Parent{
	public int a ;
	public int b;
	public void ccc() {
		System.out.println("ccc");
	}
}

//자식 클래스 역할
//태어나는 시점
//자식 클래스가 부모 클래스를 가리킬 수 있음 
class Child extends Parent{
	public int d;
	public int e;
	public void fff() {
		System.out.println("fff");
	}
}

//사이트 > 유저 계정 , 관리자 계정

class Member{
	public String id;
	public String pw;
}

class User extends Member{
	public String name;
	public int point;
}


class Administrator extends Member{
	public int level;
	
}

class AAA{
	
}

class BBB extends AAA {
	
}

class CCC extends BBB {
	
}

class DDD extends CCC{
	
}
//하나의 자식이 2개 이상 상속을 동시에 받을 수 없음 [c++ 에서는 가능]