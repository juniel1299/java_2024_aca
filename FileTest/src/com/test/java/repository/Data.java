package com.test.java.repository;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

//텍스트 파일과 관련된 업무를 담당하는 담당자 

public class Data {

	
	//score.txt > 자료형? 구조 > 메모리 > 클래스 or 해쉬 or arraylist 
	// 성적 1명 > 텍스트 파일 1줄 > 자바 자료형 >  Score.java
	//홍길동,100,90,80
	//아무개,90,80,90
	
	//프로그램 시작 > score.txt > 메모리
	
	
	
	private static final String SCORE = "dat\\score.txt";
	
	public static ArrayList<Score> list = new ArrayList<Score>(); //score.txt 내용을 ArrayList에 저장
	
	
	
	
	public static void load() {
	
		
		try {

			BufferedReader reader = new BufferedReader(new FileReader(Data.SCORE));
			
			String line = null;
			
			while((line = reader.readLine()) !=null) {
				
				//텍스트 1줄 > Score 객체 1줄
				//홍길동 100,90,80
				String[] temp = line.split(",");
				
				Score score = new Score(temp[0]
						,Integer.parseInt(temp[1])
						,Integer.parseInt(temp[2])
						,Integer.parseInt(temp[3]));
				
				
				
				list.add(score);
				
				
			}
			
			reader.close();
		} catch (Exception e) {
			System.out.println("Data.load");
			e.printStackTrace();
			System.out.println("Data.load");
		}
		
	}
	
	
	
}















