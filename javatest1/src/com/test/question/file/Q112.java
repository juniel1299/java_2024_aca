package com.test.question.file;

import java.io.File;
import java.util.Scanner;

public class Q112 {
public static void main(String[] args) {
	
	//C:\class\java\file\AAA\test.txt
	
	Scanner scan = new Scanner(System.in);
	
	File path1 = new File("C:\\class\\code\\java\\test.txt");
	File path2 = new File("C:\\class\\code\\java\\test1.txt");
	
	String Ans = "";
	
	System.out.println("파일 이동을 실행합니다.");
	
	System.out.print("같은 이름을 가지는 파일이 이미 존재합니다. 덮어쓸까요? (y/n)");
	Ans = scan.nextLine();
	
	if(Ans.equals("y")) {
		System.out.println(path1.renameTo(path2));
	}else {
		System.out.println("작업을 취소합니다.");
	}
	
	
}//main
}
