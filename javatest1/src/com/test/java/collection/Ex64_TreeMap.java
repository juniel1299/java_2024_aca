package com.test.java.collection;

import java.util.TreeMap;

public class Ex64_TreeMap {
public static void main(String[] args) {
	
	
	/*
	 
	 TreeMap 
	 - 이진 탐색 트리 > 내부 정렬
	 - 키 + 값
	 
	 */
	
	TreeMap<String, String> map = new TreeMap<String, String>();
	map.put("white", "흰색");
	map.put("black", "검정색");
	map.put("red", "빨간색");
	map.put("blue", "파란색");
	map.put("yellow", "노랑");
	
	//key 순으로 정렬
	System.out.println(map);
	
	System.out.println(map.get("white"));
	
	System.out.println(map.firstKey());
	System.out.println(map.lastKey());
	
	System.out.println(map.firstEntry());
	System.out.println(map.lastEntry());
	
	System.out.println(map.headMap("m"));
	System.out.println(map.tailMap("n"));
	System.out.println(map.subMap("r", "w"));
	
}
}
