package com.test.question.obj;

public class Q093 {
public static void main(String[] args) {
	
	Note n1 = new Note();
	
	n1.setSize("B4");
	n1.setColor("노란색");
	n1.setOwner("홍길동");
	n1.setPage(25);
	
	
	Note note2 = new Note();

	note2.setSize("A4");
	note2.setColor("검정색");
	note2.setPage(100);

	System.out.println(note2.info());
	
}//main
}
