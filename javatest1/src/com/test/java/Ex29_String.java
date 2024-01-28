package com.test.java;

import java.util.Scanner;

public class Ex29_String {
public static void main(String[] args) {
	
		/*
		 
		 문자열 , String
		 String 클래스에서 문자열 조작에 관련한 기능 제공
		 
		 
		 */
	
	//m1();
	//m2();
	//m3();
	//m4();
	//m5();
	//m6();
	//m7();
	//m8();
	//m9();
	//m10();
	//m11();
	//m12();
	//m13();
	m14();
	//m15();
}//main

private static void m15() {
	// TODO Auto-generated method stub
	
	//문자열 분리
	// String[] split (String delimiter) 
	
	String txt="홍길동,아무개,하하하,호호호,후후후";
	
	String[] list = txt.split("\\."); // .와 |는 그대로 하면 안 됨 , \\. \\| 이런식으로 넣어야 됨 
	
	for(int i=0; i<list.length; i++) {
		System.out.println("이름: " +list[i]);
	
	
	
	
	}

	
	
	
}

private static void m14() {
	// TODO Auto-generated method stub
	
	//문자열 치환 (바꾸기)
	//String replace (char old, char new)
	// String replace (String old, String new)
	
	String txt = "안녕하세요. 홍길동입니다.";
	
	System.out.println(txt.replace("홍길동", "아무개")); 
	
	String content = "뭐해 바보야";
	String word = "바보";
	
	//masking
	System.out.println(content.replace(word, "**"));
	
	System.out.println();
	txt = "     하나     둘      셋     ";
	System.out.println(txt.trim());
	
	System.out.println(txt.replace(" ", ""));

	System.out.println(txt.replace("하나", ""));
}

private static void m13() {
	// TODO Auto-generated method stub
	
	
	//문자열 검색
	// indexOf , lastIndexOf 
	// boolean contains(String s)
	
	String txt="안녕하세요 홍길동입니다.";
	
	if(txt.indexOf("홍길동")> -1) {
		System.out.println("O");
	}
	
	if(txt.contains("홍길동")) { //boolean이 자동으로 설정됨 
		System.out.println("O");
	}
	
	
}

private static void m12() {
	// TODO Auto-generated method stub
	//문자열 추출
	// String substring(int beginIndex, int endIndex)
	// String substring(int beginIndex
	// beginIndex: 포함(inclusive)
	//endIndex : 미포함(exclusive)
	
	String txt ="가나다라마바사아자차카타파하";
	
	System.out.println(txt.substring(3,7)); //3번째 위치 ~ 6번째까지 출력
	System.out.println(txt.substring(3)); //3번째 위치부터 끝까지
	System.out.println(txt.charAt(4)); //char -> 문자 코드값
	System.out.println(txt.substring(4,5)); //String -> 문자코드값 x
	
	String jumin = "123456-1234567";
	//System.out.println(jumin.charAt(7) == '1' ? "남자" : "여자");
	System.out.println(jumin.substring(7,8) == "1" ? "남자" : "여자");
	
	//몇년생
	System.out.print("" + jumin.charAt(0) + jumin.charAt(1) + "\n");
	System.out.println(jumin.substring(0,2));
	
	//몇월
	System.out.println(jumin.substring(2,4));
	//몇일
	System.out.println(jumin.substring(4,6));

	//파일 경로

	String path = "C:\\class\\code\\java\\Hello.java";
	
	//1. 파일명 추출
	int index = path.lastIndexOf("\\");
	
	String filename = path.substring(index + 1);
	System.out.println("파일명 : " +  filename);
	
	//2. 파일명 > 확장자 없이 파일 이름만 추출 >> Hello
	
	index = filename.lastIndexOf(".");
	String filenameWithoutExtenstion =filename.substring(0,index);
	
	System.out.println("확장자 포함 파일 명 :" +  filenameWithoutExtenstion);
	
	//3. 확장자만 출력 .java
	
  String extension = filename.substring(index);
  System.out.println("확장자: " + extension);
	

}

private static void m11() {
	// TODO Auto-generated method stub
	
	
	
	//문자열 검색 *****
	//문자열 내에서 원하는 문자(열)을 검색 > 발견된  위치(index) 반환
	
	//int indexOf(char c)
	//int indexOf(String c)
	//int indexOf(char c,int beginIndex)
	//int indexOf(String s, int beginIndex)
	

	//int lastIndexOf(char c)
	//int lastIndexOf(String c)
	//int lastIndexOf(char c,int beginIndex)
	//int lastIndexOf(String s, int beginIndex)
	
	
	String txt ="홍길동 자바 아무개 자바 테스트";
	
	System.out.println(txt.indexOf("자바")); //왼쪽에서부터 검색 4
	System.out.println(txt.indexOf(("자바"),5)); //5부터 검색 -> 11
	System.out.println(txt.lastIndexOf("자바")); // 오른쪽에서부터 검색 11
	System.out.println(txt.lastIndexOf(("자바"),10)); //오른쪽에서 10부터 왼쪽으로 검색 ->4
	
	
}

private static void m10() {
	// TODO Auto-generated method stub
	
	//패턴 검색 
	
	//boolean startsWith(String word)
	//boolean endsWith(String word)
	
	String name = "홍길동";
	
	//이 사람이 '홍'씨? > boolean 
	
	System.out.println(name.charAt(0) == '홍');
	System.out.println(name.indexOf('홍') == 0);
	System.out.println(name.startsWith("홍")); //글자 맨 앞이 해당 글자로 시작하는가 ? true / false
	System.out.println();
	
	
	// 끝나는 글자 찾기
	System.out.println(name.charAt(name.length()-1) == '동');
	System.out.println(name.indexOf('동')==name.length()-1);
	System.out.println(name.endsWith("동"));
	
	
	//자원 경로 
	String path = "C:\\class\\code\\java\\Hello.java";
	
	//위의 자원이 자바 소스 파일인가?
	if(path.endsWith(".java")) {
		System.out.println("O");
	}else {
		System.out.println("X");
	}
	
	
}

private static void m9() {
	// TODO Auto-generated method stub
	
	//문자열 대소문자 변경
	
	//String toUpperCase()
	//String toLowerCase()
	
	String content ="오늘 수업하는 과목은 Java입니다.";
	
	String word = "java"; //검색어
	
	System.out.println(content.toUpperCase());
	//System.out.println(content.toLowerCase());
	System.out.println(word.toUpperCase());
	
	//대소문자 구분(case sensitive)
	// 정확도 높음, 
	// 검색율 낮음
	if(content.indexOf(word)>-1) {
		System.out.println("검색 결과: O");
	}else {
		System.out.println("결과x");
	}
	//메서드().메서드().메서드() > 메서드 체인닝
	//대소문 구분 x (case insensitive)
	//검색율 높아짐 , 
	//정확도 낮음 
	if(content.toUpperCase().indexOf(word.toUpperCase())>-1) {
		System.out.println("검색 결과: O");
	}else {
		System.out.println("결과x");
	}
	
}

private static void m8() {
	// TODO Auto-generated method stub
	
	//게시판 글쓰기 > 금지어 
	String stop = "바보"; //금지어 설정 
	
	String content = "안녕하세요 저는 자바를 배우는 학생입니다."; 
	
	if(content.indexOf(stop)> -1) { //금지어가 없을 시 -1 이므로 
		System.out.println("금지어 금지");
	}else {
		System.out.println("글쓰기 처리");
	}
	
	String[] stops = {"바보","멍청이","메롱","ㅂㅏㅂㅗ"};
	
	for(int i=0; i<stops.length; i++) {
		if(content.indexOf(stops[i])> -1) {
			System.out.println("금지어 발견");
			break;
		}
	}
	System.out.println("종료");
}

private static void m7() {
	// TODO Auto-generated method stub
	
	//문자열 검색 *****
	//문자열 내에서 원하는 문자(열)을 검색 > 발견된  위치(index) 반환
	//int indexOf(char c)
	//int indexOf(String c)
	//int indexOf(char c,int beginIndex)
	//int indexOf(String s, int beginIndex)
	
	String txt= "안녕하세요. 홍길동입니다.";
	
	int index =1;
	
	index = txt.indexOf('하');
	
	System.out.println(index); //하 의 위치 -> 2 

	index = txt.indexOf('홍');
	
	System.out.println(index); //홍 의 위치 -> 7

	index = txt.indexOf('강');
	
	System.out.println(index); //입력을 받으면 무조건 돌려줘야함 '강'은 없으므로 index에서 받을 수 없는 -1을 반환 
	

	index = txt.indexOf("홍길동");
	
	System.out.println(index); //3글자를 받아도 제일 앞의 글자 위치를 반환해줌  
	
	String txt1= "안녕하세요. 홍길동입니다. 반갑습니다. 홍길동입니다. 안녕히가세요. 홍길동입니다.";
	
	index = txt1.indexOf("홍길동");
	System.out.println(index); //무조건 맨 처음꺼 반환해줌 추가로 더 있어도 해당 위치에서 멈춤

	index = txt1.indexOf("홍길동",10);
	System.out.println(index); //어느 위치에서부터 검색 할건지 선택가능, 해당 위치에서부터 맨 앞글자 위치를 반환 
	
	index = txt1.indexOf("홍길동",index + 3);
	System.out.println(index);
}

private static void m6() {
	// TODO Auto-generated method stub
	//문자열 공백 제거
	
	// String trim()
	// whitespace (공백) > 스페이스, 탭, 개행 제거하는 메서드
	// 불필요하거나 사용자 실수로 생긴 공백 제거 역할
	
	
	String txt="     하나     둘     셋     ";
	System.out.printf("[%s]",txt.trim());//문자열 시작 , 끝에만 없앰. 
	
	
	


}

private static void m5() {
	// TODO Auto-generated method stub
	
	//메서드 호출 
	Scanner scan = new Scanner(System.in);
	
	System.out.print("단어 입력: ");
	String word = scan.nextLine();
	
	if(isVaild(word)) {
		System.out.println("소문자O");
	} else {
		System.out.println("소문자x");
	}
	
	
	
}

private static boolean isVaild(String word) {
	// TODO Auto-generated method stub
	
	for(int i=0; i<word.length(); i++) {
		char c =word.charAt(i);
		
		if((c<'a' || c>'z')&& (c<'0' || c>'9')) {
			return false;
		}
	}
	
	return true;
}

private static void m4() {
	// TODO Auto-generated method stub
	
	//단어 입력
	//영어 소문자로만
	
	Scanner scan = new Scanner(System.in);
	System.out.print("단어 입력: ");
	String word = scan.nextLine();
	
	
	boolean result = true;
	
	
for(int i=0; i<word.length(); i++) {
	char c = word.charAt(i);

	//if(c>='a' && c<='z') {
		//System.out.println("소문자");
	//} else {
		//System.out.println("소문자 아님");
	//}
	
	//***유효성 검사는 잘못된 것을 찾는 조건을 만든다.
	
	if(c<'a'||c>'z') {
		System.out.println("소문자 아님");
		result = false;
		break;
	}
}
	System.out.println(result);
	if(result) {
		System.out.println("소문자");
	} else {
		System.out.println("소문자 x");
	}
	
}

private static void m3() {
	// TODO Auto-generated method stub
	
	//주민등록번호 입력
	//ex) 970110-1234567 -를 반드시 넣으시오 
	Scanner scan = new Scanner(System.in);
	System.out.print("주민번호 입력 (- 포함하시오): ");
	String jumin = scan.nextLine();
	
	if(jumin.charAt(6) == '-') {
		System.out.println("올바른 입력");
	} else {
		System.out.println("올바르지 않은 입력");
	}
	
	
	
}

private static void m2() {
	// TODO Auto-generated method stub
	
	//문자열 추출
	//char charAt(int index)
	// 원하는 위치에 문자 1개를 추출함
	//zero based index 0부터 시작  
	String txt = "안녕하세요. 홍길동입니다.";
	
	char c =txt.charAt(4);//요 추출
	System.out.println(c);
	
	//마지막 문자
	c = txt.charAt(txt.length()-1);
	System.out.println(c);
	
	
}

private static void m1() {
	// TODO Auto-generated method stub
	
	//문자열 생성
	//1. 리터럴
	//2. 객체 생성
	
	
	String str1 = "홍길동";
	
	String str2 = new String("홍길동"); //
	
	//문자열 길이
	// int length();
	
	
	//문자열 == 문자의 집합
	//String == char[]
	
	
	String txt = "홍길동";
	
	System.out.println(txt.length()); //글자 수 
	
	
	System.out.println("자바".length());

	System.out.println("ABC한글123#@!".length());
	
	//요구사항) 사용자 입력 > 문자수?
	Scanner scan = new Scanner(System.in);
	/*
	
	System.out.print("문장 입력: ");
	String statement = scan.nextLine();
	
	System.out.printf("%s > %d 문자\n",statement,statement.length());
	*/
	//유효성 검사
	
	//이름 입력
	//2~5자 
	
	System.out.print("이름 입력: ");
		String name = scan.nextLine();
		if(name.length()>=2 && name.length() <=5) {
			System.out.println("올바른 이름");
		} else {
			System.out.println("이름을 2~5자 이내로 입력하시오.");
		}
	
	
	
	
}



}
