package com.test.JDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex04_select {
	
	public static void main(String[] args) {
		
		//Ex04_select.java
		
		//m1();
		//m2();
		//m3();
		//m4();
		m5();
	}//main

	private static void m5() {
		// TODO Auto-generated method stub
		
		//tblInsa + tblBonus 
		// 요구 사항 특정 직원에게 보너스를 지급하는 프로그램 작성 
		//1. 모든 직원 명단 출력 (직원번호, 이름, 부서 , 직위) > m4 참조
		//2. 사용자 > 직원 선택 (직원 번호 입력)
		//3. 사용자 > 보너스 금액 입력
		//4. 보너스 지급 > insert
		//5. 지급된 내역을 출력(tblBonus > 직원번호, 이름, 부서, 직위 , 보너스 금액)
		
		Scanner scan = new Scanner(System.in);
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		
try {
			
			conn = DBUtil.open();
			stat = conn.createStatement();
			
			//1. 직원 명단 가져오기(select tblInsa)
			//2. 보너스 지급할 직원 선택(scan.nextLine)
			//3. 지급 할 보너스 금액 입력(scan.nextLine)
			//4. 보너스 지급 (insert tblBonus)
			//5. 지급된 보너스 출력 (select tblBonus)
			
			String sql = "select num,name,buseo,jikwi from tblInsa";
			rs = stat.executeQuery(sql);
			ArrayList<String> blist = new ArrayList<String>();
			int n = 1001;
			while (rs.next()) {
				System.out.printf("%d. %s\t %s\t %s\t %s\n"
						, n
						, rs.getString("name")
						, rs.getString("buseo")
						,rs.getString("jikwi"));
						n++;
						blist.add(rs.getString(n));

				}
			
//			ArrayList<String> blist = new ArrayList<String>();
//			
//			int n = 1;
//			while (rs.next()) {
//				System.out.printf("%d. %s\n", n, rs.getString("buseo"));
//				n++;
//				blist.add(rs.getString("buseo"));
//			}
//			
//			System.out.print("선택(번호): ");
//			int sel = scan.nextInt();
//			
//			String buseo = blist.get(sel - 1);		
//			
//			
//			
//			sql = String.format("select * from tblInsa "
//											+ "where buseo = '%s'", buseo);
//			
//			rs = stat.executeQuery(sql);
//			
//			System.out.println("[이름]\t[직위]\t[지역]\t[급여]");
//			
//			while (rs.next()) {
//				//레코드 1줄 = 직원 1명
//				System.out.printf("%s\t%s\t%s\t%,10d원\n"
//									, rs.getString("name")
//									, rs.getString("jikwi")
//									, rs.getString("city")
//									, rs.getInt("basicpay"));
//				
//			}
			
			
			stat.close();
			conn.close();
}catch(Exception e){
	
}
		
	}

	private static void m4() {
		
		//부서 입력 > 직원 명단 출력
		
		Scanner scan = new Scanner(System.in);
//		System.out.print("부서명: ");
//		String buseo = scan.nextLine();
		
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		
		try {
			
			conn = DBUtil.open();
			stat = conn.createStatement();
			
			
			
			String sql = "select distinct buseo from tblInsa order by buseo asc";
			rs = stat.executeQuery(sql);
			
			System.out.println("보고 싶은 부서를 선택하세요.");
			ArrayList<String> blist = new ArrayList<String>();
			
			int n = 1;
			while (rs.next()) {
				System.out.printf("%d. %s\n", n, rs.getString("buseo"));
				n++;
				blist.add(rs.getString("buseo"));
			}
			
			System.out.print("선택(번호): ");
			int sel = scan.nextInt();
			
			String buseo = blist.get(sel - 1);		
			
			
			
			sql = String.format("select * from tblInsa "
											+ "where buseo = '%s'", buseo);
			
			rs = stat.executeQuery(sql);
			
			System.out.println("[이름]\t[직위]\t[지역]\t[급여]");
			
			while (rs.next()) {
				//레코드 1줄 = 직원 1명
				System.out.printf("%s\t%s\t%s\t%,10d원\n"
									, rs.getString("name")
									, rs.getString("jikwi")
									, rs.getString("city")
									, rs.getInt("basicpay"));
				
			}
			
			
			stat.close();
			conn.close();
			
		} catch (Exception e) {
			System.out.println("Ex04_select.m4");
			e.printStackTrace();
		}
		
	}

	private static void m3() {
		
		//다중값 반환
		//- 다중 레코드
		//- N행 1열
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		
		try {
			
			conn = DBUtil.open();
			stat = conn.createStatement();
			
			String sql = "select name from tblInsa order by name asc";
			
			//60명
			rs = stat.executeQuery(sql); //BOF
			
			//ResultSet.next가 호출되지 않았음
			//System.out.println(rs.getString("name"));
			
			rs.next();
			System.out.println(rs.getString("name"));
			
			System.out.println(rs.getString("name"));
			
			rs.next();
			System.out.println(rs.getString("name"));
			
			while (rs.next()) {
				System.out.println(rs.getString("name"));			
			}
						
			stat.close();
			conn.close();
			
		} catch (Exception e) {
			System.out.println("Ex04_select.m3");
			e.printStackTrace();
		}
		
	}

	private static void m2() {
		
		//다중값 반환
		//- 1행 N열
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		
		try {
			
			conn = DBUtil.open();
			stat = conn.createStatement();
			
			String sql = "select * from tblAddress where seq = 5";
			
			rs = stat.executeQuery(sql);
			
			if (rs.next()) {
				
				String name = rs.getString("name");
				String age = rs.getString("age");
				String address = rs.getString("address");
				
				System.out.println(name);
				System.out.println(age);
				System.out.println(address);
				
			} else {
				System.out.println("5번 데이터가 없습니다.");
			}
			
			stat.close();
			conn.close();
			
		} catch (Exception e) {
			System.out.println("Ex04_select.m2");
			e.printStackTrace();
		}
		
	}

	private static void m1() {
		
		//단일값 반환
		//- 1행 1열
		
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		
		try {
			
			conn = DBUtil.open();
			stat = conn.createStatement();
			
			String sql = "select count(*) as cnt from tblAddress";
			
			rs = stat.executeQuery(sql);
			
			//ResultSet == 커서(Cursor) > 판독기 == 스트림, Iterator, 향상된 for
			
			rs.next(); //커서 1줄 전진
			
			//현재 커서가 가르키고 있는 레코드의 원하는 컬럼을 가져오기
			// - rs.getXXX()
			
			//int count = rs.getInt(1); //컬럼 순서
			//int count = rs.getInt("cnt"); //컬럼명
			String count = rs.getString("cnt");
			
			System.out.println(count);
			
			
			stat.close();
			conn.close();
			
		} catch (Exception e) {
			System.out.println("Ex04_select.m1");
			e.printStackTrace();
		}
		
	}

}



















