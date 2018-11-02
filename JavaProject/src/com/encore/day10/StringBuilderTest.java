package com.encore.day10;

public class StringBuilderTest {

	public static void call() {

		String s = "오늘의 점심";
		s += " 시간은 원래대로 1시입니다."; // 스트링은 고정문자이다. 단지 주소가 바뀌는 것 뿐
		// 결합 연산자 더하기를 사용하는 것은 메모리 낭비가 발생한다.
		System.out.println(s);

	}

	public static void call2() {
		// StringBuilder는 가변 문자열이다. 결합연산자를 제공하지 않는다.
		StringBuilder s = new StringBuilder("오늘의 점심");
		s.append("은 원래대로 1시 입니다.");
		System.out.println(s);
		//call3(new string(s));
		call3(s.toString());
	}

	public static void call3(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {
		call3("123");

	}

}
