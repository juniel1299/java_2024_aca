package com.test.java;

public class Homework {

	public static void main(String[] args) {
		// int 예제
		int lion = 35;
		int tiger = 40;
		int dog = 33;
		double averageSpeed;
		averageSpeed = (lion + tiger + dog) / 3;

		System.err.println("세마리의 평균 속도는 " + averageSpeed + "km/h입니다");
		// float 예제
		float univScore = 4.5F;
		int studentA = 3;
		float studentB = 3.62F;
		float studentC = 3.81F;

		float averageScore = (studentA + studentB + studentC) / 3;

		System.out.println("학점 총점은" + univScore + "이며 세명의 학생 평균 학점은" + averageScore + "입니다.");
		// byte 예제
		byte pm = 4;
		byte am = 4;

		int studyTimeTotal = (pm + am);

		System.out.println("학원의 총 수업시간은 " + studyTimeTotal + "시간 입니다");

		// short 예제
		short coffeeCost = 2500;
		short latteCost = 3650;

		int costAverage = (coffeeCost + latteCost) / 2;

		System.out.println("두 음료의 평균 값은 " + costAverage + "원 입니다.");
		
		// long 예제
		
		long naverStock = 36000000000000L;
		long kakaoStock = 25751000000000L;
		
		long naverKakaoTotalStock = (naverStock + kakaoStock);
		
		System.out.println("네이버와 카카오의 시총 총합은 "+naverKakaoTotalStock+"원 입니다");
		
		//double 예제
		
		double aStudentSleepTime = 5.15;
		double bStudentSleepTime = 6.33;
		double cStudentSleepTime = 4.11;
		double dStudentSleepTime = 8.5;
		
		double studentAverageSleepTime = (aStudentSleepTime + bStudentSleepTime + cStudentSleepTime + dStudentSleepTime)/4;
		
		System.out.println( "네명의 학생의 평균 수면시간은 " + studentAverageSleepTime + "시간 입니다.");
		
		// char 예제
		
		char mostFirstName = '김';
		char SecondManyName = '이';
		
		System.out.println("한국에서 가장 많은 성은 " +mostFirstName+" 이며, 두 번째로 많은 성은 " +SecondManyName+ " 입니다.");
		
		//boolean 예제
		
		boolean numberName = true;
		
		System.out.println("한국에서 숫자를 부를 때 삼과 셋은 동일한 숫자를 말하는 단어인가요? " +  numberName);

		//String 예제
		String koreanHello = ("안녕");
		String koreanUpperHello = ("안녕하세요");
		
		System.out.println("한국에서 친구와 인사할 땐" + koreanHello + "라 하며, 나이가 많은 사람에겐 " +koreanUpperHello + "라 한다.");
		
	}
}
