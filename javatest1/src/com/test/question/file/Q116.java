package com.test.question.file;

import java.io.File;
import java.util.ArrayList;

public class Q116 {
public static void main(String[] args) {

	

	
	//파일 경로1 C:\Users\\user\Downloads\파일 디렉토리 문제\동일 파일\MusicA
	//파일 경로2 C:\Users\\user\Downloads\파일 디렉토리 문제\동일 파일\MusicB

	String path1 = "C:\\Users\\user\\Downloads\\파일 디렉토리 문제\\동일 파일\\MusicA";
	String path2 = "C:\\Users\\user\\Downloads\\파일 디렉토리 문제\\동일 파일\\MusicB";
	File folder1 = new File(path1);
	File folder2 = new File(path2);
	
	File[] list1 = folder1.listFiles(); //폴더안에 존재하는 파일을 배열안에 정리
	File[] list2 = folder2.listFiles(); //폴더안에 존재하는 파일을 배열안에 정리
	
	ArrayList<File> twice = new ArrayList<File>(); //겹치는 파일 Arraylist에 넣음 
		for(File file1 : list1) { //A폴더에 있는 파일 반복
		
	for(File file2 : list2) { //B폴더에 있는 파일 반복
		if(file1.getName().equals(file2.getName())) { //만약 두 폴더에 파일 이름이 겹치면  
			twice.add(file1); // ArrayList에 파일 이름을 저장
		}
		
	}
		
		
	}
	
	for(File file : twice) { //ArrayList에 담은 파일명 전체를 반복
		
		
		System.out.println(file.getName());  //출력
	}
			
}

}
