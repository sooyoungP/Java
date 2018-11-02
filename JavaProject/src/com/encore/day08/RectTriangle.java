package com.encore.day08;

public class RectTriangle extends Shape {

	// ����
	double width;
	double height;

	// ������ �ż���
	public RectTriangle(double w, double h) {
		super(3); // ��������� ���� �־���Ѵ�. �ֳĸ� shape���� �ʱ�ȭ�� �ȵǾ��ֱ� ������
		width = w;
		height = h;
	}

	@Override
	double getArea() {
		return width * height / 2; //�����ﰢ���� ����
	}

	@Override
	double getPerimeter() {
		return width + height + Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2)); // �ѷ� ���ϴ� ����
		//Math.sqrt:��Ʈ, Math.pow:������
	}
}