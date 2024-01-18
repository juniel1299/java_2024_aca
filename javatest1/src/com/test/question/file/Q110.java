package com.test.question.file;

import java.io.File;
import java.util.Scanner;

public class Q110 {
	public static void main(String[] args) {
		//C:\\movie\\SpiderMan.mp4
		Scanner scan = new Scanner(System.in);
		String path = "";
		//폴더 경로
		System.out.print("파일경로:");
		
		path = scan.nextLine();
		
		//폴더 참조 객체
		File dir = new File(path);
		String index = ".";
		
		System.out.printf("파일명: %s\n",dir.getName());
		System.out.printf("종류: %s 파일\n",path.substring(path.indexOf(".") +1));
		System.out.printf("파일크기: %d B",dir.length());

	}//main
}
