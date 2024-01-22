package com.test.java.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Ex63_TreeSet {
public static void main(String[] args) {
	
	/*
	 
	 컬렉션 이름
	 
	 물리구조 + 사용법(인터페이스)
	 
	 Array	+ List
	 Linked	+ List
	 
	 Hash 	+ Set
	 Tree	+ Set
	 
	 Hash	+ Map
	 Tree	+ Map
	 
	 
	 TreeSet
	 - 순서가 없다
	 - 중복값을 가지지 못한다.
	 - 이진 탐색 트리 구조 Binary Search Tree
	 - 내부 데이터가 정렬이 되어 있는 구조로 저장 
	 */
	
	TreeSet<Integer> set = new TreeSet<Integer>();
	

	set.add(1);
	set.add(5);
	set.add(4);
	set.add(3);
	set.add(7);
	set.add(8);
	set.add(9);
	set.add(2);
	set.add(6);
	set.add(10);
	
	System.out.println(set);
	
	//범위 관련 기능 제공 (List 계열도 가능함) , HashSet은 없음 
	System.out.println(set.first()); //제일 작은 값
	System.out.println(set.last()); // 제일 큰 값
	System.out.println(set.headSet(3)); // 3 이전에 나오는 데이터를 확인
	System.out.println(set.tailSet(7)); // 7 포함 7이후까지 나옴 
	System.out.println(set.subSet(3, 7)); //범위 안의 숫자
	
	//HashSet , TreeSet 모두 iterator , 향상된 for문으로 탐색 가능 
	
	Iterator<Integer> iter = set.iterator();
	
	while(iter.hasNext()) {
		System.out.println(iter.next());
	}

	System.out.println();
	
	for(int n : set) {
		System.out.println(n);
	}
	
	//Set 사용
	// HashSet , TreeSet > HashSet이 대부분 
	//Hash가 속도가 더 빠름 
	
}//main
}
