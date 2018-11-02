package com.encore.day08;

public class Rectangle extends Shape implements Resizable {

	// 변수
	double width;
	double height;

	// 생성자 매서드
	public Rectangle(double width, double height) {
		super(4); // 값을 지정
		this.width = width;
		this.height = height;
	}

	// 추상매서드 구현
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
