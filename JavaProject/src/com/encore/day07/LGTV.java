package com.encore.day07;

public class LGTV implements TV {

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
	public void great() {
		System.out.println(KBS + "���� ȭ���� ���ƿ�.");

	}
}