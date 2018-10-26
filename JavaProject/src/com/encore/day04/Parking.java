package com.encore.day04;

public class Parking {
	public static void call() {
		//1. 객체참조 변수선언
		int a;
		String b;
		Car c1;
		//2. 객체 생성
		b = new String("자바");
		c1 = new Car(); //자동으로 초기화된다. 
		//3. 객체 사용
		c1.model = "SM5";
		c1.color = "black";
		c1.price = 5000;
		System.out.println(c1);
		System.out.println(c1.model);
		System.out.println(c1.color);
		System.out.println(c1.price);
	}
	
	public static void call2() {
		Car c2 = new Car("BMW520"+"white"+7100);
	
		System.out.println(c2);
		System.out.println(c2.model);
		System.out.println(c2.color);
		System.out.println(c2.price);
				
	}
	public static void main(String[] args) {
		call2();
	}
}
