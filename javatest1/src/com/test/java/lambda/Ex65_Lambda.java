package com.test.java.lambda;

import java.lang.invoke.LambdaMetafactory;

public class Ex65_Lambda {
public static void main(String[] args) {
	 
	/*
	 
	 람다식, Lambda Expression
	 - 함수형 프로그래밍 방식을 지원하는 표현식
	 - 람다식을 사용하면 코드가 간결해진다.(호불호)
	 - 자바 > 컬렉션(배열) 조작을 위해서 제공
	 
	 - 자바의 메서드 표현 
	 - 람다식은 매개변수를 가지는 코드블럭이다.
	 - 자바의 람다식은 인터페이스를 사용해서 만든다.
	 - 자바의 람다식은 익명 객체를 만드는 표현을 간소화시킨 기술이다.
	 
	 람다식 형식
	 - 인터페이스 변수 = 람다식;
	 - MyInterface m1 = ()->{};
	 
	 (매개변수) -> {구현부};
	 a. (매개변수): 추상 메서드의 인자리스트
	 b. ->: 화살표(Arrow) , 구현부 호출하는 역할 (연결)
	 c. {구현부}; 추상 메서드의 구현부 
	 
	 조건1: 추상 메서드가 2개 이상이 되면 람다식으로 만들 수 없음. //FunctionalInterface
	 
	 
	 */
	
	//요구사항) MyInterface 구현한 객체를 생성하시오.
	
	//Case 1. 클래스 선언 + 객체 생성
	
	
	MyInterface m1 = new MyClass();
	
	m1.test();
	
	//Case 2. 익명 객체 생성 
	MyInterface m2 = new MyInterface() {
		
		@Override
		public void test() {
			// TODO Auto-generated method stub
		System.out.println("익명 객체에서 구현한 메서드");	
		}
	};
	m2.test();
	
	//Case 3. 람다식을 사용하는 방법 
	
	MyInterface m3 = ()->{ //람다식을 통해 생략 new MyInterface, public void test 부분 생략 
		//인터페이스 없이는 람다식 못 씀 
		System.out.println("람다식으로 구현한 메서드");
	};
	m3.test();
	
	
	TestInterface t1 = new TestInterface() {
		
		@Override
		public void bbb() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void aaa() {
			// TODO Auto-generated method stub
			
		}
	};
	
//	TestInterface t2 = ()->{
//		
//	};
	
	
	//추상 메서드의 형식에 따라
	//매개변수 유/무
	//반환값 유/무
	
	
	
	NoParameterNoReturn pr1 = new NoParameterNoReturn() {
		
		@Override
		public void call() {
			// TODO Auto-generated method stub
			System.out.println("pr1");
			System.out.println();
		}
	}; 
	pr1.call();
	
	NoParameterNoReturn pr2 = () ->{
		System.out.println("pr2");
		System.out.println();
	};
	pr2.call();
	
	NoParameterNoReturn pr3 = () -> System.out.println("pr3"); //한줄이면 블럭 생략 가능 
	pr3.call();
	System.out.println();
	
	ParameterNoReturn pr4 = (int n) -> {
		System.out.println(n);
	};
	pr4.call(10);
	pr4.call(20);
	pr4.call(30);
	System.out.println();
	
	//***람다식의 매개변수 자료형을 생략 할 수 있다.
	ParameterNoReturn pr5 = (n) -> { 
		System.out.println(n);
	};
	pr5.call(50);
	System.out.println();
	
	ParameterNoReturn pr6 = n->{
		System.out.println(n);
	};
	pr6.call(70);
	System.out.println();
	
	ParameterNoReturn pr7 = n->System.out.println(n);
	pr7.call(10);
	
	MultiParameterNoReturn pr8 = (String name, int age) -> {
		System.out.println(name + age);
	};
	pr8.call("홍길동", 20);
	
	System.out.println();
	
	MultiParameterNoReturn pr9 = (name,age)->{
		System.out.println(name + age);
	};
	pr9.call("홍길동", 22);

//	MultiParameterNoReturn pr10 = name,age ->{ //람다식에서 괄호 생략은 매개변수 1개일때만 
//		System.out.println(name + age);
//	};
//	pr10.call("홍길동", 10);
	
	System.out.println();
	
	MultiParameterNoReturn pr10 = (name,age)-> System.out.println(name+age);
		pr10.call("가나다", 11);
	
		System.out.println();
	NoParameterReturn pr11 = ()->{
		return 10;
	};
	System.out.println(pr11.call());	
	
	System.out.println();
	
	//구현부에 return문이 유일하면 {}와 return 을 동시 생략 가능 
	NoParameterReturn pr12 = ()-> 20; //리턴까지 생략해야 동작가능
	System.out.println(pr12.call());
	
	System.out.println();
	
	
	ParameterReturn pr13 = (int a, int b) ->{
		return a+b;
	};
	System.out.println(pr13.call(10,20));
	
	System.out.println();
	
	
	
	[가-힣A-Za-z] 
	
	
	
	
	
	
	
	
	
}//main
}

@FunctionalInterface //메서드가 1개인지 검사 (람다식을 저장 할 수 있는지 확인)
interface MyInterface{
	void test();
}

class MyClass implements MyInterface{

	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("실명 클래스에서 구현한 메서드입니다.");
	}
	
}

interface TestInterface{
	void aaa();
	void bbb();
}

interface NoParameterNoReturn{
	void call();
}

interface ParameterNoReturn{
	void call(int n);
}

interface MultiParameterNoReturn{
	void call(String name, int age);
}

interface NoParameterReturn{
	int call();
}

interface ParameterReturn{
	int call(int a, int b);
}