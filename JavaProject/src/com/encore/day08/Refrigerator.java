package com.encore.day08;

public class Refrigerator implements RemoteControll {

	// �������̽����� ������ �߻�ż��带 �ݵ�� ������ �ǹ��� �ִ�.
	@Override
	public void turnOn() {
		System.out.println("������� ������ ����");

	}

	@Override
	public void turnOff() {
		System.out.println("�ڷ������� ������ ����");

	}

}
