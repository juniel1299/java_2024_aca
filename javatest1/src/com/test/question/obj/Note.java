package com.test.question.obj;

public class Note {
	   private String size;
	   private String color;
	   private int page;
	   private String owner;
	   private int price;
	   
	   String sizeValue ="";
	   
	   public String info() {
			String temp = "";
			temp +="■■■■■■ 노트 정보 ■■■■■■";
			temp += "소유자: " + owner + "\r\n";
			temp +="특성: " + color + " " + sizeValue + " "+ size +"노트" + "\r\n";
			temp +="가격: " + price + "\r\n";
			return temp;
		}
	   
	   
	public void setSize(String size) {
		this.size = size;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setPage(int page) {
		if(page<51 && page >=10) {
			sizeValue = "얇다";
		}else if (page >=51 && page <101 ) {
			sizeValue = "보통";
		}else if (page>=101 && page <201) {
			sizeValue = "두껍다";
		}
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
}
