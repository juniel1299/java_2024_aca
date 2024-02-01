package com.test.java.chaos;

public class ViewAll {
	
	public void seasonPassMain() { //정기권 메인 메뉴 
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		System.out.println("\t\t\t\t\t\t\t 정기권\t\t\t\t\t %s\n");
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("\t\t\t\t\t\t\t 1. 민원 내용 입력하기");
		System.out.println("\t\t\t\t\t\t\t 2. 뒤로 가기");
		
		
	}
	
	public void lostArticleSearchBottom() {
		System.out.println("\t\t\t\t\t\t\t 1. 다음 페이지");
		System.out.println("\t\t\t\t\t\t\t 2. 이전 페이지");
		System.out.println("\t\t\t\t\t\t\t 3. 뒤로 가기");
	
	}
	
	public void lostArticleSearchTop() { // 분실물 검색 상단 라벨 
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		System.out.println("\t\t\t\t\t\t\t 분실물 검색\t\t\t\t\t %s\n");
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		
	}
	
	public void lostArticleListCheckBottom() {//분실물 목록 확인 아래 라벨 
		System.out.println("\t\t\t\t\t\t\t 1. 검색하기");
		System.out.println("\t\t\t\t\t\t\t 2. 다음 페이지");
		System.out.println("\t\t\t\t\t\t\t 3. 이전 페이지");
		System.out.println("\t\t\t\t\t\t\t 4. 뒤로 가기");
	}
	
	public void lostArticleListCheckTop() { // 분실물 목록 확인 라벨 
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		System.out.println("\t\t\t\t\t\t\t 분실물 목록 확인\t\t\t\t\t %s\n");
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		
	}
	
	public void userVoc() {
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		System.out.println("\t\t\t\t\t\t\t 민원 접수\t\t\t\t\t %s\n");
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("\t\t\t\t\t\t\t 1. 민원 내용 입력하기");
		System.out.println("\t\t\t\t\t\t\t 2. 뒤로 가기");
		
	}
	
	public void userVocMain(String member.authName) { //고객의 소리 메뉴 
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		System.out.println("\t\t\t\t\t\t\t 고객의 소리\t\t\t\t\t %s\n",member.authName);
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("\t\t\t\t\t\t\t 1. 일반 민원 접수");
		System.out.println("\t\t\t\t\t\t\t 2. 분실물 목록 확인");
		System.out.println("\t\t\t\t\t\t\t 3. 뒤로 가기");
	}
	
	public void trainTimeTableSearch(String member.authName) { //열차 시간표 , 검색 후 
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		System.out.println("\t\t\t\t\t\t\t 열차 시간표\t\t\t\t\t %s\n",member.authName);
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		
		
	}
	
	public void trainTimeTable(String member.authName) { // 고객 열차 시간표
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		System.out.println("\t\t\t\t\t\t\t 열차 시간표\t\t\t\t\t %s\n",member.authName);
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		
		
	}
	
	public void userResign(String member.authName) {//회원 탈퇴
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		System.out.println("\t\t\t\t\t\t\t 회원 탈퇴\t\t\t\t\t %s\n",member.authName);
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.print("회원 탈퇴 시 등록된 정보는 모두 삭제되며\n 등록된 정기권은 소모되며 환불되지 않습니다.\n 정말 탈퇴하시겠습니까?\n");
		System.out.println();
		System.out.println();
		System.out.println("\t\t\t\t\t\t\t 1. 탈퇴 하기");
		System.out.println("\t\t\t\t\t\t\t 2. 뒤로 가기");
	}
	
	public void favoriteDelete(String member.authName){ //즐겨찾기 삭제
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		System.out.println("\t\t\t\t\t\t\t 즐겨찾기 삭제\t\t\t\t\t %s\n",member.authName);
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		System.out.println();
		System.out.println();
		System.out.println("\t\t\t\t\t\t\t 0. 뒤로 가기");
	}
	
	public void favoriteAdd(String member.authName) { // 즐겨찾기 등록
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		System.out.println("\t\t\t\t\t\t\t 즐겨찾기 등록\t\t\t\t\t %s\n",member.authName);
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		
	}
	
	
	
	public void favoriteChange(String member.authName) {//즐겨찾기 편집
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		System.out.println("\t\t\t\t\t\t\t 즐겨찾기 편집\t\t\t\t\t %s\n",member.authName);
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("\t\t\t\t\t\t\t 1.즐겨찾기 등록");
		System.out.println("\t\t\t\t\t\t\t 2.즐겨찾기 삭제");
		System.out.println("\t\t\t\t\t\t\t 3.뒤로 가기");
		
		
	}
	
	
	
	public void favoriteList(String member.authName) { //즐겨찾기 목록
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		System.out.println("\t\t\t\t\t\t\t 길 찾기(즐겨찾기 노선)\t\t\t\t\t %s\n",member.authName);
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		
	}
	
