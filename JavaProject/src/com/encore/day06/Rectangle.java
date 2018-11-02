package com.encore.day06;

public class Rectangle extends Shape{
		
	int width;
	int height;
	
	public Rectangle(int x, int y, int width, int height) {
		super(x,y); //명시적으로 생성자 호출
		this.x = x;
		this.x = y;
		this.height = height;
		this.x = x;
		
		//Override(덮어쓰기)
		public void draw() {
			System.out.println("x = " + x + "y = " + y + "그리기 시작");
		}
		
	}
}
