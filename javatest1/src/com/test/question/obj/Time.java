package com.test.question.obj;

public class Time {

	//시간 변수 
	private int hour; 
	private int minute;
	private int second;
	
	public Time() {
		this.hour = 0;
		this.minute = 0;
		this.second = 0;
		
	}


	public Time(int hour, int minute, int second) { //환산 
		this.second = second % 60; //60 넘는 수만 초 
		this.hour = (second / 60 + minute) / 60; //60분 넘으면 시 
		this.minute = (second / 60 + minute) % 60 ; 
		this.hour +=hour; //시는 중첩  
	}

	
	public Time (int minute, int second) {
		this.second = second % 60;
		this.hour = (second / 60 + minute) / 60;
		this.minute = (second / 60 + minute) % 60 ;
	}


	public Time (int second) {
		this.second = second % 60;
		this.hour = (second / 60 + minute) / 60;
		this.minute = (second / 60 + minute) % 60 ;
	}
public String info() {
	return String.format("%d:%02d:%02d"
			, this.hour
			, this.minute
			, this.second);
}
}