	public void lineFavorite(String member.authName) {//노선 즐겨찾기
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		System.out.println("\t\t\t\t\t\t\t 노선 즐겨찾기\t\t\t\t\t %s\n",member.authName);
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("\t\t\t\t\t\t\t 1.PW 재설정하기");
		System.out.println("\t\t\t\t\t\t\t 2.전화번호 재설정하기");
		System.out.println("\t\t\t\t\t\t\t 3.뒤로 가기");
		
	}
	
	public void phoneNumChange(String member.authName) {//전화번호 재설정
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		System.out.println("\t\t\t\t\t\t\t 전화번호 재설정\t\t\t\t\t %s\n",member.authName);
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		
	}
	
	public static void bottomReceive() { //아래에 있는 접수
		System.out.println("접수 되었습니다.");
	}
	
	public static void bottomResign() { //아래에 있는 탈퇴
		System.out.println("탈퇴를 완료했습니다.");
	}
	public static void bottomDelete() { // 아래에 있는 삭제
		System.out.println("삭제가 완료되었습니다.");
	}
	
	public static void bottomAdd() { // 아래에 있는 등록
		System.out.println("등록이 완료되었습니다.");
	}
	
	public void bottomChange() { //아래에 있는 작은 변경이 완료되었습니다.
		System.out.println("변경이 완료되었습니다.");
	}
	
	public void pwChange(String member.authName) { //pw재설정 라벨
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		System.out.println("\t\t\t\t\t\t\t PW 재설정\t\t\t\t\t %s\n",member.authName);
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		
	}
	
	public void userInfoChange(String member.authName) { //회원정보 수정 메뉴 화면 
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		System.out.println("\t\t\t\t\t\t\t 회원정보 수정\t\t\t\t\t %s\n",member.authName);
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("\t\t\t\t\t\t\t 1.PW 재설정하기");
		System.out.println("\t\t\t\t\t\t\t 2.전화번호 재설정하기");
		System.out.println("\t\t\t\t\t\t\t 3.뒤로 가기");
		
	}
	
	public void userMyInfo(String member.authName) { //고객 > 마이페이지 > 내 정보 보기
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		System.out.println("\t\t\t\t\t\t\t 내 정보\t\t\t\t\t %s\n",member.authName);
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		
		
	}
	
//	public void userMyPage(String member.authName) { //고객 마이 페이지 
//		System.out.println("----------------------------------------------------------------------------------------------------------------");
//		System.out.println("\t\t\t\t\t\t\t 마이 페이지\t\t\t\t\t %s\n",member.authName);
//		System.out.println("----------------------------------------------------------------------------------------------------------------");
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		System.out.println("\t\t\t\t\t\t\t 1.내 정보 보기");
//		System.out.println("\t\t\t\t\t\t\t 2.회원정보 수정");
//		System.out.println("\t\t\t\t\t\t\t 3.노선 즐겨찾기");
//		System.out.println("\t\t\t\t\t\t\t 4.회원 탈퇴");
//		System.out.println("\t\t\t\t\t\t\t 5.뒤로 가기");
//		
//	}
	
//	public void userMainView(String member.authName) { //고객 메인 메뉴 화면 
//		System.out.println("----------------------------------------------------------------------------------------------------------------");
//		System.out.printf("\t\t\t\t\t\t\t PW 찾기\t\t\t\t\t %s\n",member.authName);
//		System.out.println("----------------------------------------------------------------------------------------------------------------");
//		System.out.println();
//		System.out.printf("\t\t\t\t\t\t\t\t\t\t\t 0.마이 페이지\n");
//		System.out.println();
//		System.out.println();
//		System.out.println("\t\t\t\t\t\t\t 1.열차 시간표");
//		System.out.println("\t\t\t\t\t\t\t 2.고객의 소리");
//		System.out.println("\t\t\t\t\t\t\t 3.정기권");
//		System.out.println("\t\t\t\t\t\t\t 4.길 찾기");
//		System.out.println("\t\t\t\t\t\t\t 5.요금표");
//		System.out.println("\t\t\t\t\t\t\t 6.로그 아웃");
//	}
	
	public static void signupFindPw() { // PW 찾기
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		System.out.println("\t\t\t\t\t\t\t PW 찾기");
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		System.out.println();
		
	}
	
	public static void signupFindId() { // ID 찾기
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		System.out.println("\t\t\t\t\t\t\t ID 찾기");
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		System.out.println();
		
	}
	
	public static void signupFindMain() { //ID/PW 찾기 메인 화면
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		System.out.println("\t\t\t\t\t\t\t ID/PW 찾기");
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("\t\t\t\t\t\t\t 1. ID 찾기");
		System.out.println("\t\t\t\t\t\t\t 2. PW 찾기");
		System.out.println("\t\t\t\t\t\t\t 3. 뒤로 가기");
	}
	
	public static void signupEmployee() { // 회원가입 관리자용 가입
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		System.out.println("\t\t\t\t\t\t\t 관리자용 가입");
		System.out.println("----------------------------------------------------------------------------------------------------------------");
	
	}
	
	public static void signupUser() {//회원가입 개인회원
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		System.out.println("\t\t\t\t\t\t\t 개인회원 가입");
		System.out.println("----------------------------------------------------------------------------------------------------------------");
	
	}
	
