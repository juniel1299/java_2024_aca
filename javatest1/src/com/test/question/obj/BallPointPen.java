package com.test.question.obj;

public class BallPointPen {
private double thickness;
public double getThickness() {
	return this.thickness;
}

public void setThickness(double thickness) {
	this.thickness = thickness;
}

public String getColor() {
	return this.color;
}

public void setColor(String color) {
	this.color = color;
}

private String color;

public String info() {
	return String.format("%s 색상 %.1fmm 볼펜", this.color , this.thickness);
}
}
