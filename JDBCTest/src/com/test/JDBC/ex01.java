package com.test.JDBC;
import java.sql.Connection;
import java.sql.DriverManager;

public class ex01 {
public static void main(String[] args) {

	
	System.out.println("[데이터베이스 접속하기]");
	Connection conn = null;
	
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	
	String id = "hr";
	String pw = "java1234";
	
	
	//DB 연결
	// DB 접속 성공
	// 접속 정보를 가지고 있는 Connection 객체 반환 
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//DB 연결
		// DB 접속 성공
		// 접속 정보를 가지고 있는 connection 객체 반환
		conn = DriverManager.getConnection(url,id,pw);
		
		//현재 오라클의 접속 상태
		//접속X > true
		//접속 O > false
		System.out.println(conn.isClosed());
		
		//업무 진행 Query
		System.out.println("업무 진행");
		
		conn.close();
	}catch (Exception e) {
		
	}
	}
}


