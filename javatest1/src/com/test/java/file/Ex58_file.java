package com.test.java.file;

import java.io.File;
import java.util.Calendar;

public class Ex58_file {
public static void main(String[] args) {
	
	/*
	 
	 
	 1. 파일/디렉토리 조작
	 	- 윈도우 탐색기로 하는 행동 > 자바로 구현
	 
	 2. 파일 입출력
	 	- 파일 > 읽기/쓰기
	 	- 텍스트 입출력
	 	ex) 메모장, 이클립스 등등..
	 
	 
	 */
	//m1();
	//m2();
	
	
}//main

private static void m2() {
	
	
	//폴더 > 정보
	
	//폴더 == 파일의 일종
	
	//폴더 경로
	String path = "C:\\class\\code\\java\\file";
	
	//폴더 참조 객체
	
	File dir = new File(path);
	
	if(dir.exists()) {
		
		System.out.println(dir.getName()); //폴더명
		System.out.println(dir.isFile()); //참조하는게 파일이면 true , 아니면 false
		System.out.println(dir.isDirectory()); //폴더면 true 파일이면 false
		System.out.println(dir.length()); //폴더 크기(바이트) > 폴더는 빈파일이므로 0 
		System.out.println(dir.getAbsolutePath()); //경로
		System.out.println(dir.lastModified()); //마지막 수정 날짜 (에폭타임으로 출력)		
		Calendar c1 = Calendar.getInstance();
		c1.setTimeInMillis(dir.lastModified()) ;
		System.out.printf("%tF %tT\n",c1,c1);
		System.out.println(dir.isHidden()); //숨김파일인지 숨김이면 true , 아니면 false
		System.out.println(dir.canRead()); //읽기전용 , 읽기 가능하면 true
		System.out.println(dir.canWrite()); // 쓰기 전용 , 쓰기 가능하면 true
		System.out.println(dir.getParent()); //해당 파일이 있는 위치 폴더 
		
		
		
	}else {
	System.out.println("해당 경로에 파일이 없습니다.");
}                                               
	//tick > 년월일시분초                       
	
	
}

private static void m1() {
	
	//파일 > 정보
	//자바 프로그램에서 외부 파일을 접근 
	//1. 외부 파일을 참조하는 객체를 생성 > 중계인, 대리인
	//2. 참조 객체 조작 > 실제 파일에 적용됨
	
	
	//파일 경로 
	
	String path = "C:\\class\\code\\java\\file\\data.txt";
	
	//파일 참조 객체 > java.io.File 클래스
	
	File file = new File(path);
	//System.out.println(file.exists()); // 파일 존재 여부 확인
	if(file.exists()) {
		
		//파일 조작
	System.out.println(file.getName()); //파일명
	System.out.println(file.isFile()); //참조하는게 파일이면 true , 폴더면 false
	System.out.println(file.isDirectory()); //
	System.out.println(file.length()); //파일 크기(바이트)
	System.out.println(file.getAbsolutePath()); //경로
	System.out.println(file.lastModified()); //마지막 수정 날짜 (에폭타임으로 출력)
	
	//tick > 년월일시분초 
	
	
	Calendar c1 = Calendar.getInstance();
	c1.setTimeInMillis(file.lastModified()) ;
	System.out.printf("%tF %tT\n",c1,c1);
	System.out.println(file.isHidden()); //숨김파일인지 숨김이면 true , 아니면 false
	System.out.println(file.canRead()); //읽기전용 , 읽기 가능하면 true
	System.out.println(file.canWrite()); // 쓰기 전용 , 쓰기 가능하면 true
	System.out.println(file.getParent()); //해당 파일이 있는 위치 폴더
	
	
	
	
	}else {
		System.out.println("해당 경로에 파일이 없습니다.");
	}
}


}
