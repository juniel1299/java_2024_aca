package com.test.question;

//보류
public class Q084 {
	public static void main(String[] args) {

		String txt = "안녕~ 길동아~ 잘가~ 길동아~"; //문장
		String word = "길동"; //검출 할 대상
		int sum = 0; //검출값 추가 
		int index = -1;
		
		
		while (true) { //word가 찾아질 때마다 동작
			index = txt.indexOf(word,index); 
			
			if(index > -1) { //검출이 될 때마다 
				sum++; //sum에 추가 
				index = index + word.length(); 
				}else { //안 될 시 while 종료 
					break;
				}
		}

		System.out.printf("'%s'을 총 %d회 발견했습니다\n",word,sum);
		
		
	}
	

		
		


}
