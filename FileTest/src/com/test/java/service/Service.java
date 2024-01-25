package com.test.java.service;

import java.util.Scanner;

import com.test.java.repository.Data;
import com.test.java.repository.Score;

//주업무객체 (실무담당자)
public class Service {
	public void add() {
		
		Scanner scan = new Scanner(System.in);
		String name = "";
		int kor = 0;
		int eng = 0;
		int math = 0;
		System.out.println("-----------------------------");
		System.out.println("           성적 추가");
		System.out.println("-----------------------------");
		
		System.out.print("이름");
		name = scan.nextLine();
		System.out.print("국어");
		kor = scan.nextInt();
		
		System.out.print("영어");
		eng = scan.nextInt();
		System.out.print("수학");
		math = scan.nextInt();
		
		scan.nextLine();
		
		//입력받은 성적 1개 > Score 객체 1개 > ArrayList의 list.add()
		Score score = new Score(name, kor, eng, math);
		Data.list.add(score); // 성적 추가
		
		System.out.println(Data.list);
		
		System.out.println("계속하려면 엔터를 입력....,.");
		
		scan.nextLine();
		
		
		
	}

}
