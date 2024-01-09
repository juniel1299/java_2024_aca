package com.test.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
//Ex28_Scanner

public class Ex28_Scanner {

	public static void main(String[] args) {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		
		Scanner Scan = new Scanner(System.in);
		/*
		//문자 입력
		System.out.print("입력: ");
		String line = Scan.nextLine(); //reader.readLine();
		System.out.println(line);
		
		//자료형별로 입력받는 메서드 제공
		System.out.println("숫자: ");
		int num = Scan.nextInt();
		System.out.println(num + 10);
		
		System.out.println("숫자: ");
		num = Scan.nextInt();
		System.out.println(num + 10);
		
		Scan.skip("\r\n");
		
		Scan.nextLine();
		
		System.out.print("입력: ");
		line = Scan.nextLine(); // nextLine 쓰면 엔터를 지움 -> nextInt의 엔터 안 지움 -> 연결해서 못 씀 
		System.out.println("마지막"+line);  //그러므로 임의로 지워야함  scan.nextLine(); 한번 쳐서 지워줘야함
											// 또는 scan.skip("\r\n"); 이용
		*/
	
		/*
	System.out.print("입력: ");
	//String txt = Scan.nextLine(); // 한 줄을 가져옴
	String txt = Scan.next(); // 띄어쓰기 하면 이후 단어는 못 가져옴 ,ex) A B C 쓰면 next next next 해서 다 가져올 수 있음 (버퍼에 남아서) 
	System.out.println(txt);
	
	*/
	
		System.out.print("입력: ");
		
		String txt = "";
		while(Scan.hasNext()) {// 입력 버퍼 안에 단어가 있는지 확인함, 남아있으면 true , 없으면 false
		 txt = Scan.next();	
		 System.out.println(txt);
			
		}
		System.out.println("종료");
		
		
	
	
	}//main
	
	
	
	
	
	
}
