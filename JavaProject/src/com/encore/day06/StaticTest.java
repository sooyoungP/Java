package com.encore.day06;

public class StaticTest {

	//instance 변수
	String var1 ="자바";
	
	//static 변수
	static String var2 = "웹";
	
	
	public static void main(String[] args) {

		System.out.println(var2);
		
		StaticTest aa = new StaticTest();
		System.out.println(aa.var1);
	}
}
