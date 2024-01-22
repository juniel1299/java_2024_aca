package com.test.question.file;

import java.io.File;

public class Q119 {
public static void main(String[] args) {
	
	
	String path = "C:\\Users\\user\\Downloads\\파일 디렉토리 문제\\직원"; //경로 선언
	
	File dir = new File(path); //경로를 file 라이브러리에 저장 
	File[] list = dir.listFiles(); //배열에 저장
	
	for(File file : list) { //무한 루프 
		String filename = file.getName(); //파일 이름을 filename 변수에 저장
		String[] temp = filename.split("_"); //저장한 filename에 _ 기준으로 분할
		
		File subdir = new File(path+"\\" + temp[0] + "\\" + temp[1]); 
		subdir.mkdirs();
		
		File movefile = new File(path+"\\" + temp[0] + "\\" + temp[1] + "\\" + filename);
		file.renameTo(movefile);
		
		System.out.println(movefile.getAbsolutePath());
	}
	
	
}//main
}
