package com.encore.day04;

public class Parking {
	public static void call() {
		//1. ��ü���� ��������
		int a;
		String b;
		Car c1;
		//2. ��ü ����
		b = new String("�ڹ�");
		c1 = new Car(); //�ڵ����� �ʱ�ȭ�ȴ�. 
		//3. ��ü ���
		c1.model = "SM5";
		c1.color = "black";
		c1.price = 5000;
		System.out.println(c1);
		System.out.println(c1.model);
		System.out.println(c1.color);
		System.out.println(c1.price);
	}
	
	public static void call2() {
		Car c2 = new Car("BMW520"+"white"+7100);
	
		System.out.println(c2);
		System.out.println(c2.model);
		System.out.println(c2.color);
		System.out.println(c2.price);
				
	}
	public static void main(String[] args) {
		call2();
	}
}
