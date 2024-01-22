package com.test.java.lambda;

import java.util.Calendar;
import java.util.function.*;


import com.test.java.collection.Member;

public class Ex67_Lambda {
public static void main(String[] args) {
	
	//Ex67_Lambda
	
	/*
	 
	 람다식 > 익명 객체의 추상 메서드 > 인터페이스 참조 변수에 저장 
	 > 람다식을 사용하려면 인터페이스가 필요함 
	 
	 람다식의 가장 큰 장점 > 간단함(생산성이 높음) 
	 람다식의 가장 큰 단점 > 인터페이스를 만들어야 함 
	 
	 *** 자바에서는 여러가지 형식의 람다식(추상 메서드)를 저장할 수 있는 
	 인터페이스를 미리 제공 > 함수형 인터페이스(Functional Interface)
	 
	 함수형 인터페이스(Functional Interface)
	 - 평범한 인터페이스
	 - 목적: 람다식을 저장하는 것
	 1 표준 API 함수형 인터페이스 > JDK 제공 
	 2 사용자 정의 함수형 인터페이스 > 개발자 선언
	 
	 
	 표준 API 함수형 인터페이스 
	 
	 1. Consumer
	 	-Consumer<T>
	 	-BiConsumer<T> (매개변수 2개)
	 	...
	 	- 매개변수 있음 , 반환값 없음 > 추상 메서드 제공 
	 
	 2. Supplier
	 	- Supplier<T>
	 	- 매개변수 없이 반환값만 존재 > 추상 메서드 제공
	 	
	 	
	 3. Function
	 	- Function<T,R>
	 	- BiFunction<T,U,R>
	 	- 매개변수 , 반환값 존재 > 추상 메서드를 제공한다
	 
	 
	 4. Operator
	 	- Function 하위셋
	 	- 매개변수를 연산 후 반환하는 행동
	 	- UnaryOperator<T>
	 	- BinaryOperator<T>
	 	- 매개변수 반환값 존재 > 추상 메서드를 제공한다
	 
	 5. Predicate
	 	- Function 하위셋
	 	- 매개변수를 논리 연산 후 반환하는 행동
	 	- Predicate<T>
	 	- BiPredicate<T,U>
	 	- 매개변수, 반환값 존재 > 추상 메서드를 제공한다.
	 	
	 */
	
	
	//m1();
	//m2();	
	//m3();
	//m4();
	m5();

}//main

private static void m5() {
	
	//Predicate
	//input output 모두 존재 (매개변수 전달하면  , 반환값 출력) 
	//testXXX() 추상 메서드 제공
	//논리 검사 > 결과값이 boolean 반환함 
	
	Function<Integer, Boolean> f1 = num-> num>0;
	System.out.println(f1.apply(-1));
	System.out.println(f1.apply(20));

	System.out.println();
	
	Predicate<Integer> p1 = num-> num>0;
	System.out.println(p1.test(10));
	System.out.println(p1.test(-5));
	
	System.out.println();
	
	BiPredicate<String, String> bp1 = (str1,str2) -> str1.length() > str2.length();
	System.out.println(bp1.test("홍길동", "홍길동님"));
	
	
	
	
	
}

private static void m4() {
	
	//Operator
	//input output 모두 존재 (매개변수 전달하면  , 반환값 출력) 
	//applyXXX()추상 메서드 제공
	//추상 메서드의 매개변수의 반환값이 자료형이 동일하다 .
	
	BiFunction<Integer, Integer, Integer> bf1 = (a,b) -> a+b;
	System.out.println(bf1.apply(20, 30));
	
	
	//매개변수 반환값 모두 형이 같으면 사용 
	BinaryOperator<Integer> bo1 = (a,b) -> a+b;
	System.out.println(bo1.apply(20, 30));
	
	UnaryOperator<Integer> uo1 = a -> a *a;
	System.out.println(uo1.apply(25));

	
	
	
}

private static void m3() {
	
	// Function 
	// input output 모두 존재 (매개변수 전달하면  , 반환값 출력) 
	// applyXXX() 추상 메서드 제공
	
	Function<Integer, Boolean> f1 = num -> num >0; {
		System.out.println(f1.apply(10));
		System.out.println(f1.apply(-10));
	}
System.out.println();	
	Function<String, Integer> f2 = str -> str.length();
	System.out.println(f2.apply("홍길동입니다."));
	
	
	BiFunction<Integer, Integer, String> bf1 = (a,b) ->{
		if(a>b) {
			return "크다";
		}else if(a<b) {
			return "작다";
		}else {
			return "같다";
		}
	};
	
		System.out.println(bf1.apply(20, 10));
		
		IntToDoubleFunction f11 = value -> value/3.0;
		System.out.println(f11.applyAsDouble(10));


}

private static void m2() {
	
	//Supplier
	// 매개변수 없이 반환값을 돌려주는 업무를 구현하는 인터페이스
	// getXXX() 추상 메서드 제공
	System.out.println();
	Supplier<Integer> s1 = ()->{ return 10;};
		System.out.println(s1.get());
	System.out.println();
		Supplier<Double> s2 = () -> Math.random();
		System.out.println(s2.get());
	System.out.println();
		Supplier<String> s3 = ()-> "홍길동";
		System.out.println(s3.get());
	System.out.println();
		Supplier<Integer> s4 = ()->{
			Calendar c = Calendar.getInstance();
			return c.get(Calendar.HOUR_OF_DAY);
		};
		System.out.println(s4.get());


}

private static void m1() {
	
	
	//Consumer<T>
	//매개변수를 받아서 소비하는 업무를 구현하는 인터페이스
	// acceptXXX() 추상 메서드 제공 
	
	MyConsumer m1 = num -> System.out.println(num);
	
	m1.test(100);
	m1.test(200);
	
	//java.util.function 패키지 
	System.out.println();
	
	Consumer<Integer> c1 = num -> System.out.println(num);
	
	c1.accept(100);
	c1.accept(200);
	
	System.out.println();
	
	Consumer<Integer> c2 = num -> System.out.println(num * num);
	c2.accept(10);
	
	System.out.println();
	
	Consumer<String> c3 = str -> System.out.println(str.length());
	c3.accept("홍길동");
	
	System.out.println();
	Consumer<Integer> c4 = count ->{
		for(int i=0; i<count; i++) {
			System.out.println(i);
		}
		System.out.println();
	
	};
	c4.accept(10);
	
	System.out.println();
	
	Consumer<Member> c5 = m -> {
		System.out.println(m.getName());
		System.out.println(m.getAge());
	};
	
	c5.accept(new Member("홍길동",20));
	
	System.out.println();
	
	BiConsumer<String, Integer> bc1 = (name, age) ->{
		System.out.printf("이름: %s, 나이: %d",name,age);
	};
		bc1.accept("아무개", 2);
		
		System.out.println();
	BiConsumer<Integer, Integer> bc2= (a,b) -> System.out.println(a+b);
	bc2.accept(10, 20);
		
	System.out.println();
	//Consumer <T> 범용
	//BiConsumer <T,U> 범용
	
	//전용
	//Consumer<Integer> ic1; 과 같음 
	IntConsumer ic1 = num -> System.out.println(num*3);
	ic1.accept(20);
	
	
	
}
}
//람다식을 저장하고 싶다 > 인터페이스 필요 > 인터페이스 선언 
interface MyConsumer{
	//Input 존재 , output 없음 == 소비
	void test(int num);
}



