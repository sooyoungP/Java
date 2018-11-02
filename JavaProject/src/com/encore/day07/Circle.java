package com.encore.day07;

public class Circle extends Shape {

	// 1.����
	int radius;

	// 2.������
	public Circle(String color, int radiu) {
		super(color, "circle");
		this.radius = radiu;
	}

	// 3. �߻�޼ҵ� ����
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

	// 4. �޼��� ����

	// 5. getter�� setter
	public int getRadius() {
		return radius;
	}

	public void setRadiu(int radiu) {
		this.radius = radiu;
	}

}
