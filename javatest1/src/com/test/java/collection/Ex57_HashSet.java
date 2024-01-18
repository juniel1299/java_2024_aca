package com.test.java.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Ex57_HashSet {
public static void main(String[] args) {
	
	/*
	 
	 1. List
	 	- 순서가 있는 집합
	 	- 첨자(방번호)
	 	- 데이터 중복을 허용
	 	
	 	
	 	
	 2. Map
	 	- 순서가 없는 집합
	 	- 키(방이름)
	 	- 데이터 중복을 허용
	 	
	 	
	 	
	 3. Set
	 	- 순서가 없는 집합
	 	- 식별자가 없다.(방번호x , 방이름x) > 방을 구분 할 수 없다.
	 	- 데이터 중복을 허용하지 않음***
	 
	 
	 */
	 //m1();
	//m2();
	//m3();
	//m4();
	//m5();
	m6();
}//main

private static void m6() {
	HashSet<Integer> set = new HashSet<Integer>();
	
	
	Random rnd = new Random();
	
	while(set.size()<5) {
		int n = rnd.nextInt(10);
		set.add(n);
	}
	

	
}

private static void m5() {
	
	//***** 개념
	
	HashSet<Member> set = new HashSet<Member>();
	
	Member m1 = new Member("홍길동",20);
	set.add(m1);
	
	set.add((new Member("아무개",25)));
	set.add((new Member("강아지",4)));
	set.add((new Member("고양이",2)));
	
	System.out.println(set.add(m1));
	
	//m1에서 불린 값과 직접 홍길동을 넣은 값이 같은데 출력이 되는 이유
	//객체지향인 자바에선
	//객체가 구분되므로 m1의 홍길동과 new Member("홍길동",20) 주소값이 다름
	//new 작성할 때 인스턴스가 생성되므로 다름 
	set.add(new Member("홍길동",20)); //동일 인물로 처리하고 싶음 
	
	System.out.println(set);
	System.out.println();
	
	Member m2 = new Member("유재석", 50);
	Member m3 = new Member("유재석", 50);
	
	System.out.println(m2==m3); //사용x (진짜 메모리 주소 값 비교)
	System.out.println(m2.equals(m3)); //사용o
	//주소값 
	System.out.println(m2.hashCode());
	System.out.println(m3.hashCode());

	

}

private static void m4() {
	
	//마트 경품 추첨
	//- 중복 당첨 허용 
	// 중복 당첨 불허
	
	String[] list = {"홍길동","아무개","강아지","고양이","병아리","사자","호랑이","독수리","부엉이","까치","햄스터"};
	
	//List vs Set
	
	//중복 당첨 허용시
	Random rnd = new Random();
	
	ArrayList<String> result1 = new ArrayList<String>();
	for(int i=0; i<5; i++) {
	
	result1.add(list[rnd.nextInt(list.length-1)]);
	
	}
	System.out.println(result1);
	
	//중복 당첨 허용x
	
	HashSet<String> result2 = new HashSet<String>();
	while(result2.size()<5) {
	
	result2.add(list[rnd.nextInt(list.length-1)]);
	
	}
	System.out.println(result2);
}

private static void m3() {

	//case 2
	HashSet<Integer> lotto2 = new HashSet<Integer>();
	Random rnd = new Random();

	while(lotto2.size()<6) {
		int n = rnd.nextInt(45) + 1;
		lotto2.add(n);
		
	}
	
	
	System.out.println(lotto2);
	
//Colletction.sort(lotto2); , Map에선 안됨
//set > 변환 > list 반대로도 가능 
	
	ArrayList<Integer> lotto3 = new ArrayList<Integer>(lotto2);
	
	Collection.sort(lotto3);
	System.out.println(lotto3);
	
	
	
}

private static void m2() {
	
	//로또 번호 > 난수 + 유일 숫자들로만
	
	Random rnd = new Random();
	//case1.
	HashSet<Integer> lotto = new HashSet<Integer>();
	
	while(lotto.size()<6 ) {
		
		int n = rnd.nextInt(45) + 1;
	
		
	//set은 정렬 불가능 
	//기존 요소들과 중복 검사
	if(check(lotto,n)) {

		//i--;
	}else {
	
		lotto.add(n);
	}
	System.out.println(lotto);
	
	System.out.println(lotto);
	Collections.sort(lotto);
	System.out.println(lotto);
	System.out.println();
	}
	}	
//

private static void m1() {
	
	HashSet<String> set = new HashSet<String>();
	
	//1. 요소 추가
	set.add("사과");
	set.add("딸기");
	set.add("바나나");
	
	System.out.println(	set.add("딸기"));
	
	//2. 요소 개수
	System.out.println( set.size() );
	System.out.println(set);
	System.out.println();
	
	//3. 요소 읽기 > 방 구분 불가능 > 원하는 요소 추출 불가능
	//- 읽기 도구 제공(********)
	//iterator == 향상된 for문 
	Iterator<String> iter = (set.iterator());
	
	System.out.println(iter.hasNext()); // 다음 요소가 존재하는가 
	System.out.println(iter.next());
	
	System.out.println(iter.hasNext()); // 다음 요소가 존재하는가 
	System.out.println(iter.next());
	
	System.out.println(iter.hasNext()); // 다음 요소가 존재하는가 
	System.out.println(iter.next());
	

	System.out.println(iter.hasNext()); // 다음 요소가 존재하는가 -> false 없음
	
	while(iter.hasNext()) {
		System.out.println(iter.next());
	}
	
	//루프 종료 == iterator 모두 소비(끝까지 탐색) 1회용 도구 
	System.out.println();
	
	
	iter = set.iterator();
	
	System.out.println(iter.next());
	
	System.out.println();
	
	for(String item:set) {
		System.out.println(item);
	}
	
	
}

private static boolean check(ArrayList<Integer> lotto, int n) {
	
	for (int i=0; i<lotto.size(); i++) {
		if (lotto.get(i) == n) {
			return true;
		}
	}
	
	return false;
}

}