	public static void signupMain() { //회원가입 메인
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		System.out.println("\t\t\t\t\t\t\t 회원가입");
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("\t\t\t\t\t\t\t 1. 개인회원 가입");
		System.out.println("\t\t\t\t\t\t\t 2. 관리자용 가입");
		System.out.println("\t\t\t\t\t\t\t 3. 뒤로 가기");
	}
	
	
	
	public static void loginTop() { //로그인 화면 상단
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		System.out.println("\t\t\t\t\t\t\t 로그인");
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		
		//밑에 입력 읽어야 함 
		
	}

	
	////////////////////////여기부터 관리자 화면 메서드
	
//	public void nameRank(String member.authName, String employeeRank) {
//		System.out.printf("\t\t  이름:                   %s                          \n",member.authName); //이름 변수 받아서 넣으세요
//		System.out.printf("\t\t  직급:                   %s                          \n",employeeRank); //직급 변수 받아서 넣으세요
//		
//	}
	
	public static void logTotal() { //행동로그 라벨
		System.out.println("====================================================================================");
		System.out.println();
		System.out.println("\t\t\t\t\t 관리자가 로그인 이후 작업한 내역입니다.");
		System.out.println();
		System.out.println("====================================================================================");
		//데이터 계속 이어 받아야 함..
	}
	
	public static void statisticsLineTotalMonthMoney() { // 호선 별 월 전체 매출 결과 값
		//데이터 받아서 그래프 그려야함 
	}
	public static void statisticsLineTotalMonthMoneyTop() { //호선 별 월 전체 매출
		System.out.println("====================================================================================");
		System.out.println();
		System.out.println("\t\t\t\t\t 호선을 입력해주세요");
		System.out.println();
		System.out.println("====================================================================================");
		
	}

	
	public static void statisticsTotalMonthMoney() { //전체 호선 월 매출 
		//데이터 받아서 그래프 그려야함 
	}
	
	public static void statisticsMoneyMain() { // 매출 통계 메인
		System.out.println("====================================================================================");
		System.out.println();
		System.out.println("\t\t\t\t\t 원하는 기능을 선택하세요");
		System.out.println("\t\t\t\t\t (숫자로 입력해주세요)");
		System.out.println("\t\t\t\t\t 현재 메뉴: 매출 통계");
		System.out.println();
		System.out.println("====================================================================================");
		System.out.println();
		System.out.println("\t\t\t\t\t 1. 전체 호선 월 매출");
		System.out.println("\t\t\t\t\t 2. 호선 별 월 매출");
		System.out.println("\t\t\t\t\t 3. 뒤로 가기");
		
	}
	
	public static void statisticsLineTotalUserResult() { // 호선 별 월 전체 이용 인원 결과
		System.out.println("====================================================================================");
		System.out.printf("\t\t\t\t\t %s의 월 전체 이용 인원은 %s명 입니다.\n"); //받을 값 예시:2호선,  전체 이용 인원 계산 값
		System.out.println("====================================================================================");
		
	}
	
	public static void statisticsLineTotalUser() { //호선 별 월 전체 이용 인원 입력 
		System.out.println("====================================================================================");
		System.out.println();
		System.out.println("\t\t\t\t\t 호선을 입력해주세요");
		System.out.println();
		System.out.println("====================================================================================");
		
	}
	
	public void statisticsMonthTotalUserResult(String monthTotalUser) { // 월 전체 이용 인원 결과
		System.out.println("====================================================================================");
		System.out.printf("\t\t\t\t\t 월 전체 이용 인원은 %s명 입니다.\n",monthTotalUser); //그냥 계산 결과 넣으면 됩니다. 
		System.out.println("====================================================================================");
		
	}
	
	public static void statisticsUserMain() { //이용객 통계 메인 
		System.out.println("====================================================================================");
		System.out.println();
		System.out.println("\t\t\t\t\t 원하는 기능을 선택하세요");
		System.out.println("\t\t\t\t\t (숫자로 입력해주세요)");
		System.out.println("\t\t\t\t\t 현재 메뉴: 이용객 통계");
		System.out.println();
		System.out.println("====================================================================================");
		System.out.println();
		System.out.println("\t\t\t\t\t 1. 월 전체 이용 인원");
		System.out.println("\t\t\t\t\t 2. 특정 호선 인원");
		System.out.println("\t\t\t\t\t 3. 뒤로 가기");
		
	}
	
	public static void statisticsChaosFour() { //혼잡도 4번째 라벨
		System.out.println("====================================================================================");
		System.out.println();
		System.out.println("\t\t\t\t\t 시간대를 입력해주세요");
		System.out.println("\t\t\t\t\t (5~24까지의 수를 입력) (단위: 시)");
		System.out.println();
		System.out.println("====================================================================================");
		//마지막 결과는 데이터라 따로 빼야함 
	}
	
	public static void statisticsChaosThree() { //혼잡도 3번째 라벨
		System.out.println("====================================================================================");
		System.out.println();
		System.out.println("\t\t\t\t\t 요일을 선택해주세요");
		System.out.println("\t\t\t\t\t (평일 또는 주말)");
		System.out.println();
		System.out.println("====================================================================================");
		
	}
	
