package com.test.java.obj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex49_Object {
public static void main(String[] args) {
	
	
	//Ex49_Object
	
	//object 클래스
	//모든 클래스의 부모 클래스이다.
	//업캐스팅 적용 > 모든 자료형을 담을 수 있는 자료형 
	
	
	m1();
	//m2();
	
	
}//main

private static void m2() {
	// TODO Auto-generated method stub
	//참조형 = (형변환)참조형
	//부모클래스 = 자식클래스
	Object o1 = new AAA();
	
	
	//불가능 작업  , 참조형과 값형을 절대적으로 형변환이 불가능함 . 
	//눈에 안 보이는 작업 > 박싱 ( Boxing )발생 (컴파일러가 함) 
	Object o2 = 100;
	// new Integer >  heap에 공간 하나를 만든 후 해당 위치에 레퍼런스 값으로  100을 넣고 Object 값형엔 주소를 넣음
	// 박싱 발생  (값형을 Object에 넣을때 발생 , Object 아니여도 발생 가능 )
	//	Object o3 = new Integer(100); // 잘 안쓰는 코드라 쓰지 말라 경고하는거 
	
	Integer a3 = 100; //박싱 발생 , Object 아닌 경우에도 발생 가능 , (참조형)
	
	
	//( 자동으로 언박싱 발생 , 숫자로 받아서 *2 한 것)
	System.out.println(a3 *2); //주소값 * 2 했으나 값 나옴 Integer라 자동으로 바꿔서 언박싱 발생한 것 
	
	//자동으로 언박싱이 발생 안 됨 , 타입 문제 (오브젝트), 오브젝트는 모든 변수가 다 들어가므로
	System.out.println((Integer)o2 * 2); //직접 Integer 를 추가해야함 
	
	int a1 = 100; //값형
	Integer a2 = new Integer(100); //참조형 
	System.out.println(a1 ==a2);  // Integer 클래스는 int 값형이 
	//가끔씩 참조타입으로 사용해야 하는 경우 
	//대신 그 역할을 하기 위해 제공되는 클래스
	
	//Wrapper Class 
	//byte > Byte
	//short > Short
	//int > Integer ... etc 
	
	//박싱(언박싱) > 비용이 높음 
	
	
	
}

public static void m1() {
	AAA a1 = new AAA();
	AAA a2 = new BBB(); //부모 변수 = 자식 객체; (업캐스팅)
	AAA a3 = new CCC(); //할아버지 = 손자 (업캐스팅)
	
	Object o1 = new AAA(); //업캐스팅
	Object o2 = new AAA(); 
	Object o3 = new CCC();
	
	Object o4 = new Scanner(System.in);
	
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	Object o5 = new BufferedReader(new InputStreamReader(System.in));
	
	Object o6 = new Employee();
	
	Object o7 = "홍길동";
	Object o8 = new int[3];
	
	// 값형 <- (형변환 100% 불가능 ) ->참조형 
	Object o9 = 100; //앞에 (Object) 생략
	Object o10 = true;
	
	
	//자료형을 신경 쓰지 않아도 되는 것이 장점 
	//자료형을 신경 쓰지 않아도 되는 것이 단점
	
	//*** Object 배열에는 무엇이든 담을 수 있다 하지만 
	//처음 담은 자료형이 int면 나머지 방에도 int를 담는다 (자료형 통일)  
	Object[] list = new Object[5];
	
	list[0] = 100;
	list[1] = 200;
	list[2] = 300;
	list[3] = "문자열";
	list[4] = true;
	
	
	
//	for(int i =0; i<list.length; i++) {
//		System.out.println((int)list[i]*2); //예측 불가능
//	}
}
}

class AAA{ //extends Object
	
	
}

class BBB extends AAA{
	
	
}

class CCC extends BBB{
	
	
}