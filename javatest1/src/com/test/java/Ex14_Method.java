package com.test.java;

public class Ex14_Method {
//main 메서드
//특수 메서드
//이름이 예약된 메서드(main)
//프로그램이 시작되면 자동으로 호출되는 메서드 > main()
	// 프로그램의 시작점 (entry point)
	// 프로그램의 종착점(End Point)
	
	public static void main(String[] args) {
		
		// 메서드 선언 위치
		// 클래스 내부
		// 메서드의 순서는 무관
		
		// 메서드 , Method
		// 코드의 집합
		// 같은 목적을 가진 코드의 집합	
		// ** 코드 재사용의 단위
		
		//메서드 사용 목적?
		// 1. 코드의 재사용
		// 2. 코드의 관리(가독성)
		
		//메서드 사용 단계
		// 1. 메서드 선언
		// 2. 메서드 호출(사용)
		
		
		//메서드 호출
		hello();
		hello();
		hello();
		hello();
		hello();
		
		
		//Case A.
		//가장 단순한 방법
		//Ctrl C,V > 하드코딩
		// 비용 10 * 5 = 50 

		printnumber();
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		printnumber();
	

	
	
	
	
	
	}
	// 메서드 선언
	//메서드 헤더 (header), Signature(서명)
	// 접근 지정자 , 정적키워드    반환타입  메서드명		인자리스트
	// public          static      void 	hello		()
	// 몸통 (body) ,구현부
	//{코드 작성}
	
		//hello 라는 메서드를 선언한다.
public static void hello() {
	
	//구현부 > 메서드가 하려는 업무
	System.out.println("반갑습니다.");
	
	
	
	
}
public static void printnumber(){
	System.out.println("하나");
	System.out.println("둘");
	System.out.println("셋");
	System.out.println("넷");
	System.out.println("다섯");
	System.out.println("");
	System.out.println("");
}


}