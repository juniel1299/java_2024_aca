package com.test.question.file;

import java.io.File;
import java.util.HashMap;
import java.util.Set;

public class Q114 {
public static void main(String[] args) {
	
	//경로 C:\Users\\user\Downloads\파일 디렉토리 문제\확장자별 카운트
	
	
	String path = "C:\\Users\\user\\Downloads\\파일 디렉토리 문제\\확장자별 카운트"; //경로
	
	File Folder = new File(path); //경로를 file 로 객체선언
	//hashmap은 방이름이 있는 점을 이용해 각각 나눠서 계산
	HashMap<String,Integer> count = new HashMap<String, Integer>(); 
	//
	File[] list = Folder.listFiles();
	
	for(File file: list) { //우선 파일에 어떤 종류의 파일들이 있는지 확인 
		//indexOf로 . 뒤에 있는 글자를 가져와서 exe 변수에 저장 
		String exe = file.getName().substring(file.getName().indexOf(".")+1); 
		
		
		if(count.get(exe) == null) { //exe에 들어간 변수가 존재하지 않을 경우 
			count.put(exe, 1); //새로 추가하여 1개 출력
		}else {
			count.put(exe, count.get(exe)+1); //exe에 들어간 변수가 이미 존재하는 변수일 때 중첩하여 count
		}
	}
	
	System.out.println(count); //다 합친 결과 HashMap을 통해 출력
	
	Set<String> keys = count.keySet(); //각각의 파일마다 개수를 set에 담음
	
	for(String key : keys) {
		System.out.printf("*%s: %d개\n", key, count.get(key)); //최종 출력 
	} 
	
	
	
	
	
}
}
