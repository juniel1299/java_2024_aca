package com.test.question;

//방향
import java.util.Scanner;

public class Q050 {
	public static void main(String[] args) {
//띄어쓰기 > 별 이므로 띄어쓰기가 내림차순으로 가고 별이 오름차순으로 가야함
		Scanner Scan = new Scanner(System.in);

		int line = 0; //스캔을 통해 입력 받을 변수
		System.out.print("행: ");
		line = Scan.nextInt(); 
		//ex : 입력이 5라 가정하였을 때 주석
		for(int i=0; i<line; i++) { //i =0 j= 4 3 2 1 
			for(int j=line; j>i; j--) { //i=1 j=3,2,1
				System.out.print(" ");// i=2 j= 2,1
			}							// i=3 j=1             //i = 4 , j는 i보다 커야함 
 		for(int k=0; k<=i; k++) {  	 //k부터 정리  i=0 k=0 	// i=1 k=0,1 
			System.out.print("*");	//i=2 k=0,1,2	//i=3 k=0,1,2,3
		}							//i=4 k=0,1,2,3,4
		System.out.println();
		}

	}// main
}
