package com.test.java.regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Ex69_RegEx {
public static void main(String[] args) {
	
	/*
	     
	     정규 표현식 (Regular Expression) /유닉스, 리눅스
	     	- 정규식 > "[특정 패턴]의 문자열을 검색하는 도구"
	     	
	     	정규 표현식 요소 (=문법)
	     	
	     	1. x 
	     		- x는 임의의 문자 1개 
	     		ex) a > a 
	     		ex)  >  찾음
	      	
	      	2. .
	      		- 임의의 문자 1개를 가리킴
	      		ex) . > 모든 종류의 문자 1개 찾음
	      		ex) .. > 모든 종류의 문자 2개
	      		ex)a.c > a와 c 사이에 글자 하나가 들어있는 것을 찾음
	      		ex) a.?c > abc,adc,ac 
	      		
	      		
	      	3. 출현횟수
	      		- 바로 앞의 문자(집합)의 출현 횟수를 표현
	      		3.1 생략
	      			- 바로 앞의 대상의 출현 횟수가 생략X , 중복X
	      			- 출현 횟수: 1
	      			일반 검색 
	      			ex) abc  > abc, ab, abb, ac, bc, b, aabb ,azc,apxc,
	      		3.2 ?
     				- 바로 앞의 대상의 출현 횟수가 생략O , 중복X
	      			- 출현 횟수: 0~1
	      			ex) a?bc  > abc, ab, abb, ac, bc, b, aabb 
	      		
	      		-> a는 0~1까지만 나오면서 bc가 있는 경우를 찾음 , 
	      			?는 ?앞에 한 글자만 적용함 , 괄호를 통해 묶을 수 있음 
	      			
	      			ex)홍길동? > 안녕~ 길동아~ 이름은 홍길동이지?
	      			
	      			ex) (자바)?코드 > 자바코드가 있습니다. 그런데 코드에 에러가 있어요 추가로 자코드가 있습니다.
	      			
	      		3.3 +
	      			- 바로 앞의 대상의 출현 횟수가 생략X , 중복O
	      			- 출현 횟수: 1~무한대
	      			
	      		ex)a+bc  > abc, ab, abb, ac, bc, b, aabb aaaaabc
	      			-> + 앞에 있는 문자는 무조건 나와야함 (횟수는 상관없음)
	      			-> 뒤에 글자도 나와야함
	      			
	      		ex) (자바)+코드 > 자바코드가 있습니다. 그런데 코드에 에러가 있어요 추가로 자코드가 있습니다. 
	      			
	      			
	      		3.4 * 
	          		- 바로 앞의 대상의 출현 횟수가 생략O , 중복O
	      			- 출현 횟수: 0~무한대
	     			- 앞의 ?와 + 합친 형태 
	     		ex)a*bc  > abc, ab, abb, ac, bc, b, aabb aaaaabc
	     				-> * 앞의 글자가 여러번 나와도, 안 나와도 뒤의 글자만 있으면 검색
	     				
	     		ex) (자바)*코드 > 자바코드가 있습니다. 그런데 코드에 에러가 있어요 추가로 자코드가 있습니다. 		
	     
	     
	     		
	     //홍?홍길동 > 홍이 1~2번이라는 조건 가능 
	 
	 
	 
	 
	 		4. 선택, choice
	 			- 연산자 or 역할 
	 			4.1 [열거값]
	 			
	 			ex) [012] > 제 나이는 12살입니다. 제 동생은 10살이에요. 키는 160cm입니다. 몸무게는 50kg이에요
	 				-> 대괄호 안에 들어있는 글자 중 하나 이상 만족하면 검색
	 				
	 				ex)[김이박]?길동 > 홍길동, 김길동, 이길동, 박길동, 정길동, 최길동
	 			
	 			
	 			ex) [0123456789]+ 숫자가 연속으로 한번이상 나온거 > 
	 			
	 			ex) 주민등록번호
	 			980101-1234567
	 			
	 			[0123456789][0123456789][0123456789][0123456789][0123456789][0123456789]-[0123456789][0123456789][0123456789][0123456789][0123456789][0123456789][0123456789]
	 			
	 			ex) 전화번호
	 			010-1234-5678
	 			010-243-1295
	 			010-[0123456789]?[0123456789][0123456789][0123456789]-[0123456789][0123456789][0123456789][0123456789]
	 			
	 			
	 			ex) 영어 소문자 > [qwertyuiopasdfghjklzxcvbnm]+ 
	 			
	 			ex) 영어 대문자 > [QWERTYUIOPASDFGHJKLZXCVBNM]+
	 			
	 			
	 			ex 합쳐서 > [QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm]
	 			
	 			*** 선택에서 연속된 문자를 간단하게 표현하는 방법
	 				- 문자 코드값 사용 
	 				
	 				ex) 숫자 > [0123456789] [0-9] ( 순서대로 놓을 시 같은 표현 )
	 				ex) 영어 > [a-z]
	 				ex) 대문자 > [A-Z]
	 				ex) 대소문자 > [A-Za-z]
	 				ex) 한글 [가-힣]+ 
	 				
	 				ex) [a-degh-p] , a부터 d까지 , 따로 eg선언 , h부터 p까지
	 				  
	 			
	 				ex) 전화번호 > 010-[0-9]?[0-9][0-9][0-9]-[0-9][0-9][0-9][0-9]
	 				
	 				ex) 주민번호 > [0-9][0-9][0-9][0-9][0-9][0-9]-[0-9][0-9][0-9][0-9][0-9][0-9][0-9]
	 				
	 				ex) 홍씨 사람들 > 홍[가-힣]?[가-힣]
				
				
	 			ex) [012] > 제 나이는 12살입니다. 제 동생은 10살이에요. 키는 160cm입니다. 몸무게는 50kg이에요
	 				-> 대괄호 안에 들어있는 숫자 중 하나 이상 만족하면 검색
	 			ex) 영문자  [A-Za-z] or [a-zA-Z]
	 			ex) 영문자 + 숫자 [A-Za-z0-9]
	 			ex 영문자 + 숫자 + 한글 [A-Za-z0-9가-힣]
	 			ex 식별자 적합한 문자 (영문자 + 숫자 + '_')
	 			> [A-Za-z0-9_]
	 			4.2 [^열거값] (XOR) , 동시불만족
	 				- 4.1의 부정형태
	 				- 열거 값을 제외한 나머지 검색
	 				
	 				ex) [^0-9]+ > 숫자가 아닌 것을 찾으시오
	 				
	 				
	 			5. 출현횟수 
					- 바로 앞의 문자(집합)의 출현 횟수를 표현
					
					- ?, +, * 보다 더 세밀한 패턴 지정이 가능
					
					5.1 {n}
						- n: 출현 횟수
						ex) a{1}bc >  ab,bc,abc,ac,abbc,abcc,aabc,aaabc , a가 한번 나오고 bc
						ex) a{2}bc > ab,bc,abc,ac,abbc,abcc,aabc,aaabc
						ex) a{3}bc > ab,bc,abc,ac,abbc,abcc,aabc,aaabc
					
					5.2 {n,m}
						- n : 최소 출현 횟수
						- m : 최대 출현 횟수
						ex) a{1,2}bc > ab,bc,abc,ac,abbc,abcc,aabc,aaabc a가 최소 1번 최대 2번
						ex) a{2,3}bc > ab,bc,abc,ac,abbc,abcc,aabc,aaabc
						ex) a{0,1}bc > ab,bc,abc,ac,abbc,abcc,aabc,aaabc
					
					5.3{n,}
	 					- n : 최소 출현 횟수
	 					- 생략: 무한대
						ex) a{1,}bc > ab,bc,abc,ac,abbc,abcc,aabc,aaabc a가 최소 1번 이상
						ex) a{0,}bc > ab,bc,abc,ac,abbc,abcc,aabc,aaabc a가 최소 0번 이상
						ex) a{3,}bc > ab,bc,abc,ac,abbc,abcc,aabc,aaabc
						
						ex) a?bc  ==  a{0,1}bc
						
						
						ex) 주민 번호 > [0-9]{6}-[0-9]{7}
						ex) 전화번호 > 010-[0-9]{3,4}-[0-9]{4}
						
						
						ex) 한글 2~4자 > [가-힣]{2,4} 
						
						ex) 영어 5자 이상 + 첫 글자는 대문자 > [A-Z][A-Za-z]{4,}
						
					6. 처음과 끝
						- 입력 컨트롤 or 입력 값을 대상으로 사용
						
						6.1 ^
							- 뒤의 표현으로 반드시 시작
							-str.startsWith
						ex) ^홍길동 -> 홍으로 시작 
						
						6.2 $
	 						- 앞의 표현이 반드시 끝
	 						- str.endWith("동")
	 						ex) 홍길동$ ->  동으로 끝나야함 
	 						
	 				7. 줄임 표현 
	 					7.1 \d 또는 \D
	 						- Digital > 숫자
	 						- [0-9] == \d
	 						- [^0-9] == \D
	 						ex)[0-9]{6}-[0-9]{7}
	 						ex \d{6}-\d{7}
	 						
	 						
	 					7.2 \w or \W
	 						- Word > 영어 대소문자 +숫자 + '_' 조합
	 						- ex) \w{2,5} 2글자에서 5글자짜리 영어 대소문자 +숫자 + '_' 조합
	 						- [A-Za-z0-9_]{2,5}
	 						
	 					7.3 \s or \S
	 						- 공백 문자(스페이스, 탭, 엔터)
	 					ex) \s+ 공백이 1개 이상 나온거 찾기
	 					ex) \S+ 공백이 아닌 문자 
	 
	 
	 
	 
	 
	 
	 */
	
	
	
	
	
	//m1();
	//m2();
	m3();
	
	
	
	
	
}//main

private static void m3() {
	
	//자바 + 정규식 지원 > 정규식 클래스 제공 
	
	String txt = "안녕하세요. 홍길동입니다. 제 연락처는 010-6238-2352 입니다. 연락주세요. 혹시 연락이 안되면 다른 번호 010-2353-4958로 연락주세요";
	
	// txt안에 전화번호가 포함되어 있는가?
//	String regex = "[0-9]{3}.[0-9]{3,4}.[0-9]{4}";
	String regex = "\\d{3}-\\d{3,4}-\\d{4}";
	
	
	//패턴 객체 == 정규표현식 객체
	Pattern p1 = Pattern.compile(regex);
	
	Matcher m1 = p1.matcher(txt); //문자열 받음 (검사 대상)
	
//	System.out.println(m1.find()); //검색결과 확인, 결과에 일치하는 항목이 있는지(boolean)
	
//	if(m1.find()) {
//		System.out.println("txt내에서 전화번호 발견");
//	}else { 
//
//		System.out.println("txt내에서 전화번호 발견 못 함 ");
//	}

//	System.out.println(m1.find()); //첫번째 find는 조건에 만족하는 첫번째 단어를 찾음
//	System.out.println(m1.find()); // 두번째 find는 앞에서 찾은 단어 이후 단어를 찾음
//	System.out.println(m1.find()); // 번호가 2개이므로 false 출력
	
	int count = 0;
	
	while(m1.find()) {
		count++;
	}
	System.out.printf("%d번 발견\n",count);
}

private static void m2() {
	
	String name = "홍길동,,아무개,강아지;고양이 멍멍이";
	
	String[] list = name.split("[,,;\\s]+");
	
	for(String item : list){
		
		
		
		System.out.println(item);
		
//		if(item.contains(";")) {
//			String[] sublist = item.split(";");
//			System.out.println(Arrays.toString(sublist));
//		}else {
//		System.out.println(item);
//	}
	}
}

private static void m1() {
	
	//자바 > 여러 메서드의 인자값으로 정규 표현식을 지원한다.
	
	// 게시판 > 글쓰기 > 개인정보 (전화번호 마스킹)
	String txt = "안녕하세요. 홍길동입니다. 제 연락처는 010-6238-2352 입니다. 연락주세요. 혹시 연락이 안되면 다른 번호 010-2353-4958로 연락주세요";
	
	System.out.println(txt
			.replaceAll("[0-9]{10,11}", "***.****.****")
			.replaceAll("[0-9]{3}.[0-9]{3,4}.[0-9]{4}", "***.****.****")
			.replaceAll("[0-9]{3}-[0-9]{3,4}-[0-9]{4}", "***-****-****"));
	
	System.out.println(txt.replaceFirst("[0-9]{3}-[0-9]{3,4}-[0-9]{4}", "***-****-****")); //앞에 하나만
	
	
}


}








