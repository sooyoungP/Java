package com.encore.day08;

public class RemoteUser {

	public static void work(RemoteControll r) { // �ڽ��� �θ� �� �� �ִ�. ������ ������ �� �� �ִ�.
		r.turnOn();
		r.turnOff();
		r.setting();
	}

	public static void main(String[] args) {
		// ������ �Ҵ�
		work(new Television()); // �ڷ������� new�ϸ� ����Ʈ��Ʈ�ѷ� ����. //��ü�� ������ �κ��� ��ȣ�� �ִ´�.
		work(new Refrigerator());
		RemoteControll.print();
	}

}
