package com.encore.day08;

public class InterImplClassUse {

	public static void main(String[] args) {

		InterImplClass a = new InterImplClass();

		// Inter1 a = new InterImplClass; //������ ������ �� �� �ִ�.
		// a.print1(); //a.�� �ϸ� Inter 1�� �������θ� ���δ�.

		// Inter2 a = new InterImplClass; //������ ������ �� �� �ִ�.
		// a.print5(); //a.�� �ϸ� Inter 2�� �������θ� ���δ�.

		// Parent a = new InterImplClass();

		System.out.println(a instanceof InterImplClass);
		System.out.println(a instanceof Inter1);
		System.out.println(a instanceof Inter1);
		System.out.println(a instanceof Parent);
		// ��� true�̴�

		a.print1();
		a.print2();
		a.print3();
		Inter1.print4(); // static �żҵ��̱� ������ �������̽�.�żҵ�� ȣ���ؾ��Ѵ�
		a.print5();
		a.print6();
		a.print7();
		Inter2.print8(); // static �żҵ��̱� ������ �������̽�.�żҵ�� ȣ���ؾ��Ѵ�

	}

}
