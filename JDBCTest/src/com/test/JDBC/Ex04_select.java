package com.test.JDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex04_select {
public static void main(String[] args) {

	
	//Ex04.select.java
	
	//m1();
	//m2();
	m3();
}

private static void m3() {
	// TODO Auto-generated method stub
	
	//다중값 반환
	
	//다중 레코드
	// N행 1열 가져오기 

	Connection conn = null;
	Statement stat = null;
	ResultSet rs= null;
	try {
	
		
		conn = DBUtil.open();
		stat = conn.createStatement();
		
		
		stat.close();
		conn.close();
		
	}catch(Exception e){
		
	}
}

private static void m2() {
	// TODO Auto-generated method stub
	
	//다중값 반환
	// 1행 N열 
	
	Connection conn = null;
	Statement stat = null;
	ResultSet rs= null;
	
	
	try {
	
		
		conn = DBUtil.open();
		stat = conn.createStatement();
		
		String sql = "select * from tblAddress where seq = 8";
		
		rs = stat.executeQuery(sql);
		
		if(rs.next()) {
			String name = rs.getString("name");
			String age = rs.getString("age");
			String address = rs.getString("address");
			System.out.println("완료");
		} else {
			System.out.println("5번 없음");
		}
		
		stat.close();
		conn.close();
		
	}catch(Exception e){
		
	}
	
	
	
}

private static void m1() {
	// TODO Auto-generated method stub
	
	// 단일값 반환
	// 1행 1열 
	Connection conn = null;
	Statement stat = null;
	ResultSet rs= null;
	
	try {
		conn = DBUtil.open();
		stat = conn.createStatement();
		
		String sql = "select count(*) as cnt from tblAddress";
		
		rs = stat.executeQuery(sql);
		
		//ResultSet = 커서 (Cursor) > 판독기 == 스트림 , Iterator 향상된 for 문
		
		rs.next(); // 커서 한 줄 전진 > 
		
		// 현재 커서가 가리키고 있는 레코드의 원하는 컬럼을 가져오기 -> rs.getXXX()
		
		// int count = rs.getInt(1);
		int count = rs.getInt("cnt"); // 오라클 스타일로 해야함 .. 1부터 시작
		
		
		
		System.out.println(count);
		
		stat.close();
		conn.close();
		
	}catch(Exception e) {
		
	}
	
}
}
