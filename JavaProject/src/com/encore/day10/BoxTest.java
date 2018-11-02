package com.encore.day10;

public class BoxTest {

	public static void call() {
		Box<Integer> b1 = new Box<Integer>(10, "나무", "green"); // 기본형은 안된다
		System.out.println(b1);
		Box<String> b2 = new Box<String>("중간사이즈", "종이", "red");
		System.out.println(b2);
		// 제네릭스에는 아무타입이나 다 들어갈 수 있다. 객체도 들어갈 수 있다. 다 초기화 시키면서 넣어야한다.
		// Box<MySum> b3 = new Box<MySum>(new MySum(10,20),"천","white");
	}

	public static void main(String[] args) {
		call();

	}

}
