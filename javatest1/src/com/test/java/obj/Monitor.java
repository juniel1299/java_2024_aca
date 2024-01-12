package com.test.java.obj;

public class Monitor {

	private String model;
	private int size = 24;
	private int price;
	//private int level;
	
	
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		//유효성검사
		this.model = model;
	}
	public int getSize() {
		return size;
	}
	public void setPrice(int price) {
		this.price = price;
	}


	public int getLevel() {
		if(this.price >= 500000) {
			return 1;
		}else if (this.price >=300000) {
			return 2;
		}else {
			return 3;
		}
	
	
	
	
	}
public String tostring() {
	return String.format("%s[%,d원,%d인치]"
			,this.model
			,this.price
			,this.size);
}
	//우클릭 > 소스 > 필드에서 만들어도 됨 
//	public  Monitor(String model, int size, int price) {
//		//super();
//		this.model = model;
//		this.size = size;
//		this.price = price;
//		
//	}


}