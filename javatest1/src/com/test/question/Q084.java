package com.test.question;

//보류
public class Q084 {
	public static void main(String[] args) {

		String txt = "안녕~ 길동아~ 잘가~ 길동아~";
		String word = "길동";
		int sum = 0;
		int index = -1;
		
		
		while (true) {
			index = txt.indexOf(word,index);
			
			if(index > -1) {
				sum++;
				index = index + word.length();
				}else {
					break;
				}
		}

		System.out.printf("'%s'을 총 %d회 발견했습니다\n",word,sum);
		
		
	}
	

		
		


}
