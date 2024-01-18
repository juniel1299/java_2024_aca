package com.test.java.file;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;

public class Ex58_File {
	
	private static int fileCount;
	private static int dirCount;
	private static int dirSize;
	static {
		fileCount = 0;
		dirCount = 0;
		dirSize = 0;
	}
	
	public static void main(String[] args) {
		
		
		//com.test.java.file > Ex58_File.java
		
		/*
		
			1. 파일/디렉토리 조작
				- 윈도우 탐색기로 하는 행동 > 자바로 구현
			
			2. 파일 입출력
				- 파일 > 읽기/쓰기
				- 텍스트 입출력
				ex) 메모장, 이클립스 등..
		
		*/
		
		//m1();
		//m2();
		
		//m3();
		//m4();
		//m5();
		//m6();
		//m7();
		
		//m8();
		//m9();
		//m10();
		//m11();
		
		//m12();
		//m13();
		m14();
		
	}//

	private static void m14() {
		
		//*****
		//폴더 > 정보?
		//- 695MB (729,363,309 바이트)
		//- 파일 11,192, 폴더 2,055
		
		String path = "C:\\class\\code\\java\\file";
		File dir = new File(path);
		
		if (dir.exists()) {
			
			count(dir);
			
			System.out.printf("총 파일 개수 : %,d\n",fileCount);
			System.out.printf("총 폴더 개수 : %,d\n",dirCount);
			System.out.printf("폴더 크기 : %,dB\n",dirSize);
		}
		
	}

	public static void count(File dir) {
		//1. 목록 가져오기
		File[] list = dir.listFiles();
		
		//2. 파일 > 개수
		for (File file : list) {
			if (file.isFile()) {
				
				file.delete();
				
//				fileCount++;
//				dirSize += file.length();
			}
		}
		
		//3. 자식 폴더 > 동일한 행동 반복
		for(File subdir : list) {
			if(subdir.isDirectory()) {
				dirCount++;
				//1 ~ 3 반복
				count(subdir);
			}
		}
		
		//빈폴더 (삭제가능)
		dir.delete();
		
		
	}

	private static void m13() {
		
		//폴더 > 정보?
		//- 695MB (729,363,309 바이트)
		//- 파일 11,192, 폴더 2,055
		
		//- 재귀 구조
		
		String path = "C:\\class\\dev\\eclipse";
		File dir = new File(path);
		
		int count = 0; //파일 개수
		
		if (dir.exists()) {
			
			File[] list = dir.listFiles(); //부모
			
			for (File file : list) {
				if (file.isFile()) {
					count++;
				}
			}
			
			for (File subdir : list) {
				if (subdir.isDirectory()) {
					
					File[] sublist = subdir.listFiles(); //자식
					
					for (File subfile : sublist) {
						if (subfile.isFile()) {
							count++;
						}
					}
					
					for (File subsubdir : sublist) {
						if (subsubdir.isDirectory()) {
							
							File[] subsublist = subsubdir.listFiles(); //손자
							
							for (File subsubfile : subsublist) {
								if (subsubfile.isFile()) {
									count++;
								}
							}
							
						}
					}
					
				}
			}
			
			
			System.out.printf("총 파일 개수: %,d개\n", count);
			
		}
		
	}

	private static void m12() {
		
		//*** 자주 사용;;
		//특정 폴더의 내용물 보기
		
		String path = "C:\\class\\dev\\eclipse";
		File dir = new File(path);
		
		if (dir.exists()) {
			
			//대상 폴더의 내용물 > 목록(배열) 가져오기
//			String[] list = dir.list();
//			
//			for (String item : list) {
//				System.out.println(item);
//			}
			
			File[] list = dir.listFiles();
			
//			for (File item : list) {
//				
//				System.out.println(item.getName());
//				System.out.println(item.isFile());
//				
//			}
			
			for (File item : list) {
				if (item.isDirectory()) {
					System.out.printf("[%s]\n", item.getName());
				}	
			}
			
			for (File item : list) {
				if (item.isFile()) {
					System.out.println(item.getName());
				}
			}
			
			
		}
		
	}

	private static void m11() {
		
		File dir  = new File("C:\\class\\code\\java\\file\\schedule");
		
		if (dir.exists()) {
			
			//빈폴더만 삭제 가능(***)
			System.out.println(dir.delete());
			
		}
		
	}

	private static void m10() {
		
		//폴더명 수정 or 폴더 이동
		//- renameTo
		
		File dir  = new File("C:\\class\\code\\java\\file\\일정");
		File dir2 = new File("C:\\class\\code\\java\\file\\schedule");
		
		System.out.println(dir.renameTo(dir2));
		
	}

	private static void m9() {
		
		//요구사항] 일정관리 > 날짜별 폴더 생성 > [2024-01-18], [2024-01-09]..
		//2024년 366일 전부~
		
		Calendar c = Calendar.getInstance();
		c.set(2024, 0, 1);
		
		//System.out.println(c.getActualMaximum(Calendar.DAY_OF_YEAR));
		
		for (int i=0; i<c.getActualMaximum(Calendar.DAY_OF_YEAR); i++) {
			
			String path = String.format("C:\\class\\code\\java\\file\\일정\\%tF", c);
			File dir = new File(path);
			dir.mkdirs();
			
			System.out.printf("%tF\n", c);
			c.add(Calendar.DATE, 1);
		}
		
	}

