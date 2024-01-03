package com.test.java;

public class Ex03_Variable {

	public static void main(String[] args) {
		
		//Ex03_Variable.java
		
		// 모든 자료형 + 변수 생성하기
		
		//정수
		
		byte b1;
		b1 = 100; // 100 > 상수 (=데이터) > 정수형 상수, 정수형 리터럴
		System.out.println(b1);
		
		// type mismatch : cannot convert from int to byte
		//b1 = 128;
		
		b1 = Byte.MAX_VALUE; // JDK에서 제공하는 상수
		System.out.println(b1);
		
		b1 = Byte.MIN_VALUE;
		System.out.println(b1);
		
		short s1;
		s1 = 100;
		System.out.println(s1);
		
		s1 = 128;
		System.out.println(s1);
		
		s1 = Short.MAX_VALUE;
		System.out.println(s1);
		
		s1 = Short.MIN_VALUE;
		System.out.println(s1);
		
		int n1;
		n1 = 100;
		System.out.println(n1);
		
		n1 = Integer.MAX_VALUE;
		System.out.println(n1);
		
		n1 = Integer.MIN_VALUE;
		System.out.println(n1);
		
		long l1;
		l1 = 100;
		System.out.println(l1);
		
		
		// the literal 3000000000 of type int is out of range
		// l1 = 3000000000; 
		// 오류 해결방법
		l1 = 3000000000L; // long은 8칸 int는 4칸이므로 칸이 모자르므로 L을 붙여 처음부터 8칸을 생성하여 맞춰줌
		System.out.println(l1);
		
		
		l1 = Long.MAX_VALUE;
		System.out.println(l1);
		
		l1 = Long.MIN_VALUE;
		System.out.println(l1);
		
		// LValue와 RValue는 반드시 자료형이 동일해야 한다.
		//왼쪽(변수) = 오른쪽(상수); 
		//LValue = RValue;
		
		// 모든 상수들도 자료형을 가진다.
		
		//*정수형 상수는 int 타입이다*
		// 운영 체제가 한번에 처리하는 데이터의 양이 int가 된다.
		
		// 100은 자료형이 뭔지?
		/*
		 b1 = 100; //byte = int
		 s1 = 100; //short = int
		 n1 = 100; // int = int 
		 l1 = 100; // long = int -> int는 4칸을 잡는데 long은 8칸이므로 long 기준으로 칸이 모자름 -> 처음부터 8칸을 받아야함
		 System.out.println(100);  
		
		 */
		
		
		// 실수
		
		//단정도형
		float f1;
		//Description	Resource	Path	Location	Type
		//Type mismatch: cannot convert from double to float	Ex03_Variable.java	/JavaTest/src/com/test/java	line 91	Java Problem
		// 오류 이유 : 실수형 상수는 double 타입이므로 float에서는 오류가 발생함.
		// f1 = 3.14;
		f1 = 3.14f; //뒤에 f를 붙여야함.
		System.out.println(f1);
		//배정도형
		double d1;
		d1 = 6.28;
		System.out.println(d1);
		
		//차이점
		// double에 비해 float이 받을 수 있는 범위가 좁아 중간에 버려야함 . (일반 정밀도)
		f1 = 123.123456789012345678901234567890F;
		d1 = 123.123456789012345678901234567890D;
		
		System.out.println(f1);
		System.out.println(d1);

		
		//받을 수 있는 범위가 좁아 버리고 자릿수만 표기하여 10^28으로 대체함
		f1 = 12345678901234567890123456789F;
		d1 = 123456789012345678901234567890D;
		
		System.out.println(f1);
		System.out.println(d1);
	
		System.out.println(Float.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		
		double d2 = 0.2;
		double d3 = 0.1;
		System.out.println(d2 + d3);
		
		
		// 0.2 x 10 = 2
		// 0.1 x 10 = 1 
		// 2 + 1 
		// 3 /10 = 0.3 으로 해야함 [ 오차 범위가 존재하기 때문에 정수로 바꾼 후 다시 나눠야함]
	
	//문자형
		char c1;
		
		c1 = 'A'; //홀따옴표 > 문자형 상수(리터럴)
		System.out.println(c1);
		
		c1 = '@';
		System.out.println(c1);
		
		//문자로서의 1임
		c1 = '1';
		System.out.println(c1); 
		
		// char 글자 1개만 넣을 수 있음, invalid character constant
		// c1 = '홍길동';
		// System.out.println(c1);
		
	//논리형
		//boolean(불리언), bool(부울)
		boolean flag;
		
		flag = true; //논리형 상수(리터럴)
		flag = false;
		
		System.out.println(flag);
		
		
		//추가 
		//- 참조형 (클래스)
		
		//String , 문자열
		//- 문자 열 > 문자들이 열을 지어 있는 형태 > 문자 집합 > char를 여러개 모아둔 자료형
		
		//홍길동 
		//char name1 = '홍';
		//char name2 = '길';
		//char name3 = '동';
		
		String name;
		name = "홍길동";
		System.out.println(name);
		
		String m3=""; //0개의 문자열 > 빈문자열, Empty String > 문자열 변수 초기화할 때 사용\
		
		//값형(기본형,원시형) vs 참조형
		// 메모리의 생성되는 규칙이 다르다.
		// Stack , Managed Heap 
		// * Stack : 우리가 만드는 모든 변수는 Stack에 생성된다.
		// 참조형의 경우 Heap에 생성됨 , 
		// 참조형은 heap에 생성되기 때문에 변수(Stack)에 넣기 위해선 주소를 변수에 넣음 > 참조
		// 값형(공간 자체에 값이 들어있음) , 참조형 (공간 자체에 heap 위치 주소가 들어있음 (heap 주소))
		// 그러므로 String 쓸 땐 ""; 가 가능하지만 int는 "";가 안됨 .
		// String은 참조형으로 Stack에 주소만 들어가고 int는 값형으로 실제 값이 들어가야하므로
		// null > null 상수
		
		int a = 10; //값형
		String b = "홍길동"; //참조형 
		
		//각 자료형별(기본형8개,자료형1개) > 변수 1개 생성 > 값을 대입 > 출력
		// 10번씩
		
		//샘플
		// 1. 데이터 선정
		// 2. 1의 데이터를 저장할 자료형 선택 (범위 + 형태)
		// 정수 + 실수 -> float/double > 선택
		// 3. 변수 생성 + 초기화 
		// ex : float myWeight;
		// myWeight = 75.2F;
		// 4. 마무리 > 문장을 생성해서 출력
		// 
		// System.out.println(myWeight);
		
	}
}
