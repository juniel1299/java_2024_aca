package com.test.java.obj;

public class Ex30_Class {
public static void main(String[] args) {
	
	//Ex30_Class.java
	
	/*
	 
	 자바, Java
	 객체 지향 프로그래밍 언어 OOP
	 object oriented programming Language 
	 객체를 중심으로 프로그램을 만드는 방식
	 객체라는 것을 만들고, 사용하는 방식
	 클래스라는 설계도를 사용해서, 객체라는 것을 만들고, 만들어진 객체를 사용하여
	 내가 원하는 행동을 구현하는 것 
	 
	 
	 클래스, Class 
	 1. 클래스, Class
	 	- 객체를 만드는 설계도
	 	- 객체를 분류하는 기준
	 	- 붕어빵 틀, 
	 2. 객체(개체), Object
	 	-  붕어빵
	 	- 객체 = 데이터(변수) + 행동(메서드)
	 	
	 3. 인스턴스 instance
	 	- 붕어빵
	 	- 메모리에 실체화된 객체
	 	
	 4. 추상화 
	 	- 실존하는 객체들의 공통점을 모아서 정의
	 	- 단순화
	 	
	 5. 정보은닉
	 	- 객체의 내부를 외부에 노출시키지 않는 작업 
	 	- 내부를 외부로부터 보호하는 역할
	 	- 외부에 객체를 봤을 때 행동을 단순화 하는 역할
	 	
	 6. 캡슐화
	 	- 외부로부터 내부를 보호하는 작업
	 	
	 7. 인터페이스
	 	- 케이스의 구멍 + 버튼
	 	
	 8. 프로퍼티(property) 속성(Attribute)
	 	- 데이터(변수)
	 	- 객체가 가지는 정보
	 
	 9. 행동(Behavior)
	 	- 메서드
	 	- 객체가 가지는 행동
	 	
	 10. 상속(inheritance)
	 	- 클래스간의 상속
	 
	 
	 
	 */
	
	//지도 만들기 > 우리집 표시 > 좌표 저장 
	
	//case1. 
	//- 가장 간단한 방법
	// 식별자 문자 > 같은 성질의 식별자가 서로 다른 이름을 사용
	// 구조를 물리적으로 보장받지 못함 
	//구조적 문제 > 규칙x , 조작 x 안 좋음 
	
	
	//우리집 좌표
	int x = 100;
	int y = 200;
	
	System.out.printf("우리집은 [%d , %d]에 위치합니다.\n",x,y);
	
	//마트 좌표
	
	int x2 = 300;
	int y2 = 400;
	System.out.printf("마트는 [ %d , %d ]에 위치합니다\n",x2,y2);
	
	
	//case2 
	//배열 사용
	//데이터 저장 가능한 구조 생성 > 집합 > 관리 용이 , 가독성 증가 
	// 배열 단점 > 요소간의 성질 차이를 구분 불가능 > 배열은 요소를 첨자로 구분
	// 방 번호는 의미를 가지지 못한다.
	
	
	//우리집 좌표 > 정수 2개
	
	int[] a1 = {100,200};
	System.out.printf("우리집은 [%d , %d]에 위치합니다.\n",a1[0],a1[1]);
	int[] a2 = {300,400};
	System.out.printf("마트는 [%d , %d]에 위치합니다\n",a2[0],a2[1]);
	
	//case3
	//- 클래스 사용
	//- 데이터 저장 구조 > 관리 용이 
	//- 각 멤버의 이름을 지정 가능 > 데이터 성질 구분 용이
	//- 단점)초기 비용 발생 
	
	
	//설계한 클래스로부터 객체(인스턴스)를 만드는 방법
	// 자료형 변수명 = new 생성자();
	// 자료형 객체(명,변수) = 객체생성연산자 생성자();
	
	// 붕어빵 틀을 사용해서 붕어빵을 1개 만들었다.
	
	Point p1 = new Point();  //참조형 이므로 heap에 값이 저장 ,배열과 역할은 같으나 자리에 이름을 지정 가능. 
	//p1을 통해 heap에 접근 , 클래스 내의 값들을 가져올 수 있음.
	
	p1.x = 100;
	p1.y = 200;
	
	System.out.printf("우리집은 [%d , %d]에 위치합니다.\n",p1.x,p1.y);
	
	Point p2 = new Point();
	p2.x =300;
	p2.y = 400;
	System.out.printf("마트는 [%d , %d]에 위치합니다\n",p2.x,p2.y);
	
	
	//모니터 
	Size monitor = new Size();
	
	monitor.name = "LG 모니터";
	monitor.width = 1920;
	monitor.height = 1080;
	
	System.out.println(monitor.name + ":" + monitor.width +"," + monitor.height);
	
	//성적
	Score student = new Score();
	
	student.name = "홍길동";
	student.kor = 100;
	student.eng = 90;
	student.math = 80;
	
	System.out.printf("이름: %s 국어: %d 영어: %d 수학: %d",student.name,student.kor,student.eng,student.math);



}//main


} //ex30_class

//클래스 선언하기 (=붕어빵 틀 만들기)
//클래스명: 파스칼 표기법
class Point{
	
	//구현부
	//클래스 멤버 선언하기
	// 1. 변수 
	// 2. 메서드

	//멤버 변수
	public int x;
	public int y;
	public int z;
	public int martx;
	public int marty;

}

class Size {
	
	public String name;
	public int width;
	public int height;



}

//성적 저장 클래스
class Score{
	public String name;
	public int kor;
	public int eng;
	public int math;
}