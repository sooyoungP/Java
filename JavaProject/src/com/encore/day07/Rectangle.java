package com.encore.day07;

public class Rectangle extends Shape {
	// 1. 변수
	int width;
	int height;

	// 2.생성자
	public Rectangle(String color, int width, int height) {
		super(color, "Rectangle");
		this.width = width;
		this.height = height;
	}

	// 3. 추상메서드 구현
	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return width * height;
	}

	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		return 2 * (width + height);
	}

}
