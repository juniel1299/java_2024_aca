package com.test.question.file;

import java.io.File;

public class Q115 {
public static void main(String[] args) {
	
	//경로 C:\Users\\user\Downloads\파일 디렉토리 문제\파일 제거
	
	
	String path = "C:\\Users\\user\\Downloads\\파일 디렉토리 문제\\파일 제거";
	
	File folder = new File(path);
	
	int count = 0; //총 삭제한 숫자
	
	
	File[] list = folder.listFiles(); //폴더안에 존재하는 파일을 배열안에 정리
	
	for(File file : list) {
		
		if(file.length() ==0) {
			file.delete();
			count++;
		}
	}
	System.out.printf("총 %d개의 파일을 삭제하였습니다.\n",count);
	
	
	
	
}//main
}
