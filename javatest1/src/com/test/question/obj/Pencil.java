package com.test.question.obj;

public class Pencil {
String hardness;


public String getHardness() {
	return this.hardness;
}

public void setHardness(String hardness) {
	this.hardness = hardness;
}
String info() {
	return String.format("%s 진하기 연필", this.hardness);
}
}
