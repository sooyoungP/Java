package com.encore.day07;

class Parent{//�θ�� �ڱ�͸� ���δ�.
	int a =100;
	int c = 300;
	
	void show() {
		System.out.println("Parent�� show �޼����Դϴ�.");
	}
}

class Child extends Parent{//�ڽ��� �θ�� �ڱ��ڽ��� ��κ��δ�.
	int b=200;
	String c; // �����ִ� �θ��� int c�� �����.
	
	void show() {
		System.out.println("Child�� show �޼����Դϴ�.");
	}
}

public class InheritTest {
	public static void main(String[] args) {
		Parent p = new Child();
		System.out.println(p);
		System.out.println(p.a);
		p.show();
		p.show();
		
		Child ch = (Child)p;
		System.out.println(ch.b);
		System.out.println(ch.c);
		ch.show();
	}
}

// Parent p = new Child ( ������ Ÿ��_parent�� ������, �Լ��� instance_child�� ������)
