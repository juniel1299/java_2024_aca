package com.test.java.obj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class Ex53_Exception {
	public static void main(String[] args) {

		/*
		 
		 예외, Exception
		 런타임 오류
		 컴파일 발견(X) > 실행 중 발견(O)
		 개발자 미리 예측해야 함  > 사전 조치 필요
		 
		 예외처리 Exception Handling
		 1. 제어문 사용 
		 
		 2. 전용 처리 구문 > try catch 문
		 
		 *** try문 > 감시  > 에러가 발생하는지 계속 검사
		 *** catch문 > 예외처리
		 ***** if는 에러가 나기전에 else 로 넘겨버림 (선 조건 후 실행)
		 ***** try는 실행을 하다 중간에 에러가 나면 catch로 넘김 (선 실행 후 조건) , 
		 //프로그램을 중단하지 않고 예외처리 후  이어감 
		 
		 
		 
		 
		 */
		
		//m1();
		//m2();
		//m3();
		//m4();
		try {
			//m5();
			//m6();
		} catch (Exception e) {

		}
		//m7();
		
		
		
		
		
	}// main

	private static void m7() {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			System.out.print("입력: ");
			
			
			int input =Integer.parseInt(reader.readLine()); 
			
			System.out.println(124); //없어도 동작은 됨 (에러가 아예 뜨지 않아 찾을 수 없음)
			
			System.out.println("종료");
		} catch (Exception e) {
			System.out.println("Ex53_Exception.m7");
			e.printStackTrace();
		}
		
		
		
	}

	private static void m6() throws IOException {
		//Wrapping Class
		BufferedReader reader 
					= new BufferedReader(new InputStreamReader(System.in));
		
		String input = reader.readLine();
		
	
	
	
	}

	private static void m5() throws Exception {
	
		//예외 미루기 , throws Exception , m5를 호출한 메인 메서드에게 미룸 
		//특정 메서드에 발생한 예외를 해당 메서드가 직접 처리하지 않고 
		//그 예외 처리의 책임을 메서드를 호출한 쪽으로 넘기는 기술
		//사소한 에러는 기존 방식 , 일괄적으로 해결해야 할 에러는 throws로 메인에서 해결 , 컨트롤 쉬움
		int n = 0;
		System.out.println(100/n);
		
		
		
		
	}

	private static void m4() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자: ");
		int num = scan.nextInt();
		
		try {
			//비즈니스 코드 영역
			System.out.println(100/num);
			
		} catch (Exception e) {
			//예외 처리 영역
			System.out.println("예외 처리");
		} finally {
			//자원 해제 영역
			//성공 실패 무관하게 무조건 실행하는 영역
			//사용한 것들을 정리하는 코드들을 많이 사용
			//return을 찍어도 실행을 무조건 함 
			System.out.println("Finally");
			scan.close(); //자원 해제 > Clean-up Code
		}
	}

	private static void m3() {
		
		// 위에서 오류가 발생하여 밑에 2 문제 무시하고 catch로 넘어감
		try {
		
		int num = 0;
		System.out.println(100 / num); // 에러 발생시 new ArithmeticException() 생성함 
		
		
		
		int[] nums = {10, 20, 30};
		System.out.println(nums[5]);
		
	
		
		Random rnd = null;
		
		System.out.println(rnd.nextInt());
		} 
		
		

		
		//다중 캐치문 
		//
		// 예외처리를 앞에서부터 하기 때문에 Arithmetic이 우선순위 (Exception이 못 잡음)
	catch(ArithmeticException e) { 
			System.out.println("0입력 > 김대리 연락");
		} 
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("첨자 오류 > 박과장 연락");
		} 
		catch(NullPointerException e) {
			System.out.println("널 > 최대리 연락");
		}
		
		catch(Exception e) { // null array arithmetic의 부모 클래스이므로 모두 받을 수 있음
//			System.out.println(e.getMessage()); //어떤 이유로 에러가 나는지 확인 
//			if(e.getMessage().equals("aa"))
			System.out.println("예외 처리");
		}
		
	}

	private static void m2() {
		int num = 0;
		
		try {
		System.out.println(100 / num);
		} catch(Exception e) {
			System.out.println("0으로 나누기 > 김대리 연락");
		}
		
		try {
		int[] nums = {10, 20, 30};
		System.out.println(nums[5]);
		} catch(Exception e) {
			System.out.println("배열 첨자 오류 > 박과장 연락");
		}
	
		
		try {
		Random rnd = null;
		
		System.out.println(rnd.nextInt());
		}catch(Exception e){
			System.out.println("널 참조 > 최대리 연락");
		}
		
	}

	private static void m1() {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자: ");
		int num = scan.nextInt();
		
		//예외 조건 
		if(num>0) {
		//비즈니스 코드(업무 코드)

		System.out.printf("100 / %d = %d\n", num, 100 / num);

		} else {
			//예외 처리 코드
			System.out.println("0 보다 큰 값을 입력하시오");
		}
		
		try {
			//비즈니스 코드(업무 코드)
			System.out.println(111);
			System.out.printf("100 / %d = %d\n", num, 100 / num);
			System.out.println(222);
		} catch(Exception e){
			//e : 예외 객체
			// - 발생한 예외에 대한 여러가지 정보를 제공하는 객체
			//e.getMessage()를 통해 에러메세지를 간결하게 볼 수 있음
			e.printStackTrace(); // 예외처리 후 에러 메세지를 띄우고 이후 계속 실행 
			
			// 예외 처리 코드
			System.out.println("0 보다 큰 값을 입력하시오");
		}
System.out.println("종료");
		
	}
}
