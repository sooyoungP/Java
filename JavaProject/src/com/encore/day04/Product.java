package com.encore.day04;

public class Product {
	//1. Field (특징)
	String model;
	String brand;
	int price;
	boolean sale;
	
	//2. constructor(생성자 - 생성자는 반드시 클래스 이름과 같아야한다
	Product(){
		this(null,null,0,false); 
	}
	
	Product(String model, int price) {
		this(model,null,price,false);
	}
	Product(String model, String brand, int price, boolean sale) {
		this.model = model;
		this.brand = brand;
		this.price = price;
		this.sale = sale;
	}
	//3. method
	public void print() {
		System.out.println(model);
		System.out.println(brand);
		System.out.println(price);
		System.out.println(sale);
	}
	
}
