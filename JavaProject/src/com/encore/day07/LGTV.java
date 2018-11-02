package com.encore.day07;

public class LGTV implements TV {

	// 추상은 반드시 구현해야한다
	@Override
	public void powerOn() {
		System.out.println(getClass().getSimpleName() + "전원을 켠다.");
	}

	@Override
	public void powerOff() {
		System.out.println(getClass().getSimpleName() + "전원을 끈다.");
	}

	// 함수는 추가할 수 있다.
	public void great() {
		System.out.println(KBS + "더더 화질이 좋아요.");

	}
}