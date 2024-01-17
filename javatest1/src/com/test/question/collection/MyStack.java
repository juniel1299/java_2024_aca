package com.test.question.collection;

public class MyStack {
	
	
	private String[] list;
	private int index;
	
	
	public MyStack() {
		this.list = new String[4];
		this.index = 0;
	}
	
	public boolean push(String s) {
		
		if (checkLength()) {
			doubleList();
		}
		
		this.list[this.index] = s;
		this.index++;
		
		return true;
	}



	private boolean checkLength() {
		
		if (this.index == this.list.length) {
			return true;
		}
		
		return false;
	}

	private void doubleList() {
		
		String[] temp = new String[this.list.length * 2];
		
		for (int i=0; i<this.list.length; i++) {
			temp[i] = this.list[i];
		}
		
		this.list = temp;		
	}

	public String pop() {
		//무조건 (첫번째 방의) 요소를 주세요!! == 선입선출
		
		String item = this.list[0];
		for (int i=0; i<this.list.length-2; i++) {
			this.list[i] = this.list[i+1];
			this.index++;
		}
		
		return item;

	}


		public int size() {
			return this.index;
		}

		public String peek() {
			
			return this.list[0];
			
		}

		public void clear() {
			this.index = 0;
			
		}
	}