	private static void m8() {
		
		//요구사항] 회원 > 회원명으로 개인 폴더 생성
		String[] member = { "홍길동", "아무개", "강아지", "고양이", "독수리" };
		
		for (int i=0; i<member.length; i++) {
			
			String path = String.format("C:\\class\\code\\java\\file\\회원\\[개인폴더]%s님", member[i]);
			
			File dir = new File(path);
			
			System.out.println(dir.mkdirs());
			
		}
		
	}

	private static void m7() {
		
		//폴더 조작
		
		//생성
//		String path = "C:\\class\\code\\java\\file\\aaa";
//		File dir = new File(path);
//		
//		if (!dir.exists()) {
//			//폴더 없음
//			
//			boolean result = dir.mkdir(); //make directory
//			System.out.println(result);
//			
//		} else {
//			System.out.println("같은 이름의 폴더가 존재함.");
//		}
		
		
		String path = "C:\\class\\code\\java\\file\\bbb\\ccc\\ddd";
		File dir = new File(path);
		
		if (!dir.exists()) {
			//폴더 없음
			
			boolean result = dir.mkdirs(); //make directory
			System.out.println(result);
			
		} else {
			System.out.println("같은 이름의 폴더가 존재함.");
		}
		
	}

	private static void m6() {
		
		//삭제
		String path = "C:\\class\\code\\java\\file\\score.txt";
		File file = new File(path);
		
		if (file.exists()) {
			
			//보통 삭제: 휴지통 폴더로 이동하기 
			//진짜 삭제: 복구 불가능
			boolean result = file.delete();
			System.out.println(result);
			
		}
		
	}

	private static void m5() {
		
		//이동
		//- renameTo
		
		String path = "C:\\class\\code\\java\\file\\score.txt";
		File file = new File(path);
		
		String path2 = "C:\\class\\code\\java\\move\\score.txt";
		File file2 = new File(path2);
		
		boolean result = file.renameTo(file2);
		System.out.println(result);
		
	}

	private static void m4() {
		
		//파일명 수정
		//- score.txt > jumsu.txt
		
		String path = "C:\\class\\code\\java\\file\\score.txt";
		File file = new File(path);
		
		String path2 = "C:\\class\\code\\java\\file\\jumsu.txt";
		File file2 = new File(path2);
		
		boolean result = file.renameTo(file2);
		System.out.println(result);
		
	}

	private static void m3() {
		
		//파일 조작 > 생성, 복사(X), 이동, 파일명 수정, 삭제 등..
		
		//생성
		String path = "C:\\class\\code\\java\\file\\score.txt";
		
		File file = new File(path);
		
		try {
			
			//동일한 파일이 있으면 동작 안함(false)
			boolean result = file.createNewFile();
			System.out.println(result);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	private static void m2() {
		
		//폴더 > 정보
		//- 폴더 == 파일의 일종
		
		//폴더 경로
		String path = "C:\\class\\code\\java\\file";
		
		//폴더 참조 객체
		File dir = new File(path);
		
		if (dir.exists()) {
			
			System.out.println(dir.getName());
			System.out.println(dir.isFile());
			System.out.println(dir.isDirectory());
			System.out.println(dir.length()); //0
			System.out.println(dir.getAbsolutePath());
			System.out.println(dir.lastModified());
			System.out.println(dir.isHidden());
			System.out.println(dir.canRead());
			System.out.println(dir.canWrite());
			System.out.println(dir.getParent());
			
		} else {
			System.out.println("폴더가 존재하지 않습니다.");
		}
				
	}

	private static void m1() {
		
		//파일 > 정보
		//- C:\class\code\java\file\data.txt
		
		//자바 프로그램에서 외부 파일을 접근
		//1. 외부 파일을 참조하는 객체를 생성 > 중계인, 대리인
		//2. 참조 객체 조작 > 실제 파일에 적용
		
		//파일 경로
		String path = "C:\\class\\code\\java\\file\\data.txt";
		
		//파일 참조 객체 > java.io.File 클래스
		File file = new File(path);
		
		//System.out.println(file.exists());
		
		if (file.exists()) {
			
			//파일 조작
			
			System.out.println(file.getName()); //data.txt
			System.out.println(file.isFile()); //true
			System.out.println(file.isDirectory()); //false
			System.out.println(file.length()); //16 > 파일 크기(바이트)
			System.out.println(file.getAbsolutePath()); //C:\class\code\java\file\data.txt
			System.out.println(file.lastModified()); //1705547413588
			
			//tick > 년월일시분초
			Calendar c1 = Calendar.getInstance();
			System.out.println(c1.getTimeInMillis());
			c1.setTimeInMillis(file.lastModified());
			System.out.printf("%tF %tT\n", c1, c1);
			
			System.out.println(file.isHidden()); //false
			System.out.println(file.canRead()); //true
			System.out.println(file.canWrite()); //true
			System.out.println(file.getParent()); //C:\class\code\java\file
			
			
		} else {
			System.out.println("해당 경로에 파일이 없습니다.");
		}
		
		
		
	}//m1
	
}















