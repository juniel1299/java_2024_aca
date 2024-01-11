package com.test.java.obj;

public class Person {

	
	private String name;
	private int age;
	private String address;
	private String nick; //별명


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getNick() {
		return nick;
	}


	public void setNick(String nick) {
		this.nick = nick;
	}
	
	public String info() {
		String temp = "";
		
		temp += "이름: " + name + "\r\n";
		temp += "나이: " + age + "\r\n";
		temp += "주소: " + address + "\r\n";
		temp += "별명: " + nick + "\r\n";
		return temp;
	}
	
}
