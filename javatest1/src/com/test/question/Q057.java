package com.test.question;

public class Q057 {
public static void main(String[] args) {
	
	int sum = 0; //더하는 값 변수 선언
	
	for(int i =1; i<=100;  i++) { //1부터 100까지 더해야 하므로 우선 범위 지정
		sum+=i; //i에 들어오는 숫자 중첩하여 저장
		if(i%10 ==0) { //i의 값이 10의 배수가 된다면 밑에 printf 출력한다. 
			System.out.printf("1 ~ %d: %d\n",i,sum);
		}
	}
}//main
}
