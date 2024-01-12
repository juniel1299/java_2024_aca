package com.test.question;

import java.util.Scanner;

public class Q083 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String file ="";
	
	int index =0;
	int mp3 =0;
	int jpg = 0;
	int java = 0;
	int hwp = 0;
	int doc = 0;
	
	for(int i=0; i<10; i++) {
		System.out.print("파일명: ");
		file = scan.nextLine();
		
		index =file.lastIndexOf("."); //.가 어느 위치에 있는지 확인 
		file = file.toLowerCase(); //대문자로 들어 올 수 있기 때문에 모두 소문자로 변경
		
		if(file.substring(index).equals(".mp3")) { //file 문자열에 substring(index) .부터 검색하게 지정
			mp3 ++; //만약 .mp3가 존재한다면 mp3를  1증가 
		}else if(file.substring(index).equals(".jpg")){ //위와 동일
			jpg++;
		}else if(file.substring(index).equals(".java")) {
			java++;
		}else if(file.substring(index).equals(".hwp")) {
			hwp++;
		}else if(file.substring(index).equals(".doc")) {
			doc++;
		}
		
	}
	//합계 출력
	System.out.printf("mp3: %d개\n",mp3);
	System.out.printf("jpg: %d개\n",jpg);
	System.out.printf("java: %d개\n",java);
	System.out.printf("hwp: %d개\n",hwp);
	System.out.printf("doc: %d개\n",doc);
	
	
	
}//main




}