	public static void statisticsChaosTwo() { // 혼잡도 2번째 라벨
		System.out.println("====================================================================================");
		System.out.println();
		System.out.println("\t\t\t\t\t 방향을 입력해주세요");
		System.out.println("\t\t\t\t\t (상행 또는 하행 기입)");
		System.out.println();
		System.out.println("====================================================================================");
		
	}
	
	public static void statisticsChaosOne() { //혼잡도 1번째 라벨
		System.out.println("====================================================================================");
		System.out.println();
		System.out.println("\t\t\t\t\t 호선을 입력해주세요");
		System.out.println();
		System.out.println("====================================================================================");
		
	}
	
	public static void statisticsMain() { // 통계 정보 메인
		System.out.println("====================================================================================");
		System.out.println();
		System.out.println("\t\t\t\t\t 원하는 기능을 선택하세요");
		System.out.println("\t\t\t\t\t (숫자로 입력해주세요)");
		System.out.println("\t\t\t\t\t 현재 메뉴: 통계 정보");
		System.out.println();
		System.out.println("====================================================================================");
		System.out.println();
		System.out.println("\t\t\t\t\t 1. 혼잡도 통계");
		System.out.println("\t\t\t\t\t 2. 이용객 통계");
		System.out.println("\t\t\t\t\t 3. 매출 통계");
		System.out.println("\t\t\t\t\t 4. 뒤로 가기");
		
	}
	
	public static void calDeleteResult() { // 캘린더 일정 삭제 결과
		System.out.println("====================================================================================");
		System.out.println("\t\t\t\t\t 삭제되었습니다.");
		System.out.println("====================================================================================");
		
	}
	
	public static void calDeleteMid() { //캘린더 일정 삭제 중간 라벨
		System.out.println("====================================================================================");
		System.out.println("\t\t\t\t\t 제거 할 일정의 내용을 동일하게 작성해주세요");
		System.out.println("====================================================================================");
		
	}
	
	public static void calAddResult() { //캘린더 일정 추가 결과
		System.out.println("====================================================================================");
		System.out.println("\t\t\t\t\t 일정이 성공적으로 추가되었습니다.");
		System.out.println("====================================================================================");
		
	}
	
	public static void calAdd() {//캘린더 일정 추가
		System.out.println("====================================================================================");
		System.out.println("\t\t\t\t\t 추가 할 일정을 작성해주세요");
		System.out.println("====================================================================================");
		
	}
	
	public static void calList() { // 캘린더 전체 일정 보기 , 일정 제거 윗부분
		System.out.println("====================================================================================");
		System.out.println("\t\t\t\t\t 전체 일정");
		System.out.println("====================================================================================");
		//일정 데이터 밑에 붙여야함
	}
	
	public static void calMain() { //행사 캘린더 메인
		System.out.println("====================================================================================");
		System.out.println();
		System.out.println("\t\t\t\t\t 원하는 기능을 선택하세요");
		System.out.println("\t\t\t\t\t (숫자로 입력해주세요)");
		System.out.println("\t\t\t\t\t 현재 메뉴: 행사 캘린더");
		System.out.println();
		System.out.println("====================================================================================");
		System.out.println();
		System.out.println("\t\t\t\t\t 1. 전체 일정 보기");
		System.out.println("\t\t\t\t\t 2. 일정 추가");
		System.out.println("\t\t\t\t\t 3. 일정 제거");
		System.out.println("\t\t\t\t\t 4. 뒤로 가기");
		
	}
	
	public static void vocListResult() { //전체 민원 보기 결과
			System.out.println("\t\t\t\t\t [출력결과]");
			//민원 목록 데이터 나와야함 
	}
	
	public static void vocListBottom() { //전체 민원 보기 아래부분
		System.out.println("====================================================================================");
		System.out.println("\t\t\t\t\t 특정 민원인의 민원 내용을 확인하려면 민원인의 아이디를 입력하세요");
		System.out.println("====================================================================================");
	
	}
	
	public static void vocListTop() { //전체 민원 보기 윗 부분
		System.out.println("====================================================================================");
		System.out.println("\t\t\t\t\t 민원 목록");
		System.out.println("====================================================================================");
		// 민원 데이터 나와야함 
	}
	
	public static void lostarticleSearchTop() { // 분실물 검색 상단 
		System.out.println("====================================================================================");
		System.out.println("\t\t\t\t\t 찾고자 하는 분실물의 이름을 적어주세요");
		System.out.println("====================================================================================");
	//밑에 입력 받으면 분실물 리스트 불러오기 해야함 
	}
	
	public static void lostarticleDeleteResult() { //분실물 삭제 결과
		System.out.println("====================================================================================");
		System.out.println("\t\t\t\t\t [등록된 분실물 정보를 삭제 하였습니다.]");
		System.out.println("====================================================================================");
	
	}
	
	public static void lostarticleDelete() { //분실물 삭제 상단 라벨
		System.out.println("====================================================================================");
		System.out.println("\t\t\t\t\t 삭제 할 분실물의 분실물,호선 그리고 역을 입력해주세요");
		System.out.println("====================================================================================");
	
	}
	
