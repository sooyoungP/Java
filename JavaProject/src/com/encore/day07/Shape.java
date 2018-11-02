package com.encore.day07;

public abstract class Shape {
	// 1.변수
	private String color;
	private String type;

	// 2. 생성자
	public Shape(String color, String type) {
		super();
		this.color = color;
		this.type = type;
	}

	@Override
	public String toString() {
		return color + "   " + type;
	}

	// 3. 메서드
	public abstract double calculateArea();

	public abstract double calculatePerimeter();

	// 4.getter
	public String getColor() {
		return color;
	}

	public String getType() {
		return type;
	}

}
