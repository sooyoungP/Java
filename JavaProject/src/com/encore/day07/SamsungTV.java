package com.encore.day07;

public class SamsungTV implements TV {

	// �߻��� �ݵ�� �����ؾ��Ѵ�
	@Override
	public void powerOn() {
		System.out.println(getClass().getSimpleName() + "������ �Ҵ�.");
	}

	@Override
	public void powerOff() {
		System.out.println(getClass().getSimpleName() + "������ ����.");
	}

	// �Լ��� �߰��� �� �ִ�.
	public void good() {
		System.out.println("ä�� "+SBS+"�� "+getClass().getSimpleName() + " ȭ���� ���ƿ�.");
	}

}
