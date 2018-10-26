package com.encore.day04;

public class Cellphone {

	String model;
	String color;
	double size;
	int price;
	char os;

	public Cellphone(String model, String color, double size, int price, char os) {
		this.model = model;
		this.color = color;
		this.size = size;
		this.price = price;
		this.os = os;
	}

	public Cellphone(String model, String color, double size, int price) {
		this(model, color, size, price,'A');
	}
	public Cellphone(String model, String color, double size) {
		this(model, color, size, 10, 'A');
	}
	public Cellphone(String model, String color) {
		this(model, color, 5.6, 10, 'A');
	}
	public Cellphone(String model) {
		this(model, Black, 5.6, 10, 'A');
	
	public void PhoneInfo() {
		System.out.println("==========폰 정보입니다========");
		System.out.println("model:"+model);
		System.out.println("color:"+color);
		System.out.println("size:"+size);
		System.out.println("price:":+price);
	}
}
}