package com.test.java;

public class Ex26_Calendar {
	public static void main(String[] args) {

		// Ex26_Calendar

		// 달력 만들기
		// 1. 해당 년월의 마지막 일
		// 2. 해당 년월의 1일의 요일
		// int year = 2024;
		// int month = 11;
		for (int i = 1; i <= 12; i++) {

			printCalendar(2024, i);
			System.out.println();
		}
	}// main

	public static void printCalendar(int year, int month) {
		int lastDay = getLastDay(year, month);
		int dayOfWeek = getDayOfWeek(year, month);

		// System.out.println(lastDay);
		// System.out.println(dayOfWeek % 7);

		System.out.println("============================================================");
		System.out.printf("\t\t%d년 \t\t%2d월\n", year, month);
		System.out.println("============================================================");
		System.out.println("[일]\t[월]\t[화]\t[수]\t[목]\t[금]\t[토]\t[일]");
		for (int i = 0; i < dayOfWeek; i++) {
			System.out.print("\t");
		}
		for (int i = 1; i <= lastDay; i++) {
			System.out.printf("%3d\t", i);

			// 토요일 개행
			if ((i + dayOfWeek) % 7 == 0) {
				System.out.println();
			}
		}
	}

	private static int getLastDay(int year, int month) {
		// TODO Auto-generated method stub

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			return 31;
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
		case 2:
			return isLeafYear(year) ? 29 : 28;

		default:
			System.out.println("올바른 숫자를 입력하시오");
		}

		return 0;
	}

//메서드명 패턴
//getXXX() > 데이터를 얻기 (반환값)
//setXXX() > 데이터를 설정 (인자값)
//3. isXXX() > boolean일때 많이 사용 
	private static boolean isLeafYear(int year) {
		// TODO Auto-generated method stub

		if ((year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
			return true; // 윤년
		} else {
			return false; // 평년
		}

	}

	private static int getDayOfWeek(int year, int month) {
		// TODO Auto-generated method stub

		// 서기 1년 1월 1일 ~ 2024년 1월 9일까지 총 몇 일 ?

		int date = 1;

		int sum = 0; // 누적변수

		// 1. 1년 1월 1일 ~ 2023년 12월 31일까지 > 365일

		for (int i = 1; i < year; i++) {
			if (isLeafYear(i)) {
				sum++;

			}
		}

		// 2024년 1월 1일 ~ 2024년 3월 31일 > 1달씩
		for (int i = 1; i < month; i++) {
			sum += getLastDay(year, i);
		}
		// 3. 2024년 1월 9일까지의 합
		sum += date;
		return sum % 7;
	}

}
