package com.test.question;
//보류
public class Q060 {
    public static int fibo(int n) {

    	
    	
		if (n == 0) { //
  
            return 0; // 밑에 i=1 부터 시작하기로 했으므로 return 적용x 밑에부터 시작
        } else if (n == 1) { //n=1이면  1반환 , 밑에 else 진행함
            return 1;
        } else { //n!=0 , n!=1 이면 아래 조건 동작
            int fibFront = 0;  //앞에 붙을 숫자
            int fibBack = 1; //뒤에 붙을 숫자

            for (int i = 2; i <= n; i++) { // i = 2부터 시작 ~ n미만
                int temp = fibBack; // temp는 1 삽입하여 처음 시작 여기까지 식 1+1임
             // 앞과 뒤를 더한 값을 back에 삽입 할예정
                fibBack = fibFront + fibBack; //우선 앞에 반환된 1 , back 들어간 1 삽입 1+1=2 
                fibFront = temp; //front에 temp에 들어간 숫자 삽입 (1 들어감)

 
            }
            return fibBack;//n번 반복

        }
    	
    }

    public static void main(String[] args) {
        int n = 12;  // 원하는 피보나치 수열의 항 개수

        for (int i = 1; i < n; i++) { // i < 12 이므로 11개 항 생성

        	System.out.print(fibo(i) + " + " ); // 
        }

	
    }
}
