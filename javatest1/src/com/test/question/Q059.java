package com.test.question;

public class Q059 {
	public static void main(String[] args) {
		int sum = 1; // 최종 값 (나오는 값을 계속 중첩)
		int num = 1; // 더 하는 숫자 + 문자를 txt에 넣어주는 역할 
		int plus = 1; //더 하는 숫자
		String txt = "1 + "; //맨 처음에 1부터 num을 통해 받은 숫자들을 문자열로 변환하여 출력 할 예정

		for (int i = 1; i < 14; i++) {
			num += plus; // 1을 가지고 있는 num에 기존 값 1 더함 (2) 
			txt += num + " + "; //num에 들어온 숫자를 문자로 받아서 저장
			sum += num; //plus를 통해 전해 받은 숫자들을 중첩하여 계속 더함
			plus++; //1 , 2 , 3 , 4  ... 계속 증가식
			if (num > 100) { //더해야 하는 숫자가 100을 넘어가면 for문이 끝남 

				break;
			}
		}
		System.out.printf("%s = %d\n", txt, sum);
	}// main
}
