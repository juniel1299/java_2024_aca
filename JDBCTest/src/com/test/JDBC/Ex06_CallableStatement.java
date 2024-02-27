package com.test.JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

import oracle.jdbc.internal.OracleTypes;





public class Ex06_CallableStatement {
public static void main(String[] args) {

	
	//m1();
	//m2();
	//m3();
	m4();
	//m5();
}

private static void m5() {
	// TODO Auto-generated method stub
	
	Connection conn = null;
	CallableStatement stat = null;
	ResultSet rs = null;
	
	try {
		
		conn=DBUtil.open();
		String sql = "{ procM5(?,?)}";
		stat = conn.prepareCall(sql);
		
		stat.setString(1, "영업부");
		stat.registerOutParameter(2, OracleTypes.CURSOR);
		
		stat.executeQuery();

		
		// out > 오라클 커서 == 결과셋 == JDBC ResultSet 
		
		rs = (ResultSet)stat.getObject(2);
		
		while(rs.next()) {
			System.out.println(rs.getString("name"));
		}
		
		stat.close();
		conn.close();
		
	}catch(Exception e) {
		
	}
	
}

private static void m4() {
	// TODO Auto-generated method stub
	
	Connection conn = null;
	CallableStatement stat = null;
	ResultSet rs = null;
	
	try {
		
		conn=DBUtil.open();
		
		
		String sql = "{ call procM4(?,?,?,?,?) }";
		stat = conn.prepareCall(sql);
		//in
		stat.setString(1,"1001");
		
		//out
		stat.registerOutParameter(2, OracleTypes.VARCHAR);
		stat.registerOutParameter(3, OracleTypes.VARCHAR);
		stat.registerOutParameter(4, OracleTypes.VARCHAR);
		stat.registerOutParameter(5, OracleTypes.VARCHAR);
		
		stat.executeQuery();
		
		System.out.println(stat.getString(2));
		System.out.println(stat.getString(3));
		System.out.println(stat.getString(4));
		System.out.println(stat.getString(5));
		
		stat.close();
		conn.close();
		
	}catch(Exception e) {
		
	}
	
}

private static void m3() {
	// TODO Auto-generated method stub
	
	Connection conn = null;
	CallableStatement stat = null;
	ResultSet rs = null;
	
	try {
	
	conn = DBUtil.open();
	
	String sql = "{ call procM3(?)}";
	
	stat = conn.prepareCall(sql); //매개변수 처리 기능 보유

	// in parameter 에선 m2 방식으로 함 
	
	//out parameter 에서는 
	
	stat.registerOutParameter(1,OracleTypes.NUMBER);			//오라클 자료형 써야함 
	
	stat.executeQuery();
	
	//PLSQL문에서 인출을 수행할 수 없습니다.  
	//System.out.println(rs.next());
	
	int count = stat.getInt(1);
	System.out.println(count);
	
	stat.close();
	conn.close();
	
	
	}catch(Exception e) {
		
	}
	
	
}

private static void m2() {
	// TODO Auto-generated method stub

	Connection conn = null;
	CallableStatement stat = null;
	ResultSet rs = null;
	
	try {
	
	conn = DBUtil.open();
	
	String sql = "{ call procM2(?,?,?,?,?)}";
	
	stat = conn.prepareCall(sql); //매개변수 처리 기능 보유

	stat.setString(1, "후후후");
	stat.setString(2, "22");
	stat.setString(3, "m");
	stat.setString(4, "010-4326-3259");
	stat.setString(5, "서울시");
	
	
	int result = stat.executeUpdate();
	System.out.println(result);
	
	
	stat.close();
	conn.close();
	
	
	}catch(Exception e) {
		
	}
	
}




private static void m1() {
	// TODO Auto-generated method stub
	
	Connection conn = null;
	CallableStatement stat = null;
	ResultSet rs = null;
	
	try {
	
	conn = DBUtil.open();
	
	String sql = "{ call procM1 }";
	
	stat = conn.prepareCall(sql); //매개변수 처리 기능 보유

	
	int result = stat.executeUpdate();
	System.out.println(result);
	
	
	stat.close();
	conn.close();
	
	
	}catch(Exception e) {
		
	}
	
}


private static void temp() {
	Connection conn = null;
	CallableStatement stat = null;
	ResultSet rs = null;
	
	try {
		
		conn=DBUtil.open();
		
		
		
		conn.close();
		
	}catch(Exception e) {
		
	}
}

}
