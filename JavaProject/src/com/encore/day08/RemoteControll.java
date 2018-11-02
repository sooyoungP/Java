package com.encore.day08;

//인터페이스 : 상수 + 추상메서드 +디폴트 매서드 + 스테틱 메서드
public interface RemoteControll {
	// public static final이 기본 값으로 생략되어있다 / 생략가능
	String HUB_ID = "316";
	public static final String HUB_NAME = "홈네트워크";

	// public abstract이 기본값으로 생략되어있다 / 생략가능
	void turnOn();

	public abstract void turnOff();

	// 리모트 컨트롤이라는 인터페이스 생성완료. 이 인터페이스을 구현한 클래스 생성

	// void setting();
	// 예를 들어 셋팅이라는 기능을 추가하고 싶을때 : 추가하면 이 인터페이스를 구현한 모든 객체가 에러

	default void setting() { // public 생략가능&자동생략되어있다.
		System.out.println("setting 합니다");
	} // 처음부터 디폴트로 구현하면 나머지 객체를 모두 사용가능

	// 리모트 컨트롤 자체에 기능을 가지고 싶을 떄. 이것을 구현한 클래스가 재정의 가 불가능하다.
	// 호출하려면 remotecontroll.print()로 호출해야한다.
	static void print() { // public 생략가능&자동생략되어있다.
		System.out.println("리모트컨트롤 자체기능");
	}

}
