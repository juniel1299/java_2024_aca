package com.test.java.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Ex71_File {
	private static String data;
	
	static {
		data = "C:\\class\\code\\java\\javatest1\\src\\com\\test\\dat\\data.txt";
	}
public static void main(String[] args) throws IOException {
	


	
	//파일 입출력
	//읽기
	//쓰기
	//수정하기(x) , 덮어쓰기만 존재 
	
	//m1();
	//m3();
	m4();
	
}//main

private static void m4() {
	// TODO Auto-generated method stub
	
	try {
		BufferedReader reader
		= new BufferedReader(new FileReader(data));
		String txt ="";
		String line = null;
		
		
		while((line = reader.readLine()) != null) {
				
				txt += line.replace("둘", "two") + "\r\n";
			
		}
		reader.close();
		System.out.println(txt);
		
		BufferedWriter writer = new BufferedWriter(new FileWriter(data));
		
		writer.write(txt);
		writer.close();
		System.out.println("complete");
		
		
	} catch (Exception e) {
		System.out.println("Ex71_File.m3");
		e.printStackTrace();
	}
}

private static void m3() throws IOException {
	
	BufferedReader reader
	= new BufferedReader(new FileReader(data));
	

	try {
		
		String txt ="";
		String line = null;
		while((line = reader.readLine()) != null) {
			if(!line.equals("셋")) {
				
				txt += line + "\r\n";
			}
		}
		reader.close();
		System.out.println(txt);
		
		BufferedWriter writer = new BufferedWriter(new FileWriter(data));
		
		writer.write(txt);
		writer.close();
		System.out.println("complete");
		
		
	} catch (Exception e) {
		System.out.println("Ex71_File.m3");
		e.printStackTrace();
	}
	
	
	
}

private static void m1() {
	
	try {
		BufferedWriter writer = new BufferedWriter(new FileWriter(data));
		
		
		writer.write("하나");
		System.out.println();
		writer.write("둘");
		System.out.println();
		writer.write("셋");
		System.out.println();
		writer.write("넷");
		System.out.println();
		writer.write("다섯");
		System.out.println();
		
		writer.close();
		
		
		System.out.println("complete");
	} catch (Exception e) {
		System.out.println("Ex71_File.m1");
		e.printStackTrace();
	}

	
	
}
}
