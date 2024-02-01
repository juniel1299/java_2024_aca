package com.test.java.chaos;

public class ViewAll {
	
	public static void adminMainView() { //관리자 메인 화면 
		System.out.println("====================================================================================");
		System.out.println();
		System.out.println("                                       관리자 모드");
		System.out.printf("\t\t  이름:                                             \n"); //이름 변수 받아서 넣으세요
		System.out.printf("\t\t  직급:                                             \n"); //직급 변수 받아서 넣으세요
		System.out.println();
		System.out.println("====================================================================================");
		System.out.println();
		System.out.println("                           선택하고자 하는 메뉴의 번호를 입력해주세요. ");
		System.out.println();
		System.out.println("====================================================================================");
		System.out.println("\t\t\t\t\t 1. 역 관리");
		System.out.println("\t\t\t\t\t 2. 직원 관리");
		System.out.println("\t\t\t\t\t 3. 고객의 소리");
		System.out.println("\t\t\t\t\t 4. 행사 캘린더");
		System.out.println("\t\t\t\t\t 5. 통계 정보");
		System.out.println("\t\t\t\t\t 6. 행동 로그 보기");
		System.out.println("\t\t\t\t\t 0. 로그아웃");
	
	
	}
	
	public static void stationMain() { //역 관리 메인 화면
		System.out.println("====================================================================================");
		System.out.println();
		System.out.println("\t\t\t\t\t 원하는 기능을 선택하세요");
		System.out.println("\t\t\t\t\t (숫자로 입력해주세요)");
		System.out.println("\t\t\t\t\t 현재 메뉴: 역 관리");
		System.out.printf("\t\t  이름:                                             \n"); //이름 변수 받아서 넣으세요
		System.out.printf("\t\t  직급:                                             \n"); //직급 변수 받아서 넣으세요
		System.out.println("====================================================================================");
		System.out.println();
		System.out.println("\t\t\t\t\t 1. 의자 없는 열차 추가");
		System.out.println("\t\t\t\t\t 2. 일반 열차 추가");
		System.out.println("\t\t\t\t\t 3. 뒤로 가기");
	}
	
	public static void trainAddOne() { // 역관리 >  열차 추가 > 추가 할 호선
		System.out.println("====================================================================================");
		System.out.println();
		System.out.println("\t\t\t\t\t 열차 추가 할 호선을 적어주세요");
		System.out.println("\t\t\t\t\t (숫자로 입력해주세요)");
		System.out.println();
		System.out.println("====================================================================================");

	}
	
	public static void trainAddTwo() { // 역 관리 >  열차 추가 > 추가 할 열차 수
		System.out.println("====================================================================================");
		System.out.println();
		System.out.println("\t\t\t\t\t 추가 할 열차 수를 적어주세요");
		System.out.println("\t\t\t\t\t (숫자로 입력해주세요)");
		System.out.println();
		System.out.println("====================================================================================");

	}
	
	public static void trainAddThree() { // 역 관리 > 열차 추가 > 추가 할 열차 수 > 확인 할 역
		System.out.println("====================================================================================");
		System.out.println();
		System.out.println("\t\t\t\t\t 확인 할 구간의 시작역을 적어주세요");
		System.out.println("\t\t\t\t\t ( (역)을 제외하고 입력해주세요)");
		System.out.println();
		System.out.println("====================================================================================");

	}
	public static void trainAddFour() { // 역 관리 > 열차 추가 > 추가 할 열차 수 > 확인 할 역 > 확인 종료 역
		System.out.println("====================================================================================");
		System.out.println();
		System.out.println("\t\t\t\t\t 확인 할 구간의 종료역을 적어주세요");
		System.out.println("\t\t\t\t\t ( (역)을 제외하고 입력해주세요)");
		System.out.println();
		System.out.println("====================================================================================");

	}
	
	public static void trainAddFive() { // 역 관리 > 열차 추가 > 추가 할 열차 수 > 확인 할 역 > 확인 종료 역 > 추가 시간대
		System.out.println("====================================================================================");
		System.out.println();
		System.out.println("\t\t\t\t\t 열차를 추가 할 시간대를 작성해주세요.");
		System.out.println("\t\t\t\t\t ( 가능 시간대 : 05:00 ~ 24:00)");
		System.out.println("\t\t\t\t\t ( (시)에 해당하는 숫자만 작성해주세요");
		System.out.println();
		System.out.println("====================================================================================");

	}
	public static void trainAddResult() { // 역 관리 열차 추가의 혼잡도 결과물 
		System.out.println("====================================================================================");
		System.out.println();
		System.out.println("\t\t\t\t\t 열차 추가 시에 개선된 혼잡도의 결과입니다.");
		System.out.println();
		System.out.println("====================================================================================");
		System.out.printf("\t\t 시작역 (%s)\n"); // 변수 넣으시면 됩니다.
		System.out.printf("\t\t %s역\t\t\t (???/???) -> (???/???) \n"); // 변수 넣으시면 됩니다. (for문 또는 배열 필요) 
		System.out.printf("\t\t 종료역 (%s)\n"); // 변수 넣으시면 됩니다.

	}
	
	public static void trainAddError() { //역관리 > 열차 추가 > 유효성 검사 실패
		System.out.println("====================================================================================");
		System.out.println();
		System.out.println("\t\t\t\t\t 올바르지 않은 값 입니다. 다시 입력해주세요");
		System.out.println();
		System.out.println("====================================================================================");

	}
	
	
	public static void page() {
		System.out.println("_________________________________________________________________________________________________________");
		System.out.println("\t\t\t 이전 페이지를 보고 싶으면 q, 다음 페이지를 보고 싶으면 e를 입력해주세요.");
		System.out.println("---------------------------------------------------------------------------------------------------------");

		
	}
	public static void back() {
		System.out.println("\t\t\t 메인메뉴로 돌아가기를 희망하면 q,e 이외의 글자를 입력해주세요.");
		
	}
	

}
