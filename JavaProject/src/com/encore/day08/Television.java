package com.encore.day08;

//이미 다른 클래스를 상속받고 있다면 다중상속이 불가능하다.
//그래서 인터페이스를 사용한다. 원래 부모를 상속받고 있을 때 다른 기능을 사용하고 싶을때

public class Television extends Parent implements RemoteControll {
	// 변수
	// 생성자
	// 매서드

	// 인터페이스에서 구현한 매서드를 받드시 구현해야한다.

	@Override
	public void turnOn() {
		System.out.println("텔레비전의 전원을 끈다");

	}

	@Override
	public void turnOff() {
		System.out.println("텔레비전의 전원을 끈다");

	}

	// 텔레비전이 만들어 놓은 디폴드를 변경하고 싶을 때 재정의가 가능하다.(소스-오버라이딩)
	@Override
	public void setting() {
		System.out.println("TV setting......");
	}

}
