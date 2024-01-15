package com.test.java.bbb;

import com.test.java.aaa.Red;

public class Yellow {
public void test() {
	Red r1 = new Red();
	
	r1.a = 10;
//	r1.c = 0; //default는 패키지가 다를 때 동작 안 됨 (패키지가 같을 때만 동작 가능 )
//	r1.d = 20;//protected는 패키지가 다를 때 동작 안 됨  
}
}
