package com.encore.day06;

public class StaticTest {

	//instance ����
	String var1 ="�ڹ�";
	
	//static ����
	static String var2 = "��";
	
	
	public static void main(String[] args) {

		System.out.println(var2);
		
		StaticTest aa = new StaticTest();
		System.out.println(aa.var1);
	}
}
