package com.test.question.file;

import java.io.File;

public class Q113 {
public static void main(String[] args) {
	
	//경로 C:\Users\\user\Downloads\파일 디렉토리 문제\음악 파일\Music
	
	//파일 앞에 001 ~ 100까지 작성 
	
	String path = "C:\\Users\\user\\Downloads\\파일 디렉토리 문제\\음악 파일\\Music";
	
	File folder = new File(path); //파일  선언
	
	int n= 1; //앞에 붙일 숫자
	
	File[] list = folder.listFiles(); //배열 생성하여 파일을 넣음
	
	
	for(File file : list) { //무한루프 list 전체 
		
			
			//temp = 서식을 위해 선언 + path\\ 에 있는 파일들 포맷을 숫자 3자리를 앞에 두게 함 
		File temp = new File (path + "\\" + String.format("[%03d]%s", n, file.getName()));
		file.renameTo(temp); //변환
		n++; //숫자를 올려가며 반복
		
		
	}
	
	System.out.println("작업 완료");
	
}//main
}
