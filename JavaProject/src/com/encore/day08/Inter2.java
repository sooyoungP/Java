package com.encore.day08;

public interface Inter2 {

	void print5(); //�߻�żҵ�, public abstract ��������
	public abstract void print6();
	default void print7() {
		System.out.println("default �żҵ� �Դϴ�.");
	}
	static void print8() {
		System.out.println("static �żҵ� �Դϴ�.");
	}
}
