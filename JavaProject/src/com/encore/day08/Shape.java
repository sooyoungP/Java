package com.encore.day08;

//�߻�Ŭ����
public abstract class Shape {

	// ����
	int numSides; // ���� ��

	// ������ �ż���_Ŭ������ �̸��� ����.
	Shape(int numSides) {
		this.numSides = numSides;
	}

	// getter
	public int getNumSides() {
		return numSides;
	}

	// �ż���_���������ڿ� ����Ÿ���� �־���Ѵ�.
	abstract double getArea(); // ����

	abstract double getPerimeter(); // �ѷ�����

}
