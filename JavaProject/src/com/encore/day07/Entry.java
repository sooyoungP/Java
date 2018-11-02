package com.encore.day07;

public abstract class Entry {
	private String name;
	private int size;

	public Entry() {
		super();
	}

	public Entry(String name, int size) {
		super();
		this.name = name;
		this.size = size;
	}

	public Entry(String name) {
		super();
		this.name = name;
	}

	public Entry(int size) {
		super();
		this.size = size;
	}

	// ������ ���� ������ �߻�޼ҵ�� ����
	public abstract void print();

	// private�� ��� ������ �ޱ����� getter/ setter�� �ʿ�
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}
