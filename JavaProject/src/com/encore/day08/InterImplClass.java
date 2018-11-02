package com.encore.day08;

public class InterImplClass extends Parent implements Inter1, Inter2 {

	@Override
	public void print5() {
		System.out.println("inter2에 있는 추상 매서드 print5 입니다"); // 각각 재정의

	}

	@Override
	public void print6() {
		System.out.println("inter2에 있는 추상 매서드 print6 입니다"); // 각각 재정의

	}

	@Override
	public void print1() {
		System.out.println("inter1에 있는 추상 매서드 print1 입니다"); // 각각 재정의

	}

	@Override
	public void print2() {
		System.out.println("inter1에 있는 추상 매서드 print2 입니다"); // 각각 재정의

	}

}
