package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

public class Ex12_Operator {

	public static void main(String[] args) throws IOException {

		// Ex12_Operator

		// 비교연산자
		// >, >=, <, <=, ==(같다(Equals)), !=(다르다(not equals))
		// 2항 연산자
		// 피연산자들의 우위(동등) 비교
		// 피연산자는 숫자형을 가진다
		// 연산의 결과가 반드시 boolean 나옴 (true , false)

		int a = 10;
		int b = 3;

		System.out.printf("%d > %d =%b\n ", a, b, a > b);
		System.out.printf("%d >= %d =%b\n ", a, b, a >= b);
		System.out.printf("%d < %d =%b\n ", a, b, a < b);
		System.out.printf("%d <= %d =%b\n ", a, b, a <= b);
		System.out.printf("%d == %d =%b\n ", a, b, a == b);
		System.out.printf("%d != %d =%b\n ", a, b, a != b);

		System.out.println();

		// 요구사항) 사용자 나이 입력 > 18세 이상이면 통과, 미만 거절

		/*
		 * System.out.println("나이 입력: "); BufferedReader reader = new BufferedReader(new
		 * InputStreamReader(System.in)); //Ctrl + Shift + O
		 * 
		 * String input = reader.readLine();
		 * 
		 * int age = Integer.parseInt(input); // 문자 25 > 숫자 25
		 * 
		 * System.out.println(age >= 18); System.out.println();
		 */

		// == , != 연산자
		// 문자열 (참조형) 비교

		int n1 = 100;
		int n2 = 100;
		int n3 = 50;
		n3 = n3 + 50;

		System.out.println(n1 == n2);
		System.out.println(n1 != n2);
		System.out.println(n1 == n3);

		String s1 = "홍길동";
		String s2 = "홍길동";
		String s3 = "홍";
		s3 = s3 + "길동";
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println();
		// *** 문자열의 비교는 ==, != 즉 연산자 사용을 하면 안된다.
		// *** 문자열의 비교는 equals() 라는 메서드를 이용해야 함
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3)); // s1.equals(s3) 로 해야 문자열 비교가 가능

		System.out.println();
		System.out.println();
		System.out.println();

		// 논리 연산자
		// &&(and) , ||(or) , !(not)
		// 2항 연산자(&& , ||)
		// 1항 연산자 (!)
		// 피연산자의 자료형이 boolean 이다.
		// 연산의 결과 또한 boolean 이다.
		// 피연산자를 정해진 규칙에 따라 연산을 한 후에 값을 반환

		// A && B = ?
		// T && T , T && F, F && T, F && F > 1, 0, 0, 0

		// A || B = ?
		// T || T, T || F, F || T, F || F > 1, 1, 1, 0

		// !A = ?

		// !T , !F 부정연산자 > (결과) 0,1

		// 베타적 논리합 (xor)
		// A ^ B = ? 두개의 값이 다르면 true
		// T ^ T, T ^ F , F ^ T, F ^ F > 0, 1, 1, 0

		boolean f1 = true;
		boolean f2 = false;

		System.out.println(f1 && f2);
		System.out.println(f1 || f2);
		System.out.println(!f1);
		System.out.println(f1 ^ f2);

		// 나이 입력 > 18세 이상 + 60세 미만

		int age = 25;
		// System.out.println(18 <= age && age < 60);
		System.out.println((18 <= age) && (age < 60));
		System.out.println((age >= 18) && (age < 60)); // 가독성을 위해 주인공(변수)을 왼쪽

		// 연산자 우선 순서
		// 산술 연산자 > 비교 연산자 > 논리 연산자

		// 대입 연산자 , 할당 연산자
		// = , +=, -=, /=, %= (복합 대입 연산자)
		// Lvalue(변수) = Rvalue(상수 또는 변수)
		// Lvalue Rvalue 자료형이 동일해야한다. > 형변환
		// 대입 연산자는 모든 연산자들 중 우선 순서가 가장 낮다.
		// 대입 연산자는 연산 방향이 오른쪽 > 왼쪽으로 실행한다.

		int sum = 10 + 20 * 3; // 곱하기 > 더하기 > = , 곱하기 계산할 때 20 * 3만 보고 계산 > 10 + 60 으로 대체가 됨
		// 10 + 60 계산 > sum = 70 만 남음 > 70을 sum에 넣음

		System.out.println(sum);

		int m1 = 100;
		int m2;
		int m3;

		// m2 = m1;
		// m3 = m1;

		m3 = m2 = m1;
		// = 연산자는 오른쪽에서 왼쪽이기 때문에 가능함.
		System.out.println(m2);
		System.out.println(m3);

		int n = 10;

		// n에 1을 추가하시오 > n의 값에 1을 더한 값을 n에 다시 넣어라. > 누적
		n = n + 1;

		System.out.println(n);

		n += 5;

		System.out.println(n);
		n = n - 2;

		System.out.println(n);
		n -= 2;

		System.out.println(n);

		n *= 2;

		System.out.println(n);
		n /= 2;

		System.out.println(n);
		
		n%= 3; //

		System.out.println(n);
		
		
		// n = 10 + n; , n +=10; 은 되지만  n = 10 - n , n-=10; 을 할 경우 n-10 이기 떄문에 논리 에러 발생함. 
		
	
		
		//증감 연산자
			// ++(증가 연산자) , -- (감소 연산자)
			//1항 연산자
			// 피연산자는 숫자형을 가진다.
			// 누적 연산을 한다.
			// 기존의 값에 1을 더하거나, 1을 뺀다.
		
			// *** 연산자와 피연산자의 위치를 바꿀 수 있다.
			// ***** 연산자의 위치에 따라 연산자 우선 순위가 달라진다.
			// ++n : 전위배치 (전치)  > 연산자 우선 순위가 가장 높다.
			// n++ : 후위배치 (후치) > 연산자 우선 순위가 가장 낮음.
		
		n = 10;
		++n;
		n++;
		System.out.println(n);
		
		--n;
		n--;
		System.out.println(n);
		
		
		n = 10;
		int result = 0;
		//result = 10 + ++n;
		
		
		++n; //따로 작성 한 후
		result = 10 + n; // 가독성을 높이기 위해 이렇게 두 줄에 작성함. 
		System.out.println(result);
		
		n = 10;
		result = 0;
		
		result = 10 + n++;
		// 10 + n > 20 우선 계산 함 > result = 20 대입 > 이미 result에 값이 들어가 ++가 동작해도 반영 x > 20이 나옴 
		System.out.println(result); 
		
		System.out.println(n);
		
		int o = 10;
		System.out.println(--o-o--);
		System.out.println();
		
		// 조건 연산자 
		// ?:  3항 연산자 (유일한 3항 연산자) 
		// A ? B : C 의 형태 
		// A : boolean > 조건으로 사용
		// B , C : 상수 또는 변수 > 연산의 결과로 사용된다.
		// A 가 참이면 B를 반환, A가 거짓이면 C를 반환한다. 
		
		
		System.out.println(1 + 1);
		System.out.println(1243124+ 124568);
		
		System.out.println(true ? "남자" : "여자");
		System.out.println(false ? "남자" : "여자");
		
		age = 25;
		
		System.out.println(age >= 18 ? "통과" : "거절");
		
		n = 5;
		System.out.println(n % 2 == 0 ? "짝수" : "홀수");
		
		// 비트 연산자 (논리 연산자) 진짜 비트를 연산함. 
		a = 10;
		b = 5;
		System.out.println(a & b); // 10 > 1010 (2^3 + 2^1) , 5 > 0101 (2^2 + 2^0) 엔드이므로 1010 , 0101 비교 > 0000
		System.out.println(a | b); // 위에 숫자 계산 1111 > 8 + 4 + 2 + 1 = 15 
		
		
		
		
		
		
		// 템플릿 저장하는 법
		// window > 설정 > Editor temlate > 작성
	
	
	
	
	
	}
}
