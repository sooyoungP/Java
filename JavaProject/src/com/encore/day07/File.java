package com.encore.day07;

public class File extends Entry {

	// 생성자 초기화
	File(String name, int size) {
		super(name, size);
	}

	// 메서드 재정의
	public void print() {
		System.out.println(getName()+"("+getSize()+")");
	}
}
