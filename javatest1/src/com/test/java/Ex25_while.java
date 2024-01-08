package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex25_while {
// Ex25_while
	public static void main(String[] args) throws IOException {
		
		/*
		 while문 , do while문 //반복문
		 
		 while(조건식){ 
		 구현부;
		 }
		 
		 if(조건식){
		 구현부;
		 }
		
		 do while(조건식) //머리부분에 있던 do while 이 몸통 부분으로 이동 > while 됨
		 //구현을 먼저하고 조건을 따짐 > 조건 만족시 다시 구현부부터
		  
		  반복문
		 1. for
		 2. while
		 3. do while
		 4. for
		  
		  
		  
		  /*
		 do
		 {
			구현부;
		 }while (조건식);
		 
		 
		 */
		
		
		//m1();
		//m2();
		//m3();
		m4();
		
	}//main

	private static void m4() {
	// TODO Auto-generated method stub
	//1~10 출력
		//while문 
		int n = 11;
		while(n<=10) {
			System.out.println(n);
			n++;
		}
		System.out.println();
		
		//do while문 
		int m = 11;
		do {
			System.out.println(m);
			m++;
		}while(m<=10);  //조건보다 구현부가 먼저 있기 때문에 숫자가 출력되고 while을 나감 
		
		
}

	private static void m3() throws IOException {
	// TODO Auto-generated method stub
	
		
		//자판기
		//루프 > 메뉴출력 > 음료선택 > 결과 * N 
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		boolean loop = true;
		String sel = "";
		
		while(loop) { //for(; loop;) 해도 됨 
			System.out.println("===============");
			System.out.println("    자판기");
			System.out.println("===============");
			System.out.println("1.   콜라");
			System.out.println("2.   사이다");
			System.out.println("3.   박카스");
			System.out.println("4.   종료");
			System.out.println("------------------");
			
			System.out.print("선택: ");
			sel = reader.readLine();
			
			if(sel.equals("1")){
				System.out.println("700원입니다.");
			
			parse(reader);
			
			} else if (sel.equals("2")) {
				System.out.println("600원입니다. ");
				parse(reader);
			}else if (sel.equals("3")) {
				System.out.println("500원입니다.");
				
				parse(reader);
			}else {
			//while문 탈출 >종료
				loop = false;
			}
			
			
		}//while
		System.out.println("자판기 종료");
}//m3

	private static void parse(BufferedReader reader) throws IOException {
		System.out.println("계속하려면 엔터를 입력하세요..");
		reader.readLine(); //일시중단
	}

	private static void m2() {
	// TODO Auto-generated method stub
		int sum =0;
		
		for(int i=0; i<=100; i++) {
		sum +=i;
		
	}
		System.out.println(sum);
		
		sum=0;
		int num = 0;
		
		while(100>=num) {
			sum +=num;
			num++;
			
		}
		System.out.println(sum);
	
	}
	
	

	private static void m1() {
		// TODO Auto-generated method stub
		//요구사항 ) 1~10까지 출력하시오.
		//for문
		int num = 1;
		for(int i=1; i<=10; i++) { 
			System.out.println(i);
		}
		System.out.println();
	
		//while 문 
		while(num<=10) { //조건식
			System.out.println(num);
			num++; //증감식
			
		}
		
		for(;;) {
			System.out.println("무한 루프");
		}
		
		/*
		while () { 
			System.out.println("무한루프");
		}
		*/
		
		
		
		
	}
	
	
}
