package com.test.JDBC;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class ex03_Statement {
public static void main(String[] args) {
	
	//m1();
	//m2();
	//m3();
	//m4();
	//m5();
	//m6();
	//ex03_Statement
	
	/*
	 
		Connection 
		- 연결/종료
		
		Statement
		- 모든 SQL 실행하는 역할
		
		Statement 종류
		1. Statement
			- 기본
			
		2. PreparedStatement
			- Statement 개량 > 매개변수 처리 특화
			
		3. CallableStatement
			- Statement 개량 > 프로시저 호출 전용 
		
		
	 */
	
}
private static void m6() {
	// TODO Auto-generated method stub
	
	// 자바의 자료형과 오라클 자료형은 아무 상관 없음. 

	// UI + SQL 입력 + 실행까지 
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("이름 : ");		//varchar2
	String name = scan.nextLine();
	
	System.out.println("나이 : "); //number
	String age = scan.nextLine();
	
	System.out.println("성별(m,f) : ");
	String gender = scan.nextLine();
	
	System.out.println("전화번호: ");
	String tel = scan.nextLine();
	
	System.out.println("주소 : ");
	String address = scan.nextLine();
	
	address = address.replace("'","''");
	
	
	
	Connection conn = null;
	Statement stat = null;
	
	try {
		
		conn = DBUtil.open();
		
		if(!conn.isClosed()) {
		
		// 자바는 SQL 모름 -> SQL을 문자열로 취급 (의미x)
		
			//String sql = "insert into tblAddress (seq,name,age,gender,tel,address,regdate) values (seqAddress.nextVal,"+name+","+age+","+gender+","+address+",default)";
			
			String sql = String.format("insert into tblAddress (seq,name,age,gender,tel,address,regdate) values (seqAddress.nextVal,'%s',%s,'%s','%s','%s',default)",name,age,gender,tel,address);
			
			
			
			stat = conn.createStatement();
			
			//반환값이 없는 쿼리
			// int stat.executeUpdate(sql)
			
			
			//반환값이 있는 쿼리 
			// ResultSet stat.executeQuery(sql)
			
			// SQL Developer 의 Ctrl + Enter 역할
			int result = stat.executeUpdate(sql);
			
			if (result ==1) {
				System.out.println("등록 성공");
			}else {
				System.out.println("등록 실패");
			}
			
			// 자원 정리
			stat.close();
			conn.close();
			
		}else {
			System.out.println("DB 접속 실패");
		}
		
		
	}catch(Exception e){
		
	}
	
	
}
private static void m5() {
	// TODO Auto-generated method stub
	Connection conn = null;
	Statement stat = null;
	
	try {
		
		conn = DBUtil.open();
		
		if(!conn.isClosed()) {
		
		// 자바는 SQL 모름 -> SQL을 문자열로 취급 (의미x)
		
			String sql =  """
					
				create table tblAddress(
				    seq number primary key,                    
				    name varchar2(30) not null,                     
				    age number(3) not null check (age between 0 and 150),           
				    gender char(10) not null check(gender in ('m','f')),            
				    tel varchar2(15) not null,                              
				    address varchar2(300) not null,                     
				    regdate date default sysdate not null               
				)
					""";
			
			
			stat = conn.createStatement();
			
			//반환값이 없는 쿼리
			// int stat.executeUpdate(sql)
			
			
			//반환값이 있는 쿼리 
			// ResultSet stat.executeQuery(sql)
			
			// SQL Developer 의 Ctrl + Enter 역할
			
			
			// create 는 컬럼이 생기지 않으므로 result 값이 0 나옴 
			int result = stat.executeUpdate(sql);
			
			if (result ==1) {
				System.out.println("등록 성공");
			}else {
				System.out.println("등록 실패");
			}
			
			//conn.commit();
			conn.rollback();
			// 자원 정리
			stat.close();
			conn.close();
			
		}else {
			System.out.println("DB 접속 실패");
		}
		
		
	}catch(Exception e){
		
	}
}
private static void m4() {
	// TODO Auto-generated method stub

	Connection conn = null;
	Statement stat = null;
	
	try {
		
		conn = DBUtil.open();
		
		if(!conn.isClosed()) {
		
		// 자바는 SQL 모름 -> SQL을 문자열로 취급 (의미x)
		
			String sql =  "delete from tblAddress where seq = 7";
			
			
			stat = conn.createStatement();
			
			//반환값이 없는 쿼리
			// int stat.executeUpdate(sql)
			
			
			//반환값이 있는 쿼리 
			// ResultSet stat.executeQuery(sql)
			
			// SQL Developer 의 Ctrl + Enter 역할
			int result = stat.executeUpdate(sql);
			
			if (result ==1) {
				System.out.println("등록 성공");
			}else {
				System.out.println("등록 실패");
			}
			
			//conn.commit();
			conn.rollback();
			// 자원 정리
			stat.close();
			conn.close();
			
		}else {
			System.out.println("DB 접속 실패");
		}
		
		
	}catch(Exception e){
		
	}
}
private static void m3() {
	// TODO Auto-generated method stub
	
	
	
	Connection conn = null;
	Statement stat = null;
	
	try {
		
		conn = DBUtil.open();
		
		if(!conn.isClosed()) {
		
		// 자바는 SQL 모름 -> SQL을 문자열로 취급 (의미x)
		
			String sql =  "Update tbladdress set age = age + 1 where seq = 2";
			
			
			stat = conn.createStatement();
			
			//반환값이 없는 쿼리
			// int stat.executeUpdate(sql)
			
			
			//반환값이 있는 쿼리 
			// ResultSet stat.executeQuery(sql)
			
			// SQL Developer 의 Ctrl + Enter 역할
			int result = stat.executeUpdate(sql);
			
			if (result ==1) {
				System.out.println("등록 성공");
			}else {
				System.out.println("등록 실패");
			}
			
			//conn.commit();
			conn.rollback();
			// 자원 정리
			stat.close();
			conn.close();
			
		}else {
			System.out.println("DB 접속 실패");
		}
		
		
	}catch(Exception e){
		
	}
}
private static void m2() {
	// TODO Auto-generated method stub
	
	//JDBC
	//1. 기본 > SQL 실행 시 자동으로 커밋이 동반된다. > Auto Commit
	//2. 설정 > 수동 트랜잭션 제어 
	
	
	Connection conn = null;
	Statement stat = null;
	
	try {
		
		conn = DBUtil.open();
		
		if(!conn.isClosed()) {
		
		// 자바는 SQL 모름 -> SQL을 문자열로 취급 (의미x)
		
			String sql = "insert into tblAddress (seq,name,age,gender,tel,address,regdate) values (seqAddress.nextVal,'하하하',20,'m','010-1234-5678','서울시 강남구 역삼동 한독빌딩',default)";
			
			
			stat = conn.createStatement();
			
			//반환값이 없는 쿼리
			// int stat.executeUpdate(sql)
			
			
			//반환값이 있는 쿼리 
			// ResultSet stat.executeQuery(sql)
			
			// SQL Developer 의 Ctrl + Enter 역할
			int result = stat.executeUpdate(sql);
			
			if (result ==1) {
				System.out.println("등록 성공");
			}else {
				System.out.println("등록 실패");
			}
			
			//conn.commit();
			conn.rollback();
			// 자원 정리
			stat.close();
			conn.close();
			
		}else {
			System.out.println("DB 접속 실패");
		}
		
		
	}catch(Exception e){
		
	}
	
	
	
	
	
	
}
private static void m1() {
	
	Connection conn = null;
	Statement stat = null;
	
	try {
		
		conn = DBUtil.open();
		
		if(!conn.isClosed()) {
		
		// 자바는 SQL 모름 -> SQL을 문자열로 취급 (의미x)
		
			String sql = "insert into tblAddress (seq,name,age,gender,tel,address,regdate) values (seqAddress.nextVal,'아무개',20,'m','010-1234-5678','서울시 강남구 역삼동 한독빌딩',default)";
			
			
			stat = conn.createStatement();
			
			//반환값이 없는 쿼리
			// int stat.executeUpdate(sql)
			
			
			//반환값이 있는 쿼리 
			// ResultSet stat.executeQuery(sql)
			
			// SQL Developer 의 Ctrl + Enter 역할
			int result = stat.executeUpdate(sql);
			
			if (result ==1) {
				System.out.println("등록 성공");
			}else {
				System.out.println("등록 실패");
			}
			
			// 자원 정리
			stat.close();
			conn.close();
			
		}else {
			System.out.println("DB 접속 실패");
		}
		
		
	}catch(Exception e){
		
	}
}

}
