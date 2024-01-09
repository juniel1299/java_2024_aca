package com.test.question;

import java.util.Scanner;

public class Q045 {
	public static void main(String[] args) {
		// 진행순서
		// 스캐너생성
		// 변수선언
		// 반복문
		// 조건문
		// 계산
		// 출력

		// 스캐너 생성
		Scanner Scan = new Scanner(System.in);
//변수선언
		int num = 0;
		// 라벨 + 입력
		System.out.print("최대 숫자: ");
		num = Scan.nextInt();
		// 1000 미만에서만 동작함
		if (num < 1000) {
			for (int i = 1; i <= num; i++) { // num에 들어온 숫자만큼 369 진행
				System.out.print(clap(i) + " "); // 메서드 안에 내용을 가져옴
			}
			System.out.println(); // 최대 숫자 엔터
		} else {
			System.out.println("1000 미만의 숫자만 가능합니다."); // 1000미만 유효성 검사 출력
		}
		Scan.close(); // 스캔 종료
	}

//메서드 선언
	private static String clap(int i) { // 메서드에서 연산
		String time = ""; // 짝 받기 위해 string 빈문자열 선언
		int number = i; // 무한루프 생성용 변수 + 입력 받은 값 삽입

		for (; number > 0;) { // 무한루프
			if (number % 10 % 3 == 0 && number % 10 != 0) { // ex 66 들어오면 66 % 10 > 6 % 3 > 0 이며 , 66 %10 = 6 이므로 짝 + 다시
															// 짝
				time += "짝"; // 짝이 2번 ~ 3번 갈 때 여기서 생성함
			}
			number /= 10; // number = number / 10 , ex) 80 / 10 = 70 , ex)
		}
		if (time.equals("")) { // 만약 빈 문자열이면 그냥 숫자를 반환
			return i + "";
		} else { // 빈 문자열이 들어가지 않고 짝 그 다음 번호 체크
			return time;
		}
	}

}
