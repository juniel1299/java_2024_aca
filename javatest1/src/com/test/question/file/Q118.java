package com.test.question.file;

import java.io.File;
import java.util.ArrayList;

public class Q118 {
public static void main(String[] args) {
	
	String path = "C:\\Users\\user\\Downloads\\파일 디렉토리 문제\\크기 정렬"; //경로설정 
	File dir = new File(path); //경로에 있는 파일 dir 변수에 삽입
	
	ArrayList<File> files = new ArrayList<File>(); //파일을 arraylist 담음
	
	add(dir, files); 
	
	for(int i =0; i<files.size()-1; i++) {  //폴더가 2개이므로 한번 더 돌음
		for(int j =0; j<files.size()-i-1; j++) { //파일 폴더 내부 탐색
			if(files.get(j).length()<files.get(j+1).length()) { //크기가 뒤의 파일보다 작을 때 
				File temp = files.get(j); // 
				files.set(j, files.get(j+1));
				files.set(j+1,temp);
			}
		}
	}
	
	System.out.printf("%-20s%s\t%5s\n","파일명","크기","파일이 들어있는 폴더");
	
	for(File file: files) {
		System.out.printf("%20s\t%5s\t%s\n"
		, file.getName()
		, getSize(file.length())
		, file.getParentFile().getName());
	}

}

	

private static String getSize(long length) { //용량 표현 
	if(length<1024) { 
		return length + "B";
		
	}else if (length<1024*1024) {
		return String.format("%.1f", length / 1024.0)+"KB";
	}else if (length<1024*1024*1024) {
		return String.format("%.1f", length/(1024.0*1024.0)) +"MB";
	}else if (length<1024*1024*1024*1024) {
		return String.format(".1f", length/(1024.0*1024*1024)) + "GB";
	}else {
		return String.format(".1f", length/(1024.0*1024*1024*1024)) + "TB";
	}
}

	
private static void add(File dir, ArrayList<File> files) { 
	File[] list = dir.listFiles();
	
	for(File file : list) {
		if(file.isFile()) {
			files.add(file);
			
		}
	}
	
	for(File subdir : list) {
		if(subdir.isDirectory()) {
			add(subdir, files);
		}
	}
	
}
}
