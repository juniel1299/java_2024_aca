package com.test.question.obj;

public class Ruler {
private int length;
private String shape;
public int getLength() {
	return this.length;
}
public void setLength(int length) {
	this.length = length;
}
public String getShape() {
	return this.shape;
}
public void setShape(String shape) {
	this.shape = shape;
	
}	
	public String info() {
		return String.format("%dcm %s", this.length, this.shape);
	}

}
