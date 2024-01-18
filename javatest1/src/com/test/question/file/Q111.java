package com.test.question.file;

import java.io.File;
import java.util.Scanner;

public class Q111 {
public static void main(String[] args) {
	//C:\class\dev\eclipse
	Scanner scan = new Scanner(System.in);
	String Folder ="";
	
	System.out.print("폴더: ");
	
	Folder = scan.nextLine();
	
	File dir = new File(Folder);
	System.out.println(dir.listFiles());
	
	
	
	}
	
}//main

