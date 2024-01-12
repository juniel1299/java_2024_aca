package com.test.java.obj._static;

public class Ex37_Static {

	
	//1. 클래스 로딩 , class loading 
	//프로그램을 실행하기 전에 클래스 정의를 미리 읽어서 메모리에 얹는 작업**
	//설계도 인식 작업
	//*** 로딩 과정 중에 만나는 모든 static 요소를 메모리에 구현한다.
	
	//main 메서드 실행
	public static void main(String[] args) {
	
	//Ex37_Static
	
	
	/*
	 
	 static 키워드
	 
	 static(정적) 키워드 
	 - 지시자(제어자) 중 하나 
	 - 클래스 or 클래스 멤버에 붙이는 키워드
	 1. 멤버 변수
	 2. 멤버 메서드
	 
	 
	 
	 */
	
	
	//상황) 학생 3명
	// - "역삼 중학교" 다님
	
//	int a =10;
//	static int b = 20; 잘못된 지시자 사용 
	Student s1 = new Student();
	s1.setName("홍길동");
	s1.setAge(15);
	
	//s1.setSchool("역삼중학교"); 
	Student.setSchool("역삼중학교"); //static way 
	
	Student s2 = new Student();
	s2.setName("아무개");
	s2.setAge(14);
	
	
	Student s3 = new Student();
	s3.setName("임꺽정");
	s3.setAge(16);
	
	
	System.out.println(s1.info());
	System.out.println(s2.info());
	System.out.println(s3.info());
	
	
}//main

}//Ex37

class Student {
	
	private String name;
	private int age; 
	//private String school;
	
	
	//
	private static String school;  
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
//	public String getSchool() {
//		return school;
//	}
//	public void setSchool(String school) {
//		this.school = school;
//	}
	//
	public static String getSchool() {
		return school;
	}
	public static void setSchool(String school) {
		Student.school = school;
	}
	
	public String info() {
		
		
		//print() -> 형식문자 (콘솔창에서만 출력)
		//String.format() -> 형식문자를 또다른 문자로 바꿔줌 
		
		return String.format("%s[%d세,%s]\n"
				,this.name
				,this.age
				,Student.getSchool());
		
		
		
	}
}

//this > 객체 접근 (new만 접근)(자기자신) > 정적(static)에선 this를 사용할 수 없음 . 
	//공용 변수로서 사용





