package com.encore.day08;

public interface Inter1 {

	void print1(); // 추상매소드, public abstract 생략가능

	public abstract void print2();

	default void print3() {
		System.out.println("default 매소드 입니다.");
	}

	static void print4() {
		System.out.println("static 매소드 입니다.");
	}
}
