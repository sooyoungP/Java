package com.encore.day08;

//�̹� �ٸ� Ŭ������ ��ӹް� �ִٸ� ���߻���� �Ұ����ϴ�.
//�׷��� �������̽��� ����Ѵ�. ���� �θ� ��ӹް� ���� �� �ٸ� ����� ����ϰ� ������

public class Television extends Parent implements RemoteControll {
	// ����
	// ������
	// �ż���

	// �������̽����� ������ �ż��带 �޵�� �����ؾ��Ѵ�.

	@Override
	public void turnOn() {
		System.out.println("�ڷ������� ������ ����");

	}

	@Override
	public void turnOff() {
		System.out.println("�ڷ������� ������ ����");

	}

	// �ڷ������� ����� ���� �����带 �����ϰ� ���� �� �����ǰ� �����ϴ�.(�ҽ�-�������̵�)
	@Override
	public void setting() {
		System.out.println("TV setting......");
	}

}
