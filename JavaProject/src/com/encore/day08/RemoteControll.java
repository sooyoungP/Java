package com.encore.day08;

//�������̽� : ��� + �߻�޼��� +����Ʈ �ż��� + ����ƽ �޼���
public interface RemoteControll {
	// public static final�� �⺻ ������ �����Ǿ��ִ� / ��������
	String HUB_ID = "316";
	public static final String HUB_NAME = "Ȩ��Ʈ��ũ";

	// public abstract�� �⺻������ �����Ǿ��ִ� / ��������
	void turnOn();

	public abstract void turnOff();

	// ����Ʈ ��Ʈ���̶�� �������̽� �����Ϸ�. �� �������̽��� ������ Ŭ���� ����

	// void setting();
	// ���� ��� �����̶�� ����� �߰��ϰ� ������ : �߰��ϸ� �� �������̽��� ������ ��� ��ü�� ����

	default void setting() { // public ��������&�ڵ������Ǿ��ִ�.
		System.out.println("setting �մϴ�");
	} // ó������ ����Ʈ�� �����ϸ� ������ ��ü�� ��� ��밡��

	// ����Ʈ ��Ʈ�� ��ü�� ����� ������ ���� ��. �̰��� ������ Ŭ������ ������ �� �Ұ����ϴ�.
	// ȣ���Ϸ��� remotecontroll.print()�� ȣ���ؾ��Ѵ�.
	static void print() { // public ��������&�ڵ������Ǿ��ִ�.
		System.out.println("����Ʈ��Ʈ�� ��ü���");
	}

}
