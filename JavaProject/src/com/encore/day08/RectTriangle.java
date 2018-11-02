package com.encore.day08;

public class RectTriangle extends Shape {

	// 변수
	double width;
	double height;

	// 생성자 매서드
	public RectTriangle(double w, double h) {
		super(3); // 명시적으로 값을 주어야한다. 왜냐면 shape에서 초기화가 안되어있기 때문에
		width = w;
		height = h;
	}

	@Override
	double getArea() {
		return width * height / 2; //직각삼각형의 면적
	}

	@Override
	double getPerimeter() {
		return width + height + Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2)); // 둘레 구하는 공식
		//Math.sqrt:루트, Math.pow:제곱근
	}
}