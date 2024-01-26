package com.test.java.openapi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Ex71_Test {
public static void main(String[] args) {
	
	
	/*
	
	 (Data) OPENAPI
	 - URL > 요청
	 - JSON 또는 XML > 응답
	 
	 Data + OpenAPI
	 
	 */
    String clientId = "BQPrQ_aaeIwOeVxH5q0X"; //애플리케이션 클라이언트 아이디
    String clientSecret = "0CHrZL8qZU"; //애플리케이션 클라이언트 시크릿

    Scanner scan = new Scanner(System.in);
    
    System.out.print("검색어: ");
    String word = scan.nextLine();

    String text = null;
    try {
        text = URLEncoder.encode(word, "UTF-8");
    } catch (UnsupportedEncodingException e) {
        throw new RuntimeException("검색어 인코딩 실패",e);
    }


    String apiURL = "https://openapi.naver.com/v1/search/book.json?query=" + text + "&display=50";    // JSON 결과
    //String apiURL = "https://openapi.naver.com/v1/search/blog.xml?query="+ text; // XML 결과


    Map<String, String> requestHeaders = new HashMap<>();
    requestHeaders.put("X-Naver-Client-Id", clientId);
    requestHeaders.put("X-Naver-Client-Secret", clientSecret);
    String responseBody = get(apiURL,requestHeaders);


//    System.out.println(responseBody);
    try {
    	JSONParser parser = new JSONParser();
    	JSONObject root = (JSONObject)parser.parse(responseBody);
    	parser.parse(responseBody);
    	
    	System.out.println(root.get("total")+"권");
    	
    	//도서목록
    	JSONArray list = (JSONArray)root.get("items");
    	
    	for(Object book : list) {
    		
    		String title = (String)((JSONObject)book).get("title");
    		
    		System.out.println(title);
    		
    		System.out.println(((JSONObject)book).get("discount"));
    		System.out.println(((JSONObject)book).get("link"));
    	}
    	
    	
	} catch (Exception e) {
		System.out.println("Ex71_Test.main");
		e.printStackTrace();
	}
	
	
}//main
private static String get(String apiUrl, Map<String, String> requestHeaders){
    HttpURLConnection con = connect(apiUrl);
    try {
        con.setRequestMethod("GET");
        for(Map.Entry<String, String> header :requestHeaders.entrySet()) {
            con.setRequestProperty(header.getKey(), header.getValue());
        }


        int responseCode = con.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) { // 정상 호출
            return readBody(con.getInputStream());
        } else { // 오류 발생
            return readBody(con.getErrorStream());
        }
    } catch (IOException e) {
        throw new RuntimeException("API 요청과 응답 실패", e);
    } finally {
        con.disconnect();
    }
}


private static HttpURLConnection connect(String apiUrl){
    try {
        URL url = new URL(apiUrl);
        return (HttpURLConnection)url.openConnection();
    } catch (MalformedURLException e) {
        throw new RuntimeException("API URL이 잘못되었습니다. : " + apiUrl, e);
    } catch (IOException e) {
        throw new RuntimeException("연결이 실패했습니다. : " + apiUrl, e);
    }
}


private static String readBody(InputStream body){
    InputStreamReader streamReader = new InputStreamReader(body);


    try (BufferedReader lineReader = new BufferedReader(streamReader)) {
        StringBuilder responseBody = new StringBuilder();


        String line;
        while ((line = lineReader.readLine()) != null) {
            responseBody.append(line);
        }


        return responseBody.toString();
    } catch (IOException e) {
        throw new RuntimeException("API 응답을 읽는 데 실패했습니다.", e);
    }
}
}

//class Student{
//	public String name;
//	public int age;
//	Student s1 = new Student();
//	s1.name = "홍길동";
//	s1.age = 20;
//	
//	Student s2 = new Student();
//	s2.name = "아무개";
//	s2.age = 25;
//	
//}

