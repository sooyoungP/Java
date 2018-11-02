package com.encore.day08;

public class Rectangle extends Shape implements Resizable {

	// ����
	double width;
	double height;

	// ������ �ż���
	public Rectangle(double width, double height) {
		super(4); // ���� ����
		this.width = width;
		this.height = height;
	}

	// �߻�ż��� ����
	@Override
	public void resize(double s) {
		width = width * s;
		height = height * s;
	}

	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return width * height;
	}

	@Override
	double getPerimeter() {
		// TODO Auto-generated method stub
		return 2 * (width + height);
	}

}
