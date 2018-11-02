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

	// 변수가 없기 때문에 추상메소드로 정의
	public abstract void print();

	// private일 경우 변수를 받기위한 getter/ setter가 필요
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
