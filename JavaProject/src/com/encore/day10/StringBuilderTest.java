package com.encore.day10;

public class StringBuilderTest {

	public static void call() {

		String s = "������ ����";
		s += " �ð��� ������� 1���Դϴ�."; // ��Ʈ���� ���������̴�. ���� �ּҰ� �ٲ�� �� ��
		// ���� ������ ���ϱ⸦ ����ϴ� ���� �޸� ���� �߻��Ѵ�.
		System.out.println(s);

	}

	public static void call2() {
		// StringBuilder�� ���� ���ڿ��̴�. ���տ����ڸ� �������� �ʴ´�.
		StringBuilder s = new StringBuilder("������ ����");
		s.append("�� ������� 1�� �Դϴ�.");
		System.out.println(s);
		//call3(new string(s));
		call3(s.toString());
	}

	public static void call3(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {
		call3("123");

	}

}
