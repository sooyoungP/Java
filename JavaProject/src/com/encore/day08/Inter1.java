package com.encore.day08;

public interface Inter1 {

	void print1(); // �߻�żҵ�, public abstract ��������

	public abstract void print2();

	default void print3() {
		System.out.println("default �żҵ� �Դϴ�.");
	}

	static void print4() {
		System.out.println("static �żҵ� �Դϴ�.");
	}
}
