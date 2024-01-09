package com.test.question;

public class Q054 {

	public static void main(String[] args) {
		
	
	boolean number = false; //소수인지 아닌지 확인
	
	for( int i=2; i<=100; i++) { //2부터 100까지 오름차순으로 숫자 나열 (0,1은 소수가 아님)
		number = false; //기본값을 false로 해놓음
		
		for(int j=2; j<i; j++) { // (i,j) (2,2) (2,3) (2,4) ...(2,99), (3,1)(3,2)  계속 반복 
			if(i%j ==0) {  //(2,2) (3,3) (5,5) 같은 숫자가 나오면 해당 제어문 동작 
				number = true; //number에 true 삽입
				break; //for문을 탈출 ->  나열
			}
		}
	
	if(!number) { // 기본값이 number는 false 이므로 false가 아닌 number를 받아옴 
		System.out.print(i + ","); //출력
	}
	
	}
}
}