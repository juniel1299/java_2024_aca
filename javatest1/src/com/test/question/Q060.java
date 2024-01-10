package com.test.question;
//보류
public class Q060 {


	public static void main(String[] args) {
		
		int sum = 1;
		int front =0;
		int back = 1;
		int temp = 0;
		String txt = "1 + ";
		
		while(true) {
			temp = front + back; // 처음에 0+1 = 1 , 그 결과 1을 back에 담고 back에 있던 1을 front로 보냄 -> 1+1 = 2 가 됨 ,
			//백에 있던 1을 front로  2를 백으로 보내고 더하기 , 1+2 = 3 
			//백에 있던 2를 front로 백을 3으로 더함 2+3 = 5 
			if(temp > 100) { //temp (피보나치 앞 뒤의 합이 100을 넘으면 while 문 탈출함)
				break;
			}
		sum += temp; //앞과 뒤 합을 sum에 중첩 
		txt += temp + " + "; //앞뒤 합친 숫자를 String으로 변환하여 문자와 같이 txt에 삽입
		
		front = back; //뒤에 있는 변수의 수를  앞에 들어가는 변수에 삽입 (피보나치 수열)
		back = temp; //앞 뒤 합친 숫자를 뒤에 있는 변수에 삽입
		
		}
	
	System.out.printf("%s = %d\n",txt,sum);
	}
}
