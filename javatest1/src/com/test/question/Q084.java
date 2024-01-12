package com.test.question;
//보류
public class Q084 {
public static void main(String[] args) {
	
String txt = "안녕~ 길동아~ 잘가~ 길동아~";
int sum = 0;
int index =0;
int name = 0;
for(int i =0; i<txt.length(); i++) {
	index = txt.indexOf("길동",i); //.가 어느 위치에 있는지 확인 
	
	if(index >=0) {
	
		sum = index; //13번째 길동 인식
	}

}
	System.out.printf("총: %d ",sum);
}



}
