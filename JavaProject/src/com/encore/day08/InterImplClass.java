package com.encore.day08;

public class InterImplClass extends Parent implements Inter1, Inter2 {

	@Override
	public void print5() {
		System.out.println("inter2�� �ִ� �߻� �ż��� print5 �Դϴ�"); // ���� ������

	}

	@Override
	public void print6() {
		System.out.println("inter2�� �ִ� �߻� �ż��� print6 �Դϴ�"); // ���� ������

	}

	@Override
	public void print1() {
		System.out.println("inter1�� �ִ� �߻� �ż��� print1 �Դϴ�"); // ���� ������

	}

	@Override
	public void print2() {
		System.out.println("inter1�� �ִ� �߻� �ż��� print2 �Դϴ�"); // ���� ������

	}

}
