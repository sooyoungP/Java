package com.encore.day07;

public abstract class Shape {
	// 1.����
	private String color;
	private String type;

	// 2. ������
	public Shape(String color, String type) {
		super();
		this.color = color;
		this.type = type;
	}

	@Override
	public String toString() {
		return color + "   " + type;
	}

	// 3. �޼���
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
