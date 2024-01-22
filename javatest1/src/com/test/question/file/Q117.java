package com.test.question.file;

import java.io.File;
import java.util.HashMap;


public class Q117 {
public static void main(String[] args) {
	
//	경로 C:\Users\\user\\Downloads\\파일 디렉토리 문제\\폴더 삭제\\delete
	
	
	//반복문으로 묶어서 파일 다 지울 예정이므로 최상단 폴더를 잡음
	String path = "C:\\Users\\user\\Downloads\\파일 디렉토리 문제\\폴더 삭제\\delete";
	
	HashMap<String,Integer> count = new HashMap<String,Integer>(); //hashmap 이용 방이름 + 값 저장
	
	count.put("file", 0); //방이름 
	count.put("directory", 0); //방이름
	
	File dir = new File(path); //
	
	deleteFile(dir,count);
	
	System.out.printf("폴더를 삭제합니다.\r\n 삭제된 폴더 %d , 파일 %d\n",count.get("directory"),count.get("file"));
}
	private static void deleteFile(File dir, HashMap<String,Integer> count) {
		File[] list = dir.listFiles(); // path 경로에 있는 dir 파일을 배열에 담음
		
		for(File file:list) { //list 배열 안에 들어간 모두 무한루프를 통해 탐색
			if(file.isFile()) { // 만약 파일이 존재하면 
				count.put("file", count.get("file")+1); //키이름 file에 1개 추가
				file.delete(); //그 추가한 값 삭제 
			}
		}
	
	for(File subdir : list) { //폴더 전체를 탐색 
		if(subdir.isDirectory()) { //폴더가 감지된다면 
			deleteFile(subdir,count); //재귀 메서드 이용 다시 위로 가서 삭제
		} 
	}
	
	count.put("directory", count.get("directory")+1); //빈 폴더는 그냥 삭제가 가능하므로
	dir.delete(); //위에서 파일을 다 삭제했으므로 그냥 삭제
	
	}
	
	
	
	
}

