package com.test.question;

public class Q018 {
public static void main(String[] args) {
	
	//메서드 선언
	// 변수 선언
	// 변수누적 + 메서드 선언
	// 출력선언
	int n1;
	int n2;
	int n3;
	int n4;
	int n5;
	
	positive(10);
	positive(10,20);
	positive(10,20,-30);
	positive(10,20,-30,40);
	positive(10,20,-30,40,50);
}//main

private static int positive(int n1, int n2, int n3, int n4, int n5) {
	int count = 0;
	

	count += (n1>0) ? 1 : 0;
	count += (n2>0) ? 1 : 0;
	count += (n3>0) ? 1 : 0;
	count += (n4>0) ? 1 : 0;
	count += (n5>0) ? 1 : 0;
	System.out.printf("양수: %d개\n",count);
	return(count);
	// TODO Auto-generated method stub
	
}

private static int positive(int n1, int n2, int n3, int n4) {
	// TODO Auto-generated method stub
	int count = 0;
	

	count += (n1>0) ? 1 : 0;
	count += (n2>0) ? 1 : 0;
	count += (n3>0) ? 1 : 0;
	count += (n4>0) ? 1 : 0;

	System.out.printf("양수: %d개\n",count);
	return(count);
	
}

private static int positive(int n1, int n2, int n3) {
	// TODO Auto-generated method stub
	int count = 0;

	count += (n1>0) ? 1 : 0;
	count += (n2>0) ? 1 : 0;
	count += (n3>0) ? 1 : 0;

	System.out.printf("양수: %d개\n",count);
	return(count);
}

private static int positive(int n1, int n2) {
	// TODO Auto-generated method stub
	int count = 0;
	
	count += (n1>0) ? 1 : 0;
	count += (n2>0) ? 1 : 0;

	System.out.printf("양수: %d개\n",count);
	return(count);
}

private static int positive(int n1) {
	// TODO Auto-generated method stub
	int count = 0;
	count += (n1>0) ? 1 : 0;

	System.out.printf("양수: %d개\n",count);
	return(count);
}
}
