package com.encore.day07;

public class ShapeTest2 {

	public static void main(String[] args) {
		Shape s = new Circle("red",5);
		System.out.println(s);
		System.out.println(s.calculateArea());
		System.out.println(s.calculatePerimeter());
		
		if(s instanceof Circle) {
		Circle c = (Circle)s;
		System.out.println(c.getRadius());
		}

	}

}
