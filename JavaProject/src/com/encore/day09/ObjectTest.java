package com.encore.day09;

public class ObjectTest {

	public static void call1() {

		Object obj1 = new Object();
		Object obj2 = new Object();

		System.out.println(obj1);
		System.out.println(obj1.toString());

		System.out.println(obj2);
		System.out.println(obj2.toString());

		System.out.println(obj1 == obj2);
		System.out.println(obj1.equals(obj2));
	}

	public static void call2() {

		String obj1 = new String("����");
		String obj2 = new String("����");

		System.out.println(obj1);
		System.out.println(obj1.toString());

		System.out.println(obj2);
		System.out.println(obj2.toString());

		System.out.println(obj1 == obj2);
		System.out.println(obj1.equals(obj2));
	}

	public static void call3() {

		Car obj1 = new Car("�׷���", 5000);
		Car obj2 = new Car("�׷���", 5000);
		String obj3 = new String("�׷���TG");

		System.out.println(obj1);
		System.out.println(obj1.toString());

		System.out.println(obj2);
		System.out.println(obj2.toString());

		System.out.println(obj1 == obj2);
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1.equals(obj3)); // ��Ÿ���̼���. �ϴ� String�� ������Ʈ�� ���ϱ⶧���� ������ �ȳ���.

		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
	}
	
	public static void callPerson() {

		Person obj1 = new Person("�Ż�","F",20);
		Person obj2 = new Person("�Ż�","F",20);

		System.out.println(obj1);
		System.out.println(obj1.toString());

		System.out.println(obj2); //���ڿ� ���
		System.out.println(obj2.toString()); //���ڿ� ���

		System.out.println(obj1 == obj2); //�ּҺ�
		System.out.println(obj1.equals(obj2)); //�����
		

		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
	}

	public static void main(String[] args) {
		callPerson();

	}

}
