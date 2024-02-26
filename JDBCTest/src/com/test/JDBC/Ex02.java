package com.test.JDBC;

import java.sql.Connection;

public class Ex02 {
public static void main(String[] args) {
	
	
	//접속 시 발생하는 에러 
	// 1. 서버 주소 
	// I0 오류 : The Network adapter could not establish the connection
	
	//2. 아이디나 암호 틀림
	// 0ra-01017 : 사용자명/비밀번호가 부적합, 로그온 할 수 없습니다.
	
	
	// 3. 서버 중지
	// Listener Refused the connection with the following error
	
	// 4. 연결 문자열 오타 (@ 앞에 : 같은거 ) 
	// 부적합한 oracle url이 지정되었습니다.
	
	// 5. 포트번호 잘못씀 
	// I0 오류 : The Network adapter could not establish the connection
	
	// 6. xe 를 틀렸을 때 SID
	// Listener Refused the connection with the following error
	
	// 7. forName 에서 오타 (드라이버 오타)
	//oracle.jdbc.driver.OracleDriver
	
	// 8. ojdbc8.jar 없거나 참조가 안 되었을 때
	//oracle.jdbc.driver.OracleDriver
	
	
	try {
		
		Connection conn = DBUtil.open("192.168.10.99","hr","java1234");
		
		System.out.println(conn.isClosed());
		
		conn.close();
		
	}catch(Exception e){
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//----------------------------------------------------------
	
	
	
	try {
		
		//Connection conn = DBUtil.open();
		Connection conn = DBUtil.open("192.168.10.40","hr","java1234");
		
		System.out.println(conn.isClosed());
		
		conn.close();
	}
	
	catch(Exception e){
		
	}
}
}
