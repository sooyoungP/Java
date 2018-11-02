package com.encore.day08;

public class Refrigerator implements RemoteControll {

	// 인터페이스에서 구현한 추상매서드를 반드시 구현할 의무가 있다.
	@Override
	public void turnOn() {
		System.out.println("냉장고의 전원을 끈다");

	}

	@Override
	public void turnOff() {
		System.out.println("텔레비전의 전원을 끈다");

	}

}
