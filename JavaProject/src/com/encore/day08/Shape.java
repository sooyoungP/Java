package com.encore.day08;

//추상클래스
public abstract class Shape {

	// 변수
	int numSides; // 변의 수

	// 생성자 매서드_클래스와 이름이 같다.
	Shape(int numSides) {
		this.numSides = numSides;
	}

	// getter
	public int getNumSides() {
		return numSides;
	}

	// 매서드_접근제한자와 리턴타입이 있어야한다.
	abstract double getArea(); // 넓이

	abstract double getPerimeter(); // 둘레길이

}
