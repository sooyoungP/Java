package com.encore.day08;

public class AnnonymousTest {

	public static void work(MyInterface aa) {
		// 여기서 프린트 하고 싶을 때
		aa.print();
	}

	public static void main(String[] args) {

		// 예시 1번
		// 이름이없는 클래스. 굳이 클래스로 저장하고 싶지않을때
		work(new MyInterface() {
			// 인터페이스는 객체생성이 안된다. 지금하는것은 클래스 생성이 아니라 인터페이스 안의 함수를 재정의 하는것
			@Override
			public void print() {
				// 함수 재정의
				System.out.println("익명클래스에 익명함수");

			}
		});

		// 예시 2번
		MyInterImpl a = new MyInterImpl();
		a.print();

		MyInterImpl a2 = new MyInterImpl();
		a2.print();

		// 인터페이스 재정의...익명클래스(클래스의 이름이 없기때문에) 한번사용용으로
		// 계속해서 만들어야 하는데, 클래스가 계속 생성되면 효율이없다.

		MyInterface a3 = new MyInterface() {

			@Override
			public void print() {
				System.out.println("익명클래스에서 정의한 매서드");
			}
		};
		a3.print();

	}
}
