package com.encore.day07;

class A {
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + "Ŭ�����Դϴ�";
	}

}

class B extends A {
	public void go() {
		System.out.println("B�� �ִ� GO �Լ��Դϴ�.");
	}
}

class C extends A {
}

class D extends B {
}

class E extends C {
}

public class PolyTest {

	public static void show(A aa) {
		System.out.println(aa);
		if (aa instanceof B) {
			B bb = (B) aa;
			bb.go();
		}
	}

	public static void main(String[] args) {

		A a = new A();
		show(a);

		B b = new B();
		show(b);
		show(new C());
		show(new D());
		show(new E());
	}

}
