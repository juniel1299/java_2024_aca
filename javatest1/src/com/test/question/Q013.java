package com.test.question;

import java.util.Scanner;

public class Q013 {
public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
int kor;
int eng;
int math;

System.out.print("수학 점수를 작성하시오.\n");
math = scan.nextInt();
System.out.print("영어 점수를 작성하시오.\n");
eng = scan.nextInt();
System.out.print("국어 점수를 작성하시오.\n");
kor = scan.nextInt();




test(int kor, int eng, int math);	
	
}

private static void test(int kor, int eng, int math) {
	// TODO Auto-generated method stub
	int fail =0;
 	  fail < ((kor + eng + math )/3)  "불합격" ; 
	
	
	
	
}//main




}
