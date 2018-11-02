package com.encore.day07;

public class Circle extends Shape {

	// 1.변수
	int radius;

	// 2.생성자
	public Circle(String color, int radiu) {
		super(color, "circle");
		this.radius = radiu;
	}

	// 3. 추상메소드 구현
	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return radius * radius * Math.PI;
	}

	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		return 2 * radius * Math.PI;
	}

	// 4. 메서드 구현

	// 5. getter와 setter
	public int getRadius() {
		return radius;
	}

	public void setRadiu(int radiu) {
		this.radius = radiu;
	}

}