	public static void lostarticleAddResult() { //분실물 추가 결과
		System.out.println("====================================================================================");
		System.out.println("\t\t\t\t\t [분실물이 정상적으로 등록되었습니다.]");
		System.out.println("====================================================================================");
	
	}
	public static void lostarticleAdd() { //분실물 추가 라벨
		System.out.println("====================================================================================");
		System.out.println("\t\t\t\t\t 추가 할 분실물의 분실물,호선 그리고 역을 입력해주세요");
		System.out.println("====================================================================================");
	
	}
	
	
	
	public static void lostarticleList() { //분실물 추가 , 제거  상단 부분
		System.out.println("====================================================================================");
		System.out.println("\t\t\t\t\t 분실물 목록");
		System.out.println("====================================================================================");
	}
	
	public static void lostarticleMain() { //전체 분실물 보기 화면
		System.out.println("====================================================================================");
		System.out.println();
		System.out.println("\t\t\t\t\t 원하는 기능을 선택하세요");
		System.out.println("\t\t\t\t\t (숫자로 입력해주세요)");
		System.out.println("\t\t\t\t\t 현재 메뉴: 전체 분실물 보기");
		System.out.println();
		System.out.println("====================================================================================");
		System.out.println();
		System.out.println("\t\t\t\t\t 1. 분실물 추가");
		System.out.println("\t\t\t\t\t 2. 분실물 제거");
		System.out.println("\t\t\t\t\t 3. 분실물 검색");
		System.out.println("\t\t\t\t\t 4. 뒤로 가기");
		
	}
	
	public static void vocMain() { //고객의 소리 메인화면 
		System.out.println("====================================================================================");
		System.out.println();
		System.out.println("\t\t\t\t\t 원하는 기능을 선택하세요");
		System.out.println("\t\t\t\t\t (숫자로 입력해주세요)");
		System.out.println("\t\t\t\t\t 현재 메뉴: 고객의 소리");
		System.out.println();
		System.out.println("====================================================================================");
		System.out.println();
		System.out.println("\t\t\t\t\t 1. 전체 분실물 보기");
		System.out.println("\t\t\t\t\t 2. 전체 민원 보기");
		System.out.println("\t\t\t\t\t 3. 뒤로 가기");
		
	}
	
	public static void safetyEmployeeUnlockResult() { //부서해제 결과 라벨
		System.out.println("\t\t\t\t\t [출력결과]");

		System.out.println("\t\t [부서 해제]");
	}
	
	public static void safetyEmployeeSetUnlockBottom() { //안전요원 배치, 해제 아래 부분
		System.out.println("====================================================================================");
		System.out.println();
		System.out.println("\t\t\t\t\t ID,호선 그리고 역을 입력해주세요");
		System.out.println();
		System.out.println("====================================================================================");
		
	}
	
	public static void safetyEmployeeUnlockList() { //안전요원 해제 상단 라벨
		System.out.println("====================================================================================");
		System.out.println();
		System.out.println("\t\t\t\t\t 배치된 안전 요원 목록");
		System.out.println();
		System.out.println("====================================================================================");
		//데이터 추가
	}
	
	public static void safetyEmployeeSetResult() { //안전요원 배치 결과
		System.out.println("\t\t\t\t\t [출력결과]");

		System.out.println("\t\t [배치 완료]");
	}
	
	

	
	public static void safetyEmployeeSetList() {//안전 요원 배치 목록 상단  
		System.out.println("====================================================================================");
		System.out.println();
		System.out.println("\t\t\t\t\t 배치 안 된 안전 요원 목록");
		System.out.println();
		System.out.println("====================================================================================");
		//데이터 추가
	}
	
	public static void safetyEmployeeSearchStation() { // 안전 요원 역으로 검색 라벨 
		System.out.println("====================================================================================");
		System.out.println();
		System.out.println("\t\t\t\t\t 안전 요원 목록을 확인 할 역을 입력해주세요");
		System.out.println("\t\t\t\t\t 현재 메뉴: 역 이름으로 안전 요원 검색");
		System.out.println();
		System.out.println("====================================================================================");
		
		
	}
	
	
	public static void safetyEmployeeSearchLine() { //호선으로 안전 요원 검색 라벨
		System.out.println("====================================================================================");
		System.out.println();
		System.out.println("\t\t\t\t\t 안전 요원 목록을 확인 할 호선을 입력해주세요");
		System.out.println("\t\t\t\t\t (숫자로 입력해주세요)");
		System.out.println("\t\t\t\t\t 현재 메뉴: 호선으로 안전 요원 검색");
		System.out.println();
		System.out.println("====================================================================================");
		
	}
	
