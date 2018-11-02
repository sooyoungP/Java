package com.encore.day10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class CollectionTest {

	public static void call1() {
		Vector data = new Vector();// vector는 java.util안에 있다. 10개 짜리 공간을 array로 만들어준다(추가적인 것은 알아서 10개씩 증가) = Vector
		data.add(100);
		data.add("자바");
		// 무조건 object로 들어간다.
		int a = (Integer) data.get(0);
		String b = (String) data.get(1);

		System.out.println(a);
		System.out.println(b);
	}

	public static void call2() {
		// Vector : list 인터페이스를 구현(순서가 있다, 중복을 허용한다.),현재는 잘 사용되지 않는다
		Vector<String> data = new Vector<>(); // 제네시스를 사용하면 반복되는 코드를 막을 수 있다.
		data.add("자바1");
		data.add("자바1");
		data.add("자바3");
		data.add("자바4");
		data.add("자바5");

		String s = data.get(1);

		System.out.println(s);

		System.out.println(data.size());
	}

	public static void call3() {
		// ArrayList: list 인터페이스를 구현
		ArrayList<String> data = new ArrayList<>();
		data.add("월요일");
		data.add("화요일");
		data.add("수요일");
		data.add("목요일");
		data.add("금요일");
		data.add("화요일");
		data.add("목요일");

		// 1. 일반적인 for 문장
		System.out.println("======일반for======");
		for (int i = 0; i < data.size(); i++) {
			System.out.println(data.get(i));
		}
		// 2. 향샹된 for 문장
		System.out.println("======향샹된for======");
		for (String s : data) {
			System.out.println(s);
		}
		// 3. Iterator(리스트를 Iterator의 형태로 바꿔라)
		System.out.println("======Iterator======");
		Iterator<String> it = data.iterator();
		while (it.hasNext()) {// 토큰이 있니 = 다음데이터가 있니? 있을때까지 진행
			System.out.println(it.next());
		}
	}

	public static void call4() {
		// LinkedList: list 인터페이스를 구현
		LinkedList<String> data = new LinkedList<>();
		data.add("월요일");
		data.add("화요일");
		data.add("수요일");
		data.add("목요일");
		data.add("금요일");
		data.add("화요일");
		data.add("목요일");

		// 1. 일반적인 for 문장
		System.out.println("======일반for======");
		for (int i = 0; i < data.size(); i++) {
			System.out.println(data.get(i));
		}
		// 2. 향샹된 for 문장
		System.out.println("======향샹된for======");
		for (String s : data) {
			System.out.println(s);
		}
		// 3. Iterator(리스트를 Iterator의 형태로 바꿔라)
		System.out.println("======Iterator======");
		Iterator<String> it = data.iterator();
		while (it.hasNext()) {// 토큰이 있니 = 다음데이터가 있니? 있을때까지 진행
			System.out.println(it.next());
		}
	}

	public static void getData(List<String> data) {// 데이터를 받을 곳을 찾는다
		data.add("월요일");
		data.add("화요일");
		data.add("수요일");
		data.add("목요일");
		data.add("금요일");
		data.add("화요일");
		data.add("목요일");
	}

	public static void print(List<String> data) { // 데이터가 들어오면 데이터를 찍기만한다.

		// 1. 일반적인 for 문장
		System.out.println("======일반for======");
		for (int i = 0; i < data.size(); i++) {
			System.out.println(data.get(i));
		}
		// 2. 향샹된 for 문장
		System.out.println("======향샹된for======");
		for (String s : data) {
			System.out.println(s);
		}
		// 3. Iterator(리스트를 Iterator의 형태로 바꿔라)
		System.out.println("======Iterator======");
		Iterator<String> it = data.iterator();
		while (it.hasNext()) {// 토큰이 있니 = 다음데이터가 있니? 있을때까지 진행
			System.out.println(it.next());
		}
	}

	public static void main(String[] args) { // 메인을 짧게 써야한다. 업무파악을 하기위해
		// 데이터를 얻어와야한다.
		List<String> mylist = new ArrayList<>(); // 빈방을 하나 만들고데이터 저장 할 곳을 정한다.
		getData(mylist); // 데이터를 얻는 업무
		print(mylist); // 데이터를 출력하는 업무
	}

}
