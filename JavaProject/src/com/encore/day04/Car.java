package com.encore.day04;

public class Car { // 자동차라는 틀을 생성하고 싶다. 틀 = 설계도 = 클래스

	//1. Field (특징, 속성, 변수)
		String model;
		String color;
		int price;

	//2. Constructor (생성자) 메서드
	//객체지향의다향성/오버로딩
	Car(){
			System.out.println("default생성자에 읜해서 car Object가 만들어진다.");
		}
	Car(String m, String c, int p) {
		System.out.println("default생성자에 읜해서 car Object가 만들어진다.");
		model = m;
		color =c;
		price =p;
	}
	
		
	//3. Method (기능)
		public void carInfoPrint();
			System.out.println("모델:"+ model);
			System.out.println("모델:"+ model);
			System.out.println("모델:"+ model);
		
	//4. Static Block
	
	//5. Inner Class

}
