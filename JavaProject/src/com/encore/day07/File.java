package com.encore.day07;

public class File extends Entry {

	// ������ �ʱ�ȭ
	File(String name, int size) {
		super(name, size);
	}

	// �޼��� ������
	public void print() {
		System.out.println(getName()+"("+getSize()+")");
	}
}
