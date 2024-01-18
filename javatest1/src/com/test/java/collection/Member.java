package com.test.java.collection;

public class Member {

	private String name;
	private int age;
	

	
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}




	public String getName() {
		return name;
	}



	public int getAge() {
		return age;
	}



	
	@Override
	public String toString() {
		return String.format("%s(%d)", this.name,this.age);
	}
		//한번 정리된 주소값을 수정 , 재정의
	@Override
	public int hashCode() {
	
		//이름+나이가 같으면 같은 사람이라 가정
		
		//홍길동20
		//아무개25
//		System.out.println((this.name + this.age).hashCode()); //하나로 묶어서 주소값 나옴
		return (this.name + this.age).hashCode();
	}
		//equals 재정의
	@Override
	public boolean equals(Object obj) {
	
	return  this.hashCode() == obj.hashCode();
	}
	
}
