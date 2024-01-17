package com.test.java.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Ex56_HashMap {
public static void main(String[] args) {
	
	/*
	 
	 List > ArrayList
	 Map > HashMap
	 
	 ArrayList
	 	- 요소 접근 > 첨자(index) 사용 > 방번호
	 	- 순서가 있는 집합 (방번호 == 요소의 순서)
	 	ex) 1강의실, 2강의실, 3강의실 
	 	- 스칼라 배열(scala array)
	 	- 요소 = 첨자(index) + 값(value)
	 	- 첨자(index)는 유일하다.
	 	- 값(value)는 중복 가능 > 방번호가 유일하니까 값은 중복되어도 
	 	
	 HashMap
	 	- 요소 접근 > 키(key) 사용 > 방이름
	 	- 순서가 없는 집합 
	 	ex) 햇님반, 달님반
	 	- 연관 배열, 사전 구조(Dictionary)
	 	- 요소 = 키(key) + 값 (value)
	 	- 키(key)는 유일하다
	 	- 값(value)은 중복 가능 
	 
	 */
	
	
	//m1();
	//m2();
	m3();
	
	
}//main

private static void m3() {
	
	HashMap<String,String> map = new HashMap<String, String>();
	
	
	map.put("red", "빨강");
	map.put("yellow", "노랑");
	map.put("blue", "파랑");
	
	//loop 탐색 , Set과 Collection을 통해 탐색 가능 
	Set<String> keys = map.keySet(); //키만 들어감 
	System.out.println(keys);
	
	for(String item : keys) {
		System.out.printf("map.get(%s) = \"%s\"\n",item,map.get(item));
	}
	
	Collection<String> values = map.values(); //값만 들어감 
	System.out.println(values);
	for(String item: values) {
		System.out.println(item);
	}
	
}

private static void m2() {
	
	HashMap<String,String> map = new HashMap<String, String>();
	
	//1. 요소 추가
	
	map.put("red", "빨강");
	map.put("yellow", "노랑");
	map.put("blue", "파랑");
	
	//2. 요소 개수
	System.out.println(map.size());
	
	
	//3. 요소 읽기
	System.out.println(map.get("red"));
	System.out.println(map.get("yellow"));
	System.out.println(map.get("blue"));
//System.out.println(map.get("green")); null이 나옴 
	
	//4. 요소 수정 
	map.put("blue", "퍼렁"); //덮어쓰기
	System.out.println(map);
	
	//5. 요소 삭제
	map.remove("blue");
	System.out.println(map);
	
	//6. 검색
	System.out.println(map.containsKey("red"));
	System.out.println(map.containsValue("빨강"));
	
	//7. 초기화
	map.clear();
	System.out.println(map);
	
	
	
	
}

private static void m1() {
	
	//학생 1명의 국어, 영어, 수학 점수 저장 
	//1. 배열
	//2. ArrayList
	//3. HashMap
	//4. Class
	
	//1. 배열
	
	
	//몇번째 방이 어떤 것을 의미하는지를 알 수 없음 
	int[] s1 = new int[3];
	
	s1[0] = 100; //국
	s1[1] = 90; //영
	s1[2] = 80; //수
	
	System.out.println(s1[0] + s1[1] + s1[2]);
	
	//ArrayList
	
	ArrayList<Integer> s2 = new ArrayList<Integer>();
	
	s2.add(100);
	s2.add(90);
	s2.add(80);
	System.out.println(s2.get(0) + s2.get(1) + s2.get(2));
	
	
	//3. Class 
	
	//집합
	//방번호 대신 이름 사용 > 가독성 높아짐
	//클래스 선언 비용 발생
	
	Score s3 = new Score(100, 90, 80);
	System.out.println(s3.getTotal());
	
	//4. HashMap
	//집합
	//방번호 대신 이름 사용 -> 가독성 높음 
	//1회용 객체를 만들 때 사용 , 틀이 필요 없음 -> 양이 많아지면 실수 할 확률 높아짐 
	HashMap<String, Integer> s4 = new HashMap<String, Integer>();
	
	s4.put("kor", 100);
	s4.put("eng", 90);
	s4.put("math", 80);
	
	System.out.println(s4.get("kor"));
	System.out.println(s4.get("eng"));
	System.out.println(s4.get("math"));

	System.out.println(s4.get("kor")+s4.get("eng")+s4.get("math"));
	
	
	
	
	
}
}
class Score{
	
	public int kor;
	public int eng;
	public int math;
	public Score() {
		this.kor =0;
		this.eng = 0;
		this.math = 0;
	}
	
	
	
	public Score(int kor, int eng, int math) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}



	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	
	public int getTotal() {
		return this.kor + this.eng + this.math;
	}
	
	
}