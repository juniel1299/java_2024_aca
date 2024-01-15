package com.test.java;

import java.util.Random;

public class Ex50_Random {
public static void main(String[] args) {
	
	//Ex50_Random
	
	
	
	//1.Math.random()
	//2. Random 클래스 
	
	//m1();
	m2();
	
}//main

private static void m2() {
	// TODO Auto-generated method stub
	Random rnd = new Random();
	//프로젝트 
	//- 주제 선정 
	// 레시피 제공 
	
	//학생 정보  > 프로그램 
	//- 학교 규모 ? 
	//- 500여명 > 1년 생활 > 데이터 
	//성적, 출결, 기타 등등..
	// 이름, 나이, 성별, 주소, 키
	
	//문자열 난수 > 배열 

	String[] name1 = {"김","이","박","최","정","유","민","차","장","조","전",};
	
	String[] name2 = {"길","동","재","석","명","수","세","원","호","미","주","이","경"};
	
	String[] address1 = {"서울시","인천시","부산시","강릉시","대구시","광주시","제주시"};
	
	String[] address2 = {"강남구","강동구","강서구","강북구","중구"};
	
	String[] address3 = {"역삼동","대치동","압구정동","천호동","길동","명일동"};	
	for(int i=0; i<200; i++) { //1학년 데이터
	
		String name = name1[rnd.nextInt(name1.length)]
				+ name2[rnd.nextInt(name2.length)]
						+ name2[rnd.nextInt(name2.length)];
		
		//System.out.println(name);
		String address  = address1[rnd.nextInt(address1.length)] + " "
						+ address2[rnd.nextInt(address2.length)] + " "
						+ address3[rnd.nextInt(address3.length)] + " "
						+ (rnd.nextInt(300)+ 100) + "번지";
		
		int age = rnd.nextInt(2) + 13;
		
		String gender = rnd.nextInt(2) == 0 ? "남자" : "여자";
		
		System.out.printf("%s(%d세) %s, %s\n",name,age,gender,address);
		
	}
	
	
}

private static void m1() {
	// TODO Auto-generated method stub
	Random rnd = new Random();
	
	//각 자료형 별 > 난수 발생
	//rnd.nextxxx();
//	System.out.println(rnd.nextInt());
	System.out.println(rnd.nextDouble()); //0~1 사이 값
	System.out.println(rnd.nextInt(10)); // 0~9 까지의 난수 발생, 가장 많이 씀  
}
}
