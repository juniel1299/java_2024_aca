package com.test.java.file;

import java.io.*;
import java.util.*;

public class Ex59_File {
public static void main(String[] args) {
	
	/*
	 
	 1. 파일/디렉토리 조작
	 
	 2. 파일 > 내용 입출력
	 	a. 텍스트 입출력 > 수업
	 		- 메모장
	 		- 이클립스
	 	
	 	b. 비텍스트 입출력(바이너리 ) , 영상,이미지,음악 등등
	 	
	
	 	
	 	파일 입출력
	 	- 자바 프로그램 <-> (데이터) <-> 보조기억장치(HDD, SSD)
	 	-               ->           ->                 쓰기(저장)
	 	-               <-            <-                읽기
	 	
	 	저장 장치
	 	- 데이터 1,0으로 저장
	 	- 데이터의 자료형 규칙 없음
	 	
	 	
	 	인코딩, Encoding
	 	- 문자 코드(응용 프로그램 데이터)를 부호화(0,1) 시키는 작업 
	 	- 자바 프로그램("홍길동",String) > 텍스트 파일(100101010100)
	 	
	 	
	 	디코딩, Decoding
	 	- 부호 데이터를 문자 코드로 변환하는 작업
	 	- 텍스트 파일(100101010100) > 자바 프로그램("홍길동",String)
	 	
	 	인코딩/디코딩 규칙
	 	- 저장 장치 or 네트워크 상에서 데이터를 표현하는 규칙
	 	
	 	1. ANSI
	 	2. UTF
	 		2-1 UTF-8
	 		2-2 UTF-16
	 	3. ISO-8859-1
	 	4. EUC-KR
	 	5. MS949
	 	
	 	
	 	
	 	ANSI(ISO-8859-1, EUC-KR, MS949) 
	 		- 영어(숫자,특수문자,서유럽 문장 등 ASCII(~255)) : 1byte
	 		- 한글(한자, 일본어 등) : 2byte로 취급
	 		
	 		UTF-8 > 국제 표준 역할 > 자바/오라클 UTF-8 사용
	 			- 영어: 1byte
	 			- 한글: 3byte
	 			
	 		UTF-16 > 모든 문자를 2바이트로 저장 
	 			- 영어: 2byte
	 			- 한글: 2byte
	 	
	 	C:\class\code\java 경로
	 	- [ANSI]영어.txt
	 	- [ANSI]한글.txt	
	  	
	  	
	  	- [UTF-8]영어.txt
	 	- [UTF-8]한글.txt
		
		
		- [UTF-16]영어.txt
	 	- [UTF-16]한글.txt
	 	
	 	
	 */

	//m1();
	//m2();
	//m3();
	//m4();
	//m5();
	//m6();
	//m7();
	m8();
	
	
}//main

private static void m8() {
	
	//성적 관리
	//- 성적표 출력
	//성적 파일(score.txt)
	
	//******** 데이터 구조 설계
	//- 이름 , 국어, 영어, 수학
	
	System.out.println("==============================================");
	System.out.println("                       성적표");
	System.out.println("==============================================");
	System.out.println("[이름]\t[국어]\t[영어]\t[수학]\t[총점]\t[평균]");
	
	try {

		BufferedReader reader = new BufferedReader(new FileReader("C:\\class\\code\\java\\javatest1\\src\\com\\test\\dat\\score.txt"));
				
				File file = new File("C:\\class\\code\\java\\javatest1\\src\\com\\test\\dat\\score.txt");
				
				String line = null;
				
				while((line = reader.readLine())!=null) {
				String[] temp = line.split(",");
				
				String name = temp[0];
				int kor = Integer.parseInt(temp[1]);
				int eng = Integer.parseInt(temp[2]);
				int math = Integer.parseInt(temp[3]);
				int total = kor + eng + math;
				double avg = total / 3.0;
				
					
					System.out.printf("%s\t%5d\t%5d\t%5d\t%5d\t%5.1f\n"
							, name
							, kor
							, eng
							, math
							, total
							, avg); //학생 1명 
				}
				
				
				reader.close();
	} catch (Exception e) {
		System.out.println("Ex59_File.m8");
		e.printStackTrace();
	}
	
	
	
	
	
}

private static void m7() {
	
	try {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("자바 파일명: ");
		String filename = scan.nextLine();
		
		//경로 C:\class\code\java\javatest1\src\com\test\java\Ex01_DataType.java
		
		String path = "C:\\class\\code\\java\\javatest1\\src\\com\\test\\java\\" + filename;
		
		BufferedReader reader = new BufferedReader(new FileReader(path));
		
		String line = null;
		int number = 1; //줄번호
		while((line = reader.readLine())!=null) {
			System.out.printf("[%3d]: %s\n",number, line);
				number++;
		
		}
		
		reader.close();
		
		
	} catch (Exception e) {
		System.out.println("Ex59_File.m7");
		e.printStackTrace();
	}
	
}

private static void m6() {
	
	//FileOutputStream > FileWriter > bufferedWriter (범용클래스)
	//FileInputStream > FileReader > bufferedReader (범용클래스)
	
	try {
//		
//		BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\class\\code\\java\\file\\list.txt"));
//		
//		
//		writer.write(65);
//		writer.newLine(); // == writer.write("\r\n");
//		writer.write("문자열");
//		
//		
//		
//		writer.close();
		

		BufferedReader reader 
		= new BufferedReader(new FileReader("C:\\class\\code\\java\\file\\list.txt"));
		
		
		//reader.read();
//		String line = reader.readLine();
//		System.out.println(line);
//		
//		line = reader.readLine();
//		System.out.println(line);
//		
//		line = reader.readLine();
//		System.out.println(line);

		
		String line = null;
		
		while((line = reader.readLine())!= null) {
			System.out.println(line);
			
		}
		
		reader.close();
	
	} catch (Exception e) {
		System.out.println("Ex59_File.m6");
		e.printStackTrace();
	}
	
	
	
}

private static void m5() {
	
	try {
		//파일 열기
		//FileInputStream > FileReader
		//1. 문자 단위 읽기(2byte) 지원
		//2. readLine은 없음
		
		FileReader reader = new FileReader("C:\\class\\code\\java\\file\\data.txt");
		
//		int code = reader.read();
//		System.out.println((char)code);
//		code = reader.read();
//		System.out.println((char)code);
//		
//		code = reader.read();
//		System.out.println((char)code);
//		
//		
//		reader.close();
		
		int code = -1;
		
		while((code = reader.read())!=-1) {
			System.out.print((char)code);
		}
		reader.close();
		
		
	} catch (Exception e) {
		System.out.println("Ex59_File.m5");
		e.printStackTrace();
	}
	
}

private static void m4() {
	
	//메모장 구현 > 콘솔 버전
	try {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("저장할 파일명: ");
		String filename= scan.nextLine();
		
		FileWriter writer 
		= new FileWriter("C:\\class\\code\\java\\file\\" + filename);
		
		boolean loop = true;
		
		while(loop) {
			System.out.print("입력: ");
			String line = scan.nextLine();
			
			writer.write(line); //한줄 입력 > 한줄 쓰기
			writer.write("\r\n"); //엔터키에 줄바꿈 
			
			if(line.equals("q!")) {
				break;
			}
					
		}
		writer.close();
		System.out.println("end");
		
	} catch (Exception e) {
		System.out.println("Ex59_File.m4");
		e.printStackTrace();
	}
}

private static void m3() {
	
	try {
		
		//파일 쓰기
		//FileWriter
		//문자열 쓰기 지원
		//문자 단위 쓰기 (2byte)
		
		//파일이 없을 경우 파일을 만들어줌 
		FileWriter writer = new FileWriter("C:\\class\\code\\java\\file\\member.txt",true);
		
		writer.write("홍길동");
		
		writer.close();
		
	} catch (Exception e) {
		System.out.println("Ex59_File.m3");
		e.printStackTrace();
	}
	
}

private static void m2() {
	
	//파일 읽기 == 파일 입력
	
	try {
		
		//FileOutputStream <-> FileInpuStream
		
//		FileInputStream stream = new FileInputStream("C:\\class\\code\\java\\file\\data.txt");
		
		FileInputStream stream = new FileInputStream("C:\\class\\code\\java\\javatest1\\src\\com\\test\\Ex01_DataType.java");
		
		//System.in.read()
		//reader.read()
		//int code = stream.read();
		//System.out.println((char)code);
		
			int code = -1;

			while((code = stream.read()) != -1) {
				System.out.print((char)code);
			}
			stream.close();
			
			
	}
			catch (Exception e) {
		System.out.println("Ex59_File.m2");
		e.printStackTrace();
	}
	
}

private static void m1() {
	
	//파일 입출력
	
	//파일 쓰기 == 파일 출력
	
	//쓰기 스트림 객체
	
	
	try {
		
		File file = new File("C:\\class\\code\\java\\file\\data.txt");
		
		//파일 객체 > 스트림 생성
		//쓰기 스트림 모드
		//1. create mode  > 기본값 , 파일 내용 다 지우고 작성한 것만 나옴
		//2. append mode > 기존내용을 두고 추가로 작성
		//FileOutputStream
		// 바이트 단위 쓰기 (1byte) > 한글 깨짐
		FileOutputStream stream = new FileOutputStream(file, true); //true로 쓰면 append mode
		
		/*
		char c = 'A';
		
		stream.write((int)c); // 문자 코드를 사용해서 파일에 문자를 작성
		stream.write('B'); // 문자 코드를 사용해서 파일에 문자를 작성
		stream.write('C');		
		
		stream.close(); //스트림 닫기(실제 저장)
		
		FileOutputStream stream2 = new FileOutputStream(file, true); //true로 쓰면 append mode
		
		stream2.write('가');		
		*/
		
		String txt = "\r\n hello java";
		
		for(int i=0; i<txt.length(); i++) {
			char c = txt.charAt(i);
			stream.write(c);
		}
		stream.close();
		System.out.println("end");
		
		
	}catch (Exception e) {
		System.out.println("Ex59_File.java");
		e.printStackTrace();
	}
	
	
	
	
}


}





