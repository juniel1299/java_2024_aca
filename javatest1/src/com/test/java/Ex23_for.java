package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex23_for {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// Ex23_for
		/*
		 * 반복문 - 특정 코드 개발자가 원하는 횟수만큼 반복한다.
		 * 
		 * - 생산성 증가, 유지보수성 향상
		 * 
		 * for(초기식; 조건식; 증감식){ 구현부; }
		 */
		// m1();
		// m2();
		//m3();
		m4();
		//m5();
		//m6();
		//m7();
		//m8();
		//m9();
		//m10();
		//m11();
		//m12();
		//m13();

		/*
		 * hello(); hello(); hello(); hello(); hello();
		 */

	}// main

	
	
	private static void m13() throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		//요구사항)숫자 5개 입력 (1~10사이) > 가장 큰 수  ? 
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int max = 1; //입력 받을 숫자 중 가장 작은 숫자로 초기화
		int min = 10;
		for( int i=0; i<5; i++) {
			System.out.print("숫자: ");
			int num = Integer.parseInt(reader.readLine());
			
			if(num > max) {
				max = num;
			}
			if(num<min) {
				min = num;
			}
			
			
		}
		System.out.println("max: " + max);
		System.out.println("min: " + min);
		
		
	}



	private static void m12() {
		// TODO Auto-generated method stub
		//1 + 2 + 3 = 6 출력시
		int sum = 0;
		
		for (int i=1; i<=3; i++ ) {
			System.out.print(i + " + ");
			sum += i;
		}
		System.out.println("\b\b= " + sum);
	}



	private static void m11() {
		// TODO Auto-generated method stub
		
		//난수 만들기 
		// 임의의 수 만들기
		// 1.Math 클래스
		// 2.Random 클래스
		
		//System.out.println(Math.E);
		//random = 0이상 1미만 수 랜덤 
		
		
		for(int i=0; i<10; i++) {
			
			//가공
			//System.out.println((int)(Math.random()*10)); //0~9 사이 랜덤 
		//주사위(1~6
		
			//System.out.println((int)(Math.random()*6)+1); //1~6 사이 랜덤
			
			System.out.println((int)(Math.random()*4)+5); //5~8 사이 랜덤 
		
		
		
		}
	
	
	}



	private static void m10() {
		// TODO Auto-generated method stub
		//학교 > 선생님 + 학생 상담(30명)
		for(int i=1; i<=30; i++) {
			//반복문 탈출 조건
//			if(i>= 16) {
	//			break;
		//	}
			//반복문 특정 숫자 탈출 
			if(i==10 || i==12) {
				continue;
			}
			
			System.out.println(i + "번 학생 상담중..");
		}
		
	}



	//break > 현재 자신이 속한 제어문을 탈출
	//단 if문 제외하고 탈출함
	//continue문 > 이번 반복을 중단하고 다시 시작으로 이동해라
	
	//break > 루프 완전 중단
	//continue > 이번만 건너뛰기 
	
	private static void m9() {
		// TODO Auto-generated method stub
		for(int i=1; i<11; i++) {
			if(i==5) {
				break;
			}
			
			System.out.println(i);
		
		
		}
		System.out.println();
	//1~4까지 실행 , 5 되면 다시 for문에 감 -> 증감식 만나 6 출력 [5가 안나옴]	
		for(int i=1; i<11; i++) {
			if(i==5) {
				continue;
			}
			
			System.out.println(i);
		
		
		}
		System.out.println();
	}

	private static void m8() throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		//무한루프 , Infinite loop
		//1. 사용자 실수
		//2. 사용자 의도 > 일부러 
		
		//21억 회전 
		//for(int i=0; i<10; i--) {
		//	System.out.println("실행문");
		//}
		
		//무한 루프 생성하기
		/*
		for(int i=0; ; i++) {
			System.out.println("설명문");
		}
		*/
		/*
		 		for(int i=0; true; i++) {
			System.out.println("설명문");
		}
		 */
		/*
		for (;;) {
			System.out.println("실행문");
		}
		*/
		
		
		//회전을 몇번할지 모를때? > 무한루프 
		
		//사용자 숫자 입력 > 합?
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int sum = 0;
		
		for(;;) {
		System.out.print("숫자: ");
		int num = Integer.parseInt(reader.readLine());
		if(num ==0) {
			break;
		}
		sum += num;
		}
		System.out.println(sum);
		
		
	}

	private static void m7() throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		//요구사항) 구구단 출력
		
		// 요구사항) 사용자가 원하는 단 출력
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		//단 입력 받을 변수
		int firstNumber =0;
		//라벨 + 계산  + 출력 
		System.out.print("숫자(단): ");
		 firstNumber = Integer.parseInt(reader.readLine());
		for(int i=1; i<10; i++) {
			System.out.printf("%d * %d = %2d\n",firstNumber,i,firstNumber*i);
		}
		
		
	}

	private static void m6() throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		//요구사항 ) 사용자가 입력한 숫자들의 합 
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int sum = 0;
		for(int i=0; i<10; i++) {
			System.out.print("숫자: ");
			int num = Integer.parseInt(reader.readLine());
			sum += num;
		}
		System.out.println(sum);
	}

	private static void m5() throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		//요구사항 ) 1~ 사용자가 입력한 숫자까지 합
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	System.out.print("숫자: ");
	
	int num = Integer.parseInt(reader.readLine());
	int sum =0;
	for(int i=1; i<=num; i++) {
	sum += i;
	}
	System.out.println(sum);
	}

	private static void m4() {
		// TODO Auto-generated method stub
		//요구사항) 1~10까지의 합 
		int sum =0;
		
		//sum = 1+2+3+4+5+6+7+8+9+10 ;
		//System.out.println(sum);
		
		
		for(int i=1; i<11; i++) {
		sum +=i;
		
		}System.out.println(sum);
	}

	private static void m3() {
		// TODO Auto-generated method stub
		// 반복문 > 루프 변수**
		// 요구사항 ) 숫자 1~10까지 출력

		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
		System.out.println("6");
		System.out.println("7");
		System.out.println("8");
		System.out.println("9");
		System.out.println("10");
		System.out.println();

		int num = 1;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;

		num = 1;

		for (int i = 0; i < 10; i++) {
			System.out.println(num);
			num++;
		}
		System.out.println();

//루프 변수 > 원하는 수열을 제공
		for (int i = 1; i < 11; i++) {
			System.out.println(i);
		}
		System.out.println();

		for(int i=1; i<11; i+=2) {
			
			System.out.println(i);
			
		}
		System.out.println();
		
		for(int i=2; i<11; i+=2) {
			System.out.println(i);
		}System.out.println();
	
	for(int i=7; i<100; i+=7) {
		System.out.println(i);
	}System.out.println();
	
	
	
	}

	private static void m2() {
		// TODO Auto-generated method stub

		// 반복문 > 회전수 제어
		// i: 루프변수
		for (int i = 1; i <= 5; i++) {

			System.out.println("실행문");

		}
		System.out.println("");
		for (int i = 5; i <= 5; i++) {

			System.out.println("실행문");
		}
		System.out.println("");
		for (int i = 10; i >= 6; i--) {

			System.out.println("실행문");
		}
		System.out.println("");

		// 가장 보편적인 형태
		for (int i = 0; i < 5; i++) {
			System.out.println("실행문");
		}
		System.out.println("");

	}

	private static void hello() {
		// TODO Auto-generated method stub
		System.out.println("안녕하세요.");
	}

	private static void m1() {
		// TODO Auto-generated method stub
		// 요구사항 ) 안녕하세요 * 5 회 출력

		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");

		System.out.println();

		// 순서
		// 1. int i=1; > 초기식 실행 (i 변수 선언)
		// 2. i <=5 , i가 5보다 작다면
		// 3. 구현부 실행
		// 4. i++ , 증감식 i를 증가 시켜라
		// 5. i<=5 ; i가 5보다 작으면
		// 6. 구현부 실행
		// 7. i++
		// 8 i<=5; i가 5보다 작으면
		// 9. 구현부 실행
		// 10. i++
		// 11. i<=5 i가 5보다 작으면
		// 12. 구현부 실행
		int i = 0;
		for (i = 1; i <= 5; i++) {
			System.out.println("안녕하세요");
		}

	}
}
