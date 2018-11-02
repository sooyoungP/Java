package com.encore.day08;

public class AnnonymousTest {

	public static void work(MyInterface aa) {
		// ���⼭ ����Ʈ �ϰ� ���� ��
		aa.print();
	}

	public static void main(String[] args) {

		// ���� 1��
		// �̸��̾��� Ŭ����. ���� Ŭ������ �����ϰ� ����������
		work(new MyInterface() {
			// �������̽��� ��ü������ �ȵȴ�. �����ϴ°��� Ŭ���� ������ �ƴ϶� �������̽� ���� �Լ��� ������ �ϴ°�
			@Override
			public void print() {
				// �Լ� ������
				System.out.println("�͸�Ŭ������ �͸��Լ�");

			}
		});

		// ���� 2��
		MyInterImpl a = new MyInterImpl();
		a.print();

		MyInterImpl a2 = new MyInterImpl();
		a2.print();

		// �������̽� ������...�͸�Ŭ����(Ŭ������ �̸��� ���⶧����) �ѹ���������
		// ����ؼ� ������ �ϴµ�, Ŭ������ ��� �����Ǹ� ȿ���̾���.

		MyInterface a3 = new MyInterface() {

			@Override
			public void print() {
				System.out.println("�͸�Ŭ�������� ������ �ż���");
			}
		};
		a3.print();

	}
}