	public static void safetyEmployeeSee() { //전체 안전 요원 보기 
		System.out.println("====================================================================================");
		System.out.println();
		System.out.println("\t\t\t\t\t 원하는 기능을 선택하세요");
		System.out.println("\t\t\t\t\t (숫자로 입력해주세요)");
		System.out.println("\t\t\t\t\t 현재 메뉴: 전체 안전 요원 보기");
		System.out.println();
		System.out.println("====================================================================================");
		System.out.println();
		System.out.println("\t\t\t\t\t 1. 호선으로 안전 요원 검색");
		System.out.println("\t\t\t\t\t 2. 역 이름으로 안전 요원 검색");
		System.out.println("\t\t\t\t\t 3. 뒤로 가기");
		
	}
	
	public static void safetyEmployeeMain() { //안전 요원 관리
		System.out.println("====================================================================================");
		System.out.println();
		System.out.println("\t\t\t\t\t 원하는 기능을 선택하세요");
		System.out.println("\t\t\t\t\t (숫자로 입력해주세요)");
		System.out.println("\t\t\t\t\t 현재 메뉴: 안전 요원 관리");
		System.out.println();
		System.out.println("====================================================================================");
		System.out.println();
		System.out.println("\t\t\t\t\t 1. 전체 안전 요원 보기");
		System.out.println("\t\t\t\t\t 2. 안전 요원 배치");
		System.out.println("\t\t\t\t\t 3. 안전 요원 부서 해제");
		System.out.println("\t\t\t\t\t 4. 뒤로 가기");
	}
	
	
	public static void employeeDeleteResult() { //직원 삭제 (예) 결과 값
		System.out.println("====================================================================================");
		System.out.println("\t\t\t\t\t 삭제되었습니다.");
		System.out.println("====================================================================================");

	}
	
	public  void employeeDeleteTwo() { //직원 삭제 2번째 라벨
		System.out.println("\t\t\t\t\t [해당 직원 정보]");
//		System.out.println("\t\t 1. %s의 이름: %s \n"); //id와 이름 넣어주세요
//		System.out.println("\t\t 2. %s의 호선: %s \n"); //id와 호선 넣어주세요
//		System.out.println("\t\t 3. %s의 역: %s\n"); //id와 역 넣어주세요
//		System.out.println("\t\t 4. %s의 직급: %s\n"); //id와 직급 넣어주세요
//		System.out.println("해당 직원을 삭제하시겠습니까?");
	}
	
	public static void employeeDeleteOne() { //직원 삭제 1번째 라벨
		System.out.println("====================================================================================");
		System.out.println("\t\t\t\t\t 삭제하고자 하는 직원의 ID를 입력해주세요");
		System.out.println();
		System.out.println("\t\t\t\t\t 현재 메뉴: 직원 삭제 ");
		System.out.println("====================================================================================");
		
	}
	
	
	public static void employeerankChangeTwo() { // 직원 직급 변경 2번째 라벨 
		System.out.println("====================================================================================");
		System.out.println("\t\t\t\t\t 변경 할 직급을 입력해주세요.");
		System.out.println();
		System.out.println("\t\t\t\t\t 현재 메뉴: 직급 변경 ");
		System.out.println("====================================================================================");
		
	}
	
	public static void employeerankChangeOne() { // 직원 직급 변경 1번째 라벨
		System.out.println("====================================================================================");
		System.out.println("\t\t\t\t\t 직급 변경이 필요한 직원의 ID를 입력해주세요.");
		System.out.println();
		System.out.println("\t\t\t\t\t 현재 메뉴: 직급 변경 ");
		System.out.println("====================================================================================");
		
	}
	
	public void employeeChangeResult() { // 직원 근무지 변경 최종 결과
		System.out.println("\t\t\t\t\t [출력결과]");
//		System.out.println("\t\t 1. %s의 이름: %s \n"); //id와 이름 넣어주세요
//		System.out.println("\t\t 2. %s의 호선: %s \n"); //id와 호선 넣어주세요
//		System.out.println("\t\t 3. %s의 역: %s\n"); //id와 역 넣어주세요
//		System.out.println("\t\t 4. %s의 직급: %s\n"); //id와 직급 넣어주세요
		//데이터 따로 추가
	}
	
	public static void employeeOfficeChangeThree() { // 직원 근무지 변경 3번째 라벨
		System.out.println("====================================================================================");
		System.out.println("\t\t\t\t\t 변경하고자 하는 근무지의 역을 입력해주세요.");
		System.out.println("\t\t\t\t\t 현재 메뉴: 근무지 변경 ");
		System.out.println("====================================================================================");
		
	}
	
	public static void employeeOfficeChangeTwo() { //직원 근무지 변경 2번째 라벨
		System.out.println("====================================================================================");
		System.out.println("\t\t\t\t\t 변경하고자 하는 근무지의 호선을 입력해주세요.");
		System.out.println("\t\t\t\t\t 숫자로 입력해주세요");
		System.out.println("\t\t\t\t\t 현재 메뉴: 근무지 변경 ");
		System.out.println("====================================================================================");
		
	}
	
	public static void employeeOfficeChangeOne() { // 직원 근무지 변경 1번째 라벨
		System.out.println("====================================================================================");
		System.out.println("\t\t\t\t\t 근무지 변경이 필요한 직원의 ID를 입력해주세요.");
		System.out.println();
		System.out.println("\t\t\t\t\t 현재 메뉴: 근무지 변경 ");
		System.out.println("====================================================================================");
		
	}
	
