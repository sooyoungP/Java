package com.encore.day07;

public class Directory extends Entry {

	//������ �ʱ�ȭ
	Directory(String name){
		super(name);
	}
	//�޼��� ������
	public void print() {
		System.out.println(getName());
	}
}
