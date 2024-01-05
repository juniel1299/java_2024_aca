package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q014 {
public static void main(String[] args) throws IOException {

	
	
	
	getTime(0, 0, 0);
}

private static int getTime(int station, int change, int time) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	System.out.print("역의 개수 : \n");
	reader.readLine();
	System.out.print("환승역의 횟수 : \n");
	reader.readLine();
	System.out.println("시간대 :");
	System.out.print("시간대 : \n");
	reader.readLine();
	String timeS =  reader.readLine();
	return time;
	
	
	
}//main




}
