package com.encore.day07;

public class Sparrow {
	String name;
	int legs;
	double length;
	
	public Sparrow(String name, int legs, double length) {
		super();
		this.name = name;
		this.legs = legs;
		this.length = length;
	}
	
	void fly() {
		System.out.println(this.getClass().getSimpleName()+
				"("+name+")"
				+"�� ���ϴ�");
	}
	void sing() {
		System.out.println(this.getClass().getSimpleName()+
				"("+name+")"
				+"�� �Ҹ����� ��ϴ�");
	}
	void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "������ �̸��� " + name +"�Դϴ�";
	}
	
}
