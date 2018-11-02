package com.encore.day09;

public class ObjectTest2 {

	public static void call() {
		Car c = new Car("BMW720", 7000);
		Car c2 = c; // ������ �ƴ϶� ����. �Ѵ� ���� ���� ���´�. �ϳ��� ���� �����ϸ� �Ѵ� ����ȴ�.

		System.out.println(c);
		System.out.println(c2);
		c2.setModel("�׷���");
		System.out.println(c);
		System.out.println(c2);
	}

	public static void call2() {
		Car c = new Car("BMW720", 7000);
		try {
			Car c2 = (Car) c.clone();

			System.out.println(c);
			System.out.println(c2);

			c2.setModel("�׷���");

			System.out.println(c);
			System.out.println(c2);

		} catch (CloneNotSupportedException e) {

			e.printStackTrace();
		}
	}

	public static void call3() throws CloneNotSupportedException {
		Car c = new Car("��", 5000, new String[] { "�����н�ī��", "�׺���̼�" });
		Car c2 = (Car) c.clone();
		System.out.println(c);
		System.out.println(c2);
		c.setModel("�� ����");
		c.acc[0] = "�Ǽ����� ����";
		System.out.println(c);
		System.out.println(c2); // ���� ���� ���� (�迭�� �ٲ��� �ʰ� ��Ʈ������ ����)
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		call3(); // ������ ������ �ڹٰ��� �ӽ����� ������
	}

}
