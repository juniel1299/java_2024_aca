package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Q004 {
public static void main(String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("섭씨(C) : ");
	String weather1 = reader.readLine();
	
	double weather = Double.parseDouble(weather1);
	double normalWeather = (weather * 1.8 + 32) ;
 System.out.printf("섭씨 %.1f는 화씨 %.1fF입니다. \n",weather, normalWeather );


}
}
