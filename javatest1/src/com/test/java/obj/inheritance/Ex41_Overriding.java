package com.test.java.obj.inheritance;

public class Ex41_Overriding {
	public static void main(String[] args) {

		/*
		 
		 메서드 오버로딩, Method overloading
		 	- 메서드 이름 동일 * N 생성
		 
		 메서드 오버라이딩, Method overriding
		 	- 클래스 상속 할 때 발생
		 	- 메서드 재정의 > 상속받은 메서드를 수정하는 기술
		 	- 부모의 메서드와 자식의 메서드가 겹치게 되면 덮어쓰기가 되어 자식 메서드가 출력됨
		 	- 클래스 경로 자체가 서로 다르게 나옴 
		 	- 변수도 오버라이딩 가능  (안함)
		 	- 설명은 그대로 두고 내용만 바꿀 때 용이 
		 
		 
		 
		 */
		
		
		OverridingParent hong = new OverridingParent();
		
		hong.name = "홍길동";
		hong.hello();
		
		OverridingChild jhong = new OverridingChild();
		
		jhong.name = "홍철수";
		jhong.hello();
//		jhong.hi();	
		
	}// main
}
//동네 사람
class OverridingParent {
	public String name;
	
	public void hello() {
		System.out.printf("안녕하세요. 좋은 아침입니다 저는 %s입니다.\n"
				,this.name);
	
	
	}
	
}

// 
class OverridingChild extends OverridingParent{

	public void hello() {
		System.out.printf("하이~ 방가~ 난 %s야\n",this.name);
	}
	
//	public void hi() {
//		System.out.printf("하이~ 방가~ 난 %s야\n",this.name);
//	}
	
}