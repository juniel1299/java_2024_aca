package com.test.java.obj.inheritance;

import java.util.Calendar;

public class Ex43_final {
public static void main(String[] args) {
	
	/*
	 
	 final 키워드 
	 - 한번 결정하면 바꿀 수 없다.
	 안정성이 높아진다.
	 
	 
	 1. 변수 적용(지역 변수, 멤버 변수)
	 	- 초기화 이후에 값을 변경할 수 없다.
	 	- 상수
	 	
	 2. 메서드 적용
	 	- 상속 시 오버라이딩 방지
	 	
	 
	 
	 3. 클래스 적용
	 	- 상속을 방지 
	 
	 
	 */
	final int A = 10; // final 변수는 대문자

		// 파이널은 선언과 동시에 초기화 ( 이렇게 따로 놓으면 구분이 힘듬 )
		final int B;
		B = 20;

		System.out.println(Calendar.YEAR);

//	final int MALE = 1;
//	final int FEMALE = 2;

		Student s1 = new Student();
		s1.name = "홍길동";
		s1.age = 20;
		s1.gender = Gender.MALE;
		Student s2 = new Student();
		s2.name = "호호호";
		s2.age = 22;
		s2.gender = Gender.FEMALE;

	}// main

}

class Gender {

	public static final int MALE = 1; // 공공데이터이므로 static을 붙임
	public static final int FEMALE = 2; // 공공데이터이므로 static 붙임
}

class Student {

	public String name;
	public int age;

	public int gender; // 성별 > 남자(1), 여자(2)

}


//클래스에 final을 붙여 상속을 못하게 하여 에러 발생을 막음.(최종 클래스) 
final class FinalParent { 
	final public String test() { //메서드에 final을 붙여 오버라이딩을(재정의 발생) 막는다
	return "성별	";
	}
}
 


//class FinalChild extends FinalParent {
//	public String test() {
//		return "나이";
//	}
//}


// 난수 생성
// 숫자만 됨 
// 문자열을 하고 싶으면 배열 이용 String[] color={"빨강","노랑","파랑","보라"};
//난수를 방번호로 씀 -> String[random] 

//String[] color={"빨강","노랑","파랑","보라"};
// System.out.println(color[(int)(Math.random() * color.length)]);