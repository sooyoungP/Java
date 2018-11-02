package com.encore.day09;

public class CellPhone {
	// ����
	String model;
	double battery;

	CellPhone(String model) { // �𵨹�ȣ�� ���ڸ� �޴� ������
		this.model = model;
	}

	void call(int time) {
		if (time < 0)
			throw new IllegalArgumentException("��ȭ�ð��Է¿���"); // ��Ÿ���̼��ǿ� ���Ѵ�.
		System.out.println("��ȭ �ð�: " + time);
		battery -= time * 0.5;
		if (battery < 0)
			battery = 0;
	}

	void charge(int time) {
		if (time < 0)
			throw new IllegalArgumentException("�����ð��Է¿���");
		System.out.println("�����ð�: " + time + "��");
		System.out.println("���� ���͸� ��: " + battery);
		battery += time * 3;
		if (battery > 100)
			battery = 100;
	}

	void printBattery() {
		System.out.println("���� ���͸� ��: " + battery);
	}

	public boolean equals(Object otherObject) { // ���������ڴ� �������̵�޴� ��ü���� ���ų� Ŀ���Ѵ�.
		if (!(otherObject instanceof CellPhone))
			return false;
		CellPhone cc = (CellPhone) otherObject;
		return model.equals(cc.model);

		// return model.equals(((CellPhone) otherObject).model);

	}

}
