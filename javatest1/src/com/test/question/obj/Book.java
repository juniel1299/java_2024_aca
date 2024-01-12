package com.test.question.obj;

import java.util.Arrays;

public class Book {

	private String title;
	private int price;
	private String author;
	private String publisher;
	private String pubYear = "2019";
	private String isbn;
	private int page;
	

	
	public String info() {
		String temp = "";
		temp += "제목: " + title + "\r\n";
		temp += "가격: " + price +  "원\r\n";
		temp += "저자: " + author + "\r\n";
		temp += "출판사: " + publisher + "년\r\n";
		temp += "발행년도: " + pubYear + "\r\n";
		temp += "ISBN: " + isbn + "\r\n";
		temp += "페이지: " + page + "장\r\n";
		return temp;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	
	
}	

