package com.encore.day06;

public class Rectangle extends Shape{
		
	int width;
	int height;
	
	public Rectangle(int x, int y, int width, int height) {
		super(x,y); //��������� ������ ȣ��
		this.x = x;
		this.x = y;
		this.height = height;
		this.x = x;
		
		//Override(�����)
		public void draw() {
			System.out.println("x = " + x + "y = " + y + "�׸��� ����");
		}
		
	}
}
