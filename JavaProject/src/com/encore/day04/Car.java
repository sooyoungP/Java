package com.encore.day04;

public class Car { // �ڵ������ Ʋ�� �����ϰ� �ʹ�. Ʋ = ���赵 = Ŭ����

	//1. Field (Ư¡, �Ӽ�, ����)
		String model;
		String color;
		int price;

	//2. Constructor (������) �޼���
	//��ü�����Ǵ��⼺/�����ε�
	Car(){
			System.out.println("default�����ڿ� ���ؼ� car Object�� ���������.");
		}
	Car(String m, String c, int p) {
		System.out.println("default�����ڿ� ���ؼ� car Object�� ���������.");
		model = m;
		color =c;
		price =p;
	}
	
		
	//3. Method (���)
		public void carInfoPrint();
			System.out.println("��:"+ model);
			System.out.println("��:"+ model);
			System.out.println("��:"+ model);
		
	//4. Static Block
	
	//5. Inner Class

}