	public static void employeeInfoChangeMain() { //직원 정보 수정
		System.out.println("====================================================================================");
		System.out.println();
		System.out.println("\t\t\t\t\t 원하는 기능을 선택하세요");
		System.out.println("\t\t\t\t\t (숫자로 입력해주세요)");
		System.out.println("\t\t\t\t\t 현재 메뉴: 직원 정보 수정");
		System.out.println();
		System.out.println("====================================================================================");
		System.out.println();
		System.out.println("\t\t\t\t\t 1. 근무지 변경");
		System.out.println("\t\t\t\t\t 2. 직급 변경");
		System.out.println("\t\t\t\t\t 3. 직원 삭제");
		System.out.println("\t\t\t\t\t 4. 뒤로 가기");
	
	}
	
	public static void employeeSearchNameResult() { // 이름으로 직원 검색 결과
		System.out.println("====================================================================================");
		System.out.println("\t\t\t\t\t 검색하신 이름을 가진 직원 목록입니다.");
		System.out.println("====================================================================================");
		System.out.println();
		System.out.println("\t[이름]\t[아이디]\t[전화번호]\t[담당하는 역(호선)]");
	}
	public static void employeeSearchName() { // 이름으로 직원 검색 
		System.out.println("====================================================================================");
		System.out.println("\t\t\t\t\t 확인 할 직원의 이름을 입력해주세요");
		System.out.println("\t\t\t\t\t (성 포함 이름 입력해주세요)");
		System.out.println("\t\t\t\t\t 현재 메뉴: 이름으로 직원 검색");
		System.out.println("====================================================================================");
	
	}
	
	
	public static void employeeSearchStation() { // 역으로 직원 검색 
		System.out.println("====================================================================================");
		System.out.println("\t\t\t\t\t 직원 목록을 확인 할 역을 입력해주세요");
		System.out.println("\t\t\t\t\t 현재 메뉴: 역으로 직원 검색");
		System.out.println("====================================================================================");
	
	}
	
	
	public static void employeeSearchLineResult() {//일반직원 검색 결과 라벨 , 안전요원 검색 결과 라벨
		System.out.println("====================================================================================");
		System.out.println("\t\t\t\t\t 현재 해당 호선에 근무 중인 직원 목록입니다.");
		System.out.println("====================================================================================");
		System.out.println();
		System.out.println("\t[이름]\t[아이디]\t[직급]\t[전화번호]\t[담당하는 역(호선)]");
		//밑에는 따로 데이터 추가 
	}
	
	
	public static void employeeSearchLine() { //전체 직원 정보 보기 > 호선으로 직원 검색 
		System.out.println("====================================================================================");
		System.out.println("\t\t\t\t\t 직원 목록을 확인 할 호선을 입력해주세요");
		System.out.println("\t\t\t\t\t (숫자로 입력해주세요)");
		System.out.println("\t\t\t\t\t 현재 메뉴: 호선으로 직원 검색");
		System.out.println("====================================================================================");
	}
	public static void employeeTotalInfo() { //전체 직원 정보 보기 
		System.out.println("====================================================================================");
		System.out.println();
		System.out.println("\t\t\t\t\t 원하는 기능을 선택하세요");
		System.out.println("\t\t\t\t\t (숫자로 입력해주세요)");
		System.out.println("\t\t\t\t\t 현재 메뉴: 전체 직원 정보 보기");
		System.out.println("====================================================================================");
		System.out.println();
		System.out.println("\t\t\t\t\t 1. 호선으로 직원 검색");
		System.out.println("\t\t\t\t\t 2. 역 이름으로 직원 검색");
		System.out.println("\t\t\t\t\t 3. 이름으로 직원 검색");
		System.out.println("\t\t\t\t\t 4. 뒤로 가기");
	}
	
	
	
	public static void employeeMain() { //직원 관리 메뉴
		System.out.println("====================================================================================");
		System.out.println();
		System.out.println("\t\t\t\t\t 원하는 기능을 선택하세요");
		System.out.println("\t\t\t\t\t (숫자로 입력해주세요)");
		System.out.println("\t\t\t\t\t 현재 메뉴: 직원 관리");
		System.out.println();
		System.out.println("====================================================================================");
		System.out.println();
		System.out.println("\t\t\t\t\t 1. 전체 직원 정보 보기");
		System.out.println("\t\t\t\t\t 2. 직원 정보 수정");
		System.out.println("\t\t\t\t\t 3. 안전 요원 관리");
		System.out.println("\t\t\t\t\t 4. 뒤로 가기");
	}
	public static void adminMainView() { //관리자 메인 화면 
		System.out.println("====================================================================================");
		System.out.println();
		System.out.println("                                       관리자 모드");
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
		System.out.printf("\t\t  이름:               %s                              \n"); //이름 변수 받아서 넣으세요
		System.out.printf("\t\t  직급:               %s                              \n"); //직급 변수 받아서 넣으세요
		System.out.println("====================================================================================");
		System.out.println();
		System.out.println("\t\t\t\t\t 1. 의자 없는 열차 추가");
		System.out.println("\t\t\t\t\t 2. 일반 열차 추가");
		System.out.println("\t\t\t\t\t 3. 뒤로 가기");
	}
	
