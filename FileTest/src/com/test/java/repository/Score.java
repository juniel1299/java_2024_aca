package com.test.java.repository;


//텍스트 1줄 == 1명의 성적
public class Score {
	
	
	//홍길동,100,90,80
	//아무개,90,80,90
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public Score(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
	}

	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}

	
	public int getTotal(){
		return kor + eng + math;
	}
	
	public double getAvg(){
		return getTotal()/3.0;
	}
	@Override
	public String toString() {
		return String.format("[name=%s, kor=%s, eng=%s, math=%s]\r\n"
				, name
				, kor
				, eng
				, math);
	}
	
	
	
}
