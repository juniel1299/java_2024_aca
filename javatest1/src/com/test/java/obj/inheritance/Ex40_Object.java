package com.test.java.obj.inheritance;

import java.util.Scanner;

public class Ex40_Object {
public static void main(String[] args) {

	//Ex40_Object
	
	/*
	 
	 Object 클래스
	 - 개발자가 선언한 모든 클래스는 자동으로 object 클래스를 상속받는다.
	 - 모든 클래스의 근원 클래스 
	 - 루트 클래스(Root Class)
	 - Object 클래스는 멤버를 9개 구현 > 상속에 의해 모든 클래스 파생 (물려진다)
	 - 모든 클래스는 9개의 메서드를 가지고 있다. > 공통 기능 
	 
	 
	 */
	
	
	Object o1 = new Object();
	
	Test t1 = new Test();
	
	
	
}//main



}
class Test { //명시적으로 상속하지 않으면 extends Object를 뒤에 붙여줌 
	//ex) class Test extends Object
	public int a;
	public int b;
}

// 데이터 구조 -> 트리 구조 -> 가장 상단에 있는 노드를 루트 노드 , 끝 노드를 리프노드 , 