	public static void trainAddOne() { // 역관리 >  열차 추가 > 추가 할 호선
		System.out.println("====================================================================================");
		System.out.println();
		System.out.println("\t\t\t\t\t 열차 추가 할 호선을 입력해주세요");
		System.out.println("\t\t\t\t\t (숫자로 입력해주세요)");
		System.out.println();
		System.out.println("====================================================================================");

	}
	
	public static void trainAddTwo() { // 역 관리 >  열차 추가 > 추가 할 열차 수
		System.out.println("====================================================================================");
		System.out.println();
		System.out.println("\t\t\t\t\t 추가 할 열차 수를 입력해주세요");
		System.out.println("\t\t\t\t\t (숫자로 입력해주세요)");
		System.out.println();
		System.out.println("====================================================================================");

	}
	
	public static void trainAddThree() { // 역 관리 > 열차 추가 > 추가 할 열차 수 > 확인 할 역
		System.out.println("====================================================================================");
		System.out.println();
		System.out.println("\t\t\t\t\t 확인 할 구간의 시작역을 입력해주세요");
		System.out.println();
		System.out.println("====================================================================================");

	}
	public static void trainAddFour() { // 역 관리 > 열차 추가 > 추가 할 열차 수 > 확인 할 역 > 확인 종료 역
		System.out.println("====================================================================================");
		System.out.println();
		System.out.println("\t\t\t\t\t 확인 할 구간의 종료역을 입력해주세요");
		System.out.println();
		System.out.println("====================================================================================");

	}
	
	public static void trainAddFive() { // 역 관리 > 열차 추가 > 추가 할 열차 수 > 확인 할 역 > 확인 종료 역 > 추가 시간대
		System.out.println("====================================================================================");
		System.out.println();
		System.out.println("\t\t\t\t\t 열차를 추가 할 시간대를 입력해주세요.");
		System.out.println("\t\t\t\t\t ( 가능 시간대 : 05:00 ~ 24:00)");
		System.out.println("\t\t\t\t\t ( (시)에 해당하는 숫자만 입력해주세요");
		System.out.println();
		System.out.println("====================================================================================");

	}
	public static void trainAddResult() { // 역 관리 열차 추가의 혼잡도 결과물 
		System.out.println("====================================================================================");
		System.out.println();
		System.out.println("\t\t\t\t\t 열차 추가 시에 개선된 혼잡도의 결과입니다.");
		System.out.println();
		System.out.println("====================================================================================");


	}
	
	public static void trainAddError() { //애매할 때 쓰는 에러 문구
		System.out.println("====================================================================================");
		System.out.println("\t\t\t\t\t 올바르지 않은 값 입니다. 다시 입력해주세요");
		System.out.println("====================================================================================");

	}
	
	public static void idError() { //존재하지 않는 아이디를 입력할 시 에러
		System.out.println("====================================================================================");
		System.out.println("\t\t\t\t\t 존재하지 않는 아이디입니다. ");
		System.out.println("====================================================================================");

	}
	public static void stationError() { //역 이름을 잘못 작성한 경우
		System.out.println("====================================================================================");
		System.out.println("\t\t\t\t\t 존재하지 않는 역입니다. ");
		System.out.println("====================================================================================");

	}
	
	public static void lineError() { //잘못된 호선을 집어넣을 경우
		System.out.println("====================================================================================");
		System.out.println("\t\t\t\t\t 존재하지 않는 호선입니다.");
		System.out.println("====================================================================================");
		
	}
	
	public static void rankNameError() { // 존재하지 않는 직급을 주었을 때 에러
		System.out.println("====================================================================================");
		System.out.println("\t\t\t\t\t 존재하지 않는 직급입니다.");
		System.out.println("====================================================================================");
		
	}
	
	
	public static void nameError() { //이름을 잘못 입력한 경우
		System.out.println("====================================================================================");
		System.out.println("\t\t\t\t\t 존재하지 않는 이름입니다.");
		System.out.println("====================================================================================");
		
	}
	
	public static void rankError() { //최고 관리자가 아닐 시 (권한이 안 될 시 )
		System.out.println("====================================================================================");
		System.out.println("\t\t\t\t\t 해당 페이지 접근 권한이 없습니다.");
		System.out.println("====================================================================================");
		
	}
	
	public static void page() { // 페이지 넘기기 라벨
		System.out.println("_________________________________________________________________________________________________________");
		System.out.println("\t\t\t 이전 페이지를 보고 싶으면 q, 다음 페이지를 보고 싶으면 e를 입력해주세요.");
		System.out.println("---------------------------------------------------------------------------------------------------------");

		
	}
	public static void back() { // 메인메뉴 돌아가기 라벨 
		System.out.println("\t\t\t 메인메뉴로 돌아가기를 희망하면 q,e 이외의 글자를 입력해주세요.");
		
	}
	

}
