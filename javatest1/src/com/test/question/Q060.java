package com.test.question;

public class Q060 {
public static void main(String[] args) {
	int test1 =0;
	int test2 = 0;
	int sum = 0;
	int total = 0;
	
		
		
	
	for(int i = 1; i<100; i++) { //왼쪽
		for(int j=1; j<100; j++) { //오른쪽

			test1 = i;
			test2 = j;
			
			sum = test1 + test2;
			total = sum + test1;
			if(total<=100) {
				return;
			}else if (total >=100){
				break;
			}
			
			System.out.printf("%d",sum);
			
		}
		}	
	System.out.print(total);
		
	
}//main
	


}

