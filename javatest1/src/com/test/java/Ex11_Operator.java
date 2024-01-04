package com.test.java;

public class Ex11_Operator {
	public static void main(String[] args) {

		//Ex11_Operator
		
		//연산자, Operator
		// 수학 연산자 > 프로그래밍 연산자
		// 피연산자를 대상으로 미리 정해진 연산(행동)을 한 후에 연산(행동)의 결과를 반환하는 역할
		// 주로 기호를 사용함 + 단어도 사용
		
		// 1. 문장, Statement
		// 2. 표현식, Expression
		// 3. 연산자, Operator
		// 4. 피연산자 Operand
		// 5. 연산자 우선 순위
		// 6. 연산자 연산 방향
		
		// 1. 문장, Statement
		// - 1개 이상의 표현식이 모여서 문장을 만든다.
		// ex) int sum = 10 + 20;
		
		
		
		// 2. 표현식 Expression
		// - 문장을 구성하는 최소 단위
		// ex) int sum
		// 10 + 20
		// sum = 30
		
		
		// 3. 연산자, Operator
		// + , = 
		
	
		//4. 피연산자 Operand
		// - 10, 20
		// = 연산자의 피연산자 sum, 30 
		
		
		
		// 5. 연산자 우선순위
		// - 하나의 문장에 속해있는 연산자들 중 누구를 먼저 실행해할지 정해져있는
		// 1+2 * 3 
		
		// 6. 연산자 연산 방향
		// - 하나의 문장에 속해있는 연산자들이 모두 연산자 우선 순위가 동일할 때 누구를 머넞 실행해할지 정해져있는 순서
		
		// 연산자 종류
		// 1. 행동(목적)
			// a. 산술 연산자
			// b. 비교 연산자
			// c. 논리 연산자
			//d : 대입 연산자
			//e : 증감 연산자
			// f. 조건 연산자
			// g. 비트 연산자
		
		
		// 2. 형태(피연산자 개수)
			// 1형 연산자 , 단항 연산자
			// 2항 연산자
			// 3항 연산자
		
		//산술 연산자
		// +,  -,  *,  /,  %(mod , 나머지)
		// 2항 연산자이기도 함
		// 피연산자를 숫자형을 가진다.(정수, 실수)
		
		int a = 10;
		int b = 3;
		
		System.out.printf("%d + %d = %d\n", a,b, a+b);
		System.out.printf("%d - %d = %d\n", a,b, a-b);
		System.out.printf("%d * %d = %d\n", a,b, a*b);
		System.out.printf("%d / %d = %d\n", a,b, a/b);
		System.out.printf("%d %% %d = %d\n", a,b, a%b); // %%를 통해 에러 수정 -> Escape
		
		
		double c = 10;
		double d = 3;
		
		System.out.printf("%.0f / %.0f = %f\n", c,d, c/d);
		
		//정수 / 정수 = 정수
		//실수 / 실수 = 실수
		// 정수 / 실수 = 실수
		// 실수 / 정수 = 실수
		
		
		// *** 모든 산술 연산자의 결과값의 자료형 > 두 피연산자의 자료형 중에서 더 크기가 큰 자료형으로 변환된다.
		
		System.out.println(10/3); // 정수 / 정수 = 3
		System.out.println(10.0 / 3.0); // 실수 / 실수 = 3.3333
		
		System.out.println(10.0 / 3); // 정수 / 실수 = 3.3333
		System.out.println(10 / 3.0); // 실수 / 정수 = 3.3333
	
	
	
	}
}
