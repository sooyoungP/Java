package com.encore.day08;

public interface Inter2 {

	void print5(); //추상매소드, public abstract 생략가능
	public abstract void print6();
	default void print7() {
		System.out.println("default 매소드 입니다.");
	}
	static void print8() {
		System.out.println("static 매소드 입니다.");
	}
}
