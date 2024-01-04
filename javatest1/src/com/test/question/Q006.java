package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q006 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("한달 수입을 적으시오(원) : \n");

		String year = reader.readLine();
		double yearMoney = Integer.parseInt(year);
		double taxNextMoney = yearMoney - (yearMoney * (3.3 / 100));
		double taxMoney = (yearMoney * (3.3 / 100));
		System.out.printf("세후 금액(원): %,.0f원.\n ", taxNextMoney);
		System.out.printf("세금(원) : %,.0f원.\n", taxMoney );
		
		
	}
}
