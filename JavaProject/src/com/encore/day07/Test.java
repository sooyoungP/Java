package com.encore.day07;

//Object class�ȿ� toString()�̶�� �Լ����ִ�....�ּҸ� ����ϴ� �Լ�....>��Ű���̸�.Ŭ�����̸�( @hashcode�� hexa�� )
//String�� Object�� ��ӹ޾Ҵ�. ������ String�� ObjectŬ������ toString�� �������ߴ�...�׷��� ���븸 ���
//�ڹٴ� ��ü�� ������ ������ �ڿ�  toString()�� �ڵ����� ���δ�
class Car {
	String model = "�׷���";

	//toString() �����Ǹ� �ϱ�����
	@Override
	public String toString() {
		return "�¼Ÿ�  �ڵ���" + model;
	}
	
	
}
public class Test {

	public static void main(String[] args) {
		String s = new String("�ڹ�");
		System.out.println(s.toString());
		System.out.println(s);
		
		Car c = new Car();
		System.out.println(c);
		System.out.println(c.model);
		
		BonusPointAccount acc = new BonusPointAccount("111","�ڼҿ�",1000,200);
		System.out.println(acc);
		

	}

}
