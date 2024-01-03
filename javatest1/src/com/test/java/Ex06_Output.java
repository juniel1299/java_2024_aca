package com.test.java;

public class Ex06_Output {

	public static void main(String[] args) {

		// Ex06_Output.java

		// 콘솔 입출력 , Console Input Output > IO
		// 기본 입력 장치 : 키보드
		// 기본 출력 장치 : 모니터

		// 콘솔 출력
		// 클래스.필드.메서드(인자 or 파라미터);
		// 1. System.out.println(값);
		// println 메서드
		// print + line > 값을 행단위로 출력한다. > 값을 출력한 뒤 엔터를 친다.

		System.out.println(100);
		System.out.println(200);
		System.out.println(300);

		// 2. System.out.print(값);
		// print 메서드
		// 값을 출력하고 엔터를 안친다.

		System.out.print(100);

		System.out.print(200);

		System.out.print(300);

		// 성적표 출력하기

		String name1 = "홍길동";
		int kor1 = 100;
		int eng1 = 90;
		int math1 = 80;

		String name2 = "아무개";
		int kor2 = 95;
		int eng2 = 98;
		int math2 = 87;

		System.out.println("\n===============================");
		System.out.println("           성적표");
		System.out.println("===============================");

		System.out.println("[이름]\t[국어]\t[영어]\t[수학]");
		System.err.println("===============================");
		System.out.print(name1);
		System.out.print("\t");
		System.out.print(kor1 + "\t");
		System.out.print(eng1 + "\t");
		System.out.print(math1 + "\r\n");

		System.out.println(name2 + "\t" + kor2 + "\t" + eng2 + "\t" + math2);

		// 3. System.out.printf(값);
		// printf 메서드
		// print format > 출력 형식을 제공한다.
		// String.format() 메서드와 동일

		System.out.println();
		System.out.println();
		System.out.println();

		// printf()
		// 형식 문자(PlaceHolder) 제공
		// 가독성 향상(***)

		// 1. %s > String
		// 2. %d > Decimal (정수) > byte, short , int , long
		// 3. %f > float (실수) > float , double
		// 4. %c > char
		// 5. %b > Boolean

		// 요구사항) "안녕하세요. 홍길동님" 문장을 출력하시오.
		String name = "홍길동"; // 사용자가 키보드로 입력한 이름

		System.out.println("안녕하세요. " + name + "님");
		System.out.printf("\n안녕하세요. %s님", name);

		// 요구사항) "안녕하세요. 홍길동님. 안녕히가세요 홍길동님" 출력하시오

		System.out.println("\n안녕하세요. " + name + "님 " + "안녕히가세요 " + name + "님");
		System.out.printf("안녕하세요 %s님 안녕히가세요 %s님", name, name);

		System.out.println();

		System.out.printf("문자열: %s\n", "문자열");

		System.out.printf("정수:%d\n", 100);

		System.out.printf("실수: %f\n", 3.14);

		System.out.printf("문자: %c\n", 'A');

		System.out.printf("논리: %b\n", true);

		System.out.println();

		// 형식문자 확장기능
		// 1. %d, %s, %f, %c, %b 사이에 숫자(정수) 삽입 가능 
		// 출력할 내용의 너비를 지정할 수 잇음. ex) %숫자d 
		// 탭문자처럼 열을 맞추기 위한 기능
		// + : 우측 정렬
		// - : 좌측 정렬
		int num = 123;
		System.out.printf("[%d]\n", num);
		System.out.printf("[%10d]\n", num); //출력내용을 10칸 확보 (숫자가 3개니까 스페이스바 7번)
		System.out.printf("[%-10d]\n", num);//음수로 적을 경우 왼쪽에 숫자 오른쪽 공백,
		System.out.println();
		
		//2. %.숫자f  (%f만 가능) 
		// 소수점 이하 자릿수 지정
		double num2 = 3.14;
		System.out.printf("[%f]\n", num2);
		System.out.printf("[%.2f]\n", num2); // 소수점 둘쨋자리까지 출력
		System.out.printf("[%.0f]\n", num2); // .0 시 정수만 출력
		System.out.printf("[%.3f]\n", 3.4567); // 소수점 셋째자리까지 출력 (반올림), 확인 후 작업(***)
		System.out.println();
		
		//3. %,d , %,f(%d, %f에만 사용 가능) 자릿수 표기(천단위 표기방식 - 3자리)
		int price = 123456;
		System.out.printf("[금액 : %,d]",price);
		
		double price2 = 1237.231;

		System.out.printf("\n[금액 : %,f]",price2);
		
		//천단위 + 소수이하(2자리) + 출력너비 (28자리 , 우측정렬)
		double num3 = 1234567.7890123;
		System.out.printf("\n[%,20.2f]\n", num3);
		
		//메뉴판 출력 > 열 정렬
		// 가장 긴거에 맞춰 정렬
		System.out.println("================================");
		System.out.println("          음료 가격(단위:원)");

		System.out.println("================================");
		System.out.printf("콜라:\t\t%,6d\n", 2500);
		System.out.printf("스무디:\t\t%,6d\n", 3500);
		System.out.printf("사이다:\t\t%,6d\n", 500);
		System.out.printf("아메리카노:\t%,6d\n", 15000);
	
	
	
	
	}
}
