package com.test.java.openapi;

import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Ex72_JSON {
public static void main(String[] args) {
	

	
	
	
	 m1();
	 m2();
	
}//main

private static void m2() {

	
	Scanner scan  = new Scanner(System.in);
	
	System.out.println("1. 메모장");
	System.out.println("2. 그림판");
	System.out.println("3. 계산기");
	System.out.println("4. 크롬");
	System.out.println("선택: ");
	String sel = scan.nextLine();
	//외부 프로그램 실행
	try {
		
		ProcessBuilder builder = new ProcessBuilder();
		if(sel.equals("1")) {
		builder.command("notepad.exe","C:\\class\\code\\java\\javatest1\\src\\com\\test\\java\\openapi\\회원.txt");
		}
		if(sel.equals("2")) {
			builder.command("mspaint.exe");
		}
		if(sel.equals("3")) {
			builder.command("calc.exe");
		}
		if(sel.equals("4")) {
			builder.command("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe", "http://naver.com");
		}
		builder.start();
		
		
		
		
	} catch (Exception e) {
		System.out.println("Ex72_JSON.m2");
		e.printStackTrace();
	}
	
	
}

public static void m1() {
	
	/*
	 {
	 	"name" : "홍길동",
	 	"age" : 20,
	 	"nick": [ "강아지" , "멍멍이" , "고양이" ]
	 }
	 */
	String json ="""
	 			 {
	 	"name" : "홍길동",
	 	"age" : 20,
	 	"nick": [ "강아지" , "멍멍이" , "고양이" ]
	 			 }
	 		""";
	 try {
		 
		 JSONParser parser = new JSONParser();
		 
		 JSONObject obj = (JSONObject)parser.parse(json);
		 
		 String name = (String)obj.get("name");
		 System.out.println(name);
		 
		 long age = (Long)obj.get("age");
		 System.out.println(age);
		 
		 JSONArray nick = (JSONArray)obj.get("nick");
		 
		 for(Object n : nick) {
			 System.out.println(n);
			 
			 
		 }
	} catch (Exception e) {
		System.out.println("Ex72_JSON.main");
		e.printStackTrace();
	}
}
}
