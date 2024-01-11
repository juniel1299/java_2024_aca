package com.test.question;

public class Q070 {
	
	public static void main(String[] args) {
		
	
	int[][] num = new int[5][5];
	int n=1;
	
	for(int i = 0; i<num.length; i++ ) {
		if(i% 2 == 0 ) {
			for(int j=0; j<num[0].length; j++) {
				num[i][j] = n;
				n++;
			}
		}else {
			for(int j=num[0].length-1; j>=0; j--) {
				num[i][j] = n;
				n++;
			}
		}
		
	}
	printAns(num);

}
	public static void printAns(int[][] num) {
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num[0].length; j++) {
				System.out.printf("%2d\t", num[i][j]);
			}
			System.out.println();
		}
	}
